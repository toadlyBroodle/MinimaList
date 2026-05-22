# MinimaList TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- 15.5 follow-up: fix FDROID.md Step 6 UpdateCheckData template (libs.versions.toml → app/build.gradle.kts) + direct operator to copy draft YAML; tests 360 → 363 — by sst-dev-cycle at 2026-05-22T20:00Z
- 15.2+15.4+15.5: fastlane metadata (short/full/title/changelog/icon), v107 tag+GitHub release, fdroiddata YAML linted; tests 631 → 653 — by sst-dev-cycle at 2026-05-22T19:00Z
- FDROID.md Step 1 + Step 4 checkboxes ticked and Prerequisites table updated after 15.1/15.3 shipped; tests 626 → 631 — by sst-dev-cycle at 2026-05-22T10:10Z
- 15.1 + 15.3: add MIT LICENSE (copyright toadlyBroodle) + pin buildToolsVersion = "35.0.0"; tests 327 → 333 — by sst-dev-cycle at 2026-05-22T00:05Z
- send.py BODY_TEMPLATE: add [mailing address] CAN-SPAM placeholder; Python tests 74 → 76; Java tests 326 → 327 — by sst-dev-cycle at 2026-05-21T13:10Z
- Phase 14.5 + 14.6: PROMOTION_PLAN.md five-section campaign plan (sender audit, legal, volume, content, monitoring); send.py DRY_RUN tool; Python tests 53 → 74; Java tests 314 → 326 — by sst-dev-cycle at 2026-05-21T12:20Z
- Phase 14.3 + 14.4: SMTP RCPT-TO probe → 1104 active addresses (1032 confirmed + 72 unverifiable, ~6% expected bounce rate); docs/FDROID.md 7-step checklist; Python tests 32 → 53; Java tests 301 → 314 — by sst-dev-cycle at 2026-05-21T11:05Z
- Phase 14.2 review: batch-sizing rule acknowledged — same-phase items must be bundled when tokens remain below band lower edge — by sst-dev-cycle at 2026-05-21T11:05Z
- Phase 14.2: build tools/outreach/validate.py (normalize, RFC-5322, dedupe, MX lookup, role/disposable flagging); Phase14ValidateTest 4 source-scan checks; 32 pytest behavioral tests; tests 297 → 301 — by sst-dev-cycle at 2026-05-21T10:30Z
- Phase14OutreachSetupTest: add emailListExistsInOutreachDir() asserting data/outreach/emails.txt exists; tests 296 → 297 — by sst-dev-cycle at 2026-05-21T09:05Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

<!-- Operator-only (not autonomous): docs/HUMAN.md H15.1 — submit the fdroiddata merge request once 15.1–15.5 are done. -->

