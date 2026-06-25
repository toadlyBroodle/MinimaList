# MinimaList

Local-only outliner — no cloud, no ads, no tracking.

## Get it on F-Droid

[<img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" alt="Get it on F-Droid" height="80">](https://f-droid.org/en/packages/ca.toadlybroodle.minimalist/)

**F-Droid listing:** https://f-droid.org/en/packages/ca.toadlybroodle.minimalist/

APK releases are also published on the [GitHub releases page](https://github.com/toadlyBroodle/MinimaList/releases).

## About

MinimaList is a minimal outline and task manager that keeps everything on your device.

Originally released on Google Play in 2018 as "sublist" by toadlyBroodle, the app was abandoned when the developer account was lost. This is a full resurrection from the original APK — every cloud surface has been removed:

- No Firebase (Realtime Database, Analytics, FCM, Crashlytics)
- No AdMob ads
- No Google Sign-In or App Invites
- No Google Play Billing
- No network connections of any kind

## Features

- Nested outline rows with indent / outdent support
- Row completion with optional auto-complete-children cascade
- Collapse / expand subtrees
- Per-row reminders via AlarmManager (notifications at scheduled times, rescheduled on boot)
- JSON and plain-text export / import (no cloud required)
- Home-screen widget showing your current list
- Dark theme with customizable accent colors
- Search across all sublists

All data is stored in a local Room database. No account required. No permissions beyond `POST_NOTIFICATIONS` (optional, for reminders) and `RECEIVE_BOOT_COMPLETED` (to reschedule reminders after reboot).

## Building from source

Standard Android Gradle build:

```
./gradlew :app:assembleRelease
```

Requires JDK 17 and the Android SDK (build-tools 35.0.0, compileSdk 35).

## License

MIT — see [LICENSE](LICENSE).
