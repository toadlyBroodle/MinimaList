package ca.toadlybroodle.minimalist;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.util.Log;
import ca.toadlybroodle.minimalist.iface.HostContract;
import ca.toadlybroodle.minimalist.model.OutlineRow;
import java.util.ArrayList;

// Ported from decompiled C0566m. Theme/color/typeface settings + outline-list in-memory cache.
// Cloud-related fields and m4949n() removed in Phase 3.1; premium gate (mo4778p) removed in 3.5.
public class AppSettings {

    private static int f3930A;
    private static int f3931B;
    private static int f3932C;
    private static int f3933D;
    private static int f3934E;
    private static int f3935F;
    private static int f3936G;
    protected static HostContract f3938a;

    static int f3939b;
    static int f3940c;
    static int f3941d;
    static boolean f3942e;
    static boolean f3943f;
    static boolean f3944g;
    static boolean f3945h;
    static boolean f3946i;
    static boolean f3947j;
    static boolean f3948k;
    static boolean f3949l;
    static int f3950m;
    static boolean f3951n;
    static boolean f3952o;

    private static final String f3953p = "fuckn" + AppSettings.class.getSimpleName();

    private static ArrayList<OutlineRow> f3954q;
    private static String[] f3955r;
    private static String[] f3956s;
    private static String[] f3957t;
    private static String[] f3958u;
    private static String[] f3959v;
    private static String[] f3960w;
    private static String[] f3961x;
    private static boolean f3962y;
    private static boolean f3963z;
    // Phase 10.8: backup location / format spinners. backupLocationIndex
    // re-uses the legacy f3963z boolean (0 = local / false, 1 = SD / true);
    // backupFormatIndex is a new pref (0 = JSON, 1 = TXT).
    private static int f3964K; // backup_format_index

    public enum KeyboardAction {
        NEW_LINE(0), NEW_ENTRY(1), NEXT_ENTRY(2), CLOSE_KEYS(3);

        private final int value;

        KeyboardAction(int i) {
            this.value = i;
        }

        public int m4960a() {
            return this.value;
        }
    }

    AppSettings(HostContract host) {
        f3938a = host;
        f3955r = m4940e(R.array.colors_700_array);
        f3956s = m4940e(R.array.colors_500_array);
        f3957t = m4940e(R.array.colors_300_array);
        f3958u = m4940e(R.array.colors_text_array);
        f3960w = m4940e(R.array.colors_a400_array);
        f3959v = m4940e(R.array.colors_text_compl_array);
        f3961x = m4940e(R.array.size_text_array);
        m4957v();
    }

    static void m4927a(int i) {
        f3931B = i;
        f3930A = i;
        f3932C = i;
        m4956u();
    }

    static void m4928a(boolean z) {
        f3962y = z;
        m4947l();
    }

    static boolean m4929a() {
        return f3962y;
    }

    static void m4930b(int i) {
        f3933D = i;
        m4956u();
    }

    // Premium gate removed; backup-location switch always allowed.
    static void m4931b(boolean z) {
        f3963z = z;
        m4947l();
    }

    // Phase 10.8: backup Location spinner — 0 = local app filesDir, 1 = SD (external app dir).
    static void setBackupLocationIndex(int i) {
        f3963z = (i == 1);
        m4947l();
    }

    static int getBackupLocationIndex() {
        return f3963z ? 1 : 0;
    }

    // Phase 10.8: backup Format spinner — 0 = JSON, 1 = TXT.
    static void setBackupFormatIndex(int i) {
        f3964K = i;
        m4947l();
    }

    static int getBackupFormatIndex() {
        return f3964K;
    }

    static boolean m4932b() {
        return f3963z;
    }

    static int m4933c() {
        return Color.parseColor(m4951p());
    }

    static void m4934c(int i) {
        f3934E = i;
        f3935F = i;
        m4956u();
    }

    static int m4936d() {
        return Color.parseColor(m4952q());
    }

    // Phase 9.2a: the legacy Gson fallback loader for "jsonListEntries" / "backupFile"
    // was deleted. Only call site was OutlineStore's recovery branch; the active read path
    // now goes through OutlineRepository.

    static void m4938d(int i) {
        f3936G = i;
        m4956u();
    }

    static int m4939e() {
        return Color.parseColor(m4953r());
    }

    static String[] m4940e(int i) {
        return f3938a.mo4775m().getResources().getStringArray(i);
    }

    static String m4941f() {
        return f3961x[f3933D];
    }

    static String m4942g() {
        return f3958u[f3934E];
    }

    static int m4943h() {
        return Color.parseColor(m4942g());
    }

    static int m4944i() {
        return Color.parseColor(m4954s());
    }

    static int m4945j() {
        return Color.parseColor(m4955t());
    }

    protected static boolean m4947l() {
        SharedPreferences.Editor editor = f3938a.mo4775m()
                .getSharedPreferences("SublistPrefsFile", 0).edit();
        editor.putInt("last_visible_sub_frag", f3941d);
        editor.putBoolean("is_premium", f3942e);
        editor.putBoolean("show_completed", f3962y);
        editor.putBoolean("def_persist_tskbr_icon", f3944g);
        editor.putBoolean("def_compl_butt_overflow", f3946i);
        editor.putBoolean("def_add_butt_loc", f3945h);
        editor.putBoolean("def_auto_compl_children", f3951n);
        editor.putBoolean("def_auto_del_children", f3952o);
        editor.putBoolean("def_auto_open_keybrd", f3947j);
        editor.putBoolean("def_add_new_location", f3948k);
        editor.putBoolean("def_sing_line_ents", f3949l);
        editor.putBoolean("backup_location_sd", f3963z);
        editor.putInt("backup_format_index", f3964K);
        editor.putInt("def_enter_key", f3950m);
        editor.putInt("color_bg", f3931B);
        editor.putInt("color_text", f3934E);
        editor.putInt("color_accent", f3936G);
        editor.putInt("size_text", f3933D);
        editor.putInt("temp_root_start", f3939b);
        editor.putInt("temp_root_end", f3940c);
        editor.apply();
        Log.d(f3953p, "preferences saved");
        return true;
    }

    // Phase 9.2a: the legacy Gson fallback loader for external backup.sub was deleted —
    // see note above for the same rationale.

    // Phase 3.1: removed m4949n() — legacy Firebase RTDB pull.

    private static String m4951p() { return f3955r[f3930A]; }
    private static String m4952q() { return f3956s[f3931B]; }
    private static String m4953r() { return f3957t[f3932C]; }
    private static String m4954s() { return f3959v[f3935F]; }
    private static String m4955t() { return f3960w[f3936G]; }

    private static void m4956u() {
        f3938a.mo4772b(true);
        m4947l();
    }

    private static boolean m4957v() {
        try {
            SharedPreferences prefs = f3938a.mo4775m()
                    .getSharedPreferences("SublistPrefsFile", 0);
            f3941d = prefs.getInt("last_visible_sub_frag", -1);
            f3942e = prefs.getBoolean("is_premium", false);
            f3962y = prefs.getBoolean("show_completed", true);
            f3944g = prefs.getBoolean("def_persist_tskbr_icon", true);
            f3946i = prefs.getBoolean("def_compl_butt_overflow", false);
            f3945h = prefs.getBoolean("def_add_butt_loc", true);
            f3951n = prefs.getBoolean("def_auto_compl_children", true);
            f3952o = prefs.getBoolean("def_auto_del_children", true);
            f3947j = prefs.getBoolean("def_auto_open_keybrd", true);
            f3948k = prefs.getBoolean("def_add_new_location", false);
            f3949l = prefs.getBoolean("def_sing_line_ents", false);
            f3950m = prefs.getInt("def_enter_key", KeyboardAction.NEW_LINE.m4960a());
            f3963z = prefs.getBoolean("backup_location_sd", false);
            f3964K = prefs.getInt("backup_format_index", 0);
            f3931B = prefs.getInt("color_bg", 10);
            f3930A = f3931B;
            f3932C = f3931B;
            f3934E = prefs.getInt("color_text", 1);
            f3935F = f3934E;
            f3936G = prefs.getInt("color_accent", 6);
            f3933D = prefs.getInt("size_text", 2);
            f3939b = prefs.getInt("temp_root_start", -1);
            f3940c = prefs.getInt("temp_root_end", -1);
            Log.d(f3953p, "preferences loaded");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(f3953p, "error loading preferences");
            return false;
        }
    }
}
