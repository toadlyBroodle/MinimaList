# Removed cloud surface

Append-only log of every cloud / monetization touch point excised from the decompiled tree during Phase 3. Each entry names the file, the surface removed, the line range it occupied in the original decompiled output, and what the Phase 4 port should do with the remainder. Phase 8 feature-parity tests read this file to know what UX is gone.

## Phase 3.1 — Firebase Realtime Database

Surface owned by `com.google.firebase.database.*` (DataSnapshot / DatabaseError / DatabaseReference / FirebaseDatabase / GenericTypeIndicator / ValueEventListener) plus `@PropertyName` / `@IgnoreExtraProperties` model annotations.

### `decompiled/sources/ca/toadlybroodledev/sublist/p032c/C0554a.java` — `OutlineRow`
- Removed import `com.google.firebase.database.InterfaceC2267e` (Exclude) and `InterfaceC2270h` (IgnoreExtraProperties).
- Removed `@InterfaceC2270h` (class-level, was line 11) and `@InterfaceC2267e` on `isInstr` field (was line 17). Annotations replaced with explanatory comments in-place.
- **Port (Phase 4.2):** keep as `model.OutlineRow`, drop the comments, no other change.

### `decompiled/sources/ca/toadlybroodledev/sublist/p032c/C0556c.java` — cloud user profile
- Removed import `com.google.firebase.database.InterfaceC2270h` and `@InterfaceC2270h` class annotation (was line 7).
- Left class body intact — `displayname` / `email` / `completed` / `invites` / `uploads` / `initInstallTime` / `firstConnectTime` / `lastConnectTime` / `trialHoursRemaining` are pure POJO fields, harmless.
- **Port (Phase 4.2):** DELETE this class entirely. It exclusively modeled the cloud user-profile doc at `users/<uid>` in RTDB; a local-only app has no user-profile concept. If trial-hours gating turns out to be wanted later, reintroduce a different, much smaller `LocalSettings` POJO backed by SharedPreferences.

### `decompiled/sources/ca/toadlybroodledev/sublist/p032c/C0555b.java` — App-invite tracker POJO
- Not touched in 3.1 (no Firebase RTDB annotations on the class itself).
- **Tracked here for visibility:** Phase 3.3 deletes this class entirely along with the App-Invites surface.

### `decompiled/sources/ca/toadlybroodledev/sublist/C0566m.java` — base settings/state class
- Removed imports `com.google.firebase.auth.AbstractC2198l` (FirebaseUser — really Phase 3.3 territory; pulled forward because the only use was inside an RTDB method) and `com.google.firebase.database.{C2225a,C2226b,C2269g,InterfaceC2276n}`.
- Removed method `protected static ArrayList<C0554a> m4949n()` (was lines 327-347): legacy-pull of `sublists/<uid>` subtree from RTDB via ValueEventListener, decoding via `GenericTypeIndicator<ArrayList<OutlineRow>>`. Sole caller is `C0567n.m4965p()` line 185 — also removed in this phase.
- **Port (Phase 4):** port the rest of `C0566m` as the local settings / theme / outline-state holder; the static `m4949n` does not survive.

### `decompiled/sources/ca/toadlybroodledev/sublist/C0567n.java` — cloud sync subclass (extends `C0566m`)
- Removed imports `com.google.firebase.database.{C2225a,C2226b,C2266d,C2268f,C2269g,InterfaceC2276n}`. The remaining `com.google.firebase.auth.{AbstractC2198l,FirebaseAuth}` imports are Phase 3.3.
- Removed `static C2266d f3973r` (was line 44) — RTDB root reference.
- Removed `f3973r = C2268f.m13000a().m13004b();` from constructor — `FirebaseDatabase.getInstance().getReference()`.
- Removed method `static void m4965p()` (was lines 164-208): RTDB pull of `sublist_collections/<uid>` via ValueEventListener, with legacy-pull fallback via `C0566m.m4949n()` and final state-merge into the in-memory outline.
- Removed method `static void m4966q()` (was lines 210-229): RTDB push of the current outline state to `sublist_collections/<uid>`, gated on signed-in user + non-null in-memory profile.
- Removed method `static void m4971v()` (was lines 288-298): RTDB write of `users/<uid>/lastConnectTime`, plus in-memory profile bump. The in-memory bump is preserved-in-comment for Phase 8 reuse if needed.
- Removed method `static void m4972w()` (was lines 300-309): RTDB write of full `users/<uid>` profile doc.
- Removed method `public static void m4975z()` (was lines 311-349): RTDB read of `users/<uid>` profile; created the doc if missing; decremented `trialHoursRemaining` based on `lastConnect` delta; repushed via `m4972w()`. Trial-hours / install-time / connect-time bookkeeping was server-anchored.
- **Port (Phase 4):** `C0567n` is mostly cloud-sync. After Phase 3.3 removes the remaining FirebaseAuth shell, the surviving locally-useful methods are `m4961a` (read widget screenshot from internal storage), `m4962a` (write widget screenshot), `m4963b`, `m4964c` (filepath helper), `m4967r` (txt export to external storage), `m4968s` / `m4969t` / `m4970u` (storage-mounted/permission helpers), `m4976a` (local JSON backup write), `m4977b` (local JSON backup read). All static utilities; the class itself does not need to survive — fold the survivors into `OutlineBackup` / `WidgetSnapshot` / `Storage` helpers during the port.

## Reverse-grep verification (Phase 3.1 end-state)

```
$ grep -rEn 'firebase\.database|C2225a|C2226b|C2266d|C2268f|C2269g|InterfaceC2276n|InterfaceC2267e|InterfaceC2270h' \
    decompiled/sources/ca/toadlybroodledev/sublist/ | grep -v 'Phase 3\.1: removed'
(no output)
```

Only mentions remaining are the `Phase 3.1: removed …` breadcrumb comments themselves.

## Phase 3.2 — Firebase Analytics + GMS Analytics

Surface owned by `com.google.firebase.analytics.FirebaseAnalytics` and `com.google.android.gms.analytics.{GoogleAnalytics, Tracker, HitBuilders}`.

### `decompiled/sources/ca/toadlybroodledev/sublist/AppMain.java`
- Removed imports `com.google.android.gms.analytics.{C0889d,C0890e,C0893h}` (`GoogleAnalytics`, `HitBuilders`, `Tracker`) and `com.google.firebase.analytics.FirebaseAnalytics`.
- Removed static fields `f3724a` (GoogleAnalytics tracker root), `f3725b` (Tracker), `f3726c` (FirebaseAnalytics).
- Removed `public static void m4792a(String item, String type)` — analytics-log wrapper. 44 call sites across 10 caller files; mapped one-to-one to a Firebase `logEvent(type, bundle)` + (when `type == "ScreenView"`) a GMS Tracker screen-view hit.
- Removed `public static void m4794b(String name, String value)` — Firebase `setUserProperty(name, value)` + duplicate-log via `m4792a`. 4 call sites.
- Removed `public void m4795a()` — GoogleAnalytics + FirebaseAnalytics init. Hard-coded tracker id was `UA-85711908-1` (a Universal Analytics property — the entire UA service was sunset by Google in July 2023, so this was already dead). Sole caller in `ActMain.java:591`.
- Left `m4793b()` intact — returns a base64 fragment of a Google Play billing public key, owned by Phase 3.5.
- **Port (Phase 4.5):** the AppMain Application subclass exists almost solely for analytics init + MultiDex. After Phase 3.5 removes `m4793b`, the class collapses to a `MultiDexApplication` shell — likely deletable entirely once `android.support.multidex` is replaced with the native API 21+ multidex path.

### Caller files — call sites removed (44 × `m4792a` + 4 × `m4794b` + 1 × `m4795a` = 49 lines total)

| file | call sites removed |
|---|---|
| `ActMain.java` | 12 × `m4792a` + 1 × `((AppMain) getApplication()).m4795a()` |
| `C0563j.java` | 1 × `m4792a` |
| `C0564k.java` | 2 × `m4792a` + 1 × `m4794b("premium_user", "true")` |
| `C0566m.java` | 1 × `m4794b("anal_opt_out", …)` |
| `C0567n.java` | 9 × `m4792a` |
| `ReceiverNotification.java` | 2 × `m4792a` (reminder-notification success/fail) |
| `ViewOnClickListenerC0548b.java` | 2 × `m4794b` (purchase-flow events) |
| `ViewOnClickListenerC0558e.java` | 3 × `m4792a` |
| `ViewOnClickListenerC0559f.java` | 4 × `m4792a` |
| `ViewOnClickListenerC0561h.java` | 1 × `m4792a` |
| `ViewOnClickListenerC0562i.java` | 6 × `m4792a` |
| `WidgetProvider.java` | 2 × `m4792a` (widget update success/fail) |

### Event-name catalog (preserved for reference)

The 44 call sites covered roughly these event groups. Full per-site capture is in `/tmp/sublist-events.txt` at strip time (also reproducible from `git show` against the parent commit of the 3.2 commit):

- `Action` / `Style` / `ScreenView` — UI interaction + screen-view tracking.
- `Back Button Exit` / `Back Button Exit Prompt` — exit-flow telemetry.
- `Menu_invite` / `Invite_fail` / `Invite_success` / `Invite_receivedFriend` / `Invite_receivedStudfinder` — App-Invites flow (Phase 3.3 deletes the underlying surface).
- `Connection Failed` / `GooAuthent_true` / `GooAuthent_false` — Google Sign-In flow telemetry (Phase 3.3 deletes the underlying surface).
- `BackupExternSave_true` / `BackupExternLoad_false` / `BackupInternSave_*` / `BackupInternLoad_*` / `ExportTxt_*` / `ExternStorgWritbl_false` — backup/export telemetry.
- `Profile_dbRead` / `Profile_dbWrite` — RTDB profile-doc telemetry (Phase 3.1 already removed underlying calls).
- `PurchPrem_*` — premium-purchase telemetry (Phase 3.5 deletes underlying billing surface).
- `RemindNotifSent_true` / `RemindNotifSent_false` — reminder-notification telemetry (the receiver itself stays — Phase 4).
- `WidgetUpdate_succ` / `WidgetUpdate_fail` — widget-update telemetry.
- `TempRoot_set` — internal state-change telemetry.
- `anal_opt_out` (user property) — telemetry-opt-out flag itself. The opt-out toggle UI may want to survive Phase 4 as a no-op setting or be deleted; flagged.
- `premium_user` (user property) — Phase 3.5 territory.

### Reverse-grep verification (Phase 3.2 end-state)

```
$ grep -rEn 'AppMain\.m4792a|AppMain\.m4794b|m4795a|gms\.analytics|firebase\.analytics' \
    decompiled/sources/ca/toadlybroodledev/sublist/ | grep -v 'Phase 3\.2: removed' | grep -v 'AppMain\.java:'
(no output)
```

The only remaining mentions are the `Phase 3.2: removed …` breadcrumb comments in `AppMain.java` itself.

## Phases 3.3–3.6

To be appended as each phase closes. Each section uses the same per-file structure: surface removed, line range, port guidance.
