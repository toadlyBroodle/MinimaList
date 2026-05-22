# MinimaList — F-Droid Submission Checklist

F-Droid is the target distribution catalog for MinimaList (Phase 14.4).  The
app has zero proprietary dependencies, zero trackers, and zero ads — exactly
the profile F-Droid rewards with straightforward admission.  This document is
the concrete path from the current repo state to a published F-Droid listing.

**No submission happens during Phase 14.4.**  All actions below are
preparation work; the actual merge request to `fdroiddata` is a future step
requiring the user's explicit go-ahead.

---

## Background

F-Droid builds and signs apps from source on its own build-server farm.
The developer does not submit a signed APK — F-Droid reads the source,
checks out the specified commit, builds, signs with its own key, and publishes.
The `ca.toadlybroodle.minimalist` install identity is separate from the
F-Droid-signed package; users installing from F-Droid get the F-Droid key.

The original `ca.toadlybroodledev.sublist` Play Store listing is permanently
orphaned (developer-account access lost).  F-Droid is the primary distribution
path for the resurrected build.

---

## Submission path options

Two paths exist.  **Merge request is preferred** for new app maintainers
submitting their own app — it gives reviewers all the context they need and
avoids the RFP wait queue.

| Path | Where | Speed | Who does the work |
|------|-------|-------|-------------------|
| **Merge request (recommended)** | Fork `gitlab.com/fdroid/fdroiddata`, add metadata YAML, open MR | ~1–2 weeks total | You |
| Request For Packaging (RFP) | File issue at `gitlab.com/fdroid/rfp` | Weeks to months | F-Droid volunteers |

---

## Ordered checklist: current repo state → submitted MR

### Step 1 — Add a FOSS license file (Done)

F-Droid's inclusion policy requires a recognized FOSS license declared in a
`LICENSE` file at the repo root and in the fdroiddata YAML `License:` field.

- [x] Choose a license (MIT, Apache-2.0, or GPL-3.0-only are all valid).
- [x] Add `LICENSE` file at repo root.
- [ ] Update `README.md` with the license badge (optional but conventional).

The app has no license file today — this is the first blocker.

### Step 2 — Add fastlane metadata in the app repo

F-Droid reads app descriptions and graphics from fastlane metadata if
present.  Create the directory structure:

```
fastlane/
  metadata/
    android/
      en-US/
        short_description.txt   (≤ 80 chars)
        full_description.txt    (≤ 4000 chars)
        title.txt               (≤ 50 chars, optional)
        changelogs/
          107.txt               (one file per versionCode, ≤ 500 chars)
        images/
          icon.png              (512 × 512 px)
          phoneScreenshots/     (up to 5, 1080 × 1920 px recommended)
```

- [x] Write `short_description.txt` — one-liner describing the app.
- [x] Write `full_description.txt` — plain text or basic HTML, ≤ 4000 chars.
- [x] Add `changelogs/107.txt` — summary of changes since the 2018 build.
- [x] Add `icon.png` — 512 × 512 export of the current vector icon.
- [ ] (Optional) add 1–3 screenshots in `phoneScreenshots/`.

### Step 3 — Verify all dependencies are FOSS

F-Droid's build server rejects builds that pull from non-FOSS sources.
MinimaList's current dependency set (AndroidX, Material, Room, Gson,
Robolectric, Mockito) is all Apache/MIT/BSD — no Google Play Services,
no Firebase, no proprietary SDK.

- [x] Zero proprietary dependencies confirmed (Phase 3 cloud strip).
- [ ] Re-confirm `libs.versions.toml` after any future dependency additions.

### Step 4 — Confirm Gradle version pin for reproducible builds

F-Droid's build server must reproduce the exact same APK bytes.  Key
requirements:

- Gradle wrapper version pinned in `gradle/wrapper/gradle-wrapper.properties`.
- AGP version pinned in `libs.versions.toml`.
- No timestamps injected into resources (AGP 7.1+ handles this automatically).
- Build-tools version pinned via `buildToolsVersion` in `app/build.gradle.kts`
  (currently unset — F-Droid's server picks latest; pinning removes ambiguity).

- [x] Add `buildToolsVersion = "35.0.0"` to
  `app/build.gradle.kts` defaultConfig.
- [x] Gradle wrapper is already version-pinned.
- [x] AGP version is pinned in `libs.versions.toml`.

### Step 5 — Tag a release on GitHub

F-Droid's YAML references a specific git commit (or tag).  A named tag makes
the YAML `commit:` field readable and the `UpdateCheckMode: Tags` automation
usable.

- [x] Create a signed git tag (e.g. `v107`) pointing at the current HEAD.
- [x] Push the tag to GitHub.

### Step 6 — Create `metadata/ca.toadlybroodle.minimalist.yml` in fdroiddata

Fork `https://gitlab.com/fdroid/fdroiddata` and add a file at that path.
Minimal working skeleton:

```yaml
Categories:
  - Productivity

License: MIT           # update to match step 1

SourceCode: https://github.com/toadlyBroodle/MinimaList
IssueTracker: https://github.com/toadlyBroodle/MinimaList/issues

Name: MinimaList
Summary: Local-only outliner with no cloud, no ads, no tracking
Description: |-
  MinimaList is a minimal outline / task manager that stores everything locally.
  Resurrected from an abandoned 2018 Play Store release; all cloud surfaces
  (Firebase, AdMob, Google Sign-In, Analytics, FCM, Cast) removed.

Builds:
  - versionName: "107"
    versionCode: 107
    commit: v107         # the tag from step 5
    gradle:
      - release

AutoUpdateMode: Version
UpdateCheckMode: Tags
UpdateCheckData: app/build.gradle.kts|versionCode\s*=\s*([0-9]+)|.|v$1
```

**Use the linted draft directly.** Rather than transcribing this skeleton, copy
`docs/fdroid/ca.toadlybroodle.minimalist.yml` from this repo into your
`fdroiddata` fork — it already has the correct `UpdateCheckData` regex and has
passed `fdroid lint` locally.

- [ ] Fork `fdroiddata` on GitLab.
- [ ] Add the YAML above (updated with correct license + commit hash).
- [x] Run `fdroid lint metadata/ca.toadlybroodle.minimalist.yml` locally
  (`pip install fdroidserver`) to catch schema errors before submitting.
- [ ] Open a merge request against `fdroiddata` main.

### Step 7 — Respond to reviewer feedback

F-Droid maintainers review MRs and may request changes (license confirmation,
build-config clarifications, anti-features declarations).  Expected turnaround
after initial review: 24–72 hours.

- [ ] Monitor the GitLab MR for reviewer comments.
- [ ] Update the YAML and app repo as needed.
- [ ] Once merged, the app appears in the F-Droid index within the next
  build cycle (typically 24–48 hours).

---

## Prerequisites still missing (blockers before any MR submission)

| Item | Status | Phase |
|------|--------|-------|
| `LICENSE` file at repo root | **Done** | Phase 15.1 |
| Fastlane metadata directory | **Done** | Phase 15.2 |
| GitHub release tag (`v107`) | **Done** | Phase 15.4 |
| `buildToolsVersion` pin | **Done** | Phase 15.3 |
| F-Droid YAML in fdroiddata fork | **Done** | Phase 15.5 |

Everything else (zero proprietary deps, gitignored secrets, clean Gradle
build, working APK) is already in place.

---

## Anti-features status

MinimaList has **none** of F-Droid's defined anti-features:

| Anti-feature | Status |
|---|---|
| Ads | None — AdMob removed in Phase 3 |
| Tracking | None — Firebase Analytics + GMS removed in Phase 3 |
| NonFreeNet | None — fully local, no network calls |
| NonFreeAdd | None |
| NonFreeDep | None — zero proprietary deps |
| NSFW | No |
| UpstreamNonFree | No — original APK is abandoned; no upstream |
| DisabledAlgorithm | No |
| KnownVuln | No |

Declare `AntiFeatures: []` in the YAML or omit the field (both are equivalent).

---

## References

- F-Droid Quick Start Guide: https://f-droid.org/docs/Submitting_to_F-Droid_Quick_Start_Guide/
- Build Metadata Reference: https://f-droid.org/docs/Build_Metadata_Reference/
- Inclusion Policy: https://f-droid.org/docs/Inclusion_Policy/
- Reproducible Builds: https://f-droid.org/docs/Reproducible_Builds/
- Anti-Features: https://f-droid.org/en/docs/Anti-Features/
- fastlane metadata guide: https://f-droid.org/docs/All_About_Descriptions_Graphics_and_Screenshots/
- fdroiddata: https://gitlab.com/fdroid/fdroiddata
- fdroid RFP tracker: https://gitlab.com/fdroid/rfp
