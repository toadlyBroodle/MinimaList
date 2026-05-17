# sublist SPEC

Canonical project spec. Read end-to-end before any non-trivial edit; update in the same commit as code changes.

## Goal

Resurrect the abandoned `ca.toadlybroodledev.sublist` Android outliner (versionCode 106, targetSdk 27, last built ~2018) as a modern, fully local, cloud-free codebase. Original source was lost on a dead machine; the only artifact is the on-device APK pulled from a Moto G via `adb`, decompiled with jadx 1.5.5 into `sources/` + `resources/`. Goal of phase 0–9 is feature parity with the shipped APK minus every cloud surface (Firebase Analytics + Firebase Realtime Database, AdMob, Google Sign-In, Google App Invites, GMS Analytics, FCM, Crashlytics, Play Billing, Cast). Goal beyond phase 9 is to evolve the app — new features land as additional phases.

## Architecture / stack (one-liner each)

- Language: Kotlin (target) with Java tolerated during port — original is 100% Java
- UI: AndroidX (`androidx.appcompat`, `androidx.fragment`, `material`); original used the now-archived `android.support.*` family
- Persistence: local-only. Room for the outline tree; JSON export/import for user-driven backup. Replaces Firebase Realtime DB.
- Build: Gradle Kotlin DSL, AGP 8.x, minSdk 21, targetSdk 35
- Deployment: signed APK side-loaded via `adb install` (no Play Store re-listing planned)
- Build flavors: `debug` carries `applicationIdSuffix = ".dev"` so dev installs land as `ca.toadlybroodledev.sublist.dev` alongside (not over) the user's still-installed production `ca.toadlybroodledev.sublist`. Until the production app is fully replaced, never reuse the prod applicationId in a debug build — it'll fail with `INSTALL_FAILED_UPDATE_INCOMPATIBLE` (different signing key) and any "fix" by uninstalling first wipes the user's real outline data.

## Phases

### Phase 0: Project scaffold

Stand up a buildable Android Studio project shell that the decompiled artifacts will be ported into. No app code yet — just confirm Gradle + AndroidX + a placeholder Activity launches on the Moto G.

- [x] 0.1 Initialize Gradle Kotlin-DSL project at repo root with package `ca.toadlybroodledev.sublist`, minSdk 21, targetSdk 35, AGP 8.x, Kotlin 2.x; commit `settings.gradle.kts`, `app/build.gradle.kts`, `gradle/libs.versions.toml`.
- [x] 0.2 Add a stub `MainActivity` extending `AppCompatActivity` with an empty layout; `./gradlew :app:assembleDebug` succeeds.
- [x] 0.3 Side-load the stub APK on the Moto G via `adb install -r` and confirm launcher icon opens an empty activity (smoke test for signing + install path).
- [x] 0.4 Move `sources/` + `resources/` into a sibling `decompiled/` directory so the port reads from there without polluting the active source tree.

### Phase 1: Manifest + resources port

Bring the user-facing assets across cleanly. Everything in `decompiled/resources/res/` is already valid AAPT output — most of it copies straight over. The manifest needs surgery to drop dead permissions and dead components before any Java touches the build.

- [ ] 1.1 [easy] Copy `decompiled/resources/res/{anim,animator,color*,drawable*,interpolator,layout*,menu*,mipmap*,values*,xml}` into `app/src/main/res/`; drop the `values-*` locale dirs we don't actually have user translations for (keep `values/` + a short whitelist; track which locales survive in a glossary entry).
- [ ] 1.2 [easy] Author a fresh `AndroidManifest.xml` declaring only `MainActivity` + `WidgetProvider` + `ReceiverNotification`; drop `BILLING`, `RECEIVE_BOOT_COMPLETED` (re-add only if we keep boot-time reminder rescheduling), `WAKE_LOCK` (same), `com.google.android.c2dm.permission.RECEIVE`, the custom `C2D_MESSAGE` permission, the cast `MediaIntentReceiver` / `MediaNotificationService` / `ReconnectionService`, and any AdMob / Sign-In / App-Invite components.
- [ ] 1.3 [easy] Keep `INTERNET` + `ACCESS_NETWORK_STATE` only if a survey of remaining classes still needs network after Phase 3 strip; default is to drop both.
- [ ] 1.4 [easy] `./gradlew :app:assembleDebug` still green after resource + manifest import (no Java code yet, so any reference from a `@string` / `@drawable` to a class is fine).

### Phase 2: Deobfuscation map

ProGuard collapsed every non-public-API class to single-letter names. Jadx renamed them mechanically to `C05NN` / `ViewOnClickListenerC05NN` / `InterfaceC05NN`. We need a stable rename map before any porting starts so subsequent phases reference real names.

- [ ] 2.1 [medium] Read every file under `decompiled/sources/ca/toadlybroodledev/sublist/` (26 root + 9 in `p030a` + 4 in `p031b` + 3 in `p032c`), and produce `docs/RENAME-MAP.md` mapping each `C05NN` / `ViewOnClickListenerC05NN` / `InterfaceC05NN` (and `p03Na` → real subpackage name) to a meaningful name. Use class members, R.layout/R.id references, and call sites to deduce purpose.
- [x] 2.2 Known anchors already deducible — record in the rename map as the starting fixtures: `p030a` → `util` (base64 helpers based on byte alphabet in `C0539a`); `p031b` → `iface` (4 callback interfaces); `p032c` → `model` (data classes); `p032c/C0554a` → `OutlineRow` (fields: `text`, `complete`, `collapsed`, `indent`, `reminder`, `isInstr`); `p031b/InterfaceC0550b` → `RowActionListener` (takes `OutlineRow`); `AppMain.m4792a` → `Analytics.log` (Firebase + GA wrapper — to be deleted in Phase 3, not renamed).
- [ ] 2.3 [medium] Cross-check the rename map for collisions and ambiguity; mark any class whose purpose can't be deduced from one pass as `[needs-runtime-trace]` and queue a follow-up Next-up item to instrument it.

### Phase 3: Cloud / monetization strip

Excise every Firebase, GMS, AdMob, Sign-In, App-Invite, Cast, FCM, Crashlytics and Billing call site from the decompiled source BEFORE the port to the active tree, so what crosses over is already clean. Work on the `decompiled/` copy; the active `app/src/main/java/` tree is populated only in Phase 4.

- [x] 3.1 **Firebase Realtime Database** — drop `@PropertyName`, `@IgnoreExtraProperties`, `InterfaceC2267e`, `InterfaceC2270h` annotations from the `p032c/model/*` data classes; remove every call to `FirebaseDatabase`, `DatabaseReference`, `ValueEventListener` across the source tree; produce `docs/REMOVED-CLOUD-SURFACE.md` listing every file + line range touched (so feature-parity tests in Phase 8 know what UX disappeared).
- [x] 3.2 **Firebase Analytics + GMS Analytics** — delete `AppMain.f3724a` / `f3725b` / `f3726c` fields and the `m4792a` / sibling logging methods; remove every `AppMain.m4792a(...)` call site (~15+ in ActMain alone) without replacement.
- [ ] 3.3 [easy] **Google Sign-In + App Invites** — delete `GoogleSignInOptions`, `com.google.android.gms.appinvite.*`, `gms.auth.*` imports and call sites (App Invites was sunset by Google in 2020 so this is already broken anyway). Remove the in-app "Invite friends" menu entry from `res/menu/`.
- [ ] 3.4 [easy] **AdMob** — delete `com.google.android.gms.ads.*` imports, `InterstitialAd` / `AdRequest` / `AdListener` usages in `ActMain`, the inner `C0657a` AdListener subclass, and any `<com.google.android.gms.ads.AdView>` tag in layouts.
- [ ] 3.5 [easy] **FCM / Cast / Crashlytics / Billing** — remove any remaining `com.google.firebase.messaging.*`, `com.google.android.gms.cast.*`, `com.google.firebase.crashlytics.*`, `com.android.billingclient.*` references. Most should already be gone with the bundled dep tree once Gradle deps are declared cleanly in Phase 4.
- [ ] 3.6 [easy] Grep-audit pass: `grep -rEi 'firebase|com\.google\.android\.gms|admob|crashlytics|billingclient|c2dm' decompiled/sources/ca/toadlybroodledev` returns zero hits (or only commented-out references in `docs/REMOVED-CLOUD-SURFACE.md`).

### Phase 4: Port core code into active tree

File-by-file move from `decompiled/sources/ca/toadlybroodledev/sublist/` into `app/src/main/java/ca/toadlybroodledev/sublist/`, applying the Phase 2 rename map. Each file gets compiled in isolation as it lands (`./gradlew :app:compileDebugJavaWithJavac`). Stay in Java for the port; defer Kotlin conversion to a later phase.

- [ ] 4.1 [medium] Port `util/` (formerly `p030a`) — 9 helper classes, smallest surface, no UI deps, easiest to verify in isolation.
- [ ] 4.2 [medium] Port `model/` (formerly `p032c`) — 3 data classes; confirm Firebase annotations are gone and `OutlineRow` is plain POJO.
- [ ] 4.3 [medium] Port `iface/` (formerly `p031b`) — 4 callback interfaces; trivial once `model/` exists.
- [ ] 4.4 [medium] Port the 16 obfuscated root-package classes (`C0538a` … `C0572s`) under their Phase-2 names; expect ~half are fragments / dialogs / adapters and half are utility helpers.
- [ ] 4.5 [medium] Port the 6 already-named classes (`ActMain`, `AppMain`, `WidgetProvider`, `ReceiverNotification`, `Fab`, `DrawerCustomLayout`, `R`); `R.java` is generated, not copied — delete the decompiled one.
- [ ] 4.6 [hard] Port the 5 `ViewOnClickListenerC05NN` inner-class-extracted listeners back to their original anonymous-class call-site form where practical; leave standalone if the rebind is risky.
- [ ] 4.7 [medium] `./gradlew :app:assembleDebug` green; app installs and `MainActivity` opens to the real outliner UI (may crash on first interaction — that's Phase 8 territory).

### Phase 5: AndroidX migration

Mechanical replacement of `android.support.*` → `androidx.*` across the ported source. Android Studio's "Migrate to AndroidX" tool handles 90% of this; the rest is per-call-site cleanup.

- [ ] 5.1 [easy] Add `android.useAndroidX=true` + `android.enableJetifier=false` to `gradle.properties`; declare AndroidX deps in `libs.versions.toml`.
- [ ] 5.2 [medium] Run Android Studio's "Refactor → Migrate to AndroidX" on the active tree; commit the result; manually fix any leftover `android.support.v4.p006a.*` / `android.support.v7.app.ActivityC0348e` references that the tool missed (jadx's `p006a` style breaks the mapper's regex).
- [ ] 5.3 [easy] Replace deprecated `android.support.design.widget.*` with `com.google.android.material.*`.
- [ ] 5.4 [easy] `./gradlew :app:assembleDebug` green; install + launch works (UI may look unchanged or subtly different).

### Phase 6: SDK and Gradle modernization

Bump targetSdk from 27 → 35 and resolve every API-level lint hit (background services, notification channels, foreground service types, scoped storage, predictive back gesture, etc.).

- [ ] 6.1 [medium] Bump `targetSdk` 27 → 35; `./gradlew :app:lintDebug` produces a finite punch list; capture as Next-up items per warning category.
- [ ] 6.2 [medium] Add notification channels (required since API 26) for `ReceiverNotification`'s reminder notifications.
- [ ] 6.3 [easy] Add `<queries>` block to the manifest for any `Intent.ACTION_SEND` share targets (required since API 30).
- [ ] 6.4 [easy] Replace any `WRITE_EXTERNAL_STORAGE` / `READ_EXTERNAL_STORAGE` usage with scoped storage / SAF for the JSON export/import path.
- [ ] 6.5 [easy] Declare the home-screen widget's launcher PendingIntents with `FLAG_IMMUTABLE` (required since API 31).

### Phase 7: Build smoke test on device

Confirm the modernized app starts, the launcher icon works, and the home-screen widget binds without crashing. Pure liveness check — no functional regression testing yet.

- [ ] 7.1 [easy] `adb install -r` succeeds with no Play Protect warnings beyond "Installed via USB".
- [ ] 7.2 [easy] App launches without an immediate ANR or crash; `adb logcat | grep AndroidRuntime` is clean for 60 seconds.
- [ ] 7.3 [easy] Home-screen widget can be added without crashing the launcher; widget renders even if empty.

### Phase 8: Feature-parity verification

Walk the original app's user-facing surface (excluding what 3.x intentionally removed) against the modernized build. This is acceptance, not new development — any gap goes to `Next up` as a bug.

- [ ] 8.1 [hard] CRUD: create / edit / delete outline rows; nesting indent works; collapsed-state persists across app restart (Room migration story is part of this — Phase 9 ships the actual Room schema).
- [ ] 8.2 [medium] Reminders: setting a reminder on a row fires a notification at the scheduled time; rescheduling on device boot still works after dropping `RECEIVE_BOOT_COMPLETED` (if we re-add the permission, this is the gate that justifies it).
- [ ] 8.3 [medium] Home-screen widget renders the current list and survives app data update.
- [ ] 8.4 [medium] Drawer / settings / appearance toggles wired to real preferences.

### Phase 9: Local persistence layer

Replace the gutted Firebase Realtime Database with a Room-backed local store. Add a user-driven JSON export/import so backup is a deliberate action, not an always-on cloud sync.

- [ ] 9.1 [hard] Design Room schema for `OutlineRow` + parent/child relationship + per-row reminder; provide a one-shot migration from any legacy on-device SharedPrefs / Firebase cache file the old build left behind (best-effort; document scope in REMOVED-CLOUD-SURFACE.md).
- [ ] 9.2 [medium] Implement a `Repository` interface; route every read/write through it; delete the last Firebase-shaped abstractions from the data layer.
- [ ] 9.3 [medium] JSON export → SAF picker → user-chosen file; JSON import in reverse with a "replace vs merge" prompt.

## Deferred / out of scope

- Re-listing on the Play Store. Side-load only for now; if we re-list, Play Console requires a privacy policy + data-handling disclosure that's only worth writing once the local-only architecture is stable. Revisit after Phase 9.
- Cloud sync via any provider. Explicit non-goal of this rewrite — the whole point is removing the cloud surface. If we want cross-device sync later it goes through a new phase with a user-controlled backend (e.g. self-hosted CouchDB / Nextcloud Notes), not a re-added Google dependency.
- Re-introducing analytics in any form. Same reason.
- Kotlin conversion of the ported Java. The port (Phase 4) stays in Java to minimize translation risk; a separate later phase can run IntelliJ's J2K converter file-by-file once the Java baseline is green.
- iOS / desktop / web port. Android only.

## Glossary (project-specific terms)

- **OutlineRow**: the single tree-row data class (text, complete, collapsed, indent, reminder, isInstr); jadx-renamed from `p032c.C0554a`.
- **Decompiled tree**: `decompiled/sources/` + `decompiled/resources/`, the read-only jadx output that the active `app/` tree is ported from.
- **Active tree**: `app/src/main/`, the modernized buildable Gradle module.
- **Phase-3 strip**: the planned excision of all Firebase / GMS / Ads / Sign-In / FCM / Cast / Crashlytics / Billing surface; tracked in `docs/REMOVED-CLOUD-SURFACE.md`.
- **Rename map**: `docs/RENAME-MAP.md`, the Phase-2 lookup from jadx-assigned `C05NN` names to meaningful identifiers.

---

### How this file evolves

- A skill (or hand-edit) closes an item by flipping `- [ ]` → `- [x]` in the same commit as the code change.
- When all items in a phase are checked, append a "completed" block to that phase: 1-paragraph result + bulleted file citations. Don't delete the checklist; it's the historical record.
- New work surfaced mid-cycle goes to `TODO.md > Next up`, not directly here.

### Difficulty labels

- `[easy]` — mechanical, well-bounded (a rename, a manifest edit, a copy-pass).
- `[medium]` — substantial reasoning, multi-step (porting a class with non-trivial deps, deobfuscating a sub-tree).
- `[hard]` — novel design or cross-file architectural decisions (Room schema, feature-parity acceptance).

### Sub-item IDs

`<phase>.<n>`, 1-indexed within each phase, assigned once, never renumbered. Inserts use letter suffixes (`<phase>.<n>a`). Cite by ID in commit messages.
