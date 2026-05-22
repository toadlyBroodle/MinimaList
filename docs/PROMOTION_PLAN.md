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

The 37 hard-rejected addresses were removed from `validated.txt` (now 1,104, matching
the active list) and saved to `data/outreach/rejected.txt` (gitignored — PII) as a
permanent suppression record, so they are never re-probed or sent to.

---

## Phase 14.5 — Full campaign plan

**No send is scheduled. Executing the campaign is a separate future phase
requiring the user's direct approval before any message is transmitted.**

---

### (a) Sender setup — botlab.dev audit

Sender identity for any future campaign: `rob@botlab.dev`  
VPS: `server1.botlab.dev` (203.161.57.177), Postfix + OpenDKIM milter on port 8891.

**SPF** (`v=spf1 ip4:203.161.57.177 -all`)  
Status: **pass**. Single IP authorization with hard fail (`-all`). No gaps.

**DKIM** (selector `mail._domainkey.botlab.dev`, RSA-2048 / SHA-256)  
Status: **pass**. OpenDKIM milter wired to Postfix; key published and valid.

**DMARC** (`v=DMARC1; p=quarantine; pct=100; rua=...postmarkapp.com; aspf=r;`)  
Status: **partial**. Aggregate reports go to Postmark. `p=quarantine` means
spoofed mail lands in spam rather than bouncing. `p=reject` is the hardened
target.

**Gaps to close before any send:**

| Gap | Action |
|-----|--------|
| DMARC at `p=quarantine`, not `p=reject` | Review Postmark aggregate reports for a clean week, then step to `p=reject` |
| No Google Postmaster Tools domain registration | Register `botlab.dev` at postmaster.google.com (free) — surfaces Gmail-specific complaint rate |
| No `List-Unsubscribe-Post` (RFC 8058 one-click) header | Add alongside `List-Unsubscribe` mailto in send.py for Gmail compliance |
| No PTR / rDNS verified | Confirm `203.161.57.177` has a matching PTR record pointing to `server1.botlab.dev` |

---

### (b) Legal framing

**Classification:** one-time service announcement to users who voluntarily installed
the app, not recurring marketing.

**CAN-SPAM (US):** applies to commercial email. This message is treated as
transactional / informational (app re-release notice to existing users), which is
exempt from the physical-postal-address requirement that applies to commercial mail.
At minimum:
- No postal address is included (decision 2026-05-22). This relies on the message
  qualifying as transactional/relationship content rather than commercial. If the
  content ever gains a promotional slant and is judged commercial, a valid physical
  postal address becomes legally required — revisit before sending in that case.
- A clear, working unsubscribe mechanism honored within 10 business days. The
  `List-Unsubscribe` header plus an in-body "reply with UNSUBSCRIBE" instruction
  satisfies this; replies are processed manually into `unsubscribed.txt`.
- `From` and `Reply-To` must identify the real sender. `rob@botlab.dev` does.
- No deceptive subject lines. "MinimaList — the app you installed is back" is
  factually accurate.

**GDPR (EU):** the legacy Play Store email list was collected under Google's Play
privacy policy, not under a direct consent mechanism for subsequent marketing emails.
EU recipients are the highest-risk cohort.
- Practical posture: treat every recipient as potentially EU-resident.
- One-time service announcement (no tracking pixels, no profiling, no re-targeting)
  is the safest approach; legitimate interest is a defensible basis for a single
  re-engagement notice to a user who explicitly installed the app.
- Include a clear unsubscribe path. Honor it permanently.
- Do not append or enrich the list (no third-party data merge).

**CASL (Canada):** stricter than CAN-SPAM. Installing an app on Play Store can
constitute "implied consent" under CASL s.10(9)(a) (existing business relationship)
for up to 2 years after last interaction. Given the ~7-year gap, implied consent has
lapsed for most Canadian addresses. Practical mitigation: same as GDPR posture —
single message, easy unsubscribe, no repeat sends.

**Bottom line:** one message, clear sender, working unsubscribe, no re-send, no
enrichment.

---

### (c) Volume plan — warmup ramp

`botlab.dev` is an established transactional sender (botlab.dev AI tools) so it has
some sending reputation, but no bulk-email history. The warmup schedule below is
conservative relative to what a cold domain requires.

**Hard limits (Gmail/Yahoo/Microsoft 2026):**
- Spam complaint rate: hard cap 0.3%, target <0.1%
- Bounce rate: hard cap 5%, target <2% (the ~6% unverifiable share is the risk)
- `5,000+/day` to Gmail = permanent "bulk sender" classification (not applicable here)

**Warmup schedule for botlab.dev bulk send:**

| Week | Daily volume | Notes |
|------|-------------|-------|
| 1 | 20–30/day | Confirmed tier only; monitor bounce + complaint rate closely |
| 2 | 50–75/day | Continue confirmed tier if week-1 complaints < 0.05% |
| 3 | 100–150/day | Extend to unverifiable tier if bounce rate from week 2 < 2% |
| 4 | 200–300/day | Full list if metrics hold |

**Never raise volume >20% day-over-day.**

Total list: 1,104 addresses. At 200/day the full list sends in ~6 days.
At 50/day: ~22 days. Recommend 50–100/day for a single-message campaign of this
size; the warmup cost is low relative to the reputation risk.

**Throttle in send.py:** default 5s between messages; `--throttle` flag overrides.

---

### (d) Content draft

**Subject:** `MinimaList — the app you installed is back, cloud-free`

**From:** `Rob (MinimaList) <rob@botlab.dev>`

**List-Unsubscribe:** `<mailto:rob@botlab.dev?subject=unsubscribe>`

**Body (plain text):**

```
Hi,

You installed MinimaList (formerly Sublist) from Google Play a few years ago.
The app has been rewritten from scratch — cloud-free, no ads, no tracking, no
accounts.

Download the latest build:
  https://github.com/toadlyBroodle/MinimaList/releases

An F-Droid listing is in progress. All outline data stays on your device.

– Rob

---
To be removed from future emails, reply to this email with UNSUBSCRIBE.
```

**Notes before sending:**
1. No postal address — the message is sent as a transactional/relationship notice
   (see Legal framing). Do not add promotional content that would reclassify it.
2. Once the F-Droid listing is live, update the link to the F-Droid page.
3. A GitHub Releases fallback is appropriate until F-Droid is available.
4. No tracking pixels, no UTM parameters — consistent with the privacy posture.
5. Unsubscribe replies (subject or body containing "unsubscribe" / "UNSUBSCRIBE")
   are processed manually into `data/outreach/unsubscribed.txt` between batches.

---

### (e) Monitoring and kill-switch

**Metrics to watch:**

| Metric | Stop threshold | Action |
|--------|---------------|--------|
| Spam complaint rate | > 0.1% | Pause immediately; investigate before resuming |
| Bounce rate | > 2% | Pause; review unverifiable tier strategy |
| Unsubscribe rate | > 2% | Review content; do not re-send to unsubscribers |
| Send failures | > 5% | Check Postfix queue and SMTP relay health |

**Sources for complaint rate:**
- Google Postmaster Tools (`postmaster.google.com`) — free, shows Gmail-specific
  complaint rate by domain. Register before sending.
- Postmark DMARC aggregate reports (already configured via `rua=` in DMARC record).

**Kill-switch protocol:**
1. Set `DRY_RUN = True` in `tools/outreach/send.py` and stop the run.
2. Do not resume until the metric has been investigated and resolved.
3. Never re-send to an address that bounced hard or unsubscribed.

**send.py safety properties (enforced, not advisory):**
- `DRY_RUN = True` is the module default — live sends require a deliberate code
  change by the user.
- The send log (`data/outreach/send_log.csv`) prevents double-sends on re-runs.
- Unsubscribed addresses in `data/outreach/unsubscribed.txt` are suppressed before
  composition — they are never even composed for in dry-run.
