package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.v4.p018i.C0207a;
import android.util.Log;
import com.google.firebase.C2213b;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstanceId {

    /* JADX INFO: renamed from: a */
    private static final long f12973a = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: b */
    private static Map<String, FirebaseInstanceId> f12974b = new C0207a();

    /* JADX INFO: renamed from: c */
    private static C2288aa f12975c;

    /* JADX INFO: renamed from: d */
    private static ScheduledThreadPoolExecutor f12976d;

    /* JADX INFO: renamed from: e */
    private final C2213b f12977e;

    /* JADX INFO: renamed from: f */
    private final C2311w f12978f;

    /* JADX INFO: renamed from: g */
    private final C2312x f12979g;

    /* JADX INFO: renamed from: h */
    private KeyPair f12980h;

    /* JADX INFO: renamed from: i */
    private boolean f12981i = false;

    private FirebaseInstanceId(C2213b c2213b) {
        this.f12977e = c2213b;
        if (C2311w.m13103a(c2213b) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        this.f12978f = new C2311w(c2213b.m12929a());
        this.f12979g = new C2312x(c2213b.m12929a(), this.f12978f);
        C2289ab c2289abM13041d = m13041d();
        if (c2289abM13041d == null || c2289abM13041d.m13066b(this.f12978f.m13107b()) || f12975c.m13056a() != null) {
            m13032j();
        }
    }

    /* JADX INFO: renamed from: a */
    public static FirebaseInstanceId m13027a() {
        return getInstance(C2213b.m12924d());
    }

    /* JADX INFO: renamed from: a */
    private final String m13028a(String str, String str2, Bundle bundle) throws IOException {
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("appid", m13040c());
        bundle.putString("gmp_app_id", this.f12977e.m12937c().m13024b());
        bundle.putString("gmsv", Integer.toString(this.f12978f.m13109d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f12978f.m13107b());
        bundle.putString("app_ver_name", this.f12978f.m13108c());
        bundle.putString("cliv", "fiid-11910000");
        Bundle bundleM13117a = this.f12979g.m13117a(bundle);
        if (bundleM13117a == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundleM13117a.getString("registration_id");
        if (string != null || (string = bundleM13117a.getString("unregistered")) != null) {
            if (!"RST".equals(string) && !string.startsWith("RST|")) {
                return string;
            }
            m13043h();
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string2 = bundleM13117a.getString("error");
        if (string2 != null) {
            throw new IOException(string2);
        }
        String strValueOf = String.valueOf(bundleM13117a);
        Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 20).append("Unexpected response ").append(strValueOf).toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: renamed from: a */
    static void m13029a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f12976d == null) {
                f12976d = new ScheduledThreadPoolExecutor(1);
            }
            f12976d.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: f */
    static C2288aa m13030f() {
        return f12975c;
    }

    /* JADX INFO: renamed from: g */
    static boolean m13031g() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(C2213b c2213b) {
        FirebaseInstanceId firebaseInstanceId;
        firebaseInstanceId = f12974b.get(c2213b.m12937c().m13024b());
        if (firebaseInstanceId == null) {
            if (f12975c == null) {
                f12975c = new C2288aa(c2213b.m12929a());
            }
            firebaseInstanceId = new FirebaseInstanceId(c2213b);
            f12974b.put(c2213b.m12937c().m13024b(), firebaseInstanceId);
        }
        return firebaseInstanceId;
    }

    /* JADX INFO: renamed from: j */
    private final synchronized void m13032j() {
        if (!this.f12981i) {
            m13035a(0L);
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m13033k() {
        f12975c.m13061c("");
        this.f12980h = null;
    }

    /* JADX INFO: renamed from: a */
    public String m13034a(String str, String str2) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        C2289ab c2289abM13055a = f12975c.m13055a("", str, str2);
        if (c2289abM13055a != null && !c2289abM13055a.m13066b(this.f12978f.m13107b())) {
            return c2289abM13055a.f12988a;
        }
        String strM13028a = m13028a(str, str2, new Bundle());
        if (strM13028a == null) {
            return strM13028a;
        }
        f12975c.m13057a("", str, str2, strM13028a, this.f12978f.m13107b());
        return strM13028a;
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m13035a(long j) {
        m13029a(new RunnableC2290b(this, this.f12978f, Math.min(Math.max(30L, j << 1), f12973a)), j);
        this.f12981i = true;
    }

    /* JADX INFO: renamed from: a */
    final void m13036a(String str) {
        C2289ab c2289abM13041d = m13041d();
        if (c2289abM13041d == null || c2289abM13041d.m13066b(this.f12978f.m13107b())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf("/topics/");
        String strValueOf2 = String.valueOf(str);
        bundle.putString("gcm.topic", strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        String str2 = c2289abM13041d.f12988a;
        String strValueOf3 = String.valueOf("/topics/");
        String strValueOf4 = String.valueOf(str);
        m13028a(str2, strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), bundle);
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m13037a(boolean z) {
        this.f12981i = z;
    }

    /* JADX INFO: renamed from: b */
    final C2213b m13038b() {
        return this.f12977e;
    }

    /* JADX INFO: renamed from: b */
    final void m13039b(String str) {
        C2289ab c2289abM13041d = m13041d();
        if (c2289abM13041d == null || c2289abM13041d.m13066b(this.f12978f.m13107b())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf("/topics/");
        String strValueOf2 = String.valueOf(str);
        bundle.putString("gcm.topic", strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        bundle.putString("delete", "1");
        String str2 = c2289abM13041d.f12988a;
        String strValueOf3 = String.valueOf("/topics/");
        String strValueOf4 = String.valueOf(str);
        m13028a(str2, strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), bundle);
    }

    /* JADX INFO: renamed from: c */
    public String m13040c() {
        if (this.f12980h == null) {
            this.f12980h = f12975c.m13063e("");
        }
        if (this.f12980h == null) {
            this.f12980h = f12975c.m13059b("");
        }
        return C2311w.m13104a(this.f12980h);
    }

    /* JADX INFO: renamed from: d */
    final C2289ab m13041d() {
        return f12975c.m13055a("", C2311w.m13103a(this.f12977e), "*");
    }

    /* JADX INFO: renamed from: e */
    final String m13042e() {
        return m13034a(C2311w.m13103a(this.f12977e), "*");
    }

    /* JADX INFO: renamed from: h */
    final void m13043h() {
        f12975c.m13060b();
        m13033k();
        m13032j();
    }

    /* JADX INFO: renamed from: i */
    final void m13044i() {
        f12975c.m13062d("");
        m13032j();
    }
}
