#!/usr/bin/env python3
"""Email-address validation pipeline for the MinimaList legacy outreach list.

Reads data/outreach/emails.txt (PII — never committed, never logged).
Outputs data/outreach/validated.txt containing addresses that passed every
check, plus a bucket-count report to stdout.

Design: fail-closed, monotone.  The output is always a strict subset of the
input; anything ambiguous is dropped, not kept.  No email is ever sent here.

Buckets (applied in order):
  bad_syntax   — does not match RFC-5322 local@domain pattern
  duplicate    — already seen after normalize()
  disposable   — domain in known throwaway-domain list
  role         — local part is a well-known role address (info@, admin@, …)
  no_mx        — domain has no MX record (DNS lookup, no send)
  valid        — passes all checks; written to validated.txt
"""

import re
import sys
from pathlib import Path

import dns.resolver

PROJECT_ROOT = Path(__file__).resolve().parent.parent.parent
INPUT_FILE = PROJECT_ROOT / "data" / "outreach" / "emails.txt"
OUTPUT_FILE = PROJECT_ROOT / "data" / "outreach" / "validated.txt"

# ---------------------------------------------------------------------------
# Constants
# ---------------------------------------------------------------------------

ROLE_PREFIXES: frozenset[str] = frozenset({
    "abuse", "accounts", "admin", "alerts", "billing", "bounce", "careers",
    "contact", "daemon", "do-not-reply", "donotreply", "email", "feedback",
    "ftp", "help", "hostmaster", "hr", "info", "jobs", "legal", "mail",
    "mailer", "marketing", "media", "newsletter", "news", "no-reply",
    "noreply", "notifications", "postmaster", "press", "privacy", "root",
    "sales", "security", "support", "uucp", "usenet", "webmaster", "www",
})

DISPOSABLE_DOMAINS: frozenset[str] = frozenset({
    "10minutemail.com", "10minutemail.net", "10minutemail.org",
    "discard.email", "dispostable.com",
    "fakeinbox.com", "guerrillamail.com", "guerrillamail.de",
    "guerrillamail.info", "guerrillamail.net", "guerrillamail.org",
    "guerrillamailblock.com", "grr.la",
    "jetable.fr.nf", "mailinator.com", "mailnew.com", "mailnull.com",
    "mega.zik.dj", "minuteinbox.com",
    "moncourrier.fr.nf", "monemail.fr.nf", "monmail.fr.nf",
    "nospam.ze.tc", "nomail.xl.cx",
    "sharklasers.com", "spam4.me",
    "spamgourmet.com", "spamgourmet.net", "spamgourmet.org",
    "speed.1s.fr",
    "tempemail.com", "tempr.email", "throwam.com", "trashmail.at",
    "trashmail.com", "trashmail.io", "trashmail.me", "trashmail.net",
    "trashmail.org", "yopmail.com", "yopmail.fr",
    "cool.fr.nf", "courriel.fr.nf",
})

# Practical RFC-5322 approximation (not the full 6 KB grammar).
# local@domain where domain has at least one dot and a 2+-char TLD.
_RFC5322_RE = re.compile(
    r"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+"
    r"@"
    r"[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?"
    r"(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*"
    r"\.[a-zA-Z]{2,}$"
)


# ---------------------------------------------------------------------------
# Pure helpers (no I/O)
# ---------------------------------------------------------------------------

def normalize(address: str) -> str:
    return address.strip().lower()


def is_valid_syntax(address: str) -> bool:
    return bool(_RFC5322_RE.match(address))


def is_role_account(local: str) -> bool:
    return local.lower() in ROLE_PREFIXES


def is_disposable_domain(domain: str) -> bool:
    return domain.lower() in DISPOSABLE_DOMAINS


# ---------------------------------------------------------------------------
# DNS helper (side-effecting; injectable for tests)
# ---------------------------------------------------------------------------

def has_mx_record(domain: str) -> bool:
    """Return True only if the domain has at least one valid MX record.

    Fail-closed: any DNS error (NXDOMAIN, timeout, no answer) → False (drop).
    """
    try:
        answers = dns.resolver.resolve(domain, "MX", lifetime=5)
        return len(answers) > 0
    except Exception:
        return False


# ---------------------------------------------------------------------------
# Pipeline
# ---------------------------------------------------------------------------

def validate(
    input_path: Path,
    output_path: Path,
    mx_check=None,
) -> tuple[dict, list[str]]:
    """Validate the address list at input_path; write survivors to output_path.

    mx_check defaults to has_mx_record; inject a lambda in tests to avoid DNS.
    Returns (buckets, valid_list).  The output is always a strict subset of
    the input (fail-closed, monotone).
    """
    if mx_check is None:
        mx_check = has_mx_record

    raw_lines = input_path.read_text(encoding="utf-8", errors="replace").splitlines()

    buckets: dict[str, int] = {
        "raw": 0,
        "bad_syntax": 0,
        "duplicate": 0,
        "disposable": 0,
        "role": 0,
        "no_mx": 0,
        "valid": 0,
    }
    seen: set[str] = set()
    valid: list[str] = []

    for raw in raw_lines:
        addr = normalize(raw)
        if not addr:
            continue

        buckets["raw"] += 1

        if not is_valid_syntax(addr):
            buckets["bad_syntax"] += 1
            continue

        if addr in seen:
            buckets["duplicate"] += 1
            continue
        seen.add(addr)

        local, domain = addr.rsplit("@", 1)

        if is_disposable_domain(domain):
            buckets["disposable"] += 1
            continue

        if is_role_account(local):
            buckets["role"] += 1
            continue

        if not mx_check(domain):
            buckets["no_mx"] += 1
            continue

        buckets["valid"] += 1
        valid.append(addr)

    output_path.parent.mkdir(parents=True, exist_ok=True)
    output_path.write_text(
        "\n".join(valid) + ("\n" if valid else ""),
        encoding="utf-8",
    )
    return buckets, valid


# ---------------------------------------------------------------------------
# CLI entry point
# ---------------------------------------------------------------------------

def main() -> None:
    if not INPUT_FILE.exists():
        print(f"ERROR: input file not found: {INPUT_FILE}", file=sys.stderr)
        sys.exit(1)

    print(f"Reading from: {INPUT_FILE}")
    buckets, valid = validate(INPUT_FILE, OUTPUT_FILE)

    print("\n=== Email validation report ===")
    print(f"  Raw addresses read:       {buckets['raw']:>6}")
    print(f"  Bad syntax  (dropped):    {buckets['bad_syntax']:>6}")
    print(f"  Duplicates  (dropped):    {buckets['duplicate']:>6}")
    print(f"  Disposable  (dropped):    {buckets['disposable']:>6}")
    print(f"  Role accts  (dropped):    {buckets['role']:>6}")
    print(f"  No MX       (dropped):    {buckets['no_mx']:>6}")
    print(f"  Valid       (kept):       {buckets['valid']:>6}")
    print(f"\nOutput written to: {OUTPUT_FILE}")


if __name__ == "__main__":
    main()
