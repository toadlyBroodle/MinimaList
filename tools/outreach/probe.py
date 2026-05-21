#!/usr/bin/env python3
"""SMTP RCPT TO mailbox probe for the MinimaList legacy outreach list.

Reads data/outreach/validated.txt (output of validate.py — PII, never committed).
Probes each address via free SMTP RCPT TO (no email sent, no cost, no reputation
impact).  Classifies three ways:
  confirmed    — SMTP 250 (mailbox accepted) and domain is not a catch-all
  unverifiable — connection failure, catch-all domain, or any ambiguous code
  rejected     — hard SMTP reject (550/551/553/554/521)

Writes data/outreach/active.txt containing the confirmed + unverifiable tiers
with a tier header separating them, so the 14.5 warmup-volume plan can send to
confirmed first and treat unverifiable with extra care.

Design: fail-closed, monotone.  Output is always a strict subset of the input.
Anything ambiguous stays in or moves to the unverifiable tier — it is never
promoted to confirmed.

Run from the VPS (outbound port 25 is blocked from most residential / WSL
connections):
    scp tools/outreach/probe.py vps:~/probe.py
    scp data/outreach/validated.txt vps:~/validated.txt
    ssh vps "python3 ~/probe.py --input ~/validated.txt --output ~/active.txt"
    scp vps:~/active.txt data/outreach/active.txt

No email is ever sent by this script.
"""

import argparse
import smtplib
import sys
import time
from pathlib import Path

import dns.resolver

PROJECT_ROOT = Path(__file__).resolve().parent.parent.parent
INPUT_FILE = PROJECT_ROOT / "data" / "outreach" / "validated.txt"
OUTPUT_FILE = PROJECT_ROOT / "data" / "outreach" / "active.txt"

# HELO domain must be a plausible sending domain (does not affect reputation here
# because we issue QUIT before DATA).
HELO_DOMAIN = "botlab.dev"
MAIL_FROM = f"noreply@{HELO_DOMAIN}"

# Seconds between per-address probes.  Aggressive probing of a single domain
# looks like a dictionary attack; we throttle globally and skip domains after
# a rate-limit response.
DEFAULT_THROTTLE_S = 1.0

# Hard-reject SMTP response codes — mailbox definitively does not exist.
# 552 (storage exceeded) is intentionally excluded: mailbox exists, just full.
REJECT_CODES = frozenset({550, 551, 553, 554, 521})

# Bogus local-part used to detect catch-all domains.  Must be something no
# real mailbox would be named.
_CATCH_ALL_PROBE_LOCAL = "zzz-probe-notarealuserxyz"


# ---------------------------------------------------------------------------
# SMTP helpers
# ---------------------------------------------------------------------------

def _resolve_lowest_mx(domain: str) -> str:
    """Return the hostname of the lowest-preference MX for domain.

    Raises dns.exception.DNSException (or subclass) if not found.
    """
    records = dns.resolver.resolve(domain, "MX", lifetime=10)
    return str(sorted(records, key=lambda r: r.preference)[0].exchange).rstrip(".")


def _smtp_rcpt_code(email: str) -> int:
    """Open an SMTP connection to the domain's MX, issue RCPT TO, and return
    the response code.  Never sends DATA — quits immediately after RCPT.

    Returns an int SMTP response code, or raises on connection failure.
    """
    domain = email.rsplit("@", 1)[1]
    mx_host = _resolve_lowest_mx(domain)
    smtp = smtplib.SMTP(timeout=8)
    try:
        smtp.connect(mx_host, 25)
        smtp.helo(HELO_DOMAIN)
        smtp.mail(MAIL_FROM)
        code, _ = smtp.rcpt(email)
        return code
    finally:
        try:
            smtp.quit()
        except Exception:
            pass


# ---------------------------------------------------------------------------
# Public classification helpers (injectable for tests)
# ---------------------------------------------------------------------------

def classify_smtp(
    email: str,
    smtp_fn=None,
    catch_all_domains: set | None = None,
) -> str:
    """Classify one address.  Returns 'confirmed', 'rejected', or 'unverifiable'.

    smtp_fn: callable(email) -> int code, or raises on connection failure.
             Defaults to _smtp_rcpt_code.
    catch_all_domains: set of domains already identified as catch-alls.  An
                       address whose domain is in this set is always 'unverifiable'
                       regardless of the SMTP response.
    """
    if smtp_fn is None:
        smtp_fn = _smtp_rcpt_code
    if catch_all_domains is None:
        catch_all_domains = set()

    domain = email.rsplit("@", 1)[1]
    if domain in catch_all_domains:
        return "unverifiable"

    try:
        code = smtp_fn(email)
    except Exception:
        return "unverifiable"

    if code == 250:
        return "confirmed"
    if code in REJECT_CODES:
        return "rejected"
    return "unverifiable"


def detect_catch_all(domain: str, smtp_fn=None) -> bool:
    """Return True if domain is a catch-all (accepts any RCPT TO with 250).

    Probes a known-bogus address.  On any error returns False (fail-safe: we
    cannot confirm it is a catch-all, so we do not downgrade real addresses).
    """
    if smtp_fn is None:
        smtp_fn = _smtp_rcpt_code
    bogus = f"{_CATCH_ALL_PROBE_LOCAL}@{domain}"
    try:
        code = smtp_fn(bogus)
        return code == 250
    except Exception:
        return False


# ---------------------------------------------------------------------------
# Pipeline
# ---------------------------------------------------------------------------

def probe(
    input_path: Path,
    output_path: Path,
    smtp_fn=None,
    throttle_s: float = DEFAULT_THROTTLE_S,
    catch_all_fn=None,
) -> dict:
    """Probe every address in input_path; write active.txt to output_path.

    Returns a buckets dict with keys: confirmed, rejected, unverifiable, total.
    The output is always a strict subset of the input (fail-closed).

    smtp_fn: callable(email) -> int code (injectable for tests).
    catch_all_fn: callable(domain) -> bool (injectable for tests);
                  defaults to detect_catch_all.
    throttle_s: seconds to sleep between probes (0 in tests).
    """
    if smtp_fn is None:
        smtp_fn = _smtp_rcpt_code
    if catch_all_fn is None:
        catch_all_fn = lambda d: detect_catch_all(d, smtp_fn=smtp_fn)

    if not input_path.exists():
        raise FileNotFoundError(f"Input file not found: {input_path}")

    addresses = [
        line.strip()
        for line in input_path.read_text(encoding="utf-8").splitlines()
        if line.strip()
    ]

    buckets = {"confirmed": 0, "rejected": 0, "unverifiable": 0, "total": len(addresses)}
    confirmed_list: list[str] = []
    unverifiable_list: list[str] = []

    catch_all_cache: dict[str, bool] = {}
    smtp_call_count = 0

    for addr in addresses:
        domain = addr.rsplit("@", 1)[1]

        # Cache catch-all detection per domain (one SMTP connection per domain).
        if domain not in catch_all_cache:
            if smtp_call_count > 0 and throttle_s > 0:
                time.sleep(throttle_s)
            smtp_call_count += 1
            catch_all_cache[domain] = catch_all_fn(domain)

        # If domain is a catch-all, no per-address SMTP needed.
        if catch_all_cache[domain]:
            buckets["unverifiable"] += 1
            unverifiable_list.append(addr)
            continue

        # Per-address SMTP probe (throttled only for real connections).
        if smtp_call_count > 0 and throttle_s > 0:
            time.sleep(throttle_s)
        smtp_call_count += 1

        result = classify_smtp(addr, smtp_fn=smtp_fn, catch_all_domains=set())

        if result == "confirmed":
            buckets["confirmed"] += 1
            confirmed_list.append(addr)
        elif result == "rejected":
            buckets["rejected"] += 1
        else:
            buckets["unverifiable"] += 1
            unverifiable_list.append(addr)

    output_path.parent.mkdir(parents=True, exist_ok=True)
    lines = ["# tier:confirmed"]
    lines.extend(confirmed_list)
    lines.append("")
    lines.append("# tier:unverifiable")
    lines.extend(unverifiable_list)
    lines.append("")
    output_path.write_text("\n".join(lines), encoding="utf-8")

    return buckets


# ---------------------------------------------------------------------------
# CLI
# ---------------------------------------------------------------------------

def main() -> None:
    parser = argparse.ArgumentParser(description="SMTP RCPT TO mailbox probe")
    parser.add_argument("--input", type=Path, default=INPUT_FILE)
    parser.add_argument("--output", type=Path, default=OUTPUT_FILE)
    parser.add_argument("--throttle", type=float, default=DEFAULT_THROTTLE_S,
                        help="seconds between per-address probes (default: 1.0)")
    args = parser.parse_args()

    if not args.input.exists():
        print(f"ERROR: input file not found: {args.input}", file=sys.stderr)
        sys.exit(1)

    total_lines = sum(1 for l in args.input.read_text(encoding="utf-8").splitlines() if l.strip())
    print(f"Probing {total_lines} addresses from: {args.input}")
    print(f"Throttle: {args.throttle}s between probes")
    print("NOTE: run from the VPS — outbound port 25 is required\n")

    buckets = probe(args.input, args.output, throttle_s=args.throttle)

    total = buckets["total"]
    print("=== SMTP probe report ===")
    print(f"  Total probed:        {total:>6}")
    print(f"  Confirmed    (kept): {buckets['confirmed']:>6}  ({100*buckets['confirmed']//max(total,1)}%)")
    print(f"  Unverifiable (kept): {buckets['unverifiable']:>6}  ({100*buckets['unverifiable']//max(total,1)}%)")
    print(f"  Rejected    (drop):  {buckets['rejected']:>6}  ({100*buckets['rejected']//max(total,1)}%)")
    active = buckets["confirmed"] + buckets["unverifiable"]
    print(f"\n  Active list total:   {active:>6}")
    if active > 0:
        pct_unverifiable = 100 * buckets["unverifiable"] // active
        print(f"  Unverifiable share:  {pct_unverifiable}% of active list")
        print(f"  Expected bounce rate (unverifiable share as proxy): ~{pct_unverifiable}%")
    print(f"\nOutput written to: {args.output}")


if __name__ == "__main__":
    main()
