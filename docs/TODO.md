# MinimaList TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- send.py BODY_TEMPLATE: add [mailing address] CAN-SPAM placeholder; Python tests 74 → 76; Java tests 326 → 327 — by sst-dev-cycle at 2026-05-21T13:10Z
- Phase 14.5 + 14.6: PROMOTION_PLAN.md five-section campaign plan (sender audit, legal, volume, content, monitoring); send.py DRY_RUN tool; Python tests 53 → 74; Java tests 314 → 326 — by sst-dev-cycle at 2026-05-21T12:20Z
- Phase 14.3 + 14.4: SMTP RCPT-TO probe → 1104 active addresses (1032 confirmed + 72 unverifiable, ~6% expected bounce rate); docs/FDROID.md 7-step checklist; Python tests 32 → 53; Java tests 301 → 314 — by sst-dev-cycle at 2026-05-21T11:05Z
- Phase 14.2 review: batch-sizing rule acknowledged — same-phase items must be bundled when tokens remain below band lower edge — by sst-dev-cycle at 2026-05-21T11:05Z
- Phase 14.2: build tools/outreach/validate.py (normalize, RFC-5322, dedupe, MX lookup, role/disposable flagging); Phase14ValidateTest 4 source-scan checks; 32 pytest behavioral tests; tests 297 → 301 — by sst-dev-cycle at 2026-05-21T10:30Z
- Phase14OutreachSetupTest: add emailListExistsInOutreachDir() asserting data/outreach/emails.txt exists; tests 296 → 297 — by sst-dev-cycle at 2026-05-21T09:05Z
- Phase 14.1: copy legacy email list to gitignored data/outreach/; create docs/PROMOTION_PLAN.md provenance stub — by sst-dev-cycle at 2026-05-21T00:10Z
- Phase 13.1–13.4: Settings buttons always white text; centered logo+title headers in Settings+Search fragments; nav-drawer logo hollow circles + butt caps; active drawer item accent color via dynamic ColorStateList — by sst-dev-cycle at 2026-05-20T16:45Z
- Phase 11.1 + 11.2: drawer header icon → vector drawable (5 density PNGs removed); drawer SubMenu reset-loop fix so only the active sublist stays accent-colored — by sst-dev-cycle at 2026-05-20T15:45Z
- Fix boot-reschedule main-thread Room crash (goAsync + AppMain.io) + unify alarm request codes on row.id across m4861b/m4862c/rescheduleAlarmsAfterBoot; OutlineRow.id field; OutlineRepositoryImpl.loadAllAsHashMap populates it; AppMain.EXECUTOR narrowed to Executor; 3 new tests (source-scan + behavioral) — by sst-dev-cycle at 2026-05-20T14:00Z
- Phase 8.2 + 8.3 acceptance: AlarmManager schedule/cancel behavioral tests; ReceiverNotification notification delivery; boot rescheduling (RECEIVE_BOOT_COMPLETED permission + intent filter + rescheduleAlarmsAfterBoot via new getRowsWithFutureReminders DAO query); Phase8WidgetTest manifest/source-scan + Robolectric onUpdate coverage — by sst-dev-cycle at 2026-05-20T12:30Z
- Phase8CrudTest: add editRow_mutatedTextSurvivesSerialisation test; guard OutlineRowView TextWatcher against null getLayout() — by sst-dev-cycle at 2026-05-20T11:00Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->


