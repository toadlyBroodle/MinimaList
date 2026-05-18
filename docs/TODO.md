# sublist TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- strengthen Phase9SettingsFragmentLifecycleTest: replace 4 bare src.contains() with 2 countOccurrences()>=2 checks; tests 155 → 153 — by sst-dev-cycle at 2026-05-19T08:15Z
- add isAdded()/getActivity()==null guard to SettingsFragment.doImportReplace + doImportMerge main.post success lambdas; tests 151 → 155 — by sst-dev-cycle at 2026-05-18T07:15Z
- 9.3 JSON export (OutlineStore.exportToUri via SAF ACTION_CREATE_DOCUMENT) + JSON import (ACTION_OPEN_DOCUMENT, replace-vs-merge AlertDialog, merge via RowActionListener.mo4767a) + close batch-sizing meta-item by batching same-phase 9.3; tests 138 → 151 — by sst-dev-cycle at 2026-05-19T06:45Z
- fix MainActivity:82 async-callback guard (isFinishing/isDestroyed/isStateSaved) + Mockito behavioral tests for OutlineRepositoryImpl (16 tests: replaceRowsForSublist delegation, importLegacy transaction+field mapping, loadAllAsHashMap, saveAllAsHashMap); tests 121 → 138 — by sst-dev-cycle at 2026-05-19T05:30Z
- 9.2a: wire OutlineRepository through MainActivity (async load callback) + OutlineRowView autosave; AppMain owns SublistDatabase/repo + io() executor + first-launch importLegacy gated on repo_migrated_v1 SharedPrefs flag; delete AppSettings m4937d/m4948m legacy Gson fallback loaders; tests 112 → 121 — by sst-dev-cycle at 2026-05-19T03:00Z
- fix replaceRowsForSublist atomicity (@Transaction default on OutlineRowDao) + importLegacy runInTransaction wrap; tests 108 → 112 — by sst-dev-cycle at 2026-05-19T02:00Z
- 9.1+9.2: Room schema (SublistEntity, OutlineRowEntity, 2 DAOs, SublistDatabase) + OutlineRepository interface + OutlineRepositoryImpl with importLegacy; tests 94 → 108 — by sst-dev-cycle at 2026-05-19T00:30Z
- 6.1-lint-fix-c/d: fix 19 WrongConstant errors (typed constants for getSystemService/Toast/DrawerLayout/AlarmManager/TypedValue/IMM) + POST_NOTIFICATIONS guard at 2 notify() sites; tests 85 → 94 — by sst-dev-cycle at 2026-05-18T23:30Z
- 6.6/6.7 lint errors fixed: super.onBackPressed() in MainActivity; Fab→OutlineFab in layout-large XML; tests 83 → 85 — by sst-dev-cycle at 2026-05-18T22:30Z
- Phase 6 closed (6.1–6.5): lint punch list captured; queries block for mailto:; scoped storage path (getExternalFilesDir); FLAG_IMMUTABLE on all PendingIntents; tests 76 → 83 — by sst-dev-cycle at 2026-05-18T21:45Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [easy] 7.1 `adb install -r` succeeds with no Play Protect warnings. Reason: blocked on adb + physical device in WSL build environment; skip to Phase 9 work until device is available.
- [easy] 7.2 App launches without ANR/crash; `adb logcat | grep AndroidRuntime` clean for 60s. Reason: same hardware blocker as 7.1.
- [easy] 7.3 Home-screen widget can be added without crashing launcher; widget renders even if empty. Reason: same hardware blocker as 7.1.
