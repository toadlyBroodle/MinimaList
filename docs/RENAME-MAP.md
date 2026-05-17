# sublist deobfuscation rename map

Maps jadx-assigned names (in `decompiled/sources/ca/toadlybroodledev/sublist/`) to meaningful identifiers used in the active `app/src/main/java/` tree. Phase 4 ports apply these renames as the files cross over.

Symbols are listed `jadx-name → real-name` with a one-line evidence cite. Use `[needs-runtime-trace]` for any symbol whose purpose can't be inferred from one read.

## Sub-packages

| jadx | real | evidence |
|---|---|---|
| `p030a` (`a`) | `util` | `C0539a` static byte arrays = the standard + URL-safe base64 alphabets (`A–Z a–z 0–9 + /` and `A–Z a–z 0–9 - _`); the package is encoding helpers. |
| `p031b` (`b`) | `iface` | All 4 members are `Interface*` callbacks consumed by `ActMain` (`InterfaceC0549a`, `InterfaceC0550b` row actions; `InterfaceC0551c`, `InterfaceC0552d` fragment-host wiring). |
| `p032c` (`c`) | `model` | `C0554a` is a plain data class with `text`/`complete`/`collapsed`/`indent`/`reminder`/`isInstr` — outline row data. `C0555b`, `C0556c` are siblings. |

## Models (`p032c` → `model`)

| jadx | real | evidence |
|---|---|---|
| `p032c.C0554a` | `model.OutlineRow` | Fields: `text`, `complete`, `collapsed`, `indent`, `reminder`, `isInstr`. Annotated `@PropertyName`/`@IgnoreExtraProperties` — was the per-row Firebase Realtime DB schema; annotations dropped in Phase 3.1. |
| `p032c.C0555b` | `[needs-runtime-trace]` | One-pass read required. |
| `p032c.C0556c` | `[needs-runtime-trace]` | One-pass read required. |

## Interfaces (`p031b` → `iface`)

| jadx | real | evidence |
|---|---|---|
| `p031b.InterfaceC0550b` | `iface.RowActionListener` | Methods take `C0563j` / `ArrayList<C0563j>` / `ComponentCallbacksC0154j` — row-action callbacks from fragments back to host. |
| `p031b.InterfaceC0551c` | `iface.FragmentHost` | `mo4846ac()` returns a `LinearLayout` and `mo4847b()` returns `ActMain` — host wiring for child fragments. |
| `p031b.InterfaceC0552d` | `iface.OutlineHost` | `mo4848ae()` / `mo4849af()` / `mo4850ah()` / `mo4851al()` — fragment-side accessors for outline state, host fragment, root layout, mode label. |
| `p031b.InterfaceC0549a` | `[needs-runtime-trace]` | Largest of the 4 interfaces; imports the full set of root-package classes — likely the master "row-cell binder" callback. Confirm in Phase 2.1. |

## Root-package named classes (already meaningful)

| jadx | real | evidence |
|---|---|---|
| `AppMain` | `SublistApp` (or keep `AppMain`) | `Application` subclass; Phase 3.2 deletes its analytics fields (`f3724a`, `f3725b`, `f3726c`) and `m4792a` wrapper — what remains may not need a custom Application subclass at all. |
| `ActMain` | `MainActivity` | Sole launcher activity; collides with Phase-0 stub `MainActivity` — the stub gets replaced when this class is ported in Phase 4.5. |
| `WidgetProvider` | `OutlineWidgetProvider` | Home-screen widget; manifest receiver. |
| `ReceiverNotification` | `ReminderReceiver` | Fires scheduled reminder notifications. |
| `Fab` | `OutlineFab` | Floating action button container. |
| `DrawerCustomLayout` | `DrawerLayout` (or keep) | Custom nav-drawer layout. |
| `R` | — | Generated; delete the decompiled copy, never port. |

## Root-package obfuscated classes (`C05NN` / `ViewOnClickListenerC05NN`)

To be filled by Phase 2.1 (full pass over each class file). Initial bucketing:

- `C0538a`, `C0553c`, `C0557d`, `C0560g`, `C0563j`, `C0564k`, `C0566m`, `C0567n`, `C0568o`, `C0569p`, `C0570q`, `C0571r`, `C0572s` — likely a mix of `Fragment`/`Dialog`/`Adapter`/utility classes. `C0563j` is widely referenced as a row carrier in the interfaces above — strong candidate for `OutlineRowView` or `OutlineRowVM`. `C0566m` has a `m4946k()` static called from `AppMain.m4792a` — likely a settings/feature-flag helper.
- `AbstractC0565l` — abstract base of one of the above.
- `ViewOnClickListenerC0548b`, `ViewOnClickListenerC0558e`, `ViewOnClickListenerC0559f`, `ViewOnClickListenerC0561h`, `ViewOnClickListenerC0562i` — listener-implementing classes ProGuard hoisted out of anonymous inner classes. Phase 4.6 considers reinlining each at the call site.

## Symbols marked for deletion (not rename)

These names are removed wholesale in Phase 3 and never appear in the active tree:

| jadx | reason |
|---|---|
| `AppMain.f3724a` (`C0889d`), `f3725b` (`C0893h`) | GMS Analytics tracker — Phase 3.2. |
| `AppMain.f3726c` (`FirebaseAnalytics`) | Firebase Analytics — Phase 3.2. |
| `AppMain.m4792a(String, String)` | Analytics-log wrapper — Phase 3.2. All ~15 call sites in `ActMain` (lines 166, 311, 500, 503, 536, 540, 564, 681, 684, …) deleted without replacement. |
| `ActMain` AdMob fields + `C0657a` inner subclass | AdMob InterstitialAd + AdListener — Phase 3.4. |
| `ActMain` Sign-In / App-Invites imports + call sites | Phase 3.3. |
