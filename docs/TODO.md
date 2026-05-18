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

- 6.2 [easy] Expand SPEC 6.2 to cover both notification-channel paths (MainActivity.mo4759F() + ReceiverNotification); define shared CHANNEL_REMINDERS constant pattern; check off Phase 4.5 [should-fix] follow-up — by sst-dev-cycle at 2026-05-18T16:15Z
- 4.5 [medium] Port ActMain→MainActivity + AppMain + WidgetProvider; full port DrawerCustomLayout (extends DrawerLayout) + OutlineFab (extends FloatingActionButton); delete decompiled R.java; update manifest (AppMain, WidgetProvider, ReceiverNotification); tests 54 → 67 — by sst-dev-cycle at 2026-05-18T15:30Z
- 4.4 [medium] Port 17 obfuscated root-package classes (AppSettings, OutlineStore, OutlineTree, OutlineRowView, SublistFragment, Clipboard, DateTimeUtil, SublistRenderer, IndentManager, StringArraySpinnerAdapter, DrawerToggle, NewSublistDialog, WelcomeSublistFragment, SettingsDialog, ProfileFragment, SearchSublistFragment, SettingsFragment); replace all 4.3 stubs; port 3 of 6 named-class 4.5 items (DrawerCustomLayout, OutlineFab, ReceiverNotification); add getListOfEntSers to OutlineRow; add Gson dep; add arrays/bools/integers.xml; tests 15 → 54 — by sst-dev-cycle at 2026-05-18T14:00Z
- 4.3 [medium] Port iface/ — 4 interfaces (HostContract 23 methods, RowActionListener 6, FragmentHost 2, OutlineHost 6); 4 deleted methods/stubs excised; 8 Phase-4.4 forward-ref stubs created; tests 4 → 15 — by sst-dev-cycle at 2026-05-18T11:15Z
- 4.1 + 4.2 [medium] Phase 4 started: 4.1 closed as N/A (p030a deleted in Phase 3.5; nothing to port); 4.2 port of `model/OutlineRow` to active tree as plain POJO — Firebase annotations already stripped, `getListOfEntSers` deferred until OutlineRowView (C0557d) lands in 4.4. JUnit test suite added (0 → 4 tests). `./gradlew assembleDebug` green — by sst-dev-cycle at 2026-05-18T10:15Z
- 2.1 + 2.3 [medium] Phase 2 closed: every remaining obfuscated identifier in the app package mapped end-to-end (22 classes + 4 interfaces + 2 models). Key reveals: `C0571r` = `OutlineTree`, `C0566m`/`C0567n` = `AppSettings`/`OutlineStore` (split-candidates post-Phase-3), `AbstractC0565l` = `Clipboard`, `InterfaceC0549a` = `HostContract` (26-method master sole-implemented by ActMain). `RENAME-MAP.md` now carries renames + evidence cites for every class, plus a 10-entry deletion table. Zero `[needs-runtime-trace]` items. Phase 4 ports unblocked — by hand at 2026-05-18T09:35Z
- 1.1 + 1.2 + 1.3 + 1.4 [easy] Phase 1 closed: res/ port (770 files kept of ~1350; library bleed across drawables/strings/styles/dimens/colors filtered with deny-list + per-entry regex; locale dirs + config-qualifier dirs dropped — modern AAR provides natively); `public.xml` removed (jadx ID locks incompatible with modern AAR IDs); manifest rewritten with zero permissions + only `MainActivity` declaration (Widget/Receiver deferred to Phase 4 when classes port); `./gradlew :app:assembleDebug` green at 7.1 MB — by hand at 2026-05-18T09:10Z
- 3.6 [easy] Phase 3 closed: spec-required grep audit passes (zero live firebase/gms/admob/crashlytics/billingclient/c2dm refs in app-package source). Remaining hits are all in `Phase 3.x: removed` comment breadcrumbs (intentional documentation) or 9 R.java constants from bundled FirebaseUI lib (R.java is generated, never ported per SPEC 4.5). REMOVED-CLOUD-SURFACE.md gets Phase 3.6 section + Phase 1 carryover punch list (manifest permissions/components + orphan resource ids) — by hand at 2026-05-18T09:40Z
- 3.5 [easy] Stripped Play Billing: deleted `p030a/` (entire IAB v3 helper lib, 9 files — re-classified from "util" after closer reading) + `C0564k.java` (premium gate). Removed `AppMain.m4793b()` (license-key fragment), `InterfaceC0549a.mo4778p()` (premium getter), `ActMain.{f3701E, ctor init, mo4778p, purchase-button case}`. Premium gates in `C0567n` (widget screenshot) and `ViewOnClickListenerC0558e` (profile UI) collapsed to give all users the previously-premium path. FCM/Cast/Crashlytics were declared in manifest only (Phase 1 deletes). `RENAME-MAP.md` corrected — by hand at 2026-05-18T09:30Z
- 3.4 [easy] Stripped AdMob from ActMain: 3 imports, `C0687h f3705o` InterstitialAd field, `mo4756C` show-gate body, `mo4758E` load-call body, ctor init (ad unit id `ca-app-pub-1334740097475606/9485517375` + AdListener inner-class). Manifest `gms.ads.AdActivity` declaration tagged for Phase 1 manifest rewrite. InterfaceC0549a hooks `mo4756C/mo4758E` tagged for Phase 4 deletion — by hand at 2026-05-18T09:15Z
- 3.3 [easy] Stripped Google Sign-In + App Invites + residual Firebase Auth: deleted `C0555b` (invite tracker, 17 lines) and `ViewOnClickListenerC0559f` (Sign-In fragment, 164 lines) entirely; surgical removal in `C0567n` (FirebaseAuth field/init/listener + `m4963b` invite-write) and `ActMain` (~50 lines: imports, `f3695n` GoogleApiClient field, `f3708r` Sign-In fragment field, `m4754A`/`m4757D` methods, `mo4766a` onConnectionFailed override, `mo4777o` getter, the request-10101 onActivityResult block, AppInvite deep-link receive handler, sign-in/sign-out/share menu cases, fragment construction). App Invites was a dead Google product (sunset 2020); Firebase Dynamic Links shortlink also deprecated. `REMOVED-CLOUD-SURFACE.md` extended — by hand at 2026-05-18T09:05Z
- 3.2 [easy] Stripped Firebase Analytics + GMS Analytics across 12 files (49 lines deleted): `AppMain` rewritten to remove fields/init/log wrappers (m4792a, m4794b, m4795a); 44 `m4792a` + 4 `m4794b` + 1 `m4795a` call sites swept. Event-name catalog preserved in `REMOVED-CLOUD-SURFACE.md`. Hard-coded UA tracker id was `UA-85711908-1` (UA service sunset by Google 2023, already dead). `AppMain.m4793b()` left intact for Phase 3.5 — by hand at 2026-05-18T08:55Z
- 3.1 [medium] Stripped Firebase Realtime Database from decompiled tree (4 files, ~110 lines removed): annotations off `OutlineRow` + `C0556c`; `C0566m.m4949n()` deleted; `C0567n.{f3973r, m4965p, m4966q, m4971v, m4972w, m4975z}` + RTDB imports deleted. `docs/REMOVED-CLOUD-SURFACE.md` catalogues each surgery with port guidance for Phase 4. Reverse-grep returns zero live refs — by hand at 2026-05-18T08:45Z
- 2.2 [easy] Seeded `docs/RENAME-MAP.md` with sub-package renames (util/iface/model), `OutlineRow` (model), 3 of 4 interface names, 6 named root classes, deletion list for analytics symbols — by hand at 2026-05-18T08:30Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [easy] [should-fix] `MainActivity.java:533` — missing `super.onRequestPermissionsResult()` call; fragment permission results silently dropped — review of 437ea68
- [easy] [should-fix] `OutlineFab.java:27` — `m4800a(true, true)` sets GONE instead of showing FAB; "animated show" path inverted — review of 437ea68
- [medium] 4.6 Port the 5 ViewOnClickListenerC05NN inner-class-extracted listeners back to anonymous-class call-site form where practical; leave standalone if rebind is risky. Reason: SPEC Phase 4; all classes now ported, this closes the phase.
- [medium] 4.7 ./gradlew :app:assembleDebug green; app installs and MainActivity opens to the real outliner UI. Reason: SPEC Phase 4 smoke-test gate; depends on 4.6.
