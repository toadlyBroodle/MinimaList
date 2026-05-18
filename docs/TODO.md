# MinimaList TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- 10.1 display rename residuals: info_save_loc sublist_collection_backup→MinimaList_collection_backup; doc titles in SPEC.md/RENAME-MAP.md/TODO.md → MinimaList; tests 178 → 182 — by sst-dev-cycle at 2026-05-19T16:00Z
- ProfileFragment FM-crash stub + 10.3 colors.xml muted M3 neutral palette (colorAccent/Primary/PrimaryDark + firebase* vestigials); tests 172 → 178 — by sst-dev-cycle at 2026-05-19T14:15Z
- Phase 10.4+10.5: drop Profile/Invite drawer menu entries; delete ProfileFragment + HostContract.mo4776n; wire SettingsFragment "Contribute on GitHub" button to github.com/toadlyBroodle/MinimaList with https <queries>; remove 30+ orphaned cloud/premium/invite strings; tests 160 → 172 — by sst-dev-cycle at 2026-05-19T12:30Z
- Phase 7 device smoke test: fix activity_main.xml stub layout + <array>→<string-array> AAPT color-type NPE + SublistFragment.onAttach f3901c init; tests 153 → 160 — by sst-dev-cycle at 2026-05-19T11:00Z
- strengthen Phase9SettingsFragmentLifecycleTest: replace 4 bare src.contains() with 2 countOccurrences()>=2 checks; tests 155 → 153 — by sst-dev-cycle at 2026-05-19T08:15Z
- add isAdded()/getActivity()==null guard to SettingsFragment.doImportReplace + doImportMerge main.post success lambdas; tests 151 → 155 — by sst-dev-cycle at 2026-05-18T07:15Z
- 9.3 JSON export (OutlineStore.exportToUri via SAF ACTION_CREATE_DOCUMENT) + JSON import (ACTION_OPEN_DOCUMENT, replace-vs-merge AlertDialog, merge via RowActionListener.mo4767a) + close batch-sizing meta-item by batching same-phase 9.3; tests 138 → 151 — by sst-dev-cycle at 2026-05-19T06:45Z
- fix MainActivity:82 async-callback guard (isFinishing/isDestroyed/isStateSaved) + Mockito behavioral tests for OutlineRepositoryImpl (16 tests: replaceRowsForSublist delegation, importLegacy transaction+field mapping, loadAllAsHashMap, saveAllAsHashMap); tests 121 → 138 — by sst-dev-cycle at 2026-05-19T05:30Z
- 9.2a: wire OutlineRepository through MainActivity (async load callback) + OutlineRowView autosave; AppMain owns SublistDatabase/repo + io() executor + first-launch importLegacy gated on repo_migrated_v1 SharedPrefs flag; delete AppSettings m4937d/m4948m legacy Gson fallback loaders; tests 112 → 121 — by sst-dev-cycle at 2026-05-19T03:00Z
- fix replaceRowsForSublist atomicity (@Transaction default on OutlineRowDao) + importLegacy runInTransaction wrap; tests 108 → 112 — by sst-dev-cycle at 2026-05-19T02:00Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [hard] 10.2 Code rename: package + applicationId `ca.toadlybroodledev.sublist` → `ca.toadlybroodledev.minimalist`; rename Sublist* classes that refer to the app itself (SublistDatabase, SublistFragment, WelcomeSublistFragment, SearchSublistFragment) while preserving domain-object types (SublistEntity, SublistDao, SublistRenderer). Provide a one-shot legacy-DB migration path from the old package's filesDir. Reason: Phase 10 closeout; should be its own cycle due to broad mechanical scope and install-identity change.
- [hard] 8.1 CRUD: create/edit/delete outline rows; nesting indent works; collapsed-state persists across app restart. Reason: Phase 7 device test passed; Phase 9 Room wiring in place; acceptance testing can now begin.
- [medium] 8.2 Reminders: setting a reminder fires a notification at the scheduled time; rescheduling on device boot works. Reason: depends on 8.1.
- [medium] 8.3 Home-screen widget renders the current list and survives app data update. Reason: depends on 8.1; widget provider verified in Phase 7.
- [medium] 8.4 Drawer / settings / appearance toggles wired to real preferences. Reason: AppSettings and SettingsFragment wiring confirmed in Phase 7 run; acceptance test remaining.
