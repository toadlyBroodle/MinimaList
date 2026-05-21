"""Behavioral tests for tools/outreach/validate.py.

Run with:  pytest tools/outreach/tests/test_validate.py -v
"""

import sys
import textwrap
from pathlib import Path

import pytest

# Allow importing validate from the parent directory
sys.path.insert(0, str(Path(__file__).resolve().parent.parent))

import validate as V  # noqa: E402


# ---------------------------------------------------------------------------
# normalize
# ---------------------------------------------------------------------------

def test_normalize_strips_leading_trailing_whitespace():
    assert V.normalize("  user@example.com  ") == "user@example.com"


def test_normalize_lowercases():
    assert V.normalize("User@EXAMPLE.COM") == "user@example.com"


def test_normalize_strips_tabs_and_newlines():
    assert V.normalize("\tuser@example.com\n") == "user@example.com"


# ---------------------------------------------------------------------------
# is_valid_syntax
# ---------------------------------------------------------------------------

def test_syntax_accepts_simple_address():
    assert V.is_valid_syntax("user@example.com")


def test_syntax_accepts_plus_addressing():
    assert V.is_valid_syntax("user+tag@example.com")


def test_syntax_accepts_subdomain():
    assert V.is_valid_syntax("user@mail.example.co.uk")


def test_syntax_rejects_missing_at():
    assert not V.is_valid_syntax("userexample.com")


def test_syntax_rejects_missing_local():
    assert not V.is_valid_syntax("@example.com")


def test_syntax_rejects_missing_domain():
    assert not V.is_valid_syntax("user@")


def test_syntax_rejects_no_tld():
    assert not V.is_valid_syntax("user@localhost")


def test_syntax_rejects_double_at():
    assert not V.is_valid_syntax("user@@example.com")


def test_syntax_rejects_space_in_address():
    assert not V.is_valid_syntax("us er@example.com")


# ---------------------------------------------------------------------------
# is_role_account
# ---------------------------------------------------------------------------

def test_role_flags_info():
    assert V.is_role_account("info")


def test_role_flags_admin():
    assert V.is_role_account("admin")


def test_role_flags_noreply():
    assert V.is_role_account("noreply")


def test_role_flags_support():
    assert V.is_role_account("support")


def test_role_keeps_real_user():
    assert not V.is_role_account("alice")


def test_role_keeps_longer_name():
    assert not V.is_role_account("johndoe")


# ---------------------------------------------------------------------------
# is_disposable_domain
# ---------------------------------------------------------------------------

def test_disposable_flags_mailinator():
    assert V.is_disposable_domain("mailinator.com")


def test_disposable_flags_yopmail():
    assert V.is_disposable_domain("yopmail.com")


def test_disposable_keeps_gmail():
    assert not V.is_disposable_domain("gmail.com")


def test_disposable_keeps_real_domain():
    assert not V.is_disposable_domain("example.com")


# ---------------------------------------------------------------------------
# validate() pipeline (MX check injected so no real DNS in unit tests)
# ---------------------------------------------------------------------------

def _write(path: Path, lines: list[str]) -> None:
    path.write_text("\n".join(lines) + "\n", encoding="utf-8")


def _read(path: Path) -> list[str]:
    return [l for l in path.read_text(encoding="utf-8").splitlines() if l.strip()]


def test_validate_keeps_valid_address(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["alice@example.com"])
    buckets, valid = V.validate(inp, out, mx_check=lambda d: True)
    assert "alice@example.com" in valid
    assert buckets["valid"] == 1


def test_validate_drops_bad_syntax(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["not-an-email", "alice@example.com"])
    buckets, valid = V.validate(inp, out, mx_check=lambda d: True)
    assert buckets["bad_syntax"] == 1
    assert "alice@example.com" in valid
    assert "not-an-email" not in valid


def test_validate_deduplicates(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["alice@example.com", "ALICE@EXAMPLE.COM", "alice@example.com"])
    buckets, valid = V.validate(inp, out, mx_check=lambda d: True)
    assert buckets["duplicate"] == 2
    assert valid.count("alice@example.com") == 1


def test_validate_drops_role_accounts(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["info@example.com", "admin@example.com", "alice@example.com"])
    buckets, valid = V.validate(inp, out, mx_check=lambda d: True)
    assert buckets["role"] == 2
    assert "alice@example.com" in valid
    assert "info@example.com" not in valid


def test_validate_drops_disposable_domains(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["user@mailinator.com", "alice@example.com"])
    buckets, valid = V.validate(inp, out, mx_check=lambda d: True)
    assert buckets["disposable"] == 1
    assert "alice@example.com" in valid
    assert "user@mailinator.com" not in valid


def test_validate_drops_no_mx_domain(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["alice@example.com", "bob@nodns.invalid"])
    buckets, valid = V.validate(inp, out, mx_check=lambda d: d == "example.com")
    assert buckets["no_mx"] == 1
    assert "alice@example.com" in valid
    assert "bob@nodns.invalid" not in valid


def test_validate_output_is_strict_subset_of_input(tmp_path):
    """Fail-closed invariant: output set ⊆ input set."""
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    raw = [
        "alice@example.com",
        "bob@example.com",
        "not-an-email",
        "info@example.com",
        "user@mailinator.com",
        "bob@nodns.invalid",
    ]
    _write(inp, raw)
    raw_lower = {r.strip().lower() for r in raw}
    _, valid = V.validate(inp, out, mx_check=lambda d: d == "example.com")
    for addr in valid:
        assert addr in raw_lower, f"{addr!r} in output but not in input"


def test_validate_writes_output_file(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    _write(inp, ["alice@example.com"])
    V.validate(inp, out, mx_check=lambda d: True)
    assert out.exists()
    assert "alice@example.com" in _read(out)


def test_validate_empty_input_produces_empty_output(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    inp.write_text("", encoding="utf-8")
    buckets, valid = V.validate(inp, out, mx_check=lambda d: True)
    assert valid == []
    assert buckets["raw"] == 0


def test_validate_bucket_counts_are_correct(tmp_path):
    inp = tmp_path / "emails.txt"
    out = tmp_path / "validated.txt"
    lines = [
        "alice@example.com",      # valid
        "bob@example.com",        # valid
        "not-an-email",           # bad_syntax
        "ALICE@EXAMPLE.COM",      # duplicate of alice
        "info@example.com",       # role
        "user@mailinator.com",    # disposable
        "ghost@nodns.invalid",    # no_mx
    ]
    _write(inp, lines)
    buckets, valid = V.validate(inp, out, mx_check=lambda d: d == "example.com")
    assert buckets["raw"] == 7
    assert buckets["bad_syntax"] == 1
    assert buckets["duplicate"] == 1
    assert buckets["role"] == 1
    assert buckets["disposable"] == 1
    assert buckets["no_mx"] == 1
    assert buckets["valid"] == 2
    assert len(valid) == 2
