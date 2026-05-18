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

- 6.2 register CHANNEL_REMINDERS in AppMain.onCreate(); substitute at ReceiverNotification + MainActivity.mo4759F(); assembleDebug green; tests 71 → 76 — by sst-dev-cycle at 2026-05-18T20:15Z
- Phase 5 closed: add android.enableJetifier=false; 5.2 N/A (no android.support.* imports in tree); 5.3 N/A (material already uses com.google.android.material); assembleDebug green; tests 69 → 71 — by sst-dev-cycle at 2026-05-18T19:15Z
- 4.6 + 4.7 Phase 4 closed: all 5 ViewOnClickListenerC05NN audited (all standalone Fragments/Dialogs, none inlinable); assembleDebug green; device install deferred to Phase 7; tests 69 → 69 — by sst-dev-cycle at 2026-05-18T18:15Z
- [should-fix] MainActivity:533 add super.onRequestPermissionsResult(); OutlineFab:27 m4800a(true,true) setVisibility(GONE)→show(); tests 67→69 — by sst-dev-cycle at 2026-05-18T17:10Z
- 6.2 [easy] Expand SPEC 6.2 to cover both notification-channel paths (MainActivity.mo4759F() + ReceiverNotification); define shared CHANNEL_REMINDERS constant pattern; check off Phase 4.5 [should-fix] follow-up — by sst-dev-cycle at 2026-05-18T16:15Z
- 4.5 [medium] Port ActMain→MainActivity + AppMain + WidgetProvider; full port DrawerCustomLayout (extends DrawerLayout) + OutlineFab (extends FloatingActionButton); delete decompiled R.java; update manifest (AppMain, WidgetProvider, ReceiverNotification); tests 54 → 67 — by sst-dev-cycle at 2026-05-18T15:30Z
- 4.4 [medium] Port 17 obfuscated root-package classes (AppSettings, OutlineStore, OutlineTree, OutlineRowView, SublistFragment, Clipboard, DateTimeUtil, SublistRenderer, IndentManager, StringArraySpinnerAdapter, DrawerToggle, NewSublistDialog, WelcomeSublistFragment, SettingsDialog, ProfileFragment, SearchSublistFragment, SettingsFragment); replace all 4.3 stubs; port 3 of 6 named-class 4.5 items (DrawerCustomLayout, OutlineFab, ReceiverNotification); add getListOfEntSers to OutlineRow; add Gson dep; add arrays/bools/integers.xml; tests 15 → 54 — by sst-dev-cycle at 2026-05-18T14:00Z
- 4.3 [medium] Port iface/ — 4 interfaces (HostContract 23 methods, RowActionListener 6, FragmentHost 2, OutlineHost 6); 4 deleted methods/stubs excised; 8 Phase-4.4 forward-ref stubs created; tests 4 → 15 — by sst-dev-cycle at 2026-05-18T11:15Z
- 4.1 + 4.2 [medium] Phase 4 started: 4.1 closed as N/A (p030a deleted in Phase 3.5; nothing to port); 4.2 port of `model/OutlineRow` to active tree as plain POJO — Firebase annotations already stripped, `getListOfEntSers` deferred until OutlineRowView (C0557d) lands in 4.4. JUnit test suite added (0 → 4 tests). `./gradlew assembleDebug` green — by sst-dev-cycle at 2026-05-18T10:15Z
- 2.1 + 2.3 [medium] Phase 2 closed: every remaining obfuscated identifier in the app package mapped end-to-end (22 classes + 4 interfaces + 2 models). Key reveals: `C0571r` = `OutlineTree`, `C0566m`/`C0567n` = `AppSettings`/`OutlineStore` (split-candidates post-Phase-3), `AbstractC0565l` = `Clipboard`, `InterfaceC0549a` = `HostContract` (26-method master sole-implemented by ActMain). `RENAME-MAP.md` now carries renames + evidence cites for every class, plus a 10-entry deletion table. Zero `[needs-runtime-trace]` items. Phase 4 ports unblocked — by hand at 2026-05-18T09:35Z
- 1.1 + 1.2 + 1.3 + 1.4 [easy] Phase 1 closed: res/ port (770 files kept of ~1350; library bleed across drawables/strings/styles/dimens/colors filtered with deny-list + per-entry regex; locale dirs + config-qualifier dirs dropped — modern AAR provides natively); `public.xml` removed (jadx ID locks incompatible with modern AAR IDs); manifest rewritten with zero permissions + only `MainActivity` declaration (Widget/Receiver deferred to Phase 4 when classes port); `./gradlew :app:assembleDebug` green at 7.1 MB — by hand at 2026-05-18T09:10Z
- 3.6 [easy] Phase 3 closed: spec-required grep audit passes (zero live firebase/gms/admob/crashlytics/billingclient/c2dm refs in app-package source). Remaining hits are all in `Phase 3.x: removed` comment breadcrumbs (intentional documentation) or 9 R.java constants from bundled FirebaseUI lib (R.java is generated, never ported per SPEC 4.5). REMOVED-CLOUD-SURFACE.md gets Phase 3.6 section + Phase 1 carryover punch list (manifest permissions/components + orphan resource ids) — by hand at 2026-05-18T09:40Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [easy] [should-fix] `Phase6NotificationChannelTest.java:appMainRegistersChannel()` — assert `Build.VERSION.SDK_INT >= Build.VERSION_CODES.O` guard exists in AppMain; current source-scan passes even if guard is removed (startup crash on API 21-25) — review of 7063238

