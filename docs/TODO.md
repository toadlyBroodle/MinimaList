# MinimaList TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- Phase 14.2 review: batch-sizing rule acknowledged — same-phase items must be bundled when tokens remain below band lower edge — by sst-dev-cycle at 2026-05-21T11:05Z
- Phase 14.2: build tools/outreach/validate.py (normalize, RFC-5322, dedupe, MX lookup, role/disposable flagging); Phase14ValidateTest 4 source-scan checks; 32 pytest behavioral tests; tests 297 → 301 — by sst-dev-cycle at 2026-05-21T10:30Z
- Phase14OutreachSetupTest: add emailListExistsInOutreachDir() asserting data/outreach/emails.txt exists; tests 296 → 297 — by sst-dev-cycle at 2026-05-21T09:05Z
- Phase 14.1: copy legacy email list to gitignored data/outreach/; create docs/PROMOTION_PLAN.md provenance stub — by sst-dev-cycle at 2026-05-21T00:10Z
- Phase 13.1–13.4: Settings buttons always white text; centered logo+title headers in Settings+Search fragments; nav-drawer logo hollow circles + butt caps; active drawer item accent color via dynamic ColorStateList — by sst-dev-cycle at 2026-05-20T16:45Z
- Phase 11.1 + 11.2: drawer header icon → vector drawable (5 density PNGs removed); drawer SubMenu reset-loop fix so only the active sublist stays accent-colored — by sst-dev-cycle at 2026-05-20T15:45Z
- Fix boot-reschedule main-thread Room crash (goAsync + AppMain.io) + unify alarm request codes on row.id across m4861b/m4862c/rescheduleAlarmsAfterBoot; OutlineRow.id field; OutlineRepositoryImpl.loadAllAsHashMap populates it; AppMain.EXECUTOR narrowed to Executor; 3 new tests (source-scan + behavioral) — by sst-dev-cycle at 2026-05-20T14:00Z
- Phase 8.2 + 8.3 acceptance: AlarmManager schedule/cancel behavioral tests; ReceiverNotification notification delivery; boot rescheduling (RECEIVE_BOOT_COMPLETED permission + intent filter + rescheduleAlarmsAfterBoot via new getRowsWithFutureReminders DAO query); Phase8WidgetTest manifest/source-scan + Robolectric onUpdate coverage — by sst-dev-cycle at 2026-05-20T12:30Z
- Phase8CrudTest: add editRow_mutatedTextSurvivesSerialisation test; guard OutlineRowView TextWatcher against null getLayout() — by sst-dev-cycle at 2026-05-20T11:00Z
- Phase 8.1 + 8.4 acceptance: added Robolectric 4.14.1 unit-test harness; Phase8CrudTest (21 tests) exercises the real OutlineTree CRUD engine; Phase8SettingsPrefsTest (13 tests); tests 224 → 258 — by sst-dev-cycle at 2026-05-19T22:42Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [medium] 14.3 Free SMTP `RCPT TO` mailbox probe (modeled on redaiteam `finder._verify_smtp`), run from the VPS, throttled; three-way classify (confirmed / unverifiable / rejected); produce tiered `data/outreach/active.txt` + funnel counts + expected bounce rate in `docs/PROMOTION_PLAN.md`. Reason: SPEC Phase 14
- [medium] 14.4 Research F-Droid inclusion (reproducible builds, fdroiddata metadata, fastlane layout, RFP vs merge request); write `docs/FDROID.md` submission checklist. Docs only. Reason: SPEC Phase 14
- [medium] 14.5 Write `docs/PROMOTION_PLAN.md` — botlab.dev SPF/DKIM/DMARC audit, legal framing, warmup/volume caps, plain-text content draft, monitoring kill-switch. No send scheduled. Reason: SPEC Phase 14
- [medium] 14.6 Build `tools/outreach/send.py` (adapt redaiteam `email.py`) with `DRY_RUN=True` hard gate, active.txt-only recipients, send log, unsubscribe suppression. Dry-run only — do not send. Reason: SPEC Phase 14

