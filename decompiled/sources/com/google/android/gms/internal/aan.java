package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.p046c.C0677a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class aan extends acd {

    /* JADX INFO: renamed from: a */
    static final Pair<String, Long> f6140a = new Pair<>("", 0L);

    /* JADX INFO: renamed from: b */
    public final aas f6141b;

    /* JADX INFO: renamed from: c */
    public final aar f6142c;

    /* JADX INFO: renamed from: d */
    public final aar f6143d;

    /* JADX INFO: renamed from: e */
    public final aar f6144e;

    /* JADX INFO: renamed from: f */
    public final aar f6145f;

    /* JADX INFO: renamed from: g */
    public final aar f6146g;

    /* JADX INFO: renamed from: h */
    public final aar f6147h;

    /* JADX INFO: renamed from: i */
    public final aat f6148i;

    /* JADX INFO: renamed from: j */
    public final aar f6149j;

    /* JADX INFO: renamed from: k */
    public final aar f6150k;

    /* JADX INFO: renamed from: l */
    public final aap f6151l;

    /* JADX INFO: renamed from: m */
    public final aar f6152m;

    /* JADX INFO: renamed from: n */
    public final aar f6153n;

    /* JADX INFO: renamed from: o */
    public boolean f6154o;

    /* JADX INFO: renamed from: q */
    private SharedPreferences f6155q;

    /* JADX INFO: renamed from: r */
    private String f6156r;

    /* JADX INFO: renamed from: s */
    private boolean f6157s;

    /* JADX INFO: renamed from: t */
    private long f6158t;

    /* JADX INFO: renamed from: u */
    private String f6159u;

    /* JADX INFO: renamed from: v */
    private long f6160v;

    /* JADX INFO: renamed from: w */
    private final Object f6161w;

    aan(abd abdVar) {
        super(abdVar);
        this.f6141b = new aas(this, "health_monitor", Math.max(0L, C2106zs.f12713e.m12779b().longValue()));
        this.f6142c = new aar(this, "last_upload", 0L);
        this.f6143d = new aar(this, "last_upload_attempt", 0L);
        this.f6144e = new aar(this, "backoff", 0L);
        this.f6145f = new aar(this, "last_delete_stale", 0L);
        this.f6149j = new aar(this, "time_before_start", 10000L);
        this.f6150k = new aar(this, "session_timeout", 1800000L);
        this.f6151l = new aap(this, "start_new_session", true);
        this.f6152m = new aar(this, "last_pause_time", 0L);
        this.f6153n = new aar(this, "time_active", 0L);
        this.f6146g = new aar(this, "midnight_offset", 0L);
        this.f6147h = new aar(this, "first_open_time", 0L);
        this.f6148i = new aat(this, "app_instance_id", null);
        this.f6161w = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final SharedPreferences m7424D() {
        mo7376c();
        m7584Q();
        return this.f6155q;
    }

    /* JADX INFO: renamed from: A */
    final Boolean m7426A() {
        mo7376c();
        if (m7424D().contains("use_service")) {
            return Boolean.valueOf(m7424D().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    final void m7427B() {
        mo7376c();
        mo7393t().m7405E().m7412a("Clearing collection preferences.");
        boolean zContains = m7424D().contains("measurement_enabled");
        boolean zM7434c = zContains ? m7434c(true) : true;
        SharedPreferences.Editor editorEdit = m7424D().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (zContains) {
            m7432b(zM7434c);
        }
    }

    /* JADX INFO: renamed from: C */
    protected final String m7428C() {
        mo7376c();
        String string = m7424D().getString("previous_os_version", null);
        mo7381h().m7584Q();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = m7424D().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    final Pair<String, Boolean> m7429a(String str) {
        mo7376c();
        long jMo7253b = mo7384k().mo7253b();
        if (this.f6156r != null && jMo7253b < this.f6158t) {
            return new Pair<>(this.f6156r, Boolean.valueOf(this.f6157s));
        }
        this.f6158t = jMo7253b + mo7395v().m12683a(str, C2106zs.f12712d);
        C0677a.m5399a(true);
        try {
            C0677a.a aVarM5396a = C0677a.m5396a(mo7385l());
            if (aVarM5396a != null) {
                this.f6156r = aVarM5396a.m5408a();
                this.f6157s = aVarM5396a.m5409b();
            }
            if (this.f6156r == null) {
                this.f6156r = "";
            }
        } catch (Throwable th) {
            mo7393t().m7404D().m7413a("Unable to get advertising id", th);
            this.f6156r = "";
        }
        C0677a.m5399a(false);
        return new Pair<>(this.f6156r, Boolean.valueOf(this.f6157s));
    }

    /* JADX INFO: renamed from: a */
    final void m7430a(boolean z) {
        mo7376c();
        mo7393t().m7405E().m7413a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m7424D().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    final String m7431b(String str) {
        mo7376c();
        String str2 = (String) m7429a(str).first;
        MessageDigest messageDigestM7738g = aek.m7738g("MD5");
        if (messageDigestM7738g == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM7738g.digest(str2.getBytes())));
    }

    /* JADX INFO: renamed from: b */
    final void m7432b(boolean z) {
        mo7376c();
        mo7393t().m7405E().m7413a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m7424D().edit();
        editorEdit.putBoolean("measurement_enabled", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    final void m7433c(String str) {
        mo7376c();
        SharedPreferences.Editor editorEdit = m7424D().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    final boolean m7434c(boolean z) {
        mo7376c();
        return m7424D().getBoolean("measurement_enabled", z);
    }

    /* JADX INFO: renamed from: d */
    final void m7435d(String str) {
        synchronized (this.f6161w) {
            this.f6159u = str;
            this.f6160v = mo7384k().mo7253b();
        }
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: l_ */
    protected final void mo7436l_() {
        this.f6155q = mo7385l().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6154o = this.f6155q.getBoolean("has_been_opened", false);
        if (this.f6154o) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f6155q.edit();
        editorEdit.putBoolean("has_been_opened", true);
        editorEdit.apply();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    final String m7437y() {
        mo7376c();
        return m7424D().getString("gmp_app_id", null);
    }

    /* JADX INFO: renamed from: z */
    final String m7438z() {
        String str;
        synchronized (this.f6161w) {
            str = Math.abs(mo7384k().mo7253b() - this.f6160v) < 1000 ? this.f6159u : null;
        }
        return str;
    }
}
