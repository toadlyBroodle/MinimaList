"""Behavioral tests for tools/outreach/send.py.

Run with:  pytest tools/outreach/tests/test_send.py -v
"""

import csv
import sys
import textwrap
from io import StringIO
from pathlib import Path
from unittest.mock import patch, MagicMock

import pytest

sys.path.insert(0, str(Path(__file__).resolve().parent.parent))

import send as S  # noqa: E402


# ---------------------------------------------------------------------------
# Safety gate: DRY_RUN must default to True
# ---------------------------------------------------------------------------

def test_dry_run_defaults_to_true():
    """The module-level DRY_RUN constant must be True out of the box."""
    assert S.DRY_RUN is True


# ---------------------------------------------------------------------------
# compose_message
# ---------------------------------------------------------------------------

def test_compose_message_returns_mime_text():
    from email.mime.text import MIMEText
    msg = S.compose_message("alice@example.com")
    assert isinstance(msg, MIMEText)


def test_compose_message_from_header():
    msg = S.compose_message("alice@example.com")
    assert "rob@botlab.dev" in msg["From"]


def test_compose_message_to_header():
    msg = S.compose_message("alice@example.com")
    assert msg["To"] == "alice@example.com"


def test_compose_message_has_list_unsubscribe():
    msg = S.compose_message("alice@example.com")
    assert msg["List-Unsubscribe"] is not None
    assert "mailto:" in msg["List-Unsubscribe"]


def test_compose_message_has_message_id():
    msg = S.compose_message("alice@example.com")
    assert msg["Message-ID"] is not None
    assert "@" in msg["Message-ID"]


def test_compose_message_has_date():
    msg = S.compose_message("alice@example.com")
    assert msg["Date"] is not None


def test_compose_message_body_contains_fdroid_or_github_link():
    msg = S.compose_message("alice@example.com")
    body = msg.get_payload(decode=True).decode("utf-8")
    assert "github.com/toadlyBroodle/MinimaList" in body or "f-droid" in body.lower()


def test_compose_message_body_has_unsubscribe_instructions():
    msg = S.compose_message("alice@example.com")
    body = msg.get_payload(decode=True).decode("utf-8")
    assert "unsubscribe" in body.lower()


def test_body_template_contains_mailing_address_placeholder():
    """CAN-SPAM requires a physical mailing address; placeholder must be present."""
    assert "[mailing address]" in S.BODY_TEMPLATE


def test_compose_message_body_contains_mailing_address_placeholder():
    """Composed message body must carry the [mailing address] placeholder."""
    msg = S.compose_message("alice@example.com")
    body = msg.get_payload(decode=True).decode("utf-8")
    assert "[mailing address]" in body


# ---------------------------------------------------------------------------
# parse_active_list
# ---------------------------------------------------------------------------

def test_parse_active_list_confirmed_tier():
    txt = "# tier:confirmed\nalice@example.com\nbob@example.com\n\n# tier:unverifiable\n"
    result = S.parse_active_list(StringIO(txt))
    assert result["confirmed"] == ["alice@example.com", "bob@example.com"]
    assert result["unverifiable"] == []


def test_parse_active_list_unverifiable_tier():
    txt = "# tier:confirmed\n\n# tier:unverifiable\ncarol@example.com\n"
    result = S.parse_active_list(StringIO(txt))
    assert result["confirmed"] == []
    assert result["unverifiable"] == ["carol@example.com"]


def test_parse_active_list_both_tiers():
    txt = "# tier:confirmed\na@x.com\n\n# tier:unverifiable\nb@x.com\n"
    result = S.parse_active_list(StringIO(txt))
    assert result["confirmed"] == ["a@x.com"]
    assert result["unverifiable"] == ["b@x.com"]


def test_parse_active_list_skips_blank_and_comment_lines():
    txt = "# tier:confirmed\n# extra comment\n\nalice@example.com\n\n# tier:unverifiable\n"
    result = S.parse_active_list(StringIO(txt))
    assert result["confirmed"] == ["alice@example.com"]


# ---------------------------------------------------------------------------
# load_unsubscribed
# ---------------------------------------------------------------------------

def test_load_unsubscribed_returns_set(tmp_path):
    f = tmp_path / "unsubscribed.txt"
    f.write_text("alice@example.com\nbob@example.com\n")
    result = S.load_unsubscribed(f)
    assert result == {"alice@example.com", "bob@example.com"}


def test_load_unsubscribed_missing_file_returns_empty(tmp_path):
    result = S.load_unsubscribed(tmp_path / "nonexistent.txt")
    assert result == set()


def test_load_unsubscribed_normalizes_case(tmp_path):
    f = tmp_path / "unsubscribed.txt"
    f.write_text("Alice@EXAMPLE.COM\n")
    result = S.load_unsubscribed(f)
    assert "alice@example.com" in result


# ---------------------------------------------------------------------------
# send_batch (dry-run behavior)
# ---------------------------------------------------------------------------

def test_send_batch_dry_run_logs_all_and_sends_none(tmp_path):
    log_path = tmp_path / "send_log.csv"
    recipients = ["a@x.com", "b@x.com"]
    sent_calls = []

    results = S.send_batch(
        recipients=recipients,
        unsubscribed=set(),
        log_path=log_path,
        dry_run=True,
        send_fn=lambda msg, to: sent_calls.append(to) or True,
        throttle_s=0,
    )

    assert len(sent_calls) == 0, "dry_run=True must never call send_fn"
    assert results["composed"] == 2
    assert results["sent"] == 0
    assert results["skipped"] == 0


def test_send_batch_skips_unsubscribed(tmp_path):
    log_path = tmp_path / "send_log.csv"
    recipients = ["a@x.com", "b@x.com"]
    sent_calls = []

    results = S.send_batch(
        recipients=recipients,
        unsubscribed={"a@x.com"},
        log_path=log_path,
        dry_run=False,
        send_fn=lambda msg, to: sent_calls.append(to) or True,
        throttle_s=0,
    )

    assert "a@x.com" not in sent_calls
    assert "b@x.com" in sent_calls
    assert results["skipped"] == 1
    assert results["sent"] == 1


def test_send_batch_does_not_double_send(tmp_path):
    """A re-run with an existing log must skip previously-sent addresses."""
    log_path = tmp_path / "send_log.csv"
    # Pre-populate log with a@x.com already sent
    with open(log_path, "w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["recipient", "status", "timestamp"])
        writer.writerow(["a@x.com", "sent", "2026-05-21T12:00:00Z"])

    sent_calls = []
    S.send_batch(
        recipients=["a@x.com", "b@x.com"],
        unsubscribed=set(),
        log_path=log_path,
        dry_run=False,
        send_fn=lambda msg, to: sent_calls.append(to) or True,
        throttle_s=0,
    )

    assert "a@x.com" not in sent_calls
    assert "b@x.com" in sent_calls


def test_send_batch_writes_log_entries(tmp_path):
    log_path = tmp_path / "send_log.csv"
    S.send_batch(
        recipients=["a@x.com"],
        unsubscribed=set(),
        log_path=log_path,
        dry_run=False,
        send_fn=lambda msg, to: True,
        throttle_s=0,
    )
    rows = list(csv.DictReader(open(log_path)))
    assert len(rows) == 1
    assert rows[0]["recipient"] == "a@x.com"
    assert rows[0]["status"] == "sent"


def test_send_batch_logs_failed_sends(tmp_path):
    log_path = tmp_path / "send_log.csv"
    S.send_batch(
        recipients=["a@x.com"],
        unsubscribed=set(),
        log_path=log_path,
        dry_run=False,
        send_fn=lambda msg, to: False,
        throttle_s=0,
    )
    rows = list(csv.DictReader(open(log_path)))
    assert rows[0]["status"] == "failed"
