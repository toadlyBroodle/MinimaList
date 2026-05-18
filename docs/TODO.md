# sublist TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight


## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- 9.2a: wire OutlineRepository through MainActivity (async load callback) + OutlineRowView autosave; AppMain owns SublistDatabase/repo + io() executor + first-launch importLegacy gated on repo_migrated_v1 SharedPrefs flag; delete AppSettings m4937d/m4948m legacy Gson fallback loaders; tests 112 → 121 — by sst-dev-cycle at 2026-05-19T03:00Z
- fix replaceRowsForSublist atomicity (@Transaction default on OutlineRowDao) + importLegacy runInTransaction wrap; tests 108 → 112 — by sst-dev-cycle at 2026-05-19T02:00Z
- 9.1+9.2: Room schema (SublistEntity, OutlineRowEntity, 2 DAOs, SublistDatabase) + OutlineRepository interface + OutlineRepositoryImpl with importLegacy; tests 94 → 108 — by sst-dev-cycle at 2026-05-19T00:30Z
- 6.1-lint-fix-c/d: fix 19 WrongConstant errors (typed constants for getSystemService/Toast/DrawerLayout/AlarmManager/TypedValue/IMM) + POST_NOTIFICATIONS guard at 2 notify() sites; tests 85 → 94 — by sst-dev-cycle at 2026-05-18T23:30Z
- 6.6/6.7 lint errors fixed: super.onBackPressed() in MainActivity; Fab→OutlineFab in layout-large XML; tests 83 → 85 — by sst-dev-cycle at 2026-05-18T22:30Z
- Phase 6 closed (6.1–6.5): lint punch list captured; queries block for mailto:; scoped storage path (getExternalFilesDir); FLAG_IMMUTABLE on all PendingIntents; tests 76 → 83 — by sst-dev-cycle at 2026-05-18T21:45Z
- [should-fix] strengthen appMainRegistersChannel() to assert Build.VERSION.SDK_INT >= Build.VERSION_CODES.O guard in AppMain.java; tests 76 → 76 — by sst-dev-cycle at 2026-05-18T21:00Z
- 6.2 register CHANNEL_REMINDERS in AppMain.onCreate(); substitute at ReceiverNotification + MainActivity.mo4759F(); assembleDebug green; tests 71 → 76 — by sst-dev-cycle at 2026-05-18T20:15Z
- Phase 5 closed: add android.enableJetifier=false; 5.2 N/A (no android.support.* imports in tree); 5.3 N/A (material already uses com.google.android.material); assembleDebug green; tests 69 → 71 — by sst-dev-cycle at 2026-05-18T19:15Z
- 4.6 + 4.7 Phase 4 closed: all 5 ViewOnClickListenerC05NN audited (all standalone Fragments/Dialogs, none inlinable); assembleDebug green; device install deferred to Phase 7; tests 69 → 69 — by sst-dev-cycle at 2026-05-18T18:15Z
- [should-fix] MainActivity:533 add super.onRequestPermissionsResult(); OutlineFab:27 m4800a(true,true) setVisibility(GONE)→show(); tests 67→69 — by sst-dev-cycle at 2026-05-18T17:10Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [medium] [should-fix] MainActivity:82 — async Room-load callback unconditionally runs `mo4767a` → `tx.commit()`; can fire after `onSaveInstanceState` (rotation/background during first-launch migration) and throw `IllegalStateException`. Reason: review of 3022088
- [medium] [should-fix] add Robolectric/Mockito tests for OutlineRepositoryImpl (replaceRowsForSublist atomicity, importLegacy walk, CASCADE delete, loadAllAsHashMap/saveAllAsHashMap round-trip) — Phase9*Test.java + Phase9Wiring92aTest are source-scan only. Reason: review of 909c804; 9.2a added two new methods that also need real Room exercise.
- [easy] 7.1 `adb install -r` succeeds with no Play Protect warnings. Reason: blocked on adb + physical device in WSL build environment; skip to Phase 9 work until device is available.
- [easy] 7.2 App launches without ANR/crash; `adb logcat | grep AndroidRuntime` clean for 60s. Reason: same hardware blocker as 7.1.
- [easy] 7.3 Home-screen widget can be added without crashing launcher; widget renders even if empty. Reason: same hardware blocker as 7.1.
- [medium] 9.3 JSON export → SAF picker → user-chosen file; JSON import with replace-vs-merge prompt. Reason: next item in Phase 9 queue.
