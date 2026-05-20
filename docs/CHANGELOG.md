# Changelog

All notable changes to MinimaList. Newest release first.

## v107 — 2026-05-21

First public release. MinimaList is a resurrection of an abandoned Android
outliner — `ca.toadlybroodledev.sublist` (versionCode 106, last built around
2018). The original source was lost on a dead machine; the only surviving
artifact was the APK pulled off an old Moto G. This release is that app brought
back to life: fully local, cloud-free, and rebuilt on a modern Android stack.

### How it was rebuilt

- Decompiled the v106 APK with jadx 1.5.5 into Java sources and resources, then
  ran a full deobfuscation pass mapping every obfuscated class and method back
  to readable names.
- Scaffolded a new Gradle Kotlin-DSL project (AGP 8.x, minSdk 21, targetSdk 35)
  around the recovered code; ported the manifest and resources, then moved the
  core code into an active source tree class by class.
- Removed every cloud and ad surface: Firebase Realtime Database, Firebase
  Analytics, GMS Analytics, Firebase Auth, Google Sign-In, Google App Invites,
  AdMob, Play Billing, FCM, Crashlytics, and Cast. The app no longer talks to
  any server and has no tracking.
- Migrated off the archived `android.support.*` libraries to AndroidX. Fixed
  lint errors, added the manifest `queries` block, adopted scoped storage,
  `FLAG_IMMUTABLE` pending intents, and the `POST_NOTIFICATIONS` runtime
  permission.

### What replaced the cloud

- A Room database now holds the outline tree, replacing Firebase Realtime DB.
  Data from the old app migrates over automatically on first run.
- Unified Export / Import — Local storage or SD card, JSON or TXT — replaces
  cloud sync.

### Feature parity, verified

- Acceptance test coverage for the CRUD engine, settings, reminder alarms, the
  home-screen widget, and alarm rescheduling after a reboot.
- Fixed several launch-blocking and edge-case crashes found during on-device
  testing.

### UI and branding refresh

- Renamed and rebranded to MinimaList; package is now
  `ca.toadlybroodle.minimalist`.
- Retired the obsolete profile and invite screens; added a "Contribute on
  GitHub" link.
- New muted Material 3 color palette.
- Nav drawer polish: vector header logo with hollow circles and square rule
  ends; the active row is highlighted in the chosen accent color.
- Settings page polish: white button text on the accent background,
  left-justified title bars, and every spinner background repaints when the
  accent color changes.

### Install

Side-load `minimalist-v107-release.apk`. Signed release build; no Play Store
listing.
