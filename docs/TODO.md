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

- [easy] 0.2 Add stub `MainActivity` + empty layout; `./gradlew :app:assembleDebug` green. Reason: SPEC Phase 0; gates 0.3 smoke test.
- [easy] 0.3 Side-load stub APK on Moto G via `adb install -r`; confirm launcher icon opens empty activity. Reason: SPEC Phase 0; validates the signing + install path before any real code crosses over.
- [medium] 2.1 Read every decompiled class and produce `docs/RENAME-MAP.md` covering all `C05NN` / `ViewOnClickListenerC05NN` / `InterfaceC05NN` and the `p030a` / `p031b` / `p032c` sub-package renames. Reason: SPEC Phase 2; blocks Phase 4 ports.
- [easy] 2.2 Seed `docs/RENAME-MAP.md` with the already-deduced anchors (util / iface / model / OutlineRow / RowActionListener). Reason: SPEC Phase 2; cheap warmup that de-risks 2.1.
- [medium] 3.1 Strip Firebase Realtime DB annotations + call sites from `decompiled/sources/`; produce `docs/REMOVED-CLOUD-SURFACE.md`. Reason: SPEC Phase 3; user's top-stated goal alongside deobfuscation.
- [easy] 3.6 Grep-audit pass confirming zero `firebase|gms|admob|crashlytics|billingclient|c2dm` references remain. Reason: SPEC Phase 3; closes Phase 3.
