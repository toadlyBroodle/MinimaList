#!/usr/bin/env python3
"""MinimaList legacy-user outreach mailer.

Reads recipients from data/outreach/active.txt (output of probe.py — PII,
never committed).  Composes a plain-text service-announcement email and
sends via /usr/sbin/sendmail (the VPS Postfix relay for rob@botlab.dev).

SAFETY GATE: DRY_RUN = True by default.  In dry-run the script composes and
logs every message but transmits nothing.  Flipping it live is out of scope
for any autonomous cycle and requires a deliberate code edit by the user.

Design mirrors redaiteam/outreach/email.py with bulk-send additions:
  - Recipients loaded only from data/outreach/active.txt (confirmed tier first,
    then unverifiable per the Phase 14.5 volume plan).
  - Per-recipient CSV send log so a re-run never double-sends.
  - Unsubscribe suppression against data/outreach/unsubscribed.txt.
  - Throttled batching per the Phase 14.5 warmup volume caps.

Run from the VPS (botlab.dev) where Postfix is configured:
    scp tools/outreach/send.py vps:~/send.py
    scp data/outreach/active.txt vps:~/active.txt
    ssh vps "python3 ~/send.py --dry-run"

No email is sent unless DRY_RUN is explicitly set to False AND the user
has approved execution of the campaign (Phase 14.5 gate).
"""

import argparse
import csv
import os
import subprocess
import sys
import time
from datetime import datetime, timezone
from email.mime.text import MIMEText
from email.utils import formatdate, make_msgid
from io import StringIO
from pathlib import Path
from typing import IO, Callable, Optional, Set

PROJECT_ROOT = Path(__file__).resolve().parent.parent.parent
ACTIVE_FILE = PROJECT_ROOT / "data" / "outreach" / "active.txt"
LOG_FILE = PROJECT_ROOT / "data" / "outreach" / "send_log.csv"
UNSUBSCRIBED_FILE = PROJECT_ROOT / "data" / "outreach" / "unsubscribed.txt"

FROM_NAME = "Rob (MinimaList)"
FROM_EMAIL = "rob@botlab.dev"

# Flip to False only after the user has given direct go-ahead to run the
# campaign.  This constant is intentionally near the top of the file so a
# reviewer scanning the module sees it immediately.
DRY_RUN: bool = True

# Default inter-message throttle (seconds).  Set by the Phase 14.5 volume plan:
# warm-up batches of ~20/day, never more than 20% day-over-day growth.
DEFAULT_THROTTLE_S: float = 5.0


# ---------------------------------------------------------------------------
# Message composition
# ---------------------------------------------------------------------------

SUBJECT = "MinimaList — the app you installed is back, cloud-free"

BODY_TEMPLATE = """\
Hi,

You installed MinimaList (formerly Sublist) from Google Play a few years ago.
The app has been rewritten from scratch — cloud-free, no ads, no tracking, \
no accounts.

Download the latest build:
  https://github.com/toadlyBroodle/MinimaList/releases

An F-Droid listing is in progress. All outline data stays on your device.

– Rob

---
To be removed from future emails, reply to this email with UNSUBSCRIBE.
"""


def compose_message(to: str) -> MIMEText:
    """Compose a plain-text service-announcement message for one recipient."""
    msg = MIMEText(BODY_TEMPLATE, "plain", "utf-8")
    msg["From"] = f"{FROM_NAME} <{FROM_EMAIL}>"
    msg["To"] = to
    msg["Subject"] = SUBJECT
    msg["Date"] = formatdate(localtime=True)
    msg["Message-ID"] = make_msgid(domain="botlab.dev")
    msg["List-Unsubscribe"] = f"<mailto:{FROM_EMAIL}?subject=unsubscribe>"
    return msg


# ---------------------------------------------------------------------------
# Active list parsing
# ---------------------------------------------------------------------------

def parse_active_list(fh: IO[str]) -> dict:
    """Parse active.txt (or any file-like) into confirmed / unverifiable lists.

    Returns {"confirmed": [...], "unverifiable": [...]}.
    Lines starting with '#' are headers or comments; blank lines are skipped.
    """
    result: dict = {"confirmed": [], "unverifiable": []}
    current_tier: Optional[str] = None

    for raw in fh:
        line = raw.strip()
        if not line:
            continue
        if line.startswith("# tier:confirmed"):
            current_tier = "confirmed"
            continue
        if line.startswith("# tier:unverifiable"):
            current_tier = "unverifiable"
            continue
        if line.startswith("#"):
            continue
        if current_tier in result:
            result[current_tier].append(line)

    return result


# ---------------------------------------------------------------------------
# Unsubscribe list
# ---------------------------------------------------------------------------

def load_unsubscribed(path: Path) -> Set[str]:
    """Load unsubscribed.txt and return a set of normalized email addresses."""
    if not path.exists():
        return set()
    result = set()
    for line in path.read_text(encoding="utf-8").splitlines():
        addr = line.strip().lower()
        if addr:
            result.add(addr)
    return result


# ---------------------------------------------------------------------------
# Send log helpers
# ---------------------------------------------------------------------------

def _load_already_sent(log_path: Path) -> Set[str]:
    """Return the set of recipients already logged as 'sent' in log_path."""
    if not log_path.exists():
        return set()
    already: Set[str] = set()
    with open(log_path, newline="", encoding="utf-8") as f:
        for row in csv.DictReader(f):
            if row.get("status") == "sent":
                already.add(row["recipient"])
    return already


def _append_log(log_path: Path, recipient: str, status: str) -> None:
    """Append one row to the CSV send log, creating headers on first write."""
    write_header = not log_path.exists() or log_path.stat().st_size == 0
    with open(log_path, "a", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)
        if write_header:
            writer.writerow(["recipient", "status", "timestamp"])
        ts = datetime.now(timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ")
        writer.writerow([recipient, status, ts])


# ---------------------------------------------------------------------------
# Batch send
# ---------------------------------------------------------------------------

def _default_send_fn(msg: MIMEText, to: str) -> bool:
    """Send via /usr/sbin/sendmail (Postfix relay on the VPS)."""
    sendmail = "/usr/sbin/sendmail"
    if not os.path.exists(sendmail):
        return False
    try:
        proc = subprocess.run(
            [sendmail, "-f", FROM_EMAIL, to],
            input=msg.as_string(),
            capture_output=True,
            text=True,
            timeout=30,
        )
        return proc.returncode == 0
    except Exception:
        return False


def send_batch(
    recipients: list,
    unsubscribed: Set[str],
    log_path: Path,
    dry_run: bool = True,
    send_fn: Optional[Callable] = None,
    throttle_s: float = DEFAULT_THROTTLE_S,
) -> dict:
    """Send (or dry-run) one message per recipient.

    Returns a counts dict: composed, sent, skipped, failed.
    Already-sent addresses (from the log) are silently skipped so re-runs are
    idempotent.  Unsubscribed addresses are also skipped and counted.
    """
    if send_fn is None:
        send_fn = _default_send_fn

    already_sent = _load_already_sent(log_path)
    counts = {"composed": 0, "sent": 0, "skipped": 0, "failed": 0}
    first = True

    for addr in recipients:
        norm = addr.strip().lower()
        if not norm:
            continue

        if norm in unsubscribed:
            counts["skipped"] += 1
            continue

        if norm in already_sent:
            counts["skipped"] += 1
            continue

        msg = compose_message(addr)
        counts["composed"] += 1

        if dry_run:
            print(f"[DRY RUN] Would send to {addr}: {SUBJECT}")
            continue

        if not first and throttle_s > 0:
            time.sleep(throttle_s)
        first = False

        ok = send_fn(msg, addr)
        if ok:
            _append_log(log_path, addr, "sent")
            already_sent.add(norm)
            counts["sent"] += 1
        else:
            _append_log(log_path, addr, "failed")
            counts["failed"] += 1

    return counts


# ---------------------------------------------------------------------------
# CLI
# ---------------------------------------------------------------------------

def main() -> None:
    parser = argparse.ArgumentParser(description="MinimaList outreach mailer")
    parser.add_argument("--input", type=Path, default=ACTIVE_FILE,
                        help="active.txt recipient list (default: data/outreach/active.txt)")
    parser.add_argument("--log", type=Path, default=LOG_FILE,
                        help="CSV send log (default: data/outreach/send_log.csv)")
    parser.add_argument("--unsubscribed", type=Path, default=UNSUBSCRIBED_FILE,
                        help="unsubscribed.txt suppression list")
    parser.add_argument("--dry-run", action="store_true", default=DRY_RUN,
                        help="compose and log but do not transmit (default: on)")
    parser.add_argument("--throttle", type=float, default=DEFAULT_THROTTLE_S,
                        help="seconds between sends (default: 5.0)")
    parser.add_argument("--confirmed-only", action="store_true",
                        help="send only to the confirmed tier (skip unverifiable)")
    args = parser.parse_args()

    if not args.input.exists():
        print(f"ERROR: input file not found: {args.input}", file=sys.stderr)
        sys.exit(1)

    with open(args.input, encoding="utf-8") as fh:
        tiers = parse_active_list(fh)

    if args.confirmed_only:
        recipients = tiers["confirmed"]
    else:
        recipients = tiers["confirmed"] + tiers["unverifiable"]

    unsubscribed = load_unsubscribed(args.unsubscribed)

    print(f"Recipients: {len(recipients)} ({len(tiers['confirmed'])} confirmed, "
          f"{len(tiers['unverifiable'])} unverifiable)")
    print(f"Unsubscribed: {len(unsubscribed)}")
    print(f"Dry-run: {args.dry_run}")
    print()

    if not args.dry_run and DRY_RUN:
        print("ERROR: DRY_RUN is True in the module — edit send.py to enable live sends.",
              file=sys.stderr)
        sys.exit(1)

    counts = send_batch(
        recipients=recipients,
        unsubscribed=unsubscribed,
        log_path=args.log,
        dry_run=args.dry_run,
        throttle_s=args.throttle,
    )

    print("=== Send report ===")
    print(f"  Composed: {counts['composed']}")
    print(f"  Sent:     {counts['sent']}")
    print(f"  Skipped:  {counts['skipped']}")
    print(f"  Failed:   {counts['failed']}")


if __name__ == "__main__":
    main()
