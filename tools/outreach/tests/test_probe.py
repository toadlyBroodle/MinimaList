"""Behavioral tests for tools/outreach/probe.py.

Run with:  pytest tools/outreach/tests/test_probe.py -v
"""

import sys
import textwrap
from pathlib import Path
from unittest.mock import patch, MagicMock

import pytest

sys.path.insert(0, str(Path(__file__).resolve().parent.parent))

import probe as P  # noqa: E402


# ---------------------------------------------------------------------------
# classify_smtp
# ---------------------------------------------------------------------------

def test_classify_250_is_confirmed():
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 250) == "confirmed"


def test_classify_550_is_rejected():
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 550) == "rejected"


def test_classify_551_is_rejected():
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 551) == "rejected"


def test_classify_553_is_rejected():
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 553) == "rejected"


def test_classify_554_is_rejected():
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 554) == "rejected"


def test_classify_connection_error_is_unverifiable():
    def raise_err(e):
        raise ConnectionRefusedError("no route")
    assert P.classify_smtp("alice@example.com", smtp_fn=raise_err) == "unverifiable"


def test_classify_421_rate_limited_is_unverifiable():
    # 421 = service not available (rate limit / greylisting) → ambiguous, keep
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 421) == "unverifiable"


def test_classify_452_is_unverifiable():
    # 452 = insufficient storage → mailbox exists but can't receive; ambiguous
    assert P.classify_smtp("alice@example.com", smtp_fn=lambda e: 452) == "unverifiable"


def test_classify_catch_all_domain_is_unverifiable():
    # If a domain accepts a known-bogus probe address with 250, it's a catch-all
    catch_all_domains = {"catch-all.com"}
    result = P.classify_smtp(
        "alice@catch-all.com",
        smtp_fn=lambda e: 250,
        catch_all_domains=catch_all_domains,
    )
    assert result == "unverifiable"


# ---------------------------------------------------------------------------
# detect_catch_all
# ---------------------------------------------------------------------------

def test_detect_catch_all_returns_true_when_bogus_accepted():
    # If the domain returns 250 for a bogus address, it's a catch-all
    result = P.detect_catch_all("example.com", smtp_fn=lambda e: 250)
    assert result is True


def test_detect_catch_all_returns_false_when_bogus_rejected():
    result = P.detect_catch_all("example.com", smtp_fn=lambda e: 550)
    assert result is False


def test_detect_catch_all_returns_false_on_connection_error():
    def raise_err(e):
        raise ConnectionRefusedError()
    result = P.detect_catch_all("example.com", smtp_fn=raise_err)
    assert result is False


# ---------------------------------------------------------------------------
# probe() pipeline
# ---------------------------------------------------------------------------

def _write(path: Path, lines: list) -> None:
    path.write_text("\n".join(lines) + "\n", encoding="utf-8")


def _read_active(path: Path) -> tuple[list, list]:
    """Return (confirmed_list, unverifiable_list) from active.txt."""
    confirmed, unverifiable = [], []
    current = None
    for line in path.read_text(encoding="utf-8").splitlines():
        line = line.strip()
        if line == "# tier:confirmed":
            current = confirmed
        elif line == "# tier:unverifiable":
            current = unverifiable
        elif line and not line.startswith("#") and current is not None:
            current.append(line)
    return confirmed, unverifiable


def test_probe_puts_confirmed_in_active_txt(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    _write(inp, ["alice@example.com"])
    P.probe(inp, out, smtp_fn=lambda e: 250, throttle_s=0, catch_all_fn=lambda d: False)
    confirmed, _ = _read_active(out)
    assert "alice@example.com" in confirmed


def test_probe_puts_unverifiable_in_active_txt(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    _write(inp, ["alice@example.com"])

    def conn_err(e):
        raise ConnectionRefusedError()

    P.probe(inp, out, smtp_fn=conn_err, throttle_s=0, catch_all_fn=lambda d: False)
    _, unverifiable = _read_active(out)
    assert "alice@example.com" in unverifiable


def test_probe_excludes_rejected_from_active_txt(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    _write(inp, ["alice@example.com"])
    P.probe(inp, out, smtp_fn=lambda e: 550, throttle_s=0, catch_all_fn=lambda d: False)
    confirmed, unverifiable = _read_active(out)
    assert "alice@example.com" not in confirmed
    assert "alice@example.com" not in unverifiable


def test_probe_output_is_strict_subset_of_input(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    addresses = ["alice@example.com", "bob@example.com", "charlie@example.com"]
    _write(inp, addresses)

    responses = {"alice@example.com": 250, "bob@example.com": 550, "charlie@example.com": 421}
    P.probe(inp, out, smtp_fn=lambda e: responses[e], throttle_s=0, catch_all_fn=lambda d: False)

    confirmed, unverifiable = _read_active(out)
    output_set = set(confirmed) | set(unverifiable)
    for addr in output_set:
        assert addr in addresses


def test_probe_returns_bucket_counts(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    _write(inp, ["a@x.com", "b@x.com", "c@x.com"])
    responses = {"a@x.com": 250, "b@x.com": 550, "c@x.com": 421}
    buckets = P.probe(inp, out, smtp_fn=lambda e: responses[e], throttle_s=0, catch_all_fn=lambda d: False)
    assert buckets["confirmed"] == 1
    assert buckets["rejected"] == 1
    assert buckets["unverifiable"] == 1


def test_probe_empty_input_produces_empty_output(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    inp.write_text("", encoding="utf-8")
    buckets = P.probe(inp, out, smtp_fn=lambda e: 250, throttle_s=0, catch_all_fn=lambda d: False)
    assert buckets["confirmed"] == 0
    assert buckets["unverifiable"] == 0


def test_probe_writes_tier_headers_in_active_txt(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    _write(inp, ["a@x.com", "b@x.com"])
    responses = {"a@x.com": 250, "b@x.com": 421}
    P.probe(inp, out, smtp_fn=lambda e: responses[e], throttle_s=0, catch_all_fn=lambda d: False)
    content = out.read_text(encoding="utf-8")
    assert "# tier:confirmed" in content
    assert "# tier:unverifiable" in content


def test_probe_catch_all_domain_moves_to_unverifiable(tmp_path):
    inp = tmp_path / "validated.txt"
    out = tmp_path / "active.txt"
    _write(inp, ["alice@catchall.com"])
    # SMTP says 250 but domain is catch-all
    P.probe(inp, out, smtp_fn=lambda e: 250, throttle_s=0, catch_all_fn=lambda d: True)
    confirmed, unverifiable = _read_active(out)
    assert "alice@catchall.com" not in confirmed
    assert "alice@catchall.com" in unverifiable


def test_probe_missing_input_raises_file_not_found(tmp_path):
    out = tmp_path / "active.txt"
    missing = tmp_path / "nonexistent.txt"
    with pytest.raises(FileNotFoundError):
        P.probe(missing, out, smtp_fn=lambda e: 250, throttle_s=0)
