# MinimaList TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- Phase 11.1 + 11.2: drawer header icon → vector drawable (5 density PNGs removed); drawer SubMenu reset-loop fix so only the active sublist stays accent-colored — by sst-dev-cycle at 2026-05-20T15:45Z
- Fix boot-reschedule main-thread Room crash (goAsync + AppMain.io) + unify alarm request codes on row.id across m4861b/m4862c/rescheduleAlarmsAfterBoot; OutlineRow.id field; OutlineRepositoryImpl.loadAllAsHashMap populates it; AppMain.EXECUTOR narrowed to Executor; 3 new tests (source-scan + behavioral) — by sst-dev-cycle at 2026-05-20T14:00Z
- Phase 8.2 + 8.3 acceptance: AlarmManager schedule/cancel behavioral tests; ReceiverNotification notification delivery; boot rescheduling (RECEIVE_BOOT_COMPLETED permission + intent filter + rescheduleAlarmsAfterBoot via new getRowsWithFutureReminders DAO query); Phase8WidgetTest manifest/source-scan + Robolectric onUpdate coverage — by sst-dev-cycle at 2026-05-20T12:30Z
- Phase8CrudTest: add editRow_mutatedTextSurvivesSerialisation test; guard OutlineRowView TextWatcher against null getLayout() — by sst-dev-cycle at 2026-05-20T11:00Z
- Phase 8.1 + 8.4 acceptance: added Robolectric 4.14.1 unit-test harness; Phase8CrudTest (21 tests) exercises the real OutlineTree CRUD engine — create/delete/indent/collapse/complete + auto-delete/auto-complete cascades + OutlineRow round-trip; Phase8SettingsPrefsTest (13 tests) verifies every AppSettings settings/appearance toggle round-trips through SharedPreferences; no production code changed; tests 224 → 258 — by sst-dev-cycle at 2026-05-19T22:42Z
- Phase10TxtRoundtripTest: 15 pure-JVM behavioral tests for OutlineStore.parseTxtRows covering root/nested incomplete/complete rows, empty text, CRLF endings, all-malformed → empty list, realistic exported block — by sst-dev-cycle at 2026-05-20T10:30Z
- Phase 10.8: unified Export/Import (Local|SD × JSON|TXT) replaces SAF-only JSON flow — `AppSettings` gains `backup_format_index` int pref + `backup_location_sd` boolean re-used as 0/1 location pref; `OutlineStore.exportJsonToDir` / `exportTxtToDir` / `importTxtFromUri` add direct-path IO (legacy `m4967r()` becomes a thin wrapper); `SettingsFragment` swaps Load-Backup Button + Backup-to-SD Switch + Backup-Data Button + Export-to-.txt Button for 2 spinners + 2 buttons; `doExport()` / `doImport()` route by Format and Location, falling through to SAF when no app-scoped files match; JSON keeps replace/merge dialog, TXT always merges with name-(2) collision suffix; lifecycle fix replaces 9.3's `isAdded()` guard (insufficient — SAF picker triggers fragment detach) with a captured-host pattern (`final HostContract host = this.f3881an;` + `if (host == null) return;`) across all three `doImport*` methods; `StringArraySpinnerAdapter` dispatch-by-item-content + `contrastingTextColor` helper so plain-label arrays render correctly on the accent background; `MainActivity.tintButton` replaces the legacy prefs-change fragment-recreate branch; release-signing config in `app/build.gradle.kts` reads gitignored `app/release.keystore.properties`; `.gitignore` adds `release.keystore.properties` + `data/`; signed `minimalist-v107-release.apk` (5.9 MB) committed at repo root; Phase 9 SAF-pattern tests retargeted to new doExport/doImport routes; Phase 10 tint test broadened for tintButton form; Phase9SettingsFragmentLifecycleTest rewritten as occurrence-count (>= 3) assertions against the captured-host literal; tests 208 → 209 — by sst-dev-cycle at 2026-05-20T00:00Z
- Phase 8.1 CRUD-audit prep: fix two `catch (Error e)` sites inherited from jadx-decompiled source — `OutlineFragment.onCreateOptionsMenu` (try/catch around `m4988a().get(f3898ao)` for stale persisted index after outline shrinkage in a prior session) and `MainActivity.onPause` (try/catch around the IME-hide call). java.lang.Error does not catch RuntimeException, so IndexOutOfBoundsException at menu-inflate would crash the activity instead of being swallowed; same root-cause shape as a8e34de + bd4b8ac. New CatchErrorAuditTest (2 source-scan assertions per site, gated on method-body slice between onCreateOptionsMenu↔onViewCreated and onPause↔onPostCreate so a future regression elsewhere in the file would not silently pass); tests 208 → 210 — by sst-dev-cycle at 2026-05-19T05:00Z
- Phase 8.1 CRUD-audit prep: guard OutlineTree.m4995b against empty f3987b — search-mode add-new (mo4851al when no row focused + f3898ao != -1) called f3987b.get(0)/get(size-1) without an isEmpty() check, IOOBE when search filter narrows to zero rows; fall back to m4991a((OutlineRow) null) (the non-search root-add path); same shape as bd4b8ac MainActivity.onStop AIOOBE fix; device smoke (Moto G API 30) launches clean, no fatal exceptions; tests 206 → 208 — by sst-dev-cycle at 2026-05-19T03:45Z
- MainActivity.onStop:582 guard: wrap OutlineStore.m4962a call with isEmpty()/f3941d>=0/f3941d<size() check to prevent AIOOBE on first-launch / no-sublists; tests 203 → 206 — by sst-dev-cycle at 2026-05-19T22:00Z
- Phase 10.2 closeout: delete ProfileFragment stub + AppSettings.m4935c/m4946k orphaned analytics methods + f3937H field/prefs; Phase 7 re-smoke ca.toadlybroodledev.minimalist.dev on Moto G (install OK, launcher/widget/MainActivity bind clean, no fatal exceptions); tests 202 → 203 — by sst-dev-cycle at 2026-05-19T21:15Z
- Phase 10.2 code rename: relocate `ca.toadlybroodledev.sublist` → `ca.toadlybroodledev.minimalist` across 53 Java files + build.gradle.kts namespace/applicationId + 2 activity_main.xml layouts + AndroidManifest comment scrub; rename 4 app-referring classes (SublistDatabase→MinimaListDatabase, SublistFragment→OutlineFragment, WelcomeSublistFragment→WelcomeFragment, SearchSublistFragment→SearchFragment), preserve Sublist* domain types (Entity/Dao/Renderer/NewSublistDialog); DateTimeUtil.m5007a switched to ctx.getPackageName(); AppMain gets LEGACY_PACKAGE + migrateLegacyPackage stub; RENAME-MAP.md gets Phase 10.2 supersession table; Phase10PackageRenameTest (15 tests) self-skips + concatenates the legacy literal to avoid sed-rewrite self-corruption; tests 187 → 202 — by sst-dev-cycle at 2026-05-19T19:00Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

