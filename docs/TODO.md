# MinimaList TODO (handoff doc)

Cross-cycle state. Three sections, in this order. Primary spec: `docs/SPEC.md`.

## In flight

## Just shipped (last cycle)

<!--
  Append-on-close, newest first. Trim to most recent 10.
-->

- Phase 8.1 CRUD-audit prep: fix two `catch (Error e)` sites inherited from jadx-decompiled source — `OutlineFragment.onCreateOptionsMenu` (try/catch around `m4988a().get(f3898ao)` for stale persisted index after outline shrinkage in a prior session) and `MainActivity.onPause` (try/catch around the IME-hide call). java.lang.Error does not catch RuntimeException, so IndexOutOfBoundsException at menu-inflate would crash the activity instead of being swallowed; same root-cause shape as a8e34de + bd4b8ac. New CatchErrorAuditTest (2 source-scan assertions per site, gated on method-body slice between onCreateOptionsMenu↔onViewCreated and onPause↔onPostCreate so a future regression elsewhere in the file would not silently pass); tests 208 → 210 — by sst-dev-cycle at 2026-05-19T05:00Z
- Phase 8.1 CRUD-audit prep: guard OutlineTree.m4995b against empty f3987b — search-mode add-new (mo4851al when no row focused + f3898ao != -1) called f3987b.get(0)/get(size-1) without an isEmpty() check, IOOBE when search filter narrows to zero rows; fall back to m4991a((OutlineRow) null) (the non-search root-add path); same shape as bd4b8ac MainActivity.onStop AIOOBE fix; device smoke (Moto G API 30) launches clean, no fatal exceptions; tests 206 → 208 — by sst-dev-cycle at 2026-05-19T03:45Z
- MainActivity.onStop:582 guard: wrap OutlineStore.m4962a call with isEmpty()/f3941d>=0/f3941d<size() check to prevent AIOOBE on first-launch / no-sublists; tests 203 → 206 — by sst-dev-cycle at 2026-05-19T22:00Z
- Phase 10.2 closeout: delete ProfileFragment stub + AppSettings.m4935c/m4946k orphaned analytics methods + f3937H field/prefs; Phase 7 re-smoke ca.toadlybroodledev.minimalist.dev on Moto G (install OK, launcher/widget/MainActivity bind clean, no fatal exceptions); tests 202 → 203 — by sst-dev-cycle at 2026-05-19T21:15Z
- Phase 10.2 code rename: relocate `ca.toadlybroodledev.sublist` → `ca.toadlybroodledev.minimalist` across 53 Java files + build.gradle.kts namespace/applicationId + 2 activity_main.xml layouts + AndroidManifest comment scrub; rename 4 app-referring classes (SublistDatabase→MinimaListDatabase, SublistFragment→OutlineFragment, WelcomeSublistFragment→WelcomeFragment, SearchSublistFragment→SearchFragment), preserve Sublist* domain types (Entity/Dao/Renderer/NewSublistDialog); DateTimeUtil.m5007a switched to ctx.getPackageName(); AppMain gets LEGACY_PACKAGE + migrateLegacyPackage stub; RENAME-MAP.md gets Phase 10.2 supersession table; Phase10PackageRenameTest (15 tests) self-skips + concatenates the legacy literal to avoid sed-rewrite self-corruption; tests 187 → 202 — by sst-dev-cycle at 2026-05-19T19:00Z
- Phase 10 follow-up: prune SettingsFragment cloud-era UI (rate/support/privacy_policy/send_anon_data — 4 buttons + Switch, layout/ + layout-large/ + handlers + 5 strings) + refine 10.3 colors.xml to sage-neutral palette (#7A8471 accent / #4B5358 primary / #2F3438 primary-dark + softened colorTextWhite #F4F4F2 / colorTextWhiteCompleted #A8AAA5 + matched firebaseColor* vestigials); add f3880ap.setBackgroundColor(accent) for Contribute on GitHub button missed by 10.4/10.5; drop dead SublistFragment.onResume m4946k() empty if-block; Phase10ColorsTest hexes refreshed + 5 new Phase10MenuSurfacePruneTest regression guards; tests 182 → 187 — by sst-dev-cycle at 2026-05-19T17:30Z
- 10.1 display rename residuals: info_save_loc sublist_collection_backup→MinimaList_collection_backup; doc titles in SPEC.md/RENAME-MAP.md/TODO.md → MinimaList; tests 178 → 182 — by sst-dev-cycle at 2026-05-19T16:00Z
- ProfileFragment FM-crash stub + 10.3 colors.xml muted M3 neutral palette (colorAccent/Primary/PrimaryDark + firebase* vestigials); tests 172 → 178 — by sst-dev-cycle at 2026-05-19T14:15Z
- Phase 10.4+10.5: drop Profile/Invite drawer menu entries; delete ProfileFragment + HostContract.mo4776n; wire SettingsFragment "Contribute on GitHub" button to github.com/toadlyBroodle/MinimaList with https <queries>; remove 30+ orphaned cloud/premium/invite strings; tests 160 → 172 — by sst-dev-cycle at 2026-05-19T12:30Z
- Phase 7 device smoke test: fix activity_main.xml stub layout + <array>→<string-array> AAPT color-type NPE + SublistFragment.onAttach f3901c init; tests 153 → 160 — by sst-dev-cycle at 2026-05-19T11:00Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [hard] 8.1 CRUD: create/edit/delete outline rows; nesting indent works; collapsed-state persists across app restart. Reason: Phase 7 device test passed; Phase 9 Room wiring in place; acceptance testing can now begin.
- [medium] 8.2 Reminders: setting a reminder fires a notification at the scheduled time; rescheduling on device boot works. Reason: depends on 8.1.
- [medium] 8.3 Home-screen widget renders the current list and survives app data update. Reason: depends on 8.1; widget provider verified in Phase 7.
- [medium] 8.4 Drawer / settings / appearance toggles wired to real preferences. Reason: AppSettings and SettingsFragment wiring confirmed in Phase 7 run; acceptance test remaining.
