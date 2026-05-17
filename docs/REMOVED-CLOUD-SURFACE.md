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

## Phase 3.3 — Google Sign-In + App Invites + residual Firebase Auth

Surface owned by `com.google.android.gms.auth.api.signin.*`, `com.google.android.gms.appinvite.*`, `com.google.android.gms.common.api.{GoogleApiClient,ResultCallback}`, `com.google.android.gms.common.ConnectionResult`, and `com.google.firebase.auth.{FirebaseAuth,FirebaseUser}`. Note: Google sunset the entire App Invites product in 2020 and Firebase Dynamic Links in 2025, so the invite surface was already non-functional on a modern device.

### Files deleted entirely
- `decompiled/sources/ca/toadlybroodledev/sublist/p032c/C0555b.java` — 17-line POJO holding `time`/`inviter`/`inviteIDs` for the RTDB `invites/` collection. No remaining caller after C0567n.m4963b removal.
- `decompiled/sources/ca/toadlybroodledev/sublist/ViewOnClickListenerC0559f.java` — 164-line Sign-In fragment (`mo914a` / `mo919a` / `mo935a` / `mo877d` / `mo982t` / `mo4868af` / `onClick`). Entirely Google-Sign-In and Firebase-Auth-Credential surface; nothing locally reusable.

### `decompiled/sources/ca/toadlybroodledev/sublist/C0567n.java`
- Removed imports for `p032c.C0555b`, `p032c.C0556c`, `com.google.firebase.auth.{AbstractC2198l,FirebaseAuth}`.
- Removed `static FirebaseAuth f3972p` field — singleton auth handle.
- Removed `FirebaseAuth.InterfaceC2155a f3975q` field — AuthStateListener.
- Removed AuthStateListener inner-class body from the constructor (5-line dispatch: on signed-in called `m4975z` to materialize the cloud profile, on signed-out nulled the local profile cache).
- Removed `f3972p = FirebaseAuth.getInstance()` and the `f3975q = new InterfaceC2155a()` instantiation from the constructor.
- Removed `static void m4963b(ArrayList<String> inviteIds)` — wrote an `invites/<auto-id>` node to RTDB with the current user's uid + timestamp + invitee-ids array.

### `decompiled/sources/ca/toadlybroodledev/sublist/ActMain.java` (~50 lines removed)
- Removed imports `com.google.android.gms.{appinvite.{C0908a,C0910c,C0912e,InterfaceC0911d}, auth.api.{C0915a, signin.GoogleSignInOptions}, common.C1071a, common.api.{AbstractC1079f, InterfaceC1194l}}`.
- Removed `AbstractC1079f.c` from the `implements` clause.
- Removed `static AbstractC1079f f3695n` field (GoogleApiClient handle).
- Removed `public ViewOnClickListenerC0559f f3708r` field (Sign-In fragment handle).
- Removed `void m4754A()` — GoogleApiClient builder with `GoogleSignInOptions` (OAuth2 client id `REDACTED_OAUTH_CLIENT_ID`) + AppInvite API. Sole caller deleted.
- Removed `protected void m4757D()` — launched the App-Invites send activity (request 10101) with deep link `https://jg5ms.app.goo.gl/XktS` (Firebase Dynamic Links — also deprecated).
- Removed `@Override public void mo4766a(C1071a c1071a)` — `GoogleApiClient.OnConnectionFailedListener.onConnectionFailed`.
- Removed `@Override public ViewOnClickListenerC0559f mo4777o()` — Sign-In fragment getter.
- Removed `if (i == 10101)` block from `onActivityResult` — App-Invites send result handler (decoded invite-IDs via `AppInviteInvitation.getInvitationIds`, wrote them to RTDB via `C0567n.m4963b`, then bumped the profile-fragment invite counter for each invitee).
- Removed Sign-In fragment construction + attachment in `onCreate` (`f3708r = (ViewOnClickListenerC0559f) .mo1072a(string2)` lookup + the null-check + `new ViewOnClickListenerC0559f()` + `transaction.add(R.id.placeholder_for_fragments, this.f3708r, string2)`).
- Removed the `C0908a.f4988b.mo6085a(f3695n, this, true).mo6696a(new InterfaceC1194l<InterfaceC0911d>() { ... })` deep-link receive handler (~30 lines): on a matching invite deep link it set the `f3943f` "got-promo" flag in `C0566m` and popped a welcome dialog with `invite_welcome` / `invite_promo_text` / `invite_friends_format` strings, then opened the Sign-In fragment on OK. The trial-hours `f3943f` gate is dead (paired with the removed `m4975z`).
- Removed `m4754A()` call from `onCreate`.
- Removed `R.id.base_google_sign_in_button` and `R.id.base_profile_sign_out_button` cases from `onFragmentInput` switch.
- Removed `R.id.profile_share_button` case from `onFragmentInput` (called `m4757D()`).

### Resource impact (deferred to Phase 1)
- `res/menu/`: any menu item with id `R.id.profile_share_button` and the Sign-In / Sign-Out buttons (`R.id.base_google_sign_in_button`, `R.id.base_profile_sign_out_button`) drops.
- `res/values/strings.xml` entries no longer referenced after this phase: `invitation_title`, `invitation_message`, `invitation_cta`, `invites_failed`, `invite_welcome`, `invite_promo_text`, `invite_friends_format`, `invite_friends`, `play_services_error`. Phase 1 deletes the orphans.
- `res/layout/`: any Sign-In layout (likely `fragment_signin.xml` or similar) drops.
- `R.java` decompiled copy: not touched — `R` is generated and a clean one comes from the Phase 1 resource port.

### Reverse-grep verification (Phase 3.3 end-state)

```
$ grep -rEn 'gms\.appinvite|gms\.auth|firebase\.auth|GoogleSignIn|FirebaseAuth|AbstractC2198l|AbstractC1079f|C0908a|C0910c|C0912e|InterfaceC0911d|C0915a|C0929b|C0555b' \
    decompiled/sources/ca/toadlybroodledev/sublist/ \
    | grep -vE 'Phase 3\.[123]:|// Phase'
(only descriptive text inside Phase 3 comment blocks remains)
```

## Phase 3.4 — AdMob

Surface owned by `com.google.android.gms.ads.{AdListener, AdRequest, InterstitialAd}`.

### `decompiled/sources/ca/toadlybroodledev/sublist/ActMain.java`
- Removed imports `com.google.android.gms.ads.{C0657a,C0676c,C0687h}` (`AdListener`, `AdRequest`, `InterstitialAd`).
- Removed `C0687h f3705o` field — InterstitialAd instance.
- Emptied `@Override mo4756C()` — the InterfaceC0549a hook that gated "show interstitial if loaded + not premium + cooldown-elapsed, else load a new one."
- Emptied `@Override mo4758E()` — the InterfaceC0549a hook that built an AdRequest with two test-device hashes and called `f3705o.loadAd(...)`. Removed test-device hashes: `B3EEABB8EE11C2BE770B684D95219ECB`, `340881060997B582C0F0D1E4759A61D7`.
- Removed InterstitialAd init in `onCreate`: removed AdMob ad unit id `ca-app-pub-1334740097475606/9485517375` (real production AdMob slot tied to the toadlybroodledev publisher account) and the inner `AdListener` class whose `onAdClosed` re-triggered `mo4758E()` to preload the next interstitial.

### `InterfaceC0549a` (Phase 4 follow-up)
- The two methods `mo4756C()` and `mo4758E()` declared on the interface are now no-ops in ActMain. Phase 4 should drop both from `p031b/InterfaceC0549a.java` along with any remaining call sites; they have no non-ad meaning.

### Resource / manifest impact (deferred to Phase 1)
- `AndroidManifest.xml` still declares `<activity android:name="com.google.android.gms.ads.AdActivity" ... />`. Phase 1 rewrites the manifest from scratch — drop.
- No `<com.google.android.gms.ads.AdView>` views were found in `decompiled/resources/res/layout/` — interstitials are full-screen overlays, not embedded views.

### Reverse-grep verification (Phase 3.4 end-state)

```
$ grep -rEn 'gms\.ads|AdView|InterstitialAd|AdListener|AdRequest|C0657a|C0676c|C0687h|f3705o|ca-app-pub' \
    decompiled/sources/ca/toadlybroodledev/sublist/ \
    | grep -vE 'Phase 3\.[1234]:|// Phase'
(only descriptive text inside Phase 3.4 comment blocks remains)
```

## Phase 3.5 — FCM / Cast / Crashlytics / Billing

Source-side scope of this phase ended up being **Play Billing only**. Initial scan returned zero matches for `firebase.messaging`, `FirebaseMessaging`, `gms.cast`, `crashlytics`, `Crashlytics`, or `fabric` in the app package — those surfaces were declared only in the manifest (FCM `RECEIVE` + custom `C2D_MESSAGE` permissions, Cast `MediaIntentReceiver` / `MediaNotificationService` / `ReconnectionService` components). Those manifest entries belong to the Phase 1 manifest rewrite, not this phase.

### Re-classified surface: `p030a` package is Play Billing v3, not utilities

Phase 2.2's rename map asserted `p030a → util` based on the base64 alphabet found in `C0539a`. Closer reading during 3.5 showed `p030a` is the **Google Play In-App Billing v3 sample helper library** (TrivialDrive-style `IabHelper`):
- `C0539a` — `Base64` encoder (internal to IAB; alphabet was not standalone util)
- `C0540b` — `IabAsyncInProgressException`
- `C0541c` — `IabException` (wraps `IabResult`)
- `C0542d` — `IabHelper` (the main billing helper class)
- `C0543e` — `IabResult`
- `C0544f` — `Inventory` (SKU map)
- `C0545g` — `Purchase` (purchase record)
- `C0546h` — `Security` (signature verification using `java.security`)
- `C0547i` — `SkuDetails`

Sole caller: `C0564k.java`, the premium-features gate.

### Files deleted entirely
- `decompiled/sources/ca/toadlybroodledev/sublist/p030a/` directory (9 files, ~complete IAB v3 helper).
- `decompiled/sources/ca/toadlybroodledev/sublist/C0564k.java` (~138 lines): premium check + purchase-flow wrapper. Public surface was `m4911a()` static "is premium" gate and `m4916d()` "start purchase flow" trigger.

### `decompiled/sources/ca/toadlybroodledev/sublist/AppMain.java`
- Removed `static String m4793b()` — returned the first half of the Google Play licensing/billing RSA public-key (base64). The full key was assembled at C0564k construction by concatenating with a second hard-coded fragment and fed into `IabHelper`. No production secret is in the half left in git history (and the second half was inside C0564k which was also deleted in this commit — full key never reconstructable from any single file).

### `decompiled/sources/ca/toadlybroodledev/sublist/p031b/InterfaceC0549a.java`
- Removed `import ca.toadlybroodledev.sublist.C0564k`.
- Removed `C0564k mo4778p()` interface method — premium-state accessor.

### `decompiled/sources/ca/toadlybroodledev/sublist/ActMain.java`
- Removed `private C0564k f3701E` field.
- Removed `this.f3701E = new C0564k(this)` from `onCreate`.
- Removed `case R.id.profile_purchase_premium_button` from the `onFragmentInput` switch (called `f3701E.m4916d()` to start the purchase flow).
- Removed `@Override public C0564k mo4778p()` getter.

### `decompiled/sources/ca/toadlybroodledev/sublist/C0567n.java`
- Removed `if (C0564k.m4911a()) { … } else { decodeResource(widget_preview); }` premium gate inside `m4962a` (widget screenshot writer). Original: premium users got a live screenshot via `setDrawingCacheEnabled`, free users got a static `R.drawable.widget_preview` placeholder. Local-only app: kept the live-screenshot path unconditionally for everyone.

### `decompiled/sources/ca/toadlybroodledev/sublist/ViewOnClickListenerC0558e.java`
- Removed the `if (!C0564k.m4911a()) { … return; }` upsell branch inside the profile-render method. Non-premium users had seen an "Unlock premium features" upsell title, the purchase button visible, and server-driven premium-member / premium-expires fields. Kept the original premium branch (premium-share title, purchase button hidden, share button hidden, "Yes" / "Never" hard-codes) and now serves it to everyone.

### Resource / manifest impact (deferred to Phase 1)
- `AndroidManifest.xml`: drop the FCM `com.google.android.c2dm.permission.RECEIVE` + custom `ca.toadlybroodledev.sublist.permission.C2D_MESSAGE` permissions; drop Cast `MediaIntentReceiver` / `MediaNotificationService` / `ReconnectionService` components; drop `<uses-permission android:name="com.android.vending.BILLING"/>`.
- `res/values/strings.xml` orphans: `profile_unlock_premium_features_title`, `profile_premium_member`, `profile_premium_expires_text`, `profile_premium_share_title`, `profile_expires_never`, and likely `email_fmt`, `profile_completed_fmt`, `profile_minimalists_converted` (server-driven counters). The Phase 1 audit will identify orphans authoritatively.
- `res/menu/`: `profile_purchase_premium_button` orphan.
- `res/drawable/widget_preview` may also become orphan if it was the free-tier placeholder for the live screenshot path.

### Reverse-grep verification (Phase 3.5 end-state)

```
$ grep -rEn 'C0564k|m4793b|p030a|com\.android\.vending\.billing|m4911a|m4916d' \
    decompiled/sources/ca/toadlybroodledev/sublist/ \
    | grep -vE 'Phase 3\.[1-5]:|// Phase'
(only descriptive text inside Phase 3 comment blocks remains)
```

## Phase 3.6

To be appended after the final grep-audit closes Phase 3.
