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

- 3.5 [easy] Stripped Play Billing: deleted `p030a/` (entire IAB v3 helper lib, 9 files — re-classified from "util" after closer reading) + `C0564k.java` (premium gate). Removed `AppMain.m4793b()` (license-key fragment), `InterfaceC0549a.mo4778p()` (premium getter), `ActMain.{f3701E, ctor init, mo4778p, purchase-button case}`. Premium gates in `C0567n` (widget screenshot) and `ViewOnClickListenerC0558e` (profile UI) collapsed to give all users the previously-premium path. FCM/Cast/Crashlytics were declared in manifest only (Phase 1 deletes). `RENAME-MAP.md` corrected — by hand at 2026-05-18T09:30Z
- 3.4 [easy] Stripped AdMob from ActMain: 3 imports, `C0687h f3705o` InterstitialAd field, `mo4756C` show-gate body, `mo4758E` load-call body, ctor init (ad unit id `ca-app-pub-1334740097475606/9485517375` + AdListener inner-class). Manifest `gms.ads.AdActivity` declaration tagged for Phase 1 manifest rewrite. InterfaceC0549a hooks `mo4756C/mo4758E` tagged for Phase 4 deletion — by hand at 2026-05-18T09:15Z
- 3.3 [easy] Stripped Google Sign-In + App Invites + residual Firebase Auth: deleted `C0555b` (invite tracker, 17 lines) and `ViewOnClickListenerC0559f` (Sign-In fragment, 164 lines) entirely; surgical removal in `C0567n` (FirebaseAuth field/init/listener + `m4963b` invite-write) and `ActMain` (~50 lines: imports, `f3695n` GoogleApiClient field, `f3708r` Sign-In fragment field, `m4754A`/`m4757D` methods, `mo4766a` onConnectionFailed override, `mo4777o` getter, the request-10101 onActivityResult block, AppInvite deep-link receive handler, sign-in/sign-out/share menu cases, fragment construction). App Invites was a dead Google product (sunset 2020); Firebase Dynamic Links shortlink also deprecated. `REMOVED-CLOUD-SURFACE.md` extended — by hand at 2026-05-18T09:05Z
- 3.2 [easy] Stripped Firebase Analytics + GMS Analytics across 12 files (49 lines deleted): `AppMain` rewritten to remove fields/init/log wrappers (m4792a, m4794b, m4795a); 44 `m4792a` + 4 `m4794b` + 1 `m4795a` call sites swept. Event-name catalog preserved in `REMOVED-CLOUD-SURFACE.md`. Hard-coded UA tracker id was `UA-85711908-1` (UA service sunset by Google 2023, already dead). `AppMain.m4793b()` left intact for Phase 3.5 — by hand at 2026-05-18T08:55Z
- 3.1 [medium] Stripped Firebase Realtime Database from decompiled tree (4 files, ~110 lines removed): annotations off `OutlineRow` + `C0556c`; `C0566m.m4949n()` deleted; `C0567n.{f3973r, m4965p, m4966q, m4971v, m4972w, m4975z}` + RTDB imports deleted. `docs/REMOVED-CLOUD-SURFACE.md` catalogues each surgery with port guidance for Phase 4. Reverse-grep returns zero live refs — by hand at 2026-05-18T08:45Z
- 2.2 [easy] Seeded `docs/RENAME-MAP.md` with sub-package renames (util/iface/model), `OutlineRow` (model), 3 of 4 interface names, 6 named root classes, deletion list for analytics symbols — by hand at 2026-05-18T08:30Z
- 0.3 [easy] Installed debug APK on Moto G via Windows-side adb (WSL UNC path); `am start` launches `MainActivity` cleanly, no `AndroidRuntime` errors in logcat. Added `applicationIdSuffix = ".dev"` to debug build type so the stub installed as `ca.toadlybroodledev.sublist.dev` alongside the user's still-installed prod app — by hand at 2026-05-18T08:22Z
- 0.2 [easy] Stub `MainActivity` (Kotlin, AppCompatActivity, empty FrameLayout); manifest declares MAIN/LAUNCHER intent filter; `./gradlew :app:assembleDebug` green (5.8M debug APK at `app/build/outputs/apk/debug/app-debug.apk`). Side-effect: installed Android SDK at `~/Android/Sdk` (platform-tools, platforms;android-35, build-tools;35.0.0) and `local.properties` — by hand at 2026-05-18T08:18Z
- 0.1 [easy] Gradle Kotlin-DSL scaffold (AGP 8.7.3, Kotlin 2.0.21, Gradle 8.10.2, compileSdk/targetSdk 35, minSdk 21); `./gradlew projects` green with `:app` registered and AGP/Kotlin plugins resolved — by hand at 2026-05-18T08:35Z
- 0.4 [easy] Moved `sources/` + `resources/` under `decompiled/` to isolate the read-only jadx tree from the upcoming active `app/` module — by hand at 2026-05-18T08:05Z
- Decompiled sublist.apk v106 into `sources/` + `resources/` via jadx 1.5.5, committed as initial repo state — by hand at 2026-05-18T07:50Z
- Authored `docs/SPEC.md` with 10 phases (scaffold → local-persistence) and `docs/TODO.md` handoff — by hand at 2026-05-18T08:00Z

## Next up (queued for next cycle)

<!--
  One line per queued item. Top item is picked next unless overridden.
  Format:
  - [<difficulty>] <spec-id-if-applicable> <one-line>. Reason: <source>
  Difficulty: easy / medium / hard.
  Order: blockers first, then highest-impact.
-->

- [medium] 2.1 Read every decompiled class and produce `docs/RENAME-MAP.md` covering all `C05NN` / `ViewOnClickListenerC05NN` / `InterfaceC05NN` and the `p030a` / `p031b` / `p032c` sub-package renames. Reason: SPEC Phase 2; blocks Phase 4 ports.
- [easy] 3.6 Grep-audit pass confirming zero `firebase|gms|admob|crashlytics|billingclient|c2dm` references remain. Reason: SPEC Phase 3; closes Phase 3.
