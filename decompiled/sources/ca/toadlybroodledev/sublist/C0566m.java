package ca.toadlybroodledev.sublist;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.util.Log;
import ca.toadlybroodledev.sublist.p031b.InterfaceC0549a;
import ca.toadlybroodledev.sublist.p032c.C0554a;
// Phase 3.1: removed com.google.firebase.auth.AbstractC2198l (was: FirebaseUser, Phase 3.3 owns Sign-In removal)
// Phase 3.1: removed com.google.firebase.database.{C2225a,C2226b,C2269g,InterfaceC2276n}
//            (DataSnapshot, DatabaseError, GenericTypeIndicator, ValueEventListener)
import com.google.p036a.C0614e;
import com.google.p036a.p041c.C0608a;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: ca.toadlybroodledev.sublist.m */
/* JADX INFO: loaded from: classes.dex */
public class C0566m {

    /* JADX INFO: renamed from: A */
    private static int f3930A;

    /* JADX INFO: renamed from: B */
    private static int f3931B;

    /* JADX INFO: renamed from: C */
    private static int f3932C;

    /* JADX INFO: renamed from: D */
    private static int f3933D;

    /* JADX INFO: renamed from: E */
    private static int f3934E;

    /* JADX INFO: renamed from: F */
    private static int f3935F;

    /* JADX INFO: renamed from: G */
    private static int f3936G;

    /* JADX INFO: renamed from: H */
    private static boolean f3937H;

    /* JADX INFO: renamed from: a */
    protected static InterfaceC0549a f3938a;

    /* JADX INFO: renamed from: b */
    static int f3939b;

    /* JADX INFO: renamed from: c */
    static int f3940c;

    /* JADX INFO: renamed from: d */
    static int f3941d;

    /* JADX INFO: renamed from: e */
    static boolean f3942e;

    /* JADX INFO: renamed from: f */
    static boolean f3943f;

    /* JADX INFO: renamed from: g */
    static boolean f3944g;

    /* JADX INFO: renamed from: h */
    static boolean f3945h;

    /* JADX INFO: renamed from: i */
    static boolean f3946i;

    /* JADX INFO: renamed from: j */
    static boolean f3947j;

    /* JADX INFO: renamed from: k */
    static boolean f3948k;

    /* JADX INFO: renamed from: l */
    static boolean f3949l;

    /* JADX INFO: renamed from: m */
    static int f3950m;

    /* JADX INFO: renamed from: n */
    static boolean f3951n;

    /* JADX INFO: renamed from: o */
    static boolean f3952o;

    /* JADX INFO: renamed from: p */
    private static final String f3953p = "fuckn" + C0566m.class.getSimpleName();

    /* JADX INFO: renamed from: q */
    private static ArrayList<C0554a> f3954q;

    /* JADX INFO: renamed from: r */
    private static String[] f3955r;

    /* JADX INFO: renamed from: s */
    private static String[] f3956s;

    /* JADX INFO: renamed from: t */
    private static String[] f3957t;

    /* JADX INFO: renamed from: u */
    private static String[] f3958u;

    /* JADX INFO: renamed from: v */
    private static String[] f3959v;

    /* JADX INFO: renamed from: w */
    private static String[] f3960w;

    /* JADX INFO: renamed from: x */
    private static String[] f3961x;

    /* JADX INFO: renamed from: y */
    private static boolean f3962y;

    /* JADX INFO: renamed from: z */
    private static boolean f3963z;

    /* JADX INFO: renamed from: ca.toadlybroodledev.sublist.m$a */
    enum a {
        NEW_LINE(0),
        NEW_ENTRY(1),
        NEXT_ENTRY(2),
        CLOSE_KEYS(3);


        /* JADX INFO: renamed from: e */
        private final int f3971e;

        a(int i) {
            this.f3971e = i;
        }

        /* JADX INFO: renamed from: a */
        public int m4960a() {
            return this.f3971e;
        }
    }

    C0566m(InterfaceC0549a interfaceC0549a) {
        f3938a = interfaceC0549a;
        f3955r = m4940e(R.array.colors_700_array);
        f3956s = m4940e(R.array.colors_500_array);
        f3957t = m4940e(R.array.colors_300_array);
        f3958u = m4940e(R.array.colors_text_array);
        f3960w = m4940e(R.array.colors_a400_array);
        f3959v = m4940e(R.array.colors_text_compl_array);
        f3961x = m4940e(R.array.size_text_array);
        m4957v();
    }

    /* JADX INFO: renamed from: a */
    static void m4927a(int i) {
        f3931B = i;
        f3930A = i;
        f3932C = i;
        m4956u();
    }

    /* JADX INFO: renamed from: a */
    static void m4928a(boolean z) {
        f3962y = z;
        m4947l();
    }

    /* JADX INFO: renamed from: a */
    static boolean m4929a() {
        return f3962y;
    }

    /* JADX INFO: renamed from: b */
    static void m4930b(int i) {
        f3933D = i;
        m4956u();
    }

    /* JADX INFO: renamed from: b */
    static void m4931b(boolean z) {
        if (!m4932b() && !f3938a.mo4778p().m4914b()) {
            f3938a.mo4780r().f3889i.setChecked(false);
        } else {
            f3963z = z;
            m4947l();
        }
    }

    /* JADX INFO: renamed from: b */
    static boolean m4932b() {
        return f3963z;
    }

    /* JADX INFO: renamed from: c */
    static int m4933c() {
        return Color.parseColor(m4951p());
    }

    /* JADX INFO: renamed from: c */
    static void m4934c(int i) {
        f3934E = i;
        f3935F = i;
        m4956u();
    }

    /* JADX INFO: renamed from: c */
    static void m4935c(boolean z) {
        f3937H = z;
        m4947l();
    }

    /* JADX INFO: renamed from: d */
    static int m4936d() {
        return Color.parseColor(m4952q());
    }

    /* JADX INFO: renamed from: d */
    protected static ArrayList<C0554a> m4937d(boolean z) {
        try {
            FileInputStream fileInputStreamOpenFileInput = f3938a.mo4775m().openFileInput(z ? "backupFile" : "jsonListEntries");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStreamOpenFileInput);
            String str = (String) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStreamOpenFileInput.close();
            f3954q = (ArrayList) new C0614e().m5258a(str, new C0608a<ArrayList<C0554a>>() { // from class: ca.toadlybroodledev.sublist.m.1
            }.m5205b());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f3954q;
    }

    /* JADX INFO: renamed from: d */
    static void m4938d(int i) {
        f3936G = i;
        m4956u();
    }

    /* JADX INFO: renamed from: e */
    static int m4939e() {
        return Color.parseColor(m4953r());
    }

    /* JADX INFO: renamed from: e */
    static String[] m4940e(int i) {
        return f3938a.mo4775m().getResources().getStringArray(i);
    }

    /* JADX INFO: renamed from: f */
    static String m4941f() {
        return f3961x[f3933D];
    }

    /* JADX INFO: renamed from: g */
    static String m4942g() {
        return f3958u[f3934E];
    }

    /* JADX INFO: renamed from: h */
    static int m4943h() {
        return Color.parseColor(m4942g());
    }

    /* JADX INFO: renamed from: i */
    static int m4944i() {
        return Color.parseColor(m4954s());
    }

    /* JADX INFO: renamed from: j */
    static int m4945j() {
        return Color.parseColor(m4955t());
    }

    /* JADX INFO: renamed from: k */
    static boolean m4946k() {
        return f3937H;
    }

    /* JADX INFO: renamed from: l */
    protected static boolean m4947l() {
        SharedPreferences.Editor editorEdit = f3938a.mo4775m().getSharedPreferences("SublistPrefsFile", 0).edit();
        editorEdit.putInt("last_visible_sub_frag", f3941d);
        editorEdit.putBoolean("is_premium", f3942e);
        editorEdit.putBoolean("send_anon_anal", f3937H);
        editorEdit.putBoolean("show_completed", f3962y);
        editorEdit.putBoolean("def_persist_tskbr_icon", f3944g);
        editorEdit.putBoolean("def_compl_butt_overflow", f3946i);
        editorEdit.putBoolean("def_add_butt_loc", f3945h);
        editorEdit.putBoolean("def_auto_compl_children", f3951n);
        editorEdit.putBoolean("def_auto_del_children", f3952o);
        editorEdit.putBoolean("def_auto_open_keybrd", f3947j);
        editorEdit.putBoolean("def_add_new_location", f3948k);
        editorEdit.putBoolean("def_sing_line_ents", f3949l);
        editorEdit.putBoolean("backup_location_sd", f3963z);
        editorEdit.putInt("def_enter_key", f3950m);
        editorEdit.putInt("color_bg", f3931B);
        editorEdit.putInt("color_text", f3934E);
        editorEdit.putInt("color_accent", f3936G);
        editorEdit.putInt("size_text", f3933D);
        editorEdit.putInt("temp_root_start", f3939b);
        editorEdit.putInt("temp_root_end", f3940c);
        editorEdit.apply();
        Log.d(f3953p, "preferences saved");
        return true;
    }

    /* JADX INFO: renamed from: m */
    protected static ArrayList<C0554a> m4948m() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(C0567n.m4970u(), "backup.sub"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            String str = (String) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            f3954q = (ArrayList) new C0614e().m5258a(str, new C0608a<ArrayList<C0554a>>() { // from class: ca.toadlybroodledev.sublist.m.2
            }.m5205b());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f3954q;
    }

    // Phase 3.1: removed protected static ArrayList<C0554a> m4949n()
    //   Original: legacy-pull of the current FirebaseAuth user's "sublists/<uid>" subtree
    //   from Firebase Realtime Database, reading via ValueEventListener and decoding via
    //   GenericTypeIndicator<ArrayList<OutlineRow>>. Sole caller: C0567n.java:185 (also
    //   being gutted). With cloud sync removed, legacy-pull has no destination — local
    //   outlines live in f3954q populated only via the local SharedPrefs/JSON load path
    //   in the surrounding methods.

    /* JADX INFO: renamed from: p */
    private static String m4951p() {
        return f3955r[f3930A];
    }

    /* JADX INFO: renamed from: q */
    private static String m4952q() {
        return f3956s[f3931B];
    }

    /* JADX INFO: renamed from: r */
    private static String m4953r() {
        return f3957t[f3932C];
    }

    /* JADX INFO: renamed from: s */
    private static String m4954s() {
        return f3959v[f3935F];
    }

    /* JADX INFO: renamed from: t */
    private static String m4955t() {
        return f3960w[f3936G];
    }

    /* JADX INFO: renamed from: u */
    private static void m4956u() {
        f3938a.mo4772b(true);
        m4947l();
    }

    /* JADX INFO: renamed from: v */
    private static boolean m4957v() {
        try {
            SharedPreferences sharedPreferences = f3938a.mo4775m().getSharedPreferences("SublistPrefsFile", 0);
            f3941d = sharedPreferences.getInt("last_visible_sub_frag", -1);
            f3942e = sharedPreferences.getBoolean("is_premium", false);
            f3937H = sharedPreferences.getBoolean("send_anon_anal", true);
            f3962y = sharedPreferences.getBoolean("show_completed", true);
            f3944g = sharedPreferences.getBoolean("def_persist_tskbr_icon", true);
            f3946i = sharedPreferences.getBoolean("def_compl_butt_overflow", false);
            f3945h = sharedPreferences.getBoolean("def_add_butt_loc", true);
            f3951n = sharedPreferences.getBoolean("def_auto_compl_children", true);
            f3952o = sharedPreferences.getBoolean("def_auto_del_children", true);
            f3947j = sharedPreferences.getBoolean("def_auto_open_keybrd", true);
            f3948k = sharedPreferences.getBoolean("def_add_new_location", false);
            f3949l = sharedPreferences.getBoolean("def_sing_line_ents", false);
            f3950m = sharedPreferences.getInt("def_enter_key", a.NEW_LINE.m4960a());
            f3963z = sharedPreferences.getBoolean("backup_location_sd", false);
            f3931B = sharedPreferences.getInt("color_bg", 10);
            f3930A = f3931B;
            f3932C = f3931B;
            f3934E = sharedPreferences.getInt("color_text", 1);
            f3935F = f3934E;
            f3936G = sharedPreferences.getInt("color_accent", 6);
            f3933D = sharedPreferences.getInt("size_text", 2);
            f3939b = sharedPreferences.getInt("temp_root_start", -1);
            f3940c = sharedPreferences.getInt("temp_root_end", -1);
            Log.d(f3953p, "preferences loaded");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(f3953p, "error loading preferences");
            return false;
        }
    }
}
