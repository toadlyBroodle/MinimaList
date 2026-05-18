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

- [x] 1.1 Copy `decompiled/resources/res/{anim,animator,color*,drawable*,interpolator,layout*,menu*,mipmap*,values*,xml}` into `app/src/main/res/`; drop the `values-*` locale dirs we don't actually have user translations for (keep `values/` + a short whitelist; track which locales survive in a glossary entry).
- [x] 1.2 Author a fresh `AndroidManifest.xml` declaring only `MainActivity` + `WidgetProvider` + `ReceiverNotification`; drop `BILLING`, `RECEIVE_BOOT_COMPLETED` (re-add only if we keep boot-time reminder rescheduling), `WAKE_LOCK` (same), `com.google.android.c2dm.permission.RECEIVE`, the custom `C2D_MESSAGE` permission, the cast `MediaIntentReceiver` / `MediaNotificationService` / `ReconnectionService`, and any AdMob / Sign-In / App-Invite components.
- [x] 1.3 Keep `INTERNET` + `ACCESS_NETWORK_STATE` only if a survey of remaining classes still needs network after Phase 3 strip; default is to drop both.
- [x] 1.4 `./gradlew :app:assembleDebug` still green after resource + manifest import (no Java code yet, so any reference from a `@string` / `@drawable` to a class is fine).

**Phase 1 completed 2026-05-18.** Resource port was more invasive than anticipated: jadx's `decompiled/resources/res/` carried massive library bleed (AppCompat `abc_*`, Material `mtrl_*`, Design `design_*`, FirebaseUI `fui_*`/`firebaseui_*`, Cast `cast_*`/`mr_*`, Places `place_*`, Wallet `wallet_*`, Common Google Play `common_google*`/`googleg_*`, MediaRouter, In-App Purchase themes, etc.), all of which the modern AAR set provides natively and refuses to co-exist with. Net of filtering: 770 files kept across 36 res subdirs out of ~1,350 in decompiled. Single `values/` dir kept (default English locale only — 114 locale-specific `values-XX/` dirs dropped); the configuration-qualifier `values-{land,large,night,sw600dp,v22-v26,...}` dirs all turned out to contain only `Base.V21.*` / `Base.V22.*` AppCompat overrides and were dropped wholesale. Per-file values filtering: `strings.xml` 381 → 256 entries; `colors.xml` 117 → 66; `dimens.xml` 214 → 49; `styles.xml` 410 → 8 (only `AppTheme`/`AppTheme.NoActionBar`/5× `ThemeOverlay.My*`/`SettingsButton` survived). Phase 3 dead layouts dropped (`fragment_google_signin.xml`, `profile_premium_layout.xml`, `profile_sync_layout.xml`, `fragment_base_profile.xml` × 2 each for `layout/` + `layout-large/`). `public.xml` removed (jadx resource-ID locks incompatible with modern AAR-assigned IDs). Manifest rewritten: zero permissions, single `MainActivity` declaration; `WidgetProvider` and `ReceiverNotification` deferred to Phase 4 (re-added when their classes port). `./gradlew :app:assembleDebug` green, 7.1 MB debug APK.

### Phase 2: Deobfuscation map

ProGuard collapsed every non-public-API class to single-letter names. Jadx renamed them mechanically to `C05NN` / `ViewOnClickListenerC05NN` / `InterfaceC05NN`. We need a stable rename map before any porting starts so subsequent phases reference real names.

- [x] 2.1 Read every file under `decompiled/sources/ca/toadlybroodledev/sublist/` (26 root + 9 in `p030a` + 4 in `p031b` + 3 in `p032c`), and produce `docs/RENAME-MAP.md` mapping each `C05NN` / `ViewOnClickListenerC05NN` / `InterfaceC05NN` (and `p03Na` → real subpackage name) to a meaningful name. Use class members, R.layout/R.id references, and call sites to deduce purpose.
- [x] 2.2 Known anchors already deducible — record in the rename map as the starting fixtures: `p030a` → `util` (base64 helpers based on byte alphabet in `C0539a`); `p031b` → `iface` (4 callback interfaces); `p032c` → `model` (data classes); `p032c/C0554a` → `OutlineRow` (fields: `text`, `complete`, `collapsed`, `indent`, `reminder`, `isInstr`); `p031b/InterfaceC0550b` → `RowActionListener` (takes `OutlineRow`); `AppMain.m4792a` → `Analytics.log` (Firebase + GA wrapper — to be deleted in Phase 3, not renamed).
- [x] 2.3 Cross-check the rename map for collisions and ambiguity; mark any class whose purpose can't be deduced from one pass as `[needs-runtime-trace]` and queue a follow-up Next-up item to instrument it.

**Phase 2 completed 2026-05-18.** All 22 remaining obfuscated identifiers in the app package mapped end-to-end. Highlights: `C0563j` → `SublistFragment` (the 568-line core fragment class), `C0571r` → `OutlineTree` (per-sublist data container; the earlier-guessed `OutlineRowVM` candidate), `C0566m` → `AppSettings` (with surviving subclass `C0567n` → `OutlineStore` after Phase 3 strip — the parent inheritance is no longer load-bearing and the two should split in Phase 4), `AbstractC0565l` → `Clipboard` (static cut/copy/paste buffer), `C0572s` → `DateTimeUtil`. The four `ViewOnClickListener*` classes all turned out to be Fragments/Dialogs (not standalone listeners — jadx names them that way because they implement `View.OnClickListener` for their own buttons): `C0548b → SettingsDialog`, `C0558e → ProfileFragment` (Phase 4 deletion candidate — built entirely around cloud profile), `C0561h → SearchSublistFragment`, `C0562i → SettingsFragment`. `InterfaceC0549a` → `HostContract` (26-method master interface sole-implemented by `ActMain`); three methods (`mo4756C`/`mo4758E` ad hooks, `mo4778p` premium getter) are now no-op stubs slated for Phase 4 deletion from the interface itself. Zero `[needs-runtime-trace]` items remain — every class had enough signal from imports + field types + public-method signatures + caller context. Cross-references with `REMOVED-CLOUD-SURFACE.md` add 12 deletion entries to the rename map's symbol table.

### Phase 3: Cloud / monetization strip

Excise every Firebase, GMS, AdMob, Sign-In, App-Invite, Cast, FCM, Crashlytics and Billing call site from the decompiled source BEFORE the port to the active tree, so what crosses over is already clean. Work on the `decompiled/` copy; the active `app/src/main/java/` tree is populated only in Phase 4.

- [x] 3.1 **Firebase Realtime Database** — drop `@PropertyName`, `@IgnoreExtraProperties`, `InterfaceC2267e`, `InterfaceC2270h` annotations from the `p032c/model/*` data classes; remove every call to `FirebaseDatabase`, `DatabaseReference`, `ValueEventListener` across the source tree; produce `docs/REMOVED-CLOUD-SURFACE.md` listing every file + line range touched (so feature-parity tests in Phase 8 know what UX disappeared).
- [x] 3.2 **Firebase Analytics + GMS Analytics** — delete `AppMain.f3724a` / `f3725b` / `f3726c` fields and the `m4792a` / sibling logging methods; remove every `AppMain.m4792a(...)` call site (~15+ in ActMain alone) without replacement.
- [x] 3.3 **Google Sign-In + App Invites** — delete `GoogleSignInOptions`, `com.google.android.gms.appinvite.*`, `gms.auth.*` imports and call sites (App Invites was sunset by Google in 2020 so this is already broken anyway). Remove the in-app "Invite friends" menu entry from `res/menu/`.
- [x] 3.4 **AdMob** — delete `com.google.android.gms.ads.*` imports, `InterstitialAd` / `AdRequest` / `AdListener` usages in `ActMain`, the inner `C0657a` AdListener subclass, and any `<com.google.android.gms.ads.AdView>` tag in layouts.
- [x] 3.5 **FCM / Cast / Crashlytics / Billing** — remove any remaining `com.google.firebase.messaging.*`, `com.google.android.gms.cast.*`, `com.google.firebase.crashlytics.*`, `com.android.billingclient.*` references. Most should already be gone with the bundled dep tree once Gradle deps are declared cleanly in Phase 4.
- [x] 3.6 Grep-audit pass: `grep -rEi 'firebase|com\.google\.android\.gms|admob|crashlytics|billingclient|c2dm' decompiled/sources/ca/toadlybroodledev` returns zero hits (or only commented-out references in `docs/REMOVED-CLOUD-SURFACE.md`).

**Phase 3 completed 2026-05-18.** Closed in 6 commits (`013f2e3` → `1c3b815`). The decompiled tree's app package has zero live Firebase / GMS / AdMob / Play-Billing / FCM / Cast / Crashlytics code references. Deleted entirely: `p030a/` (9 files, In-App Billing v3 sample lib — re-classified from "util" mid-phase), `C0564k.java` (premium gate), `ViewOnClickListenerC0559f.java` (Sign-In fragment, 164 lines), `p032c/C0555b.java` (App-Invites tracker). Surgically excised across `AppMain`, `ActMain`, `C0566m`, `C0567n`, `ViewOnClickListenerC0558e`, `p031b/InterfaceC0549a`, `p032c/C0554a`, `p032c/C0556c`: ~250 lines net across all phases plus 49 analytics call sites. Per-removal port guidance + line citations in `docs/REMOVED-CLOUD-SURFACE.md`. Two interface methods (`mo4756C`, `mo4758E` ad hooks; `mo4778p` premium getter) became no-ops in their sole implementer — flagged for Phase 4 deletion from `InterfaceC0549a`. Phase 1 carryover list (manifest permissions / components, orphan strings/colors/styles/menu items) catalogued in the same doc. RENAME-MAP.md updated to reflect the `p030a` re-classification.

### Phase 4: Port core code into active tree

File-by-file move from `decompiled/sources/ca/toadlybroodledev/sublist/` into `app/src/main/java/ca/toadlybroodledev/sublist/`, applying the Phase 2 rename map. Each file gets compiled in isolation as it lands (`./gradlew :app:compileDebugJavaWithJavac`). Stay in Java for the port; defer Kotlin conversion to a later phase.

- [x] 4.1 [medium] Port `util/` (formerly `p030a`) — 9 helper classes, smallest surface, no UI deps, easiest to verify in isolation. **N/A: `p030a` was re-classified as the IAB v3 billing helper library and deleted entirely in Phase 3.5. Nothing to port.**
- [x] 4.2 [medium] Port `model/` (formerly `p032c`) — 3 data classes; confirm Firebase annotations are gone and `OutlineRow` is plain POJO.
- [x] 4.3 [medium] Port `iface/` (formerly `p031b`) — 4 callback interfaces; trivial once `model/` exists.
**Phase 4.3 completed 2026-05-18.** All 4 `p031b` interfaces ported into `app/src/main/java/ca/toadlybroodledev/sublist/iface/` with Phase-2 names applied. `HostContract` (27-method `InterfaceC0549a`) trimmed to 23 methods: `mo4756C`/`mo4758E` (AdMob hooks), `mo4762a(C0556c)` (cloud-profile setter — C0556c deleted), and `mo4777o()` (Sign-In fragment getter — return type deleted) all dropped; `mo4778p` was already gone from Phase 3.5. `RowActionListener` (6 methods) and `FragmentHost`/`OutlineHost` (2 + 6 methods) ported clean. `android.support.v4.p006a.AbstractC0164t` resolved to `androidx.fragment.app.FragmentTransaction`; `ComponentCallbacksC0154j` resolved to `androidx.fragment.app.Fragment`. Eight forward-ref stubs created for Phase-4.4 types (`SublistFragment`, `OutlineRowView`, `OutlineTree`, `OutlineStore`, `ProfileFragment`, `SettingsFragment`, `DrawerCustomLayout`, `OutlineFab`) so the interfaces compile now; stubs will be replaced by full ports in 4.4/4.5. `./gradlew :app:testDebugUnitTest` green at 15 tests (4 → 15, +11 new IfacePackageTest assertions). Full compilation of the iface package awaits 4.4 — stub body correctness is the acceptance gate for this sub-phase.

- [x] 4.4 [medium] Port the 16 obfuscated root-package classes (`C0538a` … `C0572s`) under their Phase-2 names; expect ~half are fragments / dialogs / adapters and half are utility helpers.
**Phase 4.4 completed 2026-05-18.** All 17 obfuscated root-package classes ported under Phase-2 names. New files: `AppSettings` (C0566m, 400 lines — SharedPrefs + palette arrays + inner `KeyboardAction` enum), `OutlineStore` (C0567n, extends AppSettings — JSON backup/export + widget screenshot helpers + Gson serialization), `OutlineTree` (C0571r, 276 lines — per-sublist row container + tree-walk helpers), `OutlineRowView` (C0557d — per-row view widget, fields/flags for text/complete/collapsed/reminder, AlarmManager scheduling), `SublistFragment` (C0563j, 568 lines — core fragment implementing OutlineHost), `Clipboard` (AbstractC0565l — static-only abstract cut/copy/paste buffer), `DateTimeUtil` (C0572s — epoch↔wall-clock converters + reminder picker dialogs), `SublistRenderer` (C0568o — clears + re-inflates LinearLayout from row list), `IndentManager` (C0569p — Tab/Shift-Tab tree manipulation), `StringArraySpinnerAdapter` (C0570q — BaseAdapter wrapping string-array resource), `DrawerToggle` (C0553c — ActionBarDrawerToggle with parallax scrim), `NewSublistDialog` (C0538a — AlertDialog + EditText for new-sublist name), `WelcomeSublistFragment` (C0560g — extends SublistFragment), `SettingsDialog` (ViewOnClickListenerC0548b), `ProfileFragment` (ViewOnClickListenerC0558e — cloud profile shell, retained for now), `SearchSublistFragment` (ViewOnClickListenerC0561h — extends SublistFragment + implements FragmentHost), `SettingsFragment` (ViewOnClickListenerC0562i). All 4.3 stubs replaced with full ports. Also ported 3 of the 4.5 named classes that were already stubs: `DrawerCustomLayout`, `OutlineFab` (decompiled `Fab`), `ReceiverNotification`. `model.OutlineRow.getListOfEntSers()` static method added (deferred from 4.2). Gson dep added to `libs.versions.toml` + `app/build.gradle.kts`. Resource arrays needed by AppSettings added: `res/values/arrays.xml`, `bools.xml`, `integers.xml`. `./gradlew :app:testDebugUnitTest` green at 54 tests (15 → 54, +39 new RootPackagePortTest assertions).
- [x] 4.5 [medium] Port the remaining 3 already-named classes (`ActMain`, `AppMain`, `WidgetProvider`); `R.java` is generated, not copied — delete the decompiled one. (`ReceiverNotification`, `Fab`/`OutlineFab`, `DrawerCustomLayout` ported in 4.4.)
**Phase 4.5 completed 2026-05-18.** All 5 outstanding Phase-4.5 items shipped: `ActMain` ported as `MainActivity.java` (replaces Phase-0 Kotlin stub `MainActivity.kt`; 320 lines, implements `HostContract` + `RowActionListener`, applies all Phase-3 removals — AdMob no-ops, Firebase listener calls, App-Invites, billing dropped); `AppMain.java` ported as minimal `Application` subclass (MultiDex.install no-op on minSdk 21 removed); `WidgetProvider.java` ported straight (bitmap screenshot + PendingIntent to `MainActivity`). `DrawerCustomLayout.java` fully ported from stub: extends `androidx.drawerlayout.widget.DrawerLayout`, wires `NavigationView` with `OnNavigationItemSelectedListener` (if-else chain; `switch` on R.id disallowed in AGP 8), menu_invite case removed (Phase 3.3). `OutlineFab.java` fully ported from stub: extends `FloatingActionButton`, `m4800a(visible, animated)` gates on `AppSettings.f3945h`. Manifest updated: `android:name=".AppMain"`, `WidgetProvider` receiver + `@xml/widget_info` meta-data, `ReceiverNotification` receiver re-added. Decompiled `R.java` deleted. `./gradlew :app:testDebugUnitTest` green at 67 tests (54 → 67, +13 new `RootPackagePortTest` assertions).
**Review follow-ups (open — schedule as the next `/sst-dev-cycle` cycle):**
- [x] [easy] [should-fix] `MainActivity.java:127` — `mo4759F()` builds a notification using `getPackageName()` as the channel ID, which is not a registered channel; notification silently dropped on API 26+ (all modern devices). SPEC 6.2 now covers both `ReceiverNotification` and `MainActivity.mo4759F()` with a shared `CHANNEL_REMINDERS` constant registered in `AppMain.onCreate()`.
- [x] [easy] [should-fix] `MainActivity.java:533` — `onRequestPermissionsResult` override omits `super.onRequestPermissionsResult()`, unlike every other lifecycle override in the file; `FragmentManager` cannot dispatch permission results to fragments, so any future fragment permission request (e.g. `POST_NOTIFICATIONS` for Phase 8.2 reminders) silently receives no result. Fixed: added `super.onRequestPermissionsResult(i, strArr, iArr)` as the first line of the method.
- [x] [easy] [should-fix] `OutlineFab.java:27` — `m4800a(true, true)` sets `setVisibility(GONE)` instead of showing the FAB; the "animated show" branch silently hides the view, inverting its contract. The `(false, true)` / `(true, false)` / `(false, false)` call sites are correct; only `(true, true)` is wrong. Fixed: replaced `setVisibility(GONE)` in the `visible && animated` branch with `show()`.

- [x] 4.6 [hard] Port the 5 `ViewOnClickListenerC05NN` inner-class-extracted listeners back to their original anonymous-class call-site form where practical; leave standalone if the rebind is risky. **N/A: All 5 audited. `C0559f` (Sign-In fragment) deleted in Phase 3.3. Remaining 4 — `SettingsDialog` (C0548b, 290-line DialogFragment), `ProfileFragment` (C0558e, Fragment), `SearchSublistFragment` (C0561h, extends SublistFragment), `SettingsFragment` (C0562i, Fragment) — each carry 10+ fields and/or extend substantial base classes. None inlinable as anonymous click listeners. All correctly ported standalone in Phase 4.4; no code changes required.**
- [x] 4.7 [medium] `./gradlew :app:assembleDebug` green; app installs and `MainActivity` opens to the real outliner UI (may crash on first interaction — that's Phase 8 territory). **`./gradlew :app:assembleDebug` → BUILD SUCCESSFUL (32 tasks). Device install + launch deferred to Phase 7 (adb not available in WSL build environment; Phase 7.1–7.2 cover this explicitly).**

**Phase 4 completed 2026-05-18.** All 7 checkable Phase-4 items closed (4.1 N/A, 4.2–4.7 shipped across 6 cycles). Active tree now holds the full port: 22 root-package classes (`AppSettings`, `OutlineStore`, `OutlineTree`, `OutlineRowView`, `SublistFragment`, `Clipboard`, `DateTimeUtil`, `SublistRenderer`, `IndentManager`, `StringArraySpinnerAdapter`, `DrawerToggle`, `NewSublistDialog`, `WelcomeSublistFragment`, `SettingsDialog`, `ProfileFragment`, `SearchSublistFragment`, `SettingsFragment`, `DrawerCustomLayout`, `OutlineFab`, `ReceiverNotification`, `AppMain`, `MainActivity` / `WidgetProvider`), 4 interfaces in `iface/`, 3 model classes in `model/`. All cloud/monetization code removed per Phase 3. Review follow-ups from 4.5 all closed (`onRequestPermissionsResult` super call, `OutlineFab.m4800a(true,true)` show bug). `./gradlew :app:testDebugUnitTest` green at 69 tests. `./gradlew :app:assembleDebug` green.

### Phase 5: AndroidX migration

Mechanical replacement of `android.support.*` → `androidx.*` across the ported source. Android Studio's "Migrate to AndroidX" tool handles 90% of this; the rest is per-call-site cleanup.

- [x] 5.1 [easy] Add `android.useAndroidX=true` + `android.enableJetifier=false` to `gradle.properties`; declare AndroidX deps in `libs.versions.toml`. (`android.useAndroidX=true` was already set from Phase 0; added `android.enableJetifier=false`; all AndroidX deps already declared.)
- [x] 5.2 [medium] Run Android Studio's "Refactor → Migrate to AndroidX" on the active tree; commit the result; manually fix any leftover `android.support.v4.p006a.*` / `android.support.v7.app.ActivityC0348e` references that the tool missed (jadx's `p006a` style breaks the mapper's regex). **N/A: Phase 4 port already resolved every `android.support.*` reference to its `androidx.*` equivalent at the call site. Grep of all 28 Java source files finds zero `import android.support.*` statements (one comment reference in `RowActionListener.java` only). No migration pass needed.**
- [x] 5.3 [easy] Replace deprecated `android.support.design.widget.*` with `com.google.android.material.*`. **N/A: no `android.support.design.widget.*` imports exist; `com.google.android.material:material` already declared in `libs.versions.toml`.**
- [x] 5.4 [easy] `./gradlew :app:assembleDebug` green; install + launch works (UI may look unchanged or subtly different). (`assembleDebug` BUILD SUCCESSFUL with `android.enableJetifier=false`; device install deferred to Phase 7 per adb-unavailable-in-WSL precedent from 4.7.)

**Phase 5 completed 2026-05-18.** The Phase 4 port already resolved all `android.support.*` references to `androidx.*` equivalents at each call site — the full Android Studio migration pass (5.2) was N/A. Only remaining task was adding `android.enableJetifier=false` to `gradle.properties` (the `android.useAndroidX=true` flag was set from Phase 0; all AndroidX deps were declared by Phase 4.4). `Phase5AndroidXTest` (2 tests) added as a regression guard: `gradlePropertiesHasBothAndroidXFlags` verifies both properties; `noAndroidSupportImportStatementsInSource` scans all 28 Java source files for `import android.support.*` statements (zero found). `./gradlew :app:assembleDebug` green. Tests 69 → 71.

### Phase 6: SDK and Gradle modernization

Bump targetSdk from 27 → 35 and resolve every API-level lint hit (background services, notification channels, foreground service types, scoped storage, predictive back gesture, etc.).

- [ ] 6.1 [medium] Bump `targetSdk` 27 → 35; `./gradlew :app:lintDebug` produces a finite punch list; capture as Next-up items per warning category.
- [x] 6.2 [medium] Add notification channels (required since API 26). Two paths need registration: (1) `ReceiverNotification.onReceive()` — fires per-row reminder alarms via `AlarmManager`; (2) `MainActivity.mo4759F()` — builds a "Upcoming reminders" summary notification. Both currently pass `getPackageName()` as the channel ID with no prior `createNotificationChannel()` call; both silently drop their notification on API 26+. Register one shared channel (e.g. `CHANNEL_REMINDERS`) in `AppMain.onCreate()` and substitute it at both call sites.

**Review follow-ups (open — schedule as the next `/sst-dev-cycle` cycle):**
- [x] [easy] [should-fix] `Phase6NotificationChannelTest.java:appMainRegistersChannel()` — source-scan asserts `createNotificationChannel` appears in `AppMain.java` but does not verify the `Build.VERSION.SDK_INT >= Build.VERSION_CODES.O` guard exists. If a future change drops the guard, the test still passes but the app crashes at startup on every API 21–25 device (full minSdk range). Fix: added `assertTrue(src.contains("Build.VERSION.SDK_INT") && src.contains("Build.VERSION_CODES.O"))` inside `appMainRegistersChannel()`.

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
