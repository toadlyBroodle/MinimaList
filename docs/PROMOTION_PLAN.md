# MinimaList Promotion Plan

## Email List Provenance

Source: legacy `ca.toadlybroodledev.sublist` Google Play Store listing.
Developer account: access lost (original account no longer accessible).
Export date: unknown.
Raw list location: `data/outreach/emails.txt` (gitignored — PII, never commit or
paste into logs or transcripts).

---

## Phase 14.2 — Validation funnel (validate.py)

Pipeline: normalize → RFC-5322 syntax → dedupe → MX lookup → role/disposable flag.
Fail-closed: output is a strict subset of the input.

| Bucket | Count |
|--------|-------|
| Raw addresses | 1,152 |
| Bad syntax (dropped) | 0 |
| Duplicates (dropped) | 7 |
| Disposable domain (dropped) | 0 |
| Role accounts (dropped) | 0 |
| No MX record (dropped) | 4 |
| **Valid (written to validated.txt)** | **1,141** |

---

## Phase 14.3 — SMTP probe funnel (probe.py)

Tool: free SMTP `RCPT TO` probe from the VPS, throttled at 0.3 s between
connections. No email sent. Three-way classification: confirmed (250 accepted,
domain is not a catch-all) / unverifiable (connection failure, catch-all
domain, or ambiguous code) / rejected (hard 5xx).

Note: Gmail accounts for 1,092 of 1,141 valid addresses (95.7 %). Gmail's MX
servers return 250 for both valid and invalid addresses (anti-harvesting
catch-all behaviour), so all Gmail addresses land in the unverifiable tier.
The confirmed tier will consist primarily of addresses at smaller domains
whose MX servers disclose mailbox existence.

**Domain distribution of validated list:**
- gmail.com: 1,092 (95.7 %)
- hotmail.com: 9
- yahoo.com: 6
- googlemail.com: 6 (alias for gmail.com — same MX)
- outlook.com: 2
- Other (26 unique domains): 26

**SMTP probe results** (run 2026-05-21 from VPS `botlab.dev`, throttle 0.3 s, SMTP timeout 8 s):

Note: Gmail's MX servers (`gmail-smtp-in.l.google.com`) accurately disclosed mailbox
existence when probed from the VPS (botlab.dev has a reputable sending IP, full
SPF/DKIM/DMARC).  The bogus catch-all probe returned 550, so Gmail was NOT classified
as catch-all — addresses returned 250 are genuinely confirmed.

| Bucket | Count | Share |
|--------|-------|-------|
| Total probed | 1,141 | — |
| Confirmed (250, non-catch-all) | **1,032** | 90% |
| Unverifiable (catch-all / error / ambiguous) | 72 | 6% |
| Rejected (hard 5xx) | 37 | 3% |
| **Active list total (confirmed + unverifiable)** | **1,104** | — |

Expected bounce rate: ~6% (unverifiable share as a conservative upper bound; actual
bounce rate for the confirmed tier alone is lower, likely 1–3% given Gmail's accurate
disclosure).

Active list written to: `data/outreach/active.txt` (gitignored — PII).
Two-section format: `# tier:confirmed` followed by `# tier:unverifiable`.
Warmup sends should target the confirmed tier first.

---

## Phases 14.4–14.6 (planned)

Full campaign plan (sender setup, legal framing, volume plan, content draft,
monitoring) will be added in Phase 14.5.

Executing the campaign is a separate future phase requiring the user's
direct approval. No send is scheduled.
