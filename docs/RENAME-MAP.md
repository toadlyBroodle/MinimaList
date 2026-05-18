# sublist deobfuscation rename map

Maps jadx-assigned names (in `decompiled/sources/ca/toadlybroodledev/sublist/`) to meaningful identifiers used in the active `app/src/main/java/` tree. Phase 4 ports apply these renames as the files cross over.

Symbols are listed `jadx-name → real-name` with a one-line evidence cite. Use `[needs-runtime-trace]` for any symbol whose purpose can't be inferred from one read.

## Sub-packages

| jadx | real | evidence |
|---|---|---|
| `p030a` (`a`) | — | **DELETED in Phase 3.5.** Mis-identified in the initial pass as base64 utilities; closer reading showed it was the Google Play **In-App Billing v3 sample helper library** (TrivialDrive-style `IabHelper`). Member classes: `C0539a` Base64 (the byte-arrays really were base64 alphabets, but the encoder was internal-to-IAB), `C0540b`/`C0541c` `IabAsyncInProgressException`/`IabException`, `C0542d` `IabHelper`, `C0543e` `IabResult`, `C0544f` `Inventory`, `C0545g` `Purchase`, `C0546h` `Security` (signature verification), `C0547i` `SkuDetails`. Sole caller was the deleted `C0564k` billing wrapper. |
| `p031b` (`b`) | `iface` | All 4 members are `Interface*` callbacks consumed by `ActMain` (`InterfaceC0549a`, `InterfaceC0550b` row actions; `InterfaceC0551c`, `InterfaceC0552d` fragment-host wiring). |
| `p032c` (`c`) | `model` | `C0554a` is a plain data class with `text`/`complete`/`collapsed`/`indent`/`reminder`/`isInstr` — outline row data. `C0555b`, `C0556c` are siblings. |

## Models (`p032c` → `model`)

| jadx | real | evidence |
|---|---|---|
| `p032c.C0554a` | `model.OutlineRow` | Fields: `text`, `complete`, `collapsed`, `indent`, `reminder`, `isInstr`. Annotated `@PropertyName`/`@IgnoreExtraProperties` — was the per-row Firebase Realtime DB schema; annotations dropped in Phase 3.1. |
| `p032c.C0555b` | — | **DELETED in Phase 3.3** (App-Invites tracker POJO; cloud-only). |
| `p032c.C0556c` | — | **Phase 4 should DELETE.** Cloud user-profile shape (displayname/email/trial-hours/connect-times/upload counters). Annotations stripped in 3.1, but the class itself has no local meaning. |

## Interfaces (`p031b` → `iface`)

| jadx | real | evidence |
|---|---|---|
| `p031b.InterfaceC0549a` | `iface.HostContract` | The master 26-method contract sole-implemented by `ActMain`. Surface covers outline manipulation (`mo4763a(C0557d)`, `mo4765a(C0563j, boolean)`, `mo4768a(ArrayList<C0563j>, boolean)`, `mo4769a(HashMap)`), UI accessors (`mo4781s()` Fab, `mo4782t()` DrawerLayout, `mo4783u()`/`mo4784v()` ImageViews, `mo4785w()` FragmentTransaction), state queries (`mo4775m()` Context, `mo4779q()` OutlineStore, `mo4786x()` sublist list, `mo4787y()` current sublist, `mo4788z()` current row), profile (`mo4762a(C0556c)` — Phase 3.x neutered), and menu callbacks (`mo4756C`/`mo4758E`/`mo4759F`, `onFragmentInput(View)`). Three methods are no-ops post-Phase-3 and slated for deletion: `mo4756C` + `mo4758E` (ad hooks), `mo4778p` (premium getter, already removed). |
| `p031b.InterfaceC0550b` | `iface.RowActionListener` | Methods take `C0563j` / `ArrayList<C0563j>` / `ComponentCallbacksC0154j` — row-action callbacks from fragments back to host. |
| `p031b.InterfaceC0551c` | `iface.FragmentHost` | `mo4846ac()` returns a `LinearLayout` and `mo4847b()` returns `ActMain` — host wiring for child fragments. |
| `p031b.InterfaceC0552d` | `iface.OutlineHost` | `mo4848ae()` / `mo4849af()` / `mo4850ah()` / `mo4851al()` — fragment-side accessors for outline state, host fragment, root layout, mode label. |

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

## Root-package obfuscated classes (full Phase 2.1 pass)

Read end-to-end during Phase 2.1; renames derived from class signature, field names, public method signatures, and call-site context.

| jadx | real | evidence |
|---|---|---|
| `C0538a` | `NewSublistDialog` | `extends DialogInterfaceOnCancelListenerC0153i` (DialogFragment). Static `f3745ae InterfaceC0550b` action callback, `f3746af EditText` for name input. `mo875c(Bundle)` overrides `onCreateDialog` returning an AlertDialog with EditText. Matches `res/layout/fragment_dialog_create_new_sub.xml`. |
| `C0553c` | `DrawerToggle` | `extends C0345b` (`android.support.v7.app.ActionBarDrawerToggle`); ctor takes `(Activity, DrawerLayout, Toolbar, int openDescRes, int closeDescRes)`. Holds an `InterfaceC0549a` host reference. `mo2438a(View, float)` is `onDrawerSlide` for parallax/scrim behaviour. |
| `C0557d` | `OutlineRowView` | Per-row view widget. Fields `f3822e EditText` (text), `f3823f boolean` (complete), `f3824g boolean` (collapsed), `f3825h long` (reminder timestamp). `m4859a()` returns indent. Owns `TextWatcher`, `OnLongClickListener`, `OnTouchListener` for inline editing + reminder gesture. Schedules `AlarmManager` PendingIntents for `f3825h` reminders. The runtime counterpart of `model.OutlineRow`. |
| `C0560g` | `WelcomeSublistFragment` | 107 lines, `extends C0563j` (SublistFragment). One of the 5 fragments ActMain creates by tag (`string5`); appears to be the static welcome/intro sublist (no editing UI, just a ScrollView + LinearLayout). |
| `C0563j` | `SublistFragment` | The core Fragment showing one sublist (568 lines — largest non-Activity class). `extends ComponentCallbacksC0154j` and implements `InterfaceC0552d` (OutlineHost). Static `m4891a(InterfaceC0549a, HashMap<String, ArrayList<C0554a>>) → ArrayList<SublistFragment>` is the factory that inflates one fragment per saved sublist. `m4899a(InterfaceC0549a, String name, ArrayList<C0554a> rows)` builds an empty/new fragment. `m4892a(...)` (referenced from C0567n) serializes to the HashMap format. Hosts the toolbar menu + context menu for cut/copy/paste. |
| `C0566m` | `AppSettings` | Theme/color/typeface settings + outline-list in-memory cache (`f3954q ArrayList<OutlineRow>`). 400 lines. Holds 7 string-array drawable indices (`f3955r..f3961x`) for color/text-color/size palettes. SharedPreferences read/write. Static `m4940e(int)` reads a string-array resource via the InterfaceC0549a host. The `f3938a InterfaceC0549a` protected static is the well-known back-door host reference. Inner `enum a` `{NEW_LINE, NEW_ENTRY, NEXT_ENTRY, CLOSE_KEYS}` is a keyboard-action mode flag (split as `AppSettings.KeyboardAction`). |
| `C0567n` | `OutlineStore` | extends `AppSettings`. Post-Phase-3 strip: just local backup/export helpers. Surviving: `m4961a(Context) Bitmap` (read widget screenshot from internal cache), `m4962a(View)` (write widget screenshot — drawing-cache + PNG to `widget_ss/widgetScreenShot.jpg`), `m4964c(boolean backup, boolean external) File` (resolve backup file path), `m4967r()` (txt-export each sublist to external storage), `m4968s`/`m4969t`/`m4970u` storage-permission/path helpers, `m4976a(boolean, boolean) boolean` (serialize HashMap → JSON via Gson, write to internal/external file), `m4977b(boolean, boolean) HashMap` (read JSON backup, fall back to SharedPrefs). Phase 4 fold these into smaller files (e.g. `WidgetSnapshot`, `BackupStore`, `Storage`); the parent inheritance from AppSettings is no longer load-bearing now that the cloud-specific subclass surface is gone. |
| `C0568o` | `SublistRenderer` | 70 lines. Takes `InterfaceC0551c` (FragmentHost). `m4979a(ArrayList<OutlineRowView>)` clears `host.mo4846ac()` (the LinearLayout container) and re-inflates each row, sizing parents via `LinearLayout.LayoutParams`. The "render this sublist's row list to the screen" routine. |
| `C0569p` | `IndentManager` | 149 lines. Takes `InterfaceC0552d` (OutlineHost). `m4980a/b/c/d` handle indent/outdent of a row + its descendants, walking the `ArrayList<OutlineRowView>` and adjusting each row's indent counter. The "Tab/Shift-Tab" tree-manipulation logic. |
| `C0570q` | `StringArraySpinnerAdapter` | `extends BaseAdapter`. Wraps a `Context` + string-array resource id; populates via `Collections.addAll(list, AppSettings.m4940e(id))`. Used by the settings UI Spinners (color, typeface, text size, etc.). |
| `C0571r` | `OutlineTree` | 276 lines. The data container for ONE sublist. Holds `ArrayList<OutlineRowView> f3987b` and the parent OutlineHost (`f3986a`). Private `m4985j/k/l(OutlineRowView)` navigate the tree (find parent / next sibling / first descendant) by indent comparison. `m4988a()` returns the row list. `m4990a(int, ArrayList<OutlineRowView>)` inserts a sub-range. The Phase-2-tagged candidate for `OutlineRowVM` in the seed map; this is its real identity. |
| `C0572s` | `DateTimeUtil` | Date/time helpers. Static `m5006a/m5007a/m5012b/m5013c/m5014c/m5018e/m5020f` mix `SimpleDateFormat`, `Calendar`, `TimeZone`, `TimeUnit.MILLISECONDS.toHours/Days`. Inner anonymous `DialogFragment` classes implement `DatePickerDialog.OnDateSetListener` + `TimePickerDialog.OnTimeSetListener` — used by the reminder-set flow. The "epoch ms ↔ wall-clock conversions + reminder picker dialogs" grab-bag. |
| `AbstractC0565l` | `Clipboard` | Static-only abstract class (never instantiated; the abstract is a no-construct hint). Static fields: `f3926b ArrayList<OutlineRow>` (the cut/copied row set), `f3927c String` (origin sublist name), `f3928d int` (origin indent). Static `m4917a()` returns the buffer, `m4924b()` returns the source-sublist name, `m4925c()` projects back to `ArrayList<OutlineRowView>` for paste. Standard outline cut/copy/paste buffer. |

## Root-package ViewOnClickListener-named classes

Naming convention is jadx's: when ProGuard kept a `View.OnClickListener` impl that wasn't inner, jadx prefixes the class with the implemented interface. None of these are *really* listener objects — they're full Fragments / Dialogs that happen to implement `View.OnClickListener` for their own button handlers.

| jadx | real | evidence |
|---|---|---|
| `ViewOnClickListenerC0548b` | `SettingsDialog` | `extends DialogInterfaceOnCancelListenerC0153i` (DialogFragment). Has `CheckBox f3800ae`, `RadioButton`s, implements `CompoundButton.OnCheckedChangeListener`. Drives the "settings preferences" modal — matches `res/layout/fragment_dialog_settings_prefs.xml`. |
| `ViewOnClickListenerC0558e` | `ProfileFragment` | `extends ComponentCallbacksC0154j`. Built around the now-deleted `C0556c` cloud user profile. After Phase 3.5 the upsell branch is gone and the premium branch hard-codes everything to "Yes/Never." Strong Phase 4 candidate for full deletion — there is no local user profile concept. |
| `ViewOnClickListenerC0561h` | `SearchSublistFragment` | `extends C0563j` (SublistFragment), implements `InterfaceC0551c` (FragmentHost). EditText + LinearLayout + KeyEvent handler — the in-app search UI. Matches `res/layout/fragment_search.xml`. |
| `ViewOnClickListenerC0562i` | `SettingsFragment` | `extends ComponentCallbacksC0154j`. Spinner + Switch + AlertDialog + Intent(ACTION_VIEW) for external links — the persistent settings page. Matches `res/layout/fragment_settings.xml`. |

## Symbols marked for deletion (not rename)

These names were removed wholesale in Phase 3 and never appear in the active tree. See `docs/REMOVED-CLOUD-SURFACE.md` for the full per-file removal log.

| jadx | reason |
|---|---|
| `AppMain.{f3724a, f3725b, f3726c, m4792a, m4793b, m4794b, m4795a}` | GMS + Firebase Analytics + license-key fragment — Phase 3.2 / 3.5. |
| `ActMain.{f3695n, f3705o, f3708r, f3701E, m4754A, m4757D, mo4766a, mo4777o, mo4778p}` + various inner subclasses + manifest declarations | AdMob + Sign-In + App-Invites + Play Billing — Phase 3.3 / 3.4 / 3.5. |
| `C0567n.{f3972p, f3973r, f3975q, m4963b, m4965p, m4966q, m4971v, m4972w, m4975z}` + its FirebaseAuth/RTDB-bearing constructor body | Firebase RTDB + Auth — Phase 3.1 / 3.3. |
| `C0566m.m4949n` | RTDB legacy-pull — Phase 3.1. |
| `C0564k` (entire class) | Premium / billing wrapper — Phase 3.5. |
| `ViewOnClickListenerC0559f` (entire class) | Sign-In fragment — Phase 3.3. |
| `p030a/*` (entire 9-file package) | In-App Billing v3 sample helper lib — Phase 3.5. |
| `p032c/C0555b` | App-Invites tracker POJO — Phase 3.3. |
| `p032c/C0556c` (slated) | Cloud user profile — Phase 4 deletion (annotations stripped 3.1; class itself has no local meaning). |
| `iface.InterfaceC0549a.mo4778p` + `mo4756C` + `mo4758E` | Premium getter + ad hooks (no-op post Phase 3) — Phase 4 interface trim. |
