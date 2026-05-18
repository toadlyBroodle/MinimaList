# sublist TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

<!--
  One line per active workstream. Format:
  - [<who> @ <utc-iso>] <one-line: current focus>
  Empty when nothing is active.
-->

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- 6.1-lint-fix-c/d: fix 19 WrongConstant errors (typed constants for getSystemService/Toast/DrawerLayout/AlarmManager/TypedValue/IMM) + POST_NOTIFICATIONS guard at 2 notify() sites; tests 85 → 94 — by sst-dev-cycle at 2026-05-18T23:30Z
- 6.6/6.7 lint errors fixed: super.onBackPressed() in MainActivity; Fab→OutlineFab in layout-large XML; tests 83 → 85 — by sst-dev-cycle at 2026-05-18T22:30Z
- Phase 6 closed (6.1–6.5): lint punch list captured; queries block for mailto:; scoped storage path (getExternalFilesDir); FLAG_IMMUTABLE on all PendingIntents; tests 76 → 83 — by sst-dev-cycle at 2026-05-18T21:45Z
- [should-fix] strengthen appMainRegistersChannel() to assert Build.VERSION.SDK_INT >= Build.VERSION_CODES.O guard in AppMain.java; tests 76 → 76 — by sst-dev-cycle at 2026-05-18T21:00Z
- 6.2 register CHANNEL_REMINDERS in AppMain.onCreate(); substitute at ReceiverNotification + MainActivity.mo4759F(); assembleDebug green; tests 71 → 76 — by sst-dev-cycle at 2026-05-18T20:15Z
- Phase 5 closed: add android.enableJetifier=false; 5.2 N/A (no android.support.* imports in tree); 5.3 N/A (material already uses com.google.android.material); assembleDebug green; tests 69 → 71 — by sst-dev-cycle at 2026-05-18T19:15Z
- 4.6 + 4.7 Phase 4 closed: all 5 ViewOnClickListenerC05NN audited (all standalone Fragments/Dialogs, none inlinable); assembleDebug green; device install deferred to Phase 7; tests 69 → 69 — by sst-dev-cycle at 2026-05-18T18:15Z
- [should-fix] MainActivity:533 add super.onRequestPermissionsResult(); OutlineFab:27 m4800a(true,true) setVisibility(GONE)→show(); tests 67→69 — by sst-dev-cycle at 2026-05-18T17:10Z
- 6.2 [easy] Expand SPEC 6.2 to cover both notification-channel paths (MainActivity.mo4759F() + ReceiverNotification); define shared CHANNEL_REMINDERS constant pattern; check off Phase 4.5 [should-fix] follow-up — by sst-dev-cycle at 2026-05-18T16:15Z
- 4.5 [medium] Port ActMain→MainActivity + AppMain + WidgetProvider; full port DrawerCustomLayout (extends DrawerLayout) + OutlineFab (extends FloatingActionButton); delete decompiled R.java; update manifest (AppMain, WidgetProvider, ReceiverNotification); tests 54 → 67 — by sst-dev-cycle at 2026-05-18T15:30Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->


