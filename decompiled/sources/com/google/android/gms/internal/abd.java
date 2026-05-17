package com.google.android.gms.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C1111az;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1297a;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class abd {

    /* JADX INFO: renamed from: a */
    private static volatile abd f6220a;

    /* JADX INFO: renamed from: A */
    private boolean f6221A;

    /* JADX INFO: renamed from: B */
    private Boolean f6222B;

    /* JADX INFO: renamed from: C */
    private long f6223C;

    /* JADX INFO: renamed from: D */
    private FileLock f6224D;

    /* JADX INFO: renamed from: E */
    private FileChannel f6225E;

    /* JADX INFO: renamed from: F */
    private List<Long> f6226F;

    /* JADX INFO: renamed from: G */
    private List<Runnable> f6227G;

    /* JADX INFO: renamed from: H */
    private int f6228H;

    /* JADX INFO: renamed from: I */
    private int f6229I;

    /* JADX INFO: renamed from: J */
    private long f6230J;

    /* JADX INFO: renamed from: K */
    private long f6231K;

    /* JADX INFO: renamed from: L */
    private boolean f6232L;

    /* JADX INFO: renamed from: M */
    private boolean f6233M;

    /* JADX INFO: renamed from: N */
    private boolean f6234N;

    /* JADX INFO: renamed from: O */
    private final long f6235O;

    /* JADX INFO: renamed from: b */
    private final Context f6236b;

    /* JADX INFO: renamed from: c */
    private final C2090zc f6237c;

    /* JADX INFO: renamed from: d */
    private final aan f6238d;

    /* JADX INFO: renamed from: e */
    private final aac f6239e;

    /* JADX INFO: renamed from: f */
    private final aay f6240f;

    /* JADX INFO: renamed from: g */
    private final adz f6241g;

    /* JADX INFO: renamed from: h */
    private final aax f6242h;

    /* JADX INFO: renamed from: i */
    private final AppMeasurement f6243i;

    /* JADX INFO: renamed from: j */
    private final FirebaseAnalytics f6244j;

    /* JADX INFO: renamed from: k */
    private final aek f6245k;

    /* JADX INFO: renamed from: l */
    private final aaa f6246l;

    /* JADX INFO: renamed from: m */
    private final C2091zd f6247m;

    /* JADX INFO: renamed from: n */
    private final C2112zy f6248n;

    /* JADX INFO: renamed from: o */
    private final aag f6249o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC1300d f6250p;

    /* JADX INFO: renamed from: q */
    private final acv f6251q;

    /* JADX INFO: renamed from: r */
    private final acz f6252r;

    /* JADX INFO: renamed from: s */
    private final C2097zj f6253s;

    /* JADX INFO: renamed from: t */
    private final acf f6254t;

    /* JADX INFO: renamed from: u */
    private final C2111zx f6255u;

    /* JADX INFO: renamed from: v */
    private final aal f6256v;

    /* JADX INFO: renamed from: w */
    private final aef f6257w;

    /* JADX INFO: renamed from: x */
    private final C2086yz f6258x;

    /* JADX INFO: renamed from: y */
    private final C2079ys f6259y;

    /* JADX INFO: renamed from: z */
    private boolean f6260z = false;

    /* JADX INFO: renamed from: com.google.android.gms.internal.abd$a */
    class C1356a implements InterfaceC2093zf {

        /* JADX INFO: renamed from: a */
        aez f6261a;

        /* JADX INFO: renamed from: b */
        List<Long> f6262b;

        /* JADX INFO: renamed from: c */
        List<aew> f6263c;

        /* JADX INFO: renamed from: d */
        private long f6264d;

        private C1356a() {
        }

        /* synthetic */ C1356a(abd abdVar, abe abeVar) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private static long m7561a(aew aewVar) {
            return ((aewVar.f6556c.longValue() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.internal.InterfaceC2093zf
        /* JADX INFO: renamed from: a */
        public final void mo7562a(aez aezVar) {
            C1221aj.m7065a(aezVar);
            this.f6261a = aezVar;
        }

        @Override // com.google.android.gms.internal.InterfaceC2093zf
        /* JADX INFO: renamed from: a */
        public final boolean mo7563a(long j, aew aewVar) {
            C1221aj.m7065a(aewVar);
            if (this.f6263c == null) {
                this.f6263c = new ArrayList();
            }
            if (this.f6262b == null) {
                this.f6262b = new ArrayList();
            }
            if (this.f6263c.size() > 0 && m7561a(this.f6263c.get(0)) != m7561a(aewVar)) {
                return false;
            }
            long jM10166f = this.f6264d + ((long) aewVar.m10166f());
            if (jM10166f >= Math.max(0, C2106zs.f12719k.m12779b().intValue())) {
                return false;
            }
            this.f6264d = jM10166f;
            this.f6263c.add(aewVar);
            this.f6262b.add(Long.valueOf(j));
            return this.f6263c.size() < Math.max(1, C2106zs.f12720l.m12779b().intValue());
        }
    }

    private abd(ace aceVar) {
        C1221aj.m7065a(aceVar);
        this.f6236b = aceVar.f6331a;
        this.f6230J = -1L;
        this.f6250p = C1303g.m7263d();
        this.f6235O = this.f6250p.mo7252a();
        this.f6237c = new C2090zc(this);
        aan aanVar = new aan(this);
        aanVar.m7585R();
        this.f6238d = aanVar;
        aac aacVar = new aac(this);
        aacVar.m7585R();
        this.f6239e = aacVar;
        aek aekVar = new aek(this);
        aekVar.m7585R();
        this.f6245k = aekVar;
        aaa aaaVar = new aaa(this);
        aaaVar.m7585R();
        this.f6246l = aaaVar;
        C2097zj c2097zj = new C2097zj(this);
        c2097zj.m7585R();
        this.f6253s = c2097zj;
        C2111zx c2111zx = new C2111zx(this);
        c2111zx.m7585R();
        this.f6255u = c2111zx;
        C2091zd c2091zd = new C2091zd(this);
        c2091zd.m7585R();
        this.f6247m = c2091zd;
        C2112zy c2112zy = new C2112zy(this);
        c2112zy.m7585R();
        this.f6248n = c2112zy;
        C2086yz c2086yz = new C2086yz(this);
        c2086yz.m7585R();
        this.f6258x = c2086yz;
        this.f6259y = new C2079ys(this);
        aag aagVar = new aag(this);
        aagVar.m7585R();
        this.f6249o = aagVar;
        acv acvVar = new acv(this);
        acvVar.m7585R();
        this.f6251q = acvVar;
        acz aczVar = new acz(this);
        aczVar.m7585R();
        this.f6252r = aczVar;
        acf acfVar = new acf(this);
        acfVar.m7585R();
        this.f6254t = acfVar;
        aef aefVar = new aef(this);
        aefVar.m7585R();
        this.f6257w = aefVar;
        this.f6256v = new aal(this);
        this.f6243i = new AppMeasurement(this);
        this.f6244j = new FirebaseAnalytics(this);
        adz adzVar = new adz(this);
        adzVar.m7585R();
        this.f6241g = adzVar;
        aax aaxVar = new aax(this);
        aaxVar.m7585R();
        this.f6242h = aaxVar;
        aay aayVar = new aay(this);
        aayVar.m7585R();
        this.f6240f = aayVar;
        if (this.f6236b.getApplicationContext() instanceof Application) {
            acf acfVarM7546l = m7546l();
            if (acfVarM7546l.mo7385l().getApplicationContext() instanceof Application) {
                Application application = (Application) acfVarM7546l.mo7385l().getApplicationContext();
                if (acfVarM7546l.f6332a == null) {
                    acfVarM7546l.f6332a = new acu(acfVarM7546l, null);
                }
                application.unregisterActivityLifecycleCallbacks(acfVarM7546l.f6332a);
                application.registerActivityLifecycleCallbacks(acfVarM7546l.f6332a);
                acfVarM7546l.mo7393t().m7405E().m7412a("Registered activity lifecycle callback");
            }
        } else {
            m7540f().m7401A().m7412a("Application context is not an Application");
        }
        this.f6240f.m7479a(new abe(this));
    }

    /* JADX INFO: renamed from: D */
    static void m7486D() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m7487H() {
        aae aaeVarM7403C;
        String strConcat;
        m7542h().mo7376c();
        this.f6245k.m7586S();
        this.f6238d.m7586S();
        this.f6255u.m7586S();
        m7540f().m7403C().m7413a("App measurement is starting up, version", 11910L);
        m7540f().m7403C().m7412a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strM12786z = this.f6255u.m12786z();
        if (m7549o().m7769j(strM12786z)) {
            aaeVarM7403C = m7540f().m7403C();
            strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            aaeVarM7403C = m7540f().m7403C();
            String strValueOf = String.valueOf(strM12786z);
            strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
        }
        aaeVarM7403C.m7412a(strConcat);
        m7540f().m7404D().m7412a("Debug-level message logging enabled");
        if (this.f6228H != this.f6229I) {
            m7540f().m7410y().m7414a("Not all components initialized", Integer.valueOf(this.f6228H), Integer.valueOf(this.f6229I));
        }
        this.f6260z = true;
    }

    /* JADX INFO: renamed from: I */
    private final aal m7488I() {
        if (this.f6256v == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return this.f6256v;
    }

    /* JADX INFO: renamed from: J */
    private final aef m7489J() {
        m7508b(this.f6257w);
        return this.f6257w;
    }

    /* JADX INFO: renamed from: K */
    private final boolean m7490K() {
        m7542h().mo7376c();
        try {
            this.f6225E = new RandomAccessFile(new File(this.f6236b.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f6224D = this.f6225E.tryLock();
        } catch (FileNotFoundException e) {
            m7540f().m7410y().m7413a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            m7540f().m7410y().m7413a("Failed to access storage lock file", e2);
        }
        if (this.f6224D != null) {
            m7540f().m7405E().m7412a("Storage concurrent access okay");
            return true;
        }
        m7540f().m7410y().m7412a("Storage concurrent data access panic");
        return false;
    }

    /* JADX INFO: renamed from: L */
    private final long m7491L() {
        long jMo7252a = this.f6250p.mo7252a();
        aan aanVarM7539e = m7539e();
        aanVarM7539e.m7584Q();
        aanVarM7539e.mo7376c();
        long jM7442a = aanVarM7539e.f6146g.m7442a();
        if (jM7442a == 0) {
            jM7442a = 1 + ((long) aanVarM7539e.mo7389p().m7773z().nextInt(86400000));
            aanVarM7539e.f6146g.m7443a(jM7442a);
        }
        return ((((jM7442a + jMo7252a) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: renamed from: M */
    private final boolean m7492M() {
        m7542h().mo7376c();
        m7518a();
        return m7551q().m12715G() || !TextUtils.isEmpty(m7551q().m12710B());
    }

    /* JADX INFO: renamed from: N */
    private final void m7493N() {
        long jMax;
        long jMax2;
        m7542h().mo7376c();
        m7518a();
        if (m7494O()) {
            if (this.f6231K > 0) {
                long jAbs = 3600000 - Math.abs(this.f6250p.mo7253b() - this.f6231K);
                if (jAbs > 0) {
                    m7540f().m7405E().m7413a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                    m7488I().m7423b();
                    m7489J().m7711y();
                    return;
                }
                this.f6231K = 0L;
            }
            if (!m7534b() || !m7492M()) {
                m7540f().m7405E().m7412a("Nothing to upload or uploading impossible");
                m7488I().m7423b();
                m7489J().m7711y();
                return;
            }
            long jMo7252a = this.f6250p.mo7252a();
            long jMax3 = Math.max(0L, C2106zs.f12696C.m12779b().longValue());
            boolean z = m7551q().m12716H() || m7551q().m12711C();
            if (z) {
                String strM12681A = this.f6237c.m12681A();
                jMax = (TextUtils.isEmpty(strM12681A) || ".none.".equals(strM12681A)) ? Math.max(0L, C2106zs.f12731w.m12779b().longValue()) : Math.max(0L, C2106zs.f12732x.m12779b().longValue());
            } else {
                jMax = Math.max(0L, C2106zs.f12730v.m12779b().longValue());
            }
            long jM7442a = m7539e().f6142c.m7442a();
            long jM7442a2 = m7539e().f6143d.m7442a();
            long jMax4 = Math.max(m7551q().m12713E(), m7551q().m12714F());
            if (jMax4 == 0) {
                jMax2 = 0;
            } else {
                long jAbs2 = jMo7252a - Math.abs(jMax4 - jMo7252a);
                long jAbs3 = jMo7252a - Math.abs(jM7442a - jMo7252a);
                long jAbs4 = jMo7252a - Math.abs(jM7442a2 - jMo7252a);
                long jMax5 = Math.max(jAbs3, jAbs4);
                jMax2 = jAbs2 + jMax3;
                if (z && jMax5 > 0) {
                    jMax2 = Math.min(jAbs2, jMax5) + jMax;
                }
                if (!m7549o().m7756a(jMax5, jMax)) {
                    jMax2 = jMax5 + jMax;
                }
                if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= Math.min(20, Math.max(0, C2106zs.f12698E.m12779b().intValue()))) {
                            jMax2 = 0;
                            break;
                        }
                        jMax2 += (1 << i2) * Math.max(0L, C2106zs.f12697D.m12779b().longValue());
                        if (jMax2 > jAbs4) {
                            break;
                        } else {
                            i = i2 + 1;
                        }
                    }
                }
            }
            if (jMax2 == 0) {
                m7540f().m7405E().m7412a("Next upload time is 0");
                m7488I().m7423b();
                m7489J().m7711y();
                return;
            }
            if (!m7553s().m7419y()) {
                m7540f().m7405E().m7412a("No network");
                m7488I().m7422a();
                m7489J().m7711y();
                return;
            }
            long jM7442a3 = m7539e().f6144e.m7442a();
            long jMax6 = Math.max(0L, C2106zs.f12728t.m12779b().longValue());
            long jMax7 = !m7549o().m7756a(jM7442a3, jMax6) ? Math.max(jMax2, jMax6 + jM7442a3) : jMax2;
            m7488I().m7423b();
            long jMo7252a2 = jMax7 - this.f6250p.mo7252a();
            if (jMo7252a2 <= 0) {
                jMo7252a2 = Math.max(0L, C2106zs.f12733y.m12779b().longValue());
                m7539e().f6142c.m7443a(this.f6250p.mo7252a());
            }
            m7540f().m7405E().m7413a("Upload scheduled in approximately ms", Long.valueOf(jMo7252a2));
            m7489J().m7710a(jMo7252a2);
        }
    }

    /* JADX INFO: renamed from: O */
    private final boolean m7494O() {
        m7542h().mo7376c();
        m7518a();
        return this.f6221A;
    }

    /* JADX INFO: renamed from: P */
    private final void m7495P() {
        m7542h().mo7376c();
        if (this.f6232L || this.f6233M || this.f6234N) {
            m7540f().m7405E().m7415a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f6232L), Boolean.valueOf(this.f6233M), Boolean.valueOf(this.f6234N));
            return;
        }
        m7540f().m7405E().m7412a("Stopping uploading service(s)");
        if (this.f6227G != null) {
            Iterator<Runnable> it = this.f6227G.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f6227G.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private final int m7496a(FileChannel fileChannel) {
        int i = 0;
        m7542h().mo7376c();
        if (fileChannel == null || !fileChannel.isOpen()) {
            m7540f().m7410y().m7412a("Bad chanel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i2 = fileChannel.read(byteBufferAllocate);
                if (i2 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i2 != -1) {
                    m7540f().m7401A().m7413a("Unexpected data length. Bytes read", Integer.valueOf(i2));
                }
            } catch (IOException e) {
                m7540f().m7410y().m7413a("Failed to read from channel", e);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static abd m7497a(Context context) {
        C1221aj.m7065a(context);
        C1221aj.m7065a(context.getApplicationContext());
        if (f6220a == null) {
            synchronized (abd.class) {
                if (f6220a == null) {
                    f6220a = new abd(new ace(context));
                }
            }
        }
        return f6220a;
    }

    /* JADX INFO: renamed from: a */
    private final C2084yx m7498a(Context context, String str, String str2, boolean z, boolean z2) {
        String string;
        String installerPackageName = "Unknown";
        String str3 = "Unknown";
        int i = Integer.MIN_VALUE;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            m7540f().m7410y().m7412a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            installerPackageName = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException e) {
            m7540f().m7410y().m7413a("Error retrieving installer package name. appId", aac.m7397a(str));
        }
        if (installerPackageName == null) {
            installerPackageName = "manual_install";
        } else if ("com.android.vending".equals(installerPackageName)) {
            installerPackageName = "";
        }
        try {
            PackageInfo packageInfoM12560b = C2040xg.m12562a(context).m12560b(str, 0);
            if (packageInfoM12560b != null) {
                CharSequence charSequenceM12561b = C2040xg.m12562a(context).m12561b(str);
                string = !TextUtils.isEmpty(charSequenceM12561b) ? charSequenceM12561b.toString() : "Unknown";
                try {
                    str3 = packageInfoM12560b.versionName;
                    i = packageInfoM12560b.versionCode;
                } catch (PackageManager.NameNotFoundException e2) {
                    m7540f().m7410y().m7414a("Error retrieving newly installed package info. appId, appName", aac.m7397a(str), string);
                    return null;
                }
            }
            return new C2084yx(str, str2, str3, i, installerPackageName, 11910L, m7549o().m7761b(context, str), (String) null, z, false, "", 0L, 0L, 0, z2);
        } catch (PackageManager.NameNotFoundException e3) {
            string = "Unknown";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7500a(acc accVar) {
        if (accVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m7501a(C2083yw c2083yw) {
        C0207a c0207a;
        m7542h().mo7376c();
        if (TextUtils.isEmpty(c2083yw.m12630d())) {
            m7528a(c2083yw.m12623b(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String strM12630d = c2083yw.m12630d();
        String strM12627c = c2083yw.m12627c();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderEncodedAuthority = builder.scheme(C2106zs.f12715g.m12779b()).encodedAuthority(C2106zs.f12716h.m12779b());
        String strValueOf = String.valueOf(strM12630d);
        builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", strM12627c).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "11910");
        String string = builder.build().toString();
        try {
            URL url = new URL(string);
            m7540f().m7405E().m7413a("Fetching remote configuration", c2083yw.m12623b());
            aes aesVarM7458a = m7544j().m7458a(c2083yw.m12623b());
            String strM7461b = m7544j().m7461b(c2083yw.m12623b());
            if (aesVarM7458a == null || TextUtils.isEmpty(strM7461b)) {
                c0207a = null;
            } else {
                C0207a c0207a2 = new C0207a();
                c0207a2.put("If-Modified-Since", strM7461b);
                c0207a = c0207a2;
            }
            this.f6232L = true;
            aag aagVarM7553s = m7553s();
            String strM12623b = c2083yw.m12623b();
            abh abhVar = new abh(this);
            aagVarM7553s.mo7376c();
            aagVarM7553s.m7584Q();
            C1221aj.m7065a(url);
            C1221aj.m7065a(abhVar);
            aagVarM7553s.mo7392s().m7481b(new aak(aagVarM7553s, strM12623b, url, null, c0207a, abhVar));
        } catch (MalformedURLException e) {
            m7540f().m7410y().m7414a("Failed to parse config URL. Not fetching. appId", aac.m7397a(c2083yw.m12623b()), string);
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7502a(int i, FileChannel fileChannel) {
        m7542h().mo7376c();
        if (fileChannel == null || !fileChannel.isOpen()) {
            m7540f().m7410y().m7412a("Bad chanel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            m7540f().m7410y().m7413a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e) {
            m7540f().m7410y().m7413a("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7503a(aew aewVar, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return false;
        }
        for (aex aexVar : aewVar.f6554a) {
            if (str.equals(aexVar.f6560a)) {
                return ((obj instanceof Long) && obj.equals(aexVar.f6562c)) || ((obj instanceof String) && obj.equals(aexVar.f6561b)) || ((obj instanceof Double) && obj.equals(aexVar.f6563d));
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0391 A[Catch: all -> 0x01be, TryCatch #8 {all -> 0x01be, blocks: (B:3:0x0007, B:16:0x0080, B:17:0x0083, B:19:0x0089, B:23:0x0096, B:24:0x00af, B:26:0x00b9, B:28:0x00d5, B:30:0x0110, B:34:0x0123, B:36:0x0137, B:120:0x0360, B:122:0x037c, B:173:0x05d2, B:124:0x0391, B:126:0x03a1, B:127:0x03b0, B:129:0x03c1, B:131:0x03cd, B:132:0x03d8, B:133:0x03dd, B:135:0x03e7, B:138:0x03f5, B:140:0x045b, B:141:0x04bf, B:143:0x04ec, B:144:0x04f7, B:146:0x04fc, B:148:0x050a, B:150:0x0513, B:151:0x051a, B:153:0x051d, B:154:0x0526, B:166:0x05a7, B:155:0x0528, B:158:0x053c, B:160:0x056a, B:162:0x0594, B:165:0x05a1, B:167:0x05ab, B:172:0x05c0, B:175:0x05ea, B:176:0x05f9, B:178:0x0613, B:180:0x061d, B:181:0x062b, B:183:0x0653, B:185:0x066f, B:188:0x069b, B:190:0x06a9, B:192:0x06c0, B:193:0x06d3, B:195:0x06d7, B:197:0x06e3, B:198:0x06f6, B:200:0x06fa, B:202:0x0702, B:203:0x0719, B:204:0x071d, B:205:0x0725, B:207:0x0736, B:209:0x074c, B:210:0x0766, B:212:0x0774, B:214:0x0788, B:215:0x07c0, B:218:0x07d0, B:220:0x07d9, B:222:0x07e3, B:224:0x07e7, B:226:0x07eb, B:228:0x07ef, B:230:0x0803, B:232:0x080d, B:234:0x082f, B:235:0x083c, B:236:0x0853, B:238:0x086a, B:240:0x08a3, B:241:0x08b4, B:242:0x08cb, B:244:0x08d1, B:246:0x08e4, B:248:0x08ed, B:249:0x08fb, B:250:0x0903, B:252:0x0909, B:253:0x091d, B:254:0x0935, B:256:0x093c, B:258:0x0954, B:259:0x095a, B:261:0x096c, B:262:0x0972, B:263:0x0975, B:265:0x0985, B:266:0x099c, B:268:0x09a3, B:270:0x09b3, B:295:0x0a8e, B:275:0x09cd, B:272:0x09b7, B:274:0x09c3, B:294:0x0a75, B:276:0x09d8, B:277:0x09eb, B:278:0x09f9, B:297:0x0a97, B:281:0x0a09, B:283:0x0a10, B:285:0x0a1a, B:286:0x0a1e, B:290:0x0a32, B:291:0x0a36, B:298:0x0aaa, B:48:0x01b9, B:84:0x02b6, B:106:0x032f, B:113:0x034e, B:97:0x02f6, B:89:0x02cf, B:116:0x0356, B:117:0x0359, B:63:0x0213, B:72:0x0241), top: B:321:0x0007, inners: #1, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0610 A[PHI: r17
      0x0610: PHI (r17v4 boolean) = (r17v3 boolean), (r17v3 boolean), (r17v3 boolean), (r17v3 boolean), (r17v1 boolean) binds: [B:156:0x0538, B:157:0x053a, B:159:0x0568, B:176:0x05f9, B:123:0x038f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6 A[Catch: SQLiteException -> 0x02e0, all -> 0x0abb, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x02e0, all -> 0x0abb, blocks: (B:44:0x0181, B:46:0x01a6, B:71:0x0232, B:72:0x0241, B:73:0x0244, B:75:0x024a, B:76:0x025b, B:78:0x0269, B:79:0x027b, B:91:0x02d4, B:87:0x02bc), top: B:322:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m7504a(String str, long j) {
        C2099zl c2099zlM12764a;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        String str2;
        Cursor cursor;
        String str3;
        Cursor cursorQuery;
        String str4;
        String[] strArr;
        m7551q().m12747x();
        try {
            C1356a c1356a = new C1356a(this, null);
            C2091zd c2091zdM7551q = m7551q();
            String str5 = null;
            long j2 = this.f6230J;
            C1221aj.m7065a(c1356a);
            c2091zdM7551q.mo7376c();
            c2091zdM7551q.m7584Q();
            Cursor cursorQuery2 = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseM12709A = c2091zdM7551q.m12709A();
                    if (TextUtils.isEmpty(null)) {
                        String[] strArr2 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        String str6 = j2 != -1 ? "rowid <= ? and " : "";
                        Cursor cursorRawQuery = sQLiteDatabaseM12709A.rawQuery(new StringBuilder(String.valueOf(str6).length() + 148).append("select app_id, metadata_fingerprint from raw_events where ").append(str6).append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;").toString(), strArr2);
                        if (cursorRawQuery.moveToFirst()) {
                            String string = cursorRawQuery.getString(0);
                            String string2 = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                            str2 = string2;
                            cursor = cursorRawQuery;
                            str3 = string;
                            try {
                                cursorQuery = sQLiteDatabaseM12709A.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str2}, null, null, "rowid", "2");
                                if (cursorQuery.moveToFirst()) {
                                    c2091zdM7551q.mo7393t().m7410y().m7413a("Raw event metadata record is missing. appId", aac.m7397a(str3));
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                } else {
                                    byte[] blob = cursorQuery.getBlob(0);
                                    brt brtVarM10078a = brt.m10078a(blob, 0, blob.length);
                                    aez aezVar = new aez();
                                    try {
                                        aezVar.mo7776a(brtVarM10078a);
                                        if (cursorQuery.moveToNext()) {
                                            c2091zdM7551q.mo7393t().m7401A().m7413a("Get multiple raw event metadata records, expected one. appId", aac.m7397a(str3));
                                        }
                                        cursorQuery.close();
                                        c1356a.mo7562a(aezVar);
                                        if (j2 != -1) {
                                            str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            strArr = new String[]{str3, str2, String.valueOf(j2)};
                                        } else {
                                            str4 = "app_id = ? and metadata_fingerprint = ?";
                                            strArr = new String[]{str3, str2};
                                        }
                                        cursorQuery2 = sQLiteDatabaseM12709A.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str4, strArr, null, null, "rowid", null);
                                        try {
                                            if (cursorQuery2.moveToFirst()) {
                                                while (true) {
                                                    long j3 = cursorQuery2.getLong(0);
                                                    byte[] blob2 = cursorQuery2.getBlob(3);
                                                    brt brtVarM10078a2 = brt.m10078a(blob2, 0, blob2.length);
                                                    aew aewVar = new aew();
                                                    try {
                                                        aewVar.mo7776a(brtVarM10078a2);
                                                        aewVar.f6555b = cursorQuery2.getString(1);
                                                        aewVar.f6556c = Long.valueOf(cursorQuery2.getLong(2));
                                                    } catch (IOException e) {
                                                        c2091zdM7551q.mo7393t().m7410y().m7414a("Data loss. Failed to merge raw event. appId", aac.m7397a(str3), e);
                                                    }
                                                    if (c1356a.mo7563a(j3, aewVar)) {
                                                        if (!cursorQuery2.moveToNext()) {
                                                            if (cursorQuery2 != null) {
                                                                cursorQuery2.close();
                                                            }
                                                        }
                                                    } else if (cursorQuery2 != null) {
                                                        cursorQuery2.close();
                                                    }
                                                }
                                            } else {
                                                c2091zdM7551q.mo7393t().m7401A().m7413a("Raw event data disappeared while in transaction. appId", aac.m7397a(str3));
                                                if (cursorQuery2 != null) {
                                                    cursorQuery2.close();
                                                }
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            str5 = str3;
                                            c2091zdM7551q.mo7393t().m7410y().m7414a("Data loss. Error selecting raw event. appId", aac.m7397a(str5), e);
                                            if (cursorQuery2 != null) {
                                                cursorQuery2.close();
                                            }
                                        }
                                    } catch (IOException e3) {
                                        c2091zdM7551q.mo7393t().m7410y().m7414a("Data loss. Failed to merge raw event metadata. appId", aac.m7397a(str3), e3);
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                    }
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                cursorQuery2 = cursor;
                                str5 = str3;
                            } catch (Throwable th) {
                                th = th;
                                cursorQuery2 = cursor;
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                                throw th;
                            }
                        } else if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null};
                        String str7 = j2 != -1 ? " and rowid <= ?" : "";
                        Cursor cursorRawQuery2 = sQLiteDatabaseM12709A.rawQuery(new StringBuilder(String.valueOf(str7).length() + 84).append("select metadata_fingerprint from raw_events where app_id = ?").append(str7).append(" order by rowid limit 1;").toString(), strArr3);
                        if (cursorRawQuery2.moveToFirst()) {
                            String string3 = cursorRawQuery2.getString(0);
                            cursorRawQuery2.close();
                            str2 = string3;
                            cursor = cursorRawQuery2;
                            str3 = null;
                            cursorQuery = sQLiteDatabaseM12709A.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str2}, null, null, "rowid", "2");
                            if (cursorQuery.moveToFirst()) {
                            }
                        } else if (cursorRawQuery2 != null) {
                            cursorRawQuery2.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (SQLiteException e5) {
                e = e5;
            }
            if (c1356a.f6263c == null || c1356a.f6263c.isEmpty()) {
                m7551q().m12748y();
                m7551q().m12749z();
                return false;
            }
            boolean z5 = false;
            aez aezVar2 = c1356a.f6261a;
            aezVar2.f6577b = new aew[c1356a.f6263c.size()];
            int i3 = 0;
            int i4 = 0;
            while (i4 < c1356a.f6263c.size()) {
                if (m7544j().m7462b(c1356a.f6261a.f6590o, c1356a.f6263c.get(i4).f6555b)) {
                    m7540f().m7401A().m7414a("Dropping blacklisted raw event. appId", aac.m7397a(c1356a.f6261a.f6590o), m7550p().m7371a(c1356a.f6263c.get(i4).f6555b));
                    if ((m7549o().m7770l(c1356a.f6261a.f6590o) || m7549o().m7771m(c1356a.f6261a.f6590o)) || "_err".equals(c1356a.f6263c.get(i4).f6555b)) {
                        i2 = i3;
                        z4 = z5;
                    } else {
                        m7549o().m7755a(c1356a.f6261a.f6590o, 11, "_ev", c1356a.f6263c.get(i4).f6555b, 0);
                        i2 = i3;
                        z4 = z5;
                    }
                } else {
                    boolean zM7464c = m7544j().m7464c(c1356a.f6261a.f6590o, c1356a.f6263c.get(i4).f6555b);
                    if (!zM7464c) {
                        m7549o();
                        if (aek.m7741n(c1356a.f6263c.get(i4).f6555b)) {
                            boolean z6 = false;
                            boolean z7 = false;
                            if (c1356a.f6263c.get(i4).f6554a == null) {
                                c1356a.f6263c.get(i4).f6554a = new aex[0];
                            }
                            aex[] aexVarArr = c1356a.f6263c.get(i4).f6554a;
                            int length = aexVarArr.length;
                            int i5 = 0;
                            while (i5 < length) {
                                aex aexVar = aexVarArr[i5];
                                if ("_c".equals(aexVar.f6560a)) {
                                    aexVar.f6562c = 1L;
                                    z6 = true;
                                    z3 = z7;
                                } else if ("_r".equals(aexVar.f6560a)) {
                                    aexVar.f6562c = 1L;
                                    z3 = true;
                                } else {
                                    z3 = z7;
                                }
                                i5++;
                                z7 = z3;
                            }
                            if (!z6 && zM7464c) {
                                m7540f().m7405E().m7413a("Marking event as conversion", m7550p().m7371a(c1356a.f6263c.get(i4).f6555b));
                                aex[] aexVarArr2 = (aex[]) Arrays.copyOf(c1356a.f6263c.get(i4).f6554a, c1356a.f6263c.get(i4).f6554a.length + 1);
                                aex aexVar2 = new aex();
                                aexVar2.f6560a = "_c";
                                aexVar2.f6562c = 1L;
                                aexVarArr2[aexVarArr2.length - 1] = aexVar2;
                                c1356a.f6263c.get(i4).f6554a = aexVarArr2;
                            }
                            if (!z7) {
                                m7540f().m7405E().m7413a("Marking event as real-time", m7550p().m7371a(c1356a.f6263c.get(i4).f6555b));
                                aex[] aexVarArr3 = (aex[]) Arrays.copyOf(c1356a.f6263c.get(i4).f6554a, c1356a.f6263c.get(i4).f6554a.length + 1);
                                aex aexVar3 = new aex();
                                aexVar3.f6560a = "_r";
                                aexVar3.f6562c = 1L;
                                aexVarArr3[aexVarArr3.length - 1] = aexVar3;
                                c1356a.f6263c.get(i4).f6554a = aexVarArr3;
                            }
                            if (m7551q().m12719a(m7491L(), c1356a.f6261a.f6590o, false, false, false, false, true).f12660e > this.f6237c.m12682a(c1356a.f6261a.f6590o)) {
                                aew aewVar2 = c1356a.f6263c.get(i4);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= aewVar2.f6554a.length) {
                                        break;
                                    }
                                    if ("_r".equals(aewVar2.f6554a[i6].f6560a)) {
                                        aex[] aexVarArr4 = new aex[aewVar2.f6554a.length - 1];
                                        if (i6 > 0) {
                                            System.arraycopy(aewVar2.f6554a, 0, aexVarArr4, 0, i6);
                                        }
                                        if (i6 < aexVarArr4.length) {
                                            System.arraycopy(aewVar2.f6554a, i6 + 1, aexVarArr4, i6, aexVarArr4.length - i6);
                                        }
                                        aewVar2.f6554a = aexVarArr4;
                                    } else {
                                        i6++;
                                    }
                                }
                            } else {
                                z5 = true;
                            }
                            if (aek.m7723a(c1356a.f6263c.get(i4).f6555b) && zM7464c && m7551q().m12719a(m7491L(), c1356a.f6261a.f6590o, false, false, true, false, false).f12658c > this.f6237c.m12684b(c1356a.f6261a.f6590o, C2106zs.f12724p)) {
                                m7540f().m7401A().m7413a("Too many conversions. Not logging as conversion. appId", aac.m7397a(c1356a.f6261a.f6590o));
                                aew aewVar3 = c1356a.f6263c.get(i4);
                                boolean z8 = false;
                                aex aexVar4 = null;
                                aex[] aexVarArr5 = aewVar3.f6554a;
                                int length2 = aexVarArr5.length;
                                int i7 = 0;
                                while (i7 < length2) {
                                    aex aexVar5 = aexVarArr5[i7];
                                    if ("_c".equals(aexVar5.f6560a)) {
                                        z2 = z8;
                                    } else if ("_err".equals(aexVar5.f6560a)) {
                                        aex aexVar6 = aexVar4;
                                        z2 = true;
                                        aexVar5 = aexVar6;
                                    } else {
                                        aexVar5 = aexVar4;
                                        z2 = z8;
                                    }
                                    i7++;
                                    z8 = z2;
                                    aexVar4 = aexVar5;
                                }
                                if (z8 && aexVar4 != null) {
                                    aewVar3.f6554a = (aex[]) C1297a.m7248a(aewVar3.f6554a, aexVar4);
                                    z = z5;
                                } else if (aexVar4 != null) {
                                    aexVar4.f6560a = "_err";
                                    aexVar4.f6562c = 10L;
                                    z = z5;
                                } else {
                                    m7540f().m7410y().m7413a("Did not find conversion parameter. appId", aac.m7397a(c1356a.f6261a.f6590o));
                                    z = z5;
                                }
                                aezVar2.f6577b[i3] = c1356a.f6263c.get(i4);
                                i2 = i3 + 1;
                                z4 = z;
                            } else {
                                z = z5;
                                aezVar2.f6577b[i3] = c1356a.f6263c.get(i4);
                                i2 = i3 + 1;
                                z4 = z;
                            }
                        }
                    }
                }
                i4++;
                i3 = i2;
                z5 = z4;
            }
            if (i3 < c1356a.f6263c.size()) {
                aezVar2.f6577b = (aew[]) Arrays.copyOf(aezVar2.f6577b, i3);
            }
            aezVar2.f6567A = m7506a(c1356a.f6261a.f6590o, c1356a.f6261a.f6578c, aezVar2.f6577b);
            if (C2106zs.f12710b.m12779b().booleanValue()) {
                if ("1".equals(this.f6237c.mo7390q().m7459a(c1356a.f6261a.f6590o, "measurement.event_sampling_enabled"))) {
                    HashMap map = new HashMap();
                    aew[] aewVarArr = new aew[aezVar2.f6577b.length];
                    int i8 = 0;
                    SecureRandom secureRandomM7773z = m7549o().m7773z();
                    aew[] aewVarArr2 = aezVar2.f6577b;
                    int length3 = aewVarArr2.length;
                    int i9 = 0;
                    while (i9 < length3) {
                        aew aewVar4 = aewVarArr2[i9];
                        if (aewVar4.f6555b.equals("_ep")) {
                            m7549o();
                            String str8 = (String) aek.m7715a(aewVar4, "_en");
                            C2099zl c2099zlM12720a = (C2099zl) map.get(str8);
                            if (c2099zlM12720a == null) {
                                c2099zlM12720a = m7551q().m12720a(c1356a.f6261a.f6590o, str8);
                                map.put(str8, c2099zlM12720a);
                            }
                            if (c2099zlM12720a.f12683g == null) {
                                if (c2099zlM12720a.f12684h.longValue() > 1) {
                                    m7549o();
                                    aewVar4.f6554a = aek.m7732a(aewVar4.f6554a, "_sr", c2099zlM12720a.f12684h);
                                }
                                if (c2099zlM12720a.f12685i != null && c2099zlM12720a.f12685i.booleanValue()) {
                                    m7549o();
                                    aewVar4.f6554a = aek.m7732a(aewVar4.f6554a, "_efs", (Object) 1L);
                                }
                                i = i8 + 1;
                                aewVarArr[i8] = aewVar4;
                            } else {
                                i = i8;
                            }
                        } else {
                            int iM7465d = !m7503a(aewVar4, "_dbg", (Object) 1L) ? m7544j().m7465d(c1356a.f6261a.f6590o, aewVar4.f6555b) : 1;
                            if (iM7465d <= 0) {
                                m7540f().m7401A().m7414a("Sample rate must be positive. event, rate", aewVar4.f6555b, Integer.valueOf(iM7465d));
                                i = i8 + 1;
                                aewVarArr[i8] = aewVar4;
                            } else {
                                C2099zl c2099zl = (C2099zl) map.get(aewVar4.f6555b);
                                if (c2099zl == null) {
                                    c2099zlM12764a = m7551q().m12720a(c1356a.f6261a.f6590o, aewVar4.f6555b);
                                    if (c2099zlM12764a == null) {
                                        m7540f().m7401A().m7414a("Event being bundled has no eventAggregate. appId, eventName", c1356a.f6261a.f6590o, aewVar4.f6555b);
                                        c2099zlM12764a = new C2099zl(c1356a.f6261a.f6590o, aewVar4.f6555b, 1L, 1L, aewVar4.f6556c.longValue(), 0L, null, null, null);
                                    }
                                } else {
                                    c2099zlM12764a = c2099zl;
                                }
                                m7549o();
                                Long l = (Long) aek.m7715a(aewVar4, "_eid");
                                Boolean boolValueOf = Boolean.valueOf(l != null);
                                if (iM7465d == 1) {
                                    i = i8 + 1;
                                    aewVarArr[i8] = aewVar4;
                                    if (boolValueOf.booleanValue() && (c2099zlM12764a.f12683g != null || c2099zlM12764a.f12684h != null || c2099zlM12764a.f12685i != null)) {
                                        map.put(aewVar4.f6555b, c2099zlM12764a.m12764a(null, null, null));
                                    }
                                } else if (secureRandomM7773z.nextInt(iM7465d) == 0) {
                                    m7549o();
                                    aewVar4.f6554a = aek.m7732a(aewVar4.f6554a, "_sr", Long.valueOf(iM7465d));
                                    i = i8 + 1;
                                    aewVarArr[i8] = aewVar4;
                                    if (boolValueOf.booleanValue()) {
                                        c2099zlM12764a = c2099zlM12764a.m12764a(null, Long.valueOf(iM7465d), null);
                                    }
                                    map.put(aewVar4.f6555b, c2099zlM12764a.m12765b(aewVar4.f6556c.longValue()));
                                } else if (Math.abs(aewVar4.f6556c.longValue() - c2099zlM12764a.f12682f) >= 86400000) {
                                    m7549o();
                                    aewVar4.f6554a = aek.m7732a(aewVar4.f6554a, "_efs", (Object) 1L);
                                    m7549o();
                                    aewVar4.f6554a = aek.m7732a(aewVar4.f6554a, "_sr", Long.valueOf(iM7465d));
                                    i = i8 + 1;
                                    aewVarArr[i8] = aewVar4;
                                    if (boolValueOf.booleanValue()) {
                                        c2099zlM12764a = c2099zlM12764a.m12764a(null, Long.valueOf(iM7465d), true);
                                    }
                                    map.put(aewVar4.f6555b, c2099zlM12764a.m12765b(aewVar4.f6556c.longValue()));
                                } else {
                                    if (boolValueOf.booleanValue()) {
                                        map.put(aewVar4.f6555b, c2099zlM12764a.m12764a(l, null, null));
                                    }
                                    i = i8;
                                }
                            }
                        }
                        i9++;
                        i8 = i;
                    }
                    if (i8 < aezVar2.f6577b.length) {
                        aezVar2.f6577b = (aew[]) Arrays.copyOf(aewVarArr, i8);
                    }
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        m7551q().m12727a((C2099zl) ((Map.Entry) it.next()).getValue());
                    }
                }
            }
            aezVar2.f6580e = Long.MAX_VALUE;
            aezVar2.f6581f = Long.MIN_VALUE;
            for (int i10 = 0; i10 < aezVar2.f6577b.length; i10++) {
                aew aewVar5 = aezVar2.f6577b[i10];
                if (aewVar5.f6556c.longValue() < aezVar2.f6580e.longValue()) {
                    aezVar2.f6580e = aewVar5.f6556c;
                }
                if (aewVar5.f6556c.longValue() > aezVar2.f6581f.longValue()) {
                    aezVar2.f6581f = aewVar5.f6556c;
                }
            }
            String str9 = c1356a.f6261a.f6590o;
            C2083yw c2083ywM12734b = m7551q().m12734b(str9);
            if (c2083ywM12734b == null) {
                m7540f().m7410y().m7413a("Bundling raw events w/o app info. appId", aac.m7397a(c1356a.f6261a.f6590o));
            } else if (aezVar2.f6577b.length > 0) {
                long jM12642h = c2083ywM12734b.m12642h();
                aezVar2.f6583h = jM12642h != 0 ? Long.valueOf(jM12642h) : null;
                long jM12639g = c2083ywM12734b.m12639g();
                if (jM12639g != 0) {
                    jM12642h = jM12639g;
                }
                aezVar2.f6582g = jM12642h != 0 ? Long.valueOf(jM12642h) : null;
                c2083ywM12734b.m12660r();
                aezVar2.f6598w = Integer.valueOf((int) c2083ywM12734b.m12656o());
                c2083ywM12734b.m12620a(aezVar2.f6580e.longValue());
                c2083ywM12734b.m12624b(aezVar2.f6581f.longValue());
                aezVar2.f6599x = c2083ywM12734b.m12668z();
                m7551q().m12726a(c2083ywM12734b);
            }
            if (aezVar2.f6577b.length > 0) {
                aes aesVarM7458a = m7544j().m7458a(c1356a.f6261a.f6590o);
                if (aesVarM7458a != null && aesVarM7458a.f6538a != null) {
                    aezVar2.f6571E = aesVarM7458a.f6538a;
                } else if (TextUtils.isEmpty(c1356a.f6261a.f6600y)) {
                    aezVar2.f6571E = -1L;
                } else {
                    m7540f().m7401A().m7413a("Did not find measurement config or missing version info. appId", aac.m7397a(c1356a.f6261a.f6590o));
                }
                m7551q().m12731a(aezVar2, z5);
            }
            m7551q().m12729a(c1356a.f6262b);
            C2091zd c2091zdM7551q2 = m7551q();
            try {
                c2091zdM7551q2.m12709A().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str9, str9});
            } catch (SQLiteException e6) {
                c2091zdM7551q2.mo7393t().m7410y().m7414a("Failed to remove unused event metadata. appId", aac.m7397a(str9), e6);
            }
            m7551q().m12748y();
            m7551q().m12749z();
            return true;
        } catch (Throwable th3) {
            m7551q().m12749z();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7505a(String str, C2104zq c2104zq) {
        long jLongValue;
        aej aejVar;
        String strM12772d = c2104zq.f12691b.m12772d("currency");
        if ("ecommerce_purchase".equals(c2104zq.f12690a)) {
            double dDoubleValue = c2104zq.f12691b.m12771c("value").doubleValue() * 1000000.0d;
            if (dDoubleValue == 0.0d) {
                dDoubleValue = c2104zq.f12691b.m12770b("value").longValue() * 1000000.0d;
            }
            if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                m7540f().m7401A().m7414a("Data lost. Currency value is too big. appId", aac.m7397a(str), Double.valueOf(dDoubleValue));
                return false;
            }
            jLongValue = Math.round(dDoubleValue);
        } else {
            jLongValue = c2104zq.f12691b.m12770b("value").longValue();
        }
        if (!TextUtils.isEmpty(strM12772d)) {
            String upperCase = strM12772d.toUpperCase(Locale.US);
            if (upperCase.matches("[A-Z]{3}")) {
                String strValueOf = String.valueOf("_ltv_");
                String strValueOf2 = String.valueOf(upperCase);
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                aej aejVarM12738c = m7551q().m12738c(str, strConcat);
                if (aejVarM12738c == null || !(aejVarM12738c.f6500e instanceof Long)) {
                    C2091zd c2091zdM7551q = m7551q();
                    int iM12684b = this.f6237c.m12684b(str, C2106zs.f12700G) - 1;
                    C1221aj.m7067a(str);
                    c2091zdM7551q.mo7376c();
                    c2091zdM7551q.m7584Q();
                    try {
                        c2091zdM7551q.m12709A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(iM12684b)});
                    } catch (SQLiteException e) {
                        c2091zdM7551q.mo7393t().m7410y().m7414a("Error pruning currencies. appId", aac.m7397a(str), e);
                    }
                    aejVar = new aej(str, c2104zq.f12692c, strConcat, this.f6250p.mo7252a(), Long.valueOf(jLongValue));
                } else {
                    aejVar = new aej(str, c2104zq.f12692c, strConcat, this.f6250p.mo7252a(), Long.valueOf(jLongValue + ((Long) aejVarM12738c.f6500e).longValue()));
                }
                if (!m7551q().m12730a(aejVar)) {
                    m7540f().m7410y().m7415a("Too many unique user properties are set. Ignoring user property. appId", aac.m7397a(str), m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                    m7549o().m7755a(str, 9, (String) null, (String) null, 0);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private final aev[] m7506a(String str, afb[] afbVarArr, aew[] aewVarArr) {
        C1221aj.m7067a(str);
        return m7560z().m12677a(str, aewVarArr, afbVarArr);
    }

    /* JADX INFO: renamed from: b */
    private final C2084yx m7507b(String str) {
        C2083yw c2083ywM12734b = m7551q().m12734b(str);
        if (c2083ywM12734b == null || TextUtils.isEmpty(c2083ywM12734b.m12644i())) {
            m7540f().m7404D().m7413a("No app data available; dropping", str);
            return null;
        }
        try {
            String str2 = C2040xg.m12562a(this.f6236b).m12560b(str, 0).versionName;
            if (c2083ywM12734b.m12644i() != null && !c2083ywM12734b.m12644i().equals(str2)) {
                m7540f().m7401A().m7413a("App version does not match; dropping. appId", aac.m7397a(str));
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return new C2084yx(str, c2083ywM12734b.m12630d(), c2083ywM12734b.m12644i(), c2083ywM12734b.m12646j(), c2083ywM12734b.m12648k(), c2083ywM12734b.m12650l(), c2083ywM12734b.m12652m(), (String) null, c2083ywM12734b.m12655n(), false, c2083ywM12734b.m12636f(), c2083ywM12734b.m12617A(), 0L, 0, c2083ywM12734b.m12618B());
    }

    /* JADX INFO: renamed from: b */
    private static void m7508b(acd acdVar) {
        if (acdVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!acdVar.m7583P()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x05ca A[Catch: all -> 0x0576, TryCatch #0 {all -> 0x0576, blocks: (B:30:0x0109, B:32:0x011c, B:38:0x0142, B:40:0x017a, B:42:0x0183, B:43:0x019a, B:46:0x01ac, B:48:0x01c2, B:50:0x01cb, B:51:0x01e2, B:54:0x0204, B:58:0x022e, B:59:0x0245, B:61:0x0255, B:63:0x0276, B:64:0x0298, B:66:0x02a6, B:67:0x02bb, B:69:0x02df, B:72:0x02ef, B:74:0x0325, B:75:0x033e, B:78:0x0395, B:81:0x03b2, B:83:0x03c2, B:85:0x03cc, B:87:0x03d2, B:88:0x03de, B:90:0x0429, B:92:0x042f, B:93:0x0435, B:95:0x0443, B:96:0x04bd, B:97:0x04df, B:99:0x04e5, B:117:0x0599, B:118:0x05a1, B:120:0x05a9, B:121:0x05af, B:123:0x05b5, B:126:0x05c4, B:128:0x05ca, B:129:0x05d0, B:131:0x05e2, B:135:0x0637, B:137:0x0658, B:134:0x0623, B:103:0x053f, B:105:0x054d, B:107:0x055d, B:108:0x0572, B:113:0x057f, B:115:0x0585, B:102:0x0535, B:101:0x052a, B:100:0x0519, B:34:0x0128, B:36:0x0132), top: B:142:0x0109, inners: #1 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m7509b(C2104zq c2104zq, C2084yx c2084yx) {
        C2099zl c2099zlM12763a;
        C2098zk c2098zk;
        boolean z;
        C2083yw c2083ywM12734b;
        C1221aj.m7065a(c2084yx);
        C1221aj.m7067a(c2084yx.f12574a);
        long jNanoTime = System.nanoTime();
        m7542h().mo7376c();
        m7518a();
        String str = c2084yx.f12574a;
        m7549o();
        if (aek.m7722a(c2104zq, c2084yx)) {
            if (!c2084yx.f12581h) {
                m7510d(c2084yx);
                return;
            }
            if (m7544j().m7462b(str, c2104zq.f12690a)) {
                m7540f().m7401A().m7414a("Dropping blacklisted event. appId", aac.m7397a(str), m7550p().m7371a(c2104zq.f12690a));
                boolean z2 = m7549o().m7770l(str) || m7549o().m7771m(str);
                if (!z2 && !"_err".equals(c2104zq.f12690a)) {
                    m7549o().m7755a(str, 11, "_ev", c2104zq.f12690a, 0);
                }
                if (!z2 || (c2083ywM12734b = m7551q().m12734b(str)) == null) {
                    return;
                }
                if (Math.abs(this.f6250p.mo7252a() - Math.max(c2083ywM12734b.m12659q(), c2083ywM12734b.m12658p())) > C2106zs.f12695B.m12779b().longValue()) {
                    m7540f().m7404D().m7412a("Fetching config for blacklisted app");
                    m7501a(c2083ywM12734b);
                    return;
                }
                return;
            }
            if (m7540f().m7409a(2)) {
                m7540f().m7405E().m7413a("Logging event", m7550p().m7370a(c2104zq));
            }
            m7551q().m12747x();
            try {
                m7510d(c2084yx);
                if (("_iap".equals(c2104zq.f12690a) || "ecommerce_purchase".equals(c2104zq.f12690a)) && !m7505a(str, c2104zq)) {
                    m7551q().m12748y();
                    return;
                }
                boolean zM7723a = aek.m7723a(c2104zq.f12690a);
                boolean zEquals = "_err".equals(c2104zq.f12690a);
                C2092ze c2092zeM12719a = m7551q().m12719a(m7491L(), str, true, zM7723a, false, zEquals, false);
                long jIntValue = c2092zeM12719a.f12657b - ((long) C2106zs.f12721m.m12779b().intValue());
                if (jIntValue > 0) {
                    if (jIntValue % 1000 == 1) {
                        m7540f().m7410y().m7414a("Data loss. Too many events logged. appId, count", aac.m7397a(str), Long.valueOf(c2092zeM12719a.f12657b));
                    }
                    m7551q().m12748y();
                    return;
                }
                if (zM7723a) {
                    long jIntValue2 = c2092zeM12719a.f12656a - ((long) C2106zs.f12723o.m12779b().intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            m7540f().m7410y().m7414a("Data loss. Too many public events logged. appId, count", aac.m7397a(str), Long.valueOf(c2092zeM12719a.f12656a));
                        }
                        m7549o().m7755a(str, 16, "_ev", c2104zq.f12690a, 0);
                        m7551q().m12748y();
                        return;
                    }
                }
                if (zEquals) {
                    long jMax = c2092zeM12719a.f12659d - ((long) Math.max(0, Math.min(1000000, this.f6237c.m12684b(c2084yx.f12574a, C2106zs.f12722n))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            m7540f().m7410y().m7414a("Too many error events logged. appId, count", aac.m7397a(str), Long.valueOf(c2092zeM12719a.f12659d));
                        }
                        m7551q().m12748y();
                        return;
                    }
                }
                Bundle bundleM12769b = c2104zq.f12691b.m12769b();
                m7549o().m7752a(bundleM12769b, "_o", c2104zq.f12692c);
                if (m7549o().m7769j(str)) {
                    m7549o().m7752a(bundleM12769b, "_dbg", (Object) 1L);
                    m7549o().m7752a(bundleM12769b, "_r", (Object) 1L);
                }
                long jM12737c = m7551q().m12737c(str);
                if (jM12737c > 0) {
                    m7540f().m7401A().m7414a("Data lost. Too many events stored on disk, deleted. appId", aac.m7397a(str), Long.valueOf(jM12737c));
                }
                C2098zk c2098zk2 = new C2098zk(this, c2104zq.f12692c, str, c2104zq.f12690a, c2104zq.f12693d, 0L, bundleM12769b);
                C2099zl c2099zlM12720a = m7551q().m12720a(str, c2098zk2.f12672b);
                if (c2099zlM12720a != null) {
                    C2098zk c2098zkM12761a = c2098zk2.m12761a(this, c2099zlM12720a.f12681e);
                    c2099zlM12763a = c2099zlM12720a.m12763a(c2098zkM12761a.f12673c);
                    c2098zk = c2098zkM12761a;
                } else if (m7551q().m12743f(str) >= 500 && zM7723a) {
                    m7540f().m7410y().m7415a("Too many event names used, ignoring event. appId, name, supported count", aac.m7397a(str), m7550p().m7371a(c2098zk2.f12672b), 500);
                    m7549o().m7755a(str, 8, (String) null, (String) null, 0);
                    return;
                } else {
                    c2099zlM12763a = new C2099zl(str, c2098zk2.f12672b, 0L, 0L, c2098zk2.f12673c, 0L, null, null, null);
                    c2098zk = c2098zk2;
                }
                m7551q().m12727a(c2099zlM12763a);
                m7542h().mo7376c();
                m7518a();
                C1221aj.m7065a(c2098zk);
                C1221aj.m7065a(c2084yx);
                C1221aj.m7067a(c2098zk.f12671a);
                C1221aj.m7074b(c2098zk.f12671a.equals(c2084yx.f12574a));
                aez aezVar = new aez();
                aezVar.f6576a = 1;
                aezVar.f6584i = "android";
                aezVar.f6590o = c2084yx.f12574a;
                aezVar.f6589n = c2084yx.f12577d;
                aezVar.f6591p = c2084yx.f12576c;
                aezVar.f6569C = c2084yx.f12583j == -2147483648L ? null : Integer.valueOf((int) c2084yx.f12583j);
                aezVar.f6592q = Long.valueOf(c2084yx.f12578e);
                aezVar.f6600y = c2084yx.f12575b;
                aezVar.f6597v = c2084yx.f12579f == 0 ? null : Long.valueOf(c2084yx.f12579f);
                Pair<String, Boolean> pairM7429a = m7539e().m7429a(c2084yx.f12574a);
                if (pairM7429a == null || TextUtils.isEmpty((CharSequence) pairM7429a.first)) {
                    if (!m7558x().m12757a(this.f6236b)) {
                        String string = Settings.Secure.getString(this.f6236b.getContentResolver(), "android_id");
                        if (string == null) {
                            m7540f().m7401A().m7413a("null secure ID. appId", aac.m7397a(aezVar.f6590o));
                            string = "null";
                        } else if (string.isEmpty()) {
                            m7540f().m7401A().m7413a("empty secure ID. appId", aac.m7397a(aezVar.f6590o));
                        }
                        aezVar.f6570D = string;
                    }
                } else if (c2084yx.f12588o) {
                    aezVar.f6594s = (String) pairM7429a.first;
                    aezVar.f6595t = (Boolean) pairM7429a.second;
                }
                m7558x().m7584Q();
                aezVar.f6586k = Build.MODEL;
                m7558x().m7584Q();
                aezVar.f6585j = Build.VERSION.RELEASE;
                aezVar.f6588m = Integer.valueOf((int) m7558x().m12758x());
                aezVar.f6587l = m7558x().m12759y();
                aezVar.f6593r = null;
                aezVar.f6579d = null;
                aezVar.f6580e = null;
                aezVar.f6581f = null;
                aezVar.f6572F = Long.valueOf(c2084yx.f12585l);
                if (m7512B() && C2090zc.m12678B()) {
                    m7559y();
                    aezVar.f6573G = null;
                }
                C2083yw c2083ywM12734b2 = m7551q().m12734b(c2084yx.f12574a);
                if (c2083ywM12734b2 == null) {
                    c2083ywM12734b2 = new C2083yw(this, c2084yx.f12574a);
                    c2083ywM12734b2.m12621a(m7559y().m12785y());
                    c2083ywM12734b2.m12632d(c2084yx.f12584k);
                    c2083ywM12734b2.m12625b(c2084yx.f12575b);
                    c2083ywM12734b2.m12629c(m7539e().m7431b(c2084yx.f12574a));
                    c2083ywM12734b2.m12637f(0L);
                    c2083ywM12734b2.m12620a(0L);
                    c2083ywM12734b2.m12624b(0L);
                    c2083ywM12734b2.m12635e(c2084yx.f12576c);
                    c2083ywM12734b2.m12628c(c2084yx.f12583j);
                    c2083ywM12734b2.m12638f(c2084yx.f12577d);
                    c2083ywM12734b2.m12631d(c2084yx.f12578e);
                    c2083ywM12734b2.m12634e(c2084yx.f12579f);
                    c2083ywM12734b2.m12622a(c2084yx.f12581h);
                    c2083ywM12734b2.m12657o(c2084yx.f12585l);
                    m7551q().m12726a(c2083ywM12734b2);
                }
                aezVar.f6596u = c2083ywM12734b2.m12627c();
                aezVar.f6568B = c2083ywM12734b2.m12636f();
                List<aej> listM12722a = m7551q().m12722a(c2084yx.f12574a);
                aezVar.f6578c = new afb[listM12722a.size()];
                for (int i = 0; i < listM12722a.size(); i++) {
                    afb afbVar = new afb();
                    aezVar.f6578c[i] = afbVar;
                    afbVar.f6606b = listM12722a.get(i).f6498c;
                    afbVar.f6605a = Long.valueOf(listM12722a.get(i).f6499d);
                    m7549o().m7754a(afbVar, listM12722a.get(i).f6500e);
                }
                try {
                    long jM12718a = m7551q().m12718a(aezVar);
                    C2091zd c2091zdM7551q = m7551q();
                    if (c2098zk.f12675e != null) {
                        Iterator<String> it = c2098zk.f12675e.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if ("_r".equals(it.next())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                boolean zM7464c = m7544j().m7464c(c2098zk.f12671a, c2098zk.f12672b);
                                C2092ze c2092zeM12719a2 = m7551q().m12719a(m7491L(), c2098zk.f12671a, false, false, false, false, false);
                                if (zM7464c && c2092zeM12719a2.f12660e < this.f6237c.m12682a(c2098zk.f12671a)) {
                                    z = true;
                                }
                            }
                        }
                        if (c2091zdM7551q.m12733a(c2098zk, jM12718a, z)) {
                            this.f6231K = 0L;
                        }
                    } else {
                        z = false;
                        if (c2091zdM7551q.m12733a(c2098zk, jM12718a, z)) {
                        }
                    }
                } catch (IOException e) {
                    m7540f().m7410y().m7414a("Data loss. Failed to insert raw event metadata. appId", aac.m7397a(aezVar.f6590o), e);
                }
                m7551q().m12748y();
                if (m7540f().m7409a(2)) {
                    m7540f().m7405E().m7413a("Event recorded", m7550p().m7369a(c2098zk));
                }
                m7551q().m12749z();
                m7493N();
                m7540f().m7405E().m7413a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
            } finally {
                m7551q().m12749z();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m7510d(C2084yx c2084yx) {
        boolean z = true;
        m7542h().mo7376c();
        m7518a();
        C1221aj.m7065a(c2084yx);
        C1221aj.m7067a(c2084yx.f12574a);
        C2083yw c2083ywM12734b = m7551q().m12734b(c2084yx.f12574a);
        String strM7431b = m7539e().m7431b(c2084yx.f12574a);
        boolean z2 = false;
        if (c2083ywM12734b == null) {
            C2083yw c2083yw = new C2083yw(this, c2084yx.f12574a);
            c2083yw.m12621a(m7559y().m12785y());
            c2083yw.m12629c(strM7431b);
            c2083ywM12734b = c2083yw;
            z2 = true;
        } else if (!strM7431b.equals(c2083ywM12734b.m12633e())) {
            c2083ywM12734b.m12629c(strM7431b);
            c2083ywM12734b.m12621a(m7559y().m12785y());
            z2 = true;
        }
        if (!TextUtils.isEmpty(c2084yx.f12575b) && !c2084yx.f12575b.equals(c2083ywM12734b.m12630d())) {
            c2083ywM12734b.m12625b(c2084yx.f12575b);
            z2 = true;
        }
        if (!TextUtils.isEmpty(c2084yx.f12584k) && !c2084yx.f12584k.equals(c2083ywM12734b.m12636f())) {
            c2083ywM12734b.m12632d(c2084yx.f12584k);
            z2 = true;
        }
        if (c2084yx.f12578e != 0 && c2084yx.f12578e != c2083ywM12734b.m12650l()) {
            c2083ywM12734b.m12631d(c2084yx.f12578e);
            z2 = true;
        }
        if (!TextUtils.isEmpty(c2084yx.f12576c) && !c2084yx.f12576c.equals(c2083ywM12734b.m12644i())) {
            c2083ywM12734b.m12635e(c2084yx.f12576c);
            z2 = true;
        }
        if (c2084yx.f12583j != c2083ywM12734b.m12646j()) {
            c2083ywM12734b.m12628c(c2084yx.f12583j);
            z2 = true;
        }
        if (c2084yx.f12577d != null && !c2084yx.f12577d.equals(c2083ywM12734b.m12648k())) {
            c2083ywM12734b.m12638f(c2084yx.f12577d);
            z2 = true;
        }
        if (c2084yx.f12579f != c2083ywM12734b.m12652m()) {
            c2083ywM12734b.m12634e(c2084yx.f12579f);
            z2 = true;
        }
        if (c2084yx.f12581h != c2083ywM12734b.m12655n()) {
            c2083ywM12734b.m12622a(c2084yx.f12581h);
            z2 = true;
        }
        if (!TextUtils.isEmpty(c2084yx.f12580g) && !c2084yx.f12580g.equals(c2083ywM12734b.m12667y())) {
            c2083ywM12734b.m12641g(c2084yx.f12580g);
            z2 = true;
        }
        if (c2084yx.f12585l != c2083ywM12734b.m12617A()) {
            c2083ywM12734b.m12657o(c2084yx.f12585l);
            z2 = true;
        }
        if (c2084yx.f12588o != c2083ywM12734b.m12618B()) {
            c2083ywM12734b.m12626b(c2084yx.f12588o);
        } else {
            z = z2;
        }
        if (z) {
            m7551q().m12726a(c2083ywM12734b);
        }
    }

    /* JADX INFO: renamed from: A */
    public final C2079ys m7511A() {
        m7500a(this.f6259y);
        return this.f6259y;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7512B() {
        boolean zBooleanValue = false;
        m7542h().mo7376c();
        m7518a();
        if (this.f6237c.m12688x()) {
            return false;
        }
        Boolean boolM12685b = this.f6237c.m12685b("firebase_analytics_collection_enabled");
        if (boolM12685b != null) {
            zBooleanValue = boolM12685b.booleanValue();
        } else if (!C1111az.m6850b()) {
            zBooleanValue = true;
        }
        return m7539e().m7434c(zBooleanValue);
    }

    /* JADX INFO: renamed from: C */
    final long m7513C() {
        Long lValueOf = Long.valueOf(m7539e().f6147h.m7442a());
        return lValueOf.longValue() == 0 ? this.f6235O : Math.min(this.f6235O, lValueOf.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x018d A[Catch: all -> 0x029b, TryCatch #1 {all -> 0x029b, blocks: (B:3:0x000d, B:5:0x0017, B:8:0x002b, B:10:0x0031, B:12:0x0045, B:14:0x004d, B:16:0x0057, B:20:0x0065, B:23:0x007b, B:25:0x0085, B:27:0x009c, B:29:0x00bc, B:30:0x00d3, B:32:0x00e1, B:34:0x00e9, B:35:0x00f3, B:37:0x0116, B:38:0x011b, B:40:0x0121, B:42:0x0133, B:45:0x013a, B:47:0x0140, B:49:0x0152, B:51:0x015a, B:52:0x0160, B:54:0x017c, B:58:0x0188, B:60:0x018d, B:62:0x01cb, B:63:0x01d2, B:66:0x01de, B:68:0x01ea, B:69:0x01f3, B:70:0x0205, B:73:0x0211, B:75:0x0218, B:76:0x0225, B:78:0x0235, B:79:0x023c, B:82:0x0280, B:85:0x0289, B:64:0x01d6, B:91:0x02a5, B:93:0x02bb, B:95:0x02c5), top: B:102:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea A[Catch: all -> 0x029b, TryCatch #1 {all -> 0x029b, blocks: (B:3:0x000d, B:5:0x0017, B:8:0x002b, B:10:0x0031, B:12:0x0045, B:14:0x004d, B:16:0x0057, B:20:0x0065, B:23:0x007b, B:25:0x0085, B:27:0x009c, B:29:0x00bc, B:30:0x00d3, B:32:0x00e1, B:34:0x00e9, B:35:0x00f3, B:37:0x0116, B:38:0x011b, B:40:0x0121, B:42:0x0133, B:45:0x013a, B:47:0x0140, B:49:0x0152, B:51:0x015a, B:52:0x0160, B:54:0x017c, B:58:0x0188, B:60:0x018d, B:62:0x01cb, B:63:0x01d2, B:66:0x01de, B:68:0x01ea, B:69:0x01f3, B:70:0x0205, B:73:0x0211, B:75:0x0218, B:76:0x0225, B:78:0x0235, B:79:0x023c, B:82:0x0280, B:85:0x0289, B:64:0x01d6, B:91:0x02a5, B:93:0x02bb, B:95:0x02c5), top: B:102:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218 A[Catch: MalformedURLException -> 0x0288, all -> 0x029b, TryCatch #0 {MalformedURLException -> 0x0288, blocks: (B:70:0x0205, B:73:0x0211, B:75:0x0218, B:76:0x0225, B:78:0x0235, B:79:0x023c, B:82:0x0280), top: B:100:0x0205, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235 A[Catch: MalformedURLException -> 0x0288, all -> 0x029b, TryCatch #0 {MalformedURLException -> 0x0288, blocks: (B:70:0x0205, B:73:0x0211, B:75:0x0218, B:76:0x0225, B:78:0x0235, B:79:0x023c, B:82:0x0280), top: B:100:0x0205, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0280 A[Catch: MalformedURLException -> 0x0288, all -> 0x029b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {MalformedURLException -> 0x0288, blocks: (B:70:0x0205, B:73:0x0211, B:75:0x0218, B:76:0x0225, B:78:0x0235, B:79:0x023c, B:82:0x0280), top: B:100:0x0205, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c9  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7514E() {
        C2083yw c2083ywM12734b;
        String str;
        List<Pair<aez, Long>> listSubList;
        aey aeyVar;
        ArrayList arrayList;
        int i;
        String strM7368a;
        String strM12779b;
        m7542h().mo7376c();
        m7518a();
        this.f6234N = true;
        try {
            Boolean boolM7660D = m7557w().m7660D();
            if (boolM7660D == null) {
                m7540f().m7401A().m7412a("Upload data called on the client side before use of service was decided");
                return;
            }
            if (boolM7660D.booleanValue()) {
                m7540f().m7410y().m7412a("Upload called in the client side when service should be used");
                return;
            }
            if (this.f6231K > 0) {
                m7493N();
                return;
            }
            m7542h().mo7376c();
            if (this.f6226F != null) {
                m7540f().m7405E().m7412a("Uploading requested multiple times");
                return;
            }
            if (!m7553s().m7419y()) {
                m7540f().m7405E().m7412a("Network not connected, ignoring upload request");
                m7493N();
                return;
            }
            long jMo7252a = this.f6250p.mo7252a();
            m7504a((String) null, jMo7252a - C2090zc.m12680z());
            long jM7442a = m7539e().f6142c.m7442a();
            if (jM7442a != 0) {
                m7540f().m7404D().m7413a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jMo7252a - jM7442a)));
            }
            String strM12710B = m7551q().m12710B();
            if (TextUtils.isEmpty(strM12710B)) {
                this.f6230J = -1L;
                String strM12721a = m7551q().m12721a(jMo7252a - C2090zc.m12680z());
                if (!TextUtils.isEmpty(strM12721a) && (c2083ywM12734b = m7551q().m12734b(strM12721a)) != null) {
                    m7501a(c2083ywM12734b);
                }
            } else {
                if (this.f6230J == -1) {
                    this.f6230J = m7551q().m12717I();
                }
                List<Pair<aez, Long>> listM12723a = m7551q().m12723a(strM12710B, this.f6237c.m12684b(strM12710B, C2106zs.f12717i), Math.max(0, this.f6237c.m12684b(strM12710B, C2106zs.f12718j)));
                if (!listM12723a.isEmpty()) {
                    Iterator<Pair<aez, Long>> it = listM12723a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        aez aezVar = (aez) it.next().first;
                        if (!TextUtils.isEmpty(aezVar.f6594s)) {
                            str = aezVar.f6594s;
                            break;
                        }
                    }
                    if (str != null) {
                        for (int i2 = 0; i2 < listM12723a.size(); i2++) {
                            aez aezVar2 = (aez) listM12723a.get(i2).first;
                            if (!TextUtils.isEmpty(aezVar2.f6594s) && !aezVar2.f6594s.equals(str)) {
                                listSubList = listM12723a.subList(0, i2);
                                break;
                            }
                        }
                        listSubList = listM12723a;
                        aeyVar = new aey();
                        aeyVar.f6565a = new aez[listSubList.size()];
                        arrayList = new ArrayList(listSubList.size());
                        boolean z = !C2090zc.m12678B() && this.f6237c.m12686c(strM12710B);
                        for (i = 0; i < aeyVar.f6565a.length; i++) {
                            aeyVar.f6565a[i] = (aez) listSubList.get(i).first;
                            arrayList.add((Long) listSubList.get(i).second);
                            aeyVar.f6565a[i].f6593r = 11910L;
                            aeyVar.f6565a[i].f6579d = Long.valueOf(jMo7252a);
                            aeyVar.f6565a[i].f6601z = false;
                            if (!z) {
                                aeyVar.f6565a[i].f6573G = null;
                            }
                        }
                        strM7368a = !m7540f().m7409a(2) ? m7550p().m7368a(aeyVar) : null;
                        byte[] bArrM7757a = m7549o().m7757a(aeyVar);
                        strM12779b = C2106zs.f12727s.m12779b();
                        try {
                            URL url = new URL(strM12779b);
                            C1221aj.m7074b(arrayList.isEmpty());
                            if (this.f6226F == null) {
                                m7540f().m7410y().m7412a("Set uploading progress before finishing the previous upload");
                            } else {
                                this.f6226F = new ArrayList(arrayList);
                            }
                            m7539e().f6143d.m7443a(jMo7252a);
                            m7540f().m7405E().m7415a("Uploading data. app, uncompressed size, data", aeyVar.f6565a.length > 0 ? aeyVar.f6565a[0].f6590o : "?", Integer.valueOf(bArrM7757a.length), strM7368a);
                            this.f6233M = true;
                            aag aagVarM7553s = m7553s();
                            abg abgVar = new abg(this);
                            aagVarM7553s.mo7376c();
                            aagVarM7553s.m7584Q();
                            C1221aj.m7065a(url);
                            C1221aj.m7065a(bArrM7757a);
                            C1221aj.m7065a(abgVar);
                            aagVarM7553s.mo7392s().m7481b(new aak(aagVarM7553s, strM12710B, url, bArrM7757a, null, abgVar));
                        } catch (MalformedURLException e) {
                            m7540f().m7410y().m7414a("Failed to parse upload URL. Not uploading. appId", aac.m7397a(strM12710B), strM12779b);
                        }
                    } else {
                        listSubList = listM12723a;
                        aeyVar = new aey();
                        aeyVar.f6565a = new aez[listSubList.size()];
                        arrayList = new ArrayList(listSubList.size());
                        if (C2090zc.m12678B()) {
                            while (i < aeyVar.f6565a.length) {
                            }
                            if (!m7540f().m7409a(2)) {
                            }
                            byte[] bArrM7757a2 = m7549o().m7757a(aeyVar);
                            strM12779b = C2106zs.f12727s.m12779b();
                            URL url2 = new URL(strM12779b);
                            C1221aj.m7074b(arrayList.isEmpty());
                            if (this.f6226F == null) {
                            }
                            m7539e().f6143d.m7443a(jMo7252a);
                            m7540f().m7405E().m7415a("Uploading data. app, uncompressed size, data", aeyVar.f6565a.length > 0 ? aeyVar.f6565a[0].f6590o : "?", Integer.valueOf(bArrM7757a2.length), strM7368a);
                            this.f6233M = true;
                            aag aagVarM7553s2 = m7553s();
                            abg abgVar2 = new abg(this);
                            aagVarM7553s2.mo7376c();
                            aagVarM7553s2.m7584Q();
                            C1221aj.m7065a(url2);
                            C1221aj.m7065a(bArrM7757a2);
                            C1221aj.m7065a(abgVar2);
                            aagVarM7553s2.mo7392s().m7481b(new aak(aagVarM7553s2, strM12710B, url2, bArrM7757a2, null, abgVar2));
                        }
                    }
                }
            }
        } finally {
            this.f6234N = false;
            m7495P();
        }
    }

    /* JADX INFO: renamed from: F */
    final void m7515F() {
        this.f6229I++;
    }

    /* JADX INFO: renamed from: G */
    final void m7516G() {
        m7542h().mo7376c();
        m7518a();
        if (this.f6221A) {
            return;
        }
        m7540f().m7403C().m7412a("This instance being marked as an uploader");
        m7542h().mo7376c();
        m7518a();
        if (m7494O() && m7490K()) {
            int iM7496a = m7496a(this.f6225E);
            int iM12782B = m7559y().m12782B();
            m7542h().mo7376c();
            if (iM7496a > iM12782B) {
                m7540f().m7410y().m7414a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(iM7496a), Integer.valueOf(iM12782B));
            } else if (iM7496a < iM12782B) {
                if (m7502a(iM12782B, this.f6225E)) {
                    m7540f().m7405E().m7414a("Storage version upgraded. Previous, current version", Integer.valueOf(iM7496a), Integer.valueOf(iM12782B));
                } else {
                    m7540f().m7410y().m7414a("Storage version upgrade failed. Previous, current version", Integer.valueOf(iM7496a), Integer.valueOf(iM12782B));
                }
            }
        }
        this.f6221A = true;
        m7493N();
    }

    /* JADX INFO: renamed from: a */
    public final String m7517a(String str) {
        try {
            return (String) m7542h().m7478a(new abf(this, str)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m7540f().m7410y().m7414a("Failed to get app instance id. appId", aac.m7397a(str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7518a() {
        if (!this.f6260z) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m7519a(int i, Throwable th, byte[] bArr) {
        m7542h().mo7376c();
        m7518a();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f6233M = false;
                m7495P();
            }
        }
        List<Long> list = this.f6226F;
        this.f6226F = null;
        if ((i == 200 || i == 204) && th == null) {
            try {
                m7539e().f6142c.m7443a(this.f6250p.mo7252a());
                m7539e().f6143d.m7443a(0L);
                m7493N();
                m7540f().m7405E().m7414a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                m7551q().m12747x();
                try {
                    for (Long l : list) {
                        C2091zd c2091zdM7551q = m7551q();
                        long jLongValue = l.longValue();
                        c2091zdM7551q.mo7376c();
                        c2091zdM7551q.m7584Q();
                        try {
                            if (c2091zdM7551q.m12709A().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            c2091zdM7551q.mo7393t().m7410y().m7413a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        }
                    }
                    m7551q().m12748y();
                    m7551q().m12749z();
                    if (m7553s().m7419y() && m7492M()) {
                        m7514E();
                    } else {
                        this.f6230J = -1L;
                        m7493N();
                    }
                    this.f6231K = 0L;
                } catch (Throwable th2) {
                    m7551q().m12749z();
                    throw th2;
                }
            } catch (SQLiteException e2) {
                m7540f().m7410y().m7413a("Database error while trying to delete uploaded bundles", e2);
                this.f6231K = this.f6250p.mo7253b();
                m7540f().m7405E().m7413a("Disable upload, time", Long.valueOf(this.f6231K));
            }
        } else {
            m7540f().m7405E().m7414a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            m7539e().f6143d.m7443a(this.f6250p.mo7252a());
            if (i == 503 || i == 429) {
                m7539e().f6144e.m7443a(this.f6250p.mo7252a());
            }
            m7493N();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7520a(acd acdVar) {
        this.f6228H++;
    }

    /* JADX INFO: renamed from: a */
    final void m7521a(aeh aehVar, C2084yx c2084yx) {
        m7542h().mo7376c();
        m7518a();
        if (TextUtils.isEmpty(c2084yx.f12575b)) {
            return;
        }
        if (!c2084yx.f12581h) {
            m7510d(c2084yx);
            return;
        }
        int iM7766e = m7549o().m7766e(aehVar.f6488a);
        if (iM7766e != 0) {
            m7549o();
            m7549o().m7755a(c2084yx.f12574a, iM7766e, "_ev", aek.m7716a(aehVar.f6488a, 24, true), aehVar.f6488a != null ? aehVar.f6488a.length() : 0);
            return;
        }
        int iM7760b = m7549o().m7760b(aehVar.f6488a, aehVar.m7712a());
        if (iM7760b != 0) {
            m7549o();
            String strM7716a = aek.m7716a(aehVar.f6488a, 24, true);
            Object objM7712a = aehVar.m7712a();
            if (objM7712a != null && ((objM7712a instanceof String) || (objM7712a instanceof CharSequence))) {
                length = String.valueOf(objM7712a).length();
            }
            m7549o().m7755a(c2084yx.f12574a, iM7760b, "_ev", strM7716a, length);
            return;
        }
        Object objM7764c = m7549o().m7764c(aehVar.f6488a, aehVar.m7712a());
        if (objM7764c != null) {
            aej aejVar = new aej(c2084yx.f12574a, aehVar.f6490c, aehVar.f6488a, aehVar.f6489b, objM7764c);
            m7540f().m7404D().m7414a("Setting user property", m7550p().m7375c(aejVar.f6498c), objM7764c);
            m7551q().m12747x();
            try {
                m7510d(c2084yx);
                boolean zM12730a = m7551q().m12730a(aejVar);
                m7551q().m12748y();
                if (zM12730a) {
                    m7540f().m7404D().m7414a("User property set", m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                } else {
                    m7540f().m7410y().m7414a("Too many unique user properties are set. Ignoring user property", m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                    m7549o().m7755a(c2084yx.f12574a, 9, (String) null, (String) null, 0);
                }
            } finally {
                m7551q().m12749z();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7522a(C2084yx c2084yx) {
        m7551q().m12734b(c2084yx.f12574a);
        C2091zd c2091zdM7551q = m7551q();
        String str = c2084yx.f12574a;
        C1221aj.m7067a(str);
        c2091zdM7551q.mo7376c();
        c2091zdM7551q.m7584Q();
        try {
            SQLiteDatabase sQLiteDatabaseM12709A = c2091zdM7551q.m12709A();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseM12709A.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("apps", "app_id=?", strArr) + 0 + sQLiteDatabaseM12709A.delete("events", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("queue", "app_id=?", strArr);
            if (iDelete > 0) {
                c2091zdM7551q.mo7393t().m7405E().m7414a("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            c2091zdM7551q.mo7393t().m7410y().m7414a("Error resetting analytics data. appId, error", aac.m7397a(str), e);
        }
        m7537c(m7498a(this.f6236b, c2084yx.f12574a, c2084yx.f12575b, c2084yx.f12581h, c2084yx.f12588o));
    }

    /* JADX INFO: renamed from: a */
    final void m7523a(C2088za c2088za) {
        C2084yx c2084yxM7507b = m7507b(c2088za.f12635a);
        if (c2084yxM7507b != null) {
            m7524a(c2088za, c2084yxM7507b);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7524a(C2088za c2088za, C2084yx c2084yx) {
        boolean z = true;
        C1221aj.m7065a(c2088za);
        C1221aj.m7067a(c2088za.f12635a);
        C1221aj.m7065a(c2088za.f12636b);
        C1221aj.m7065a(c2088za.f12637c);
        C1221aj.m7067a(c2088za.f12637c.f6488a);
        m7542h().mo7376c();
        m7518a();
        if (TextUtils.isEmpty(c2084yx.f12575b)) {
            return;
        }
        if (!c2084yx.f12581h) {
            m7510d(c2084yx);
            return;
        }
        C2088za c2088za2 = new C2088za(c2088za);
        c2088za2.f12639e = false;
        m7551q().m12747x();
        try {
            C2088za c2088zaM12739d = m7551q().m12739d(c2088za2.f12635a, c2088za2.f12637c.f6488a);
            if (c2088zaM12739d != null && !c2088zaM12739d.f12636b.equals(c2088za2.f12636b)) {
                m7540f().m7401A().m7415a("Updating a conditional user property with different origin. name, origin, origin (from DB)", m7550p().m7375c(c2088za2.f12637c.f6488a), c2088za2.f12636b, c2088zaM12739d.f12636b);
            }
            if (c2088zaM12739d != null && c2088zaM12739d.f12639e) {
                c2088za2.f12636b = c2088zaM12739d.f12636b;
                c2088za2.f12638d = c2088zaM12739d.f12638d;
                c2088za2.f12642h = c2088zaM12739d.f12642h;
                c2088za2.f12640f = c2088zaM12739d.f12640f;
                c2088za2.f12643i = c2088zaM12739d.f12643i;
                c2088za2.f12639e = c2088zaM12739d.f12639e;
                c2088za2.f12637c = new aeh(c2088za2.f12637c.f6488a, c2088zaM12739d.f12637c.f6489b, c2088za2.f12637c.m7712a(), c2088zaM12739d.f12637c.f6490c);
                z = false;
            } else if (TextUtils.isEmpty(c2088za2.f12640f)) {
                c2088za2.f12637c = new aeh(c2088za2.f12637c.f6488a, c2088za2.f12638d, c2088za2.f12637c.m7712a(), c2088za2.f12637c.f6490c);
                c2088za2.f12639e = true;
            } else {
                z = false;
            }
            if (c2088za2.f12639e) {
                aeh aehVar = c2088za2.f12637c;
                aej aejVar = new aej(c2088za2.f12635a, c2088za2.f12636b, aehVar.f6488a, aehVar.f6489b, aehVar.m7712a());
                if (m7551q().m12730a(aejVar)) {
                    m7540f().m7404D().m7415a("User property updated immediately", c2088za2.f12635a, m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                } else {
                    m7540f().m7410y().m7415a("(2)Too many active user properties, ignoring", aac.m7397a(c2088za2.f12635a), m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                }
                if (z && c2088za2.f12643i != null) {
                    m7509b(new C2104zq(c2088za2.f12643i, c2088za2.f12638d), c2084yx);
                }
            }
            if (m7551q().m12732a(c2088za2)) {
                m7540f().m7404D().m7415a("Conditional property added", c2088za2.f12635a, m7550p().m7375c(c2088za2.f12637c.f6488a), c2088za2.f12637c.m7712a());
            } else {
                m7540f().m7410y().m7415a("Too many conditional properties, ignoring", aac.m7397a(c2088za2.f12635a), m7550p().m7375c(c2088za2.f12637c.f6488a), c2088za2.f12637c.m7712a());
            }
            m7551q().m12748y();
        } finally {
            m7551q().m12749z();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7525a(C2104zq c2104zq, C2084yx c2084yx) {
        List<C2088za> listM12725a;
        List<C2088za> listM12725a2;
        List<C2088za> listM12725a3;
        C1221aj.m7065a(c2084yx);
        C1221aj.m7067a(c2084yx.f12574a);
        m7542h().mo7376c();
        m7518a();
        String str = c2084yx.f12574a;
        long j = c2104zq.f12693d;
        m7549o();
        if (aek.m7722a(c2104zq, c2084yx)) {
            if (!c2084yx.f12581h) {
                m7510d(c2084yx);
                return;
            }
            m7551q().m12747x();
            try {
                C2091zd c2091zdM7551q = m7551q();
                C1221aj.m7067a(str);
                c2091zdM7551q.mo7376c();
                c2091zdM7551q.m7584Q();
                if (j < 0) {
                    c2091zdM7551q.mo7393t().m7401A().m7414a("Invalid time querying timed out conditional properties", aac.m7397a(str), Long.valueOf(j));
                    listM12725a = Collections.emptyList();
                } else {
                    listM12725a = c2091zdM7551q.m12725a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (C2088za c2088za : listM12725a) {
                    if (c2088za != null) {
                        m7540f().m7404D().m7415a("User property timed out", c2088za.f12635a, m7550p().m7375c(c2088za.f12637c.f6488a), c2088za.f12637c.m7712a());
                        if (c2088za.f12641g != null) {
                            m7509b(new C2104zq(c2088za.f12641g, j), c2084yx);
                        }
                        m7551q().m12741e(str, c2088za.f12637c.f6488a);
                    }
                }
                C2091zd c2091zdM7551q2 = m7551q();
                C1221aj.m7067a(str);
                c2091zdM7551q2.mo7376c();
                c2091zdM7551q2.m7584Q();
                if (j < 0) {
                    c2091zdM7551q2.mo7393t().m7401A().m7414a("Invalid time querying expired conditional properties", aac.m7397a(str), Long.valueOf(j));
                    listM12725a2 = Collections.emptyList();
                } else {
                    listM12725a2 = c2091zdM7551q2.m12725a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listM12725a2.size());
                for (C2088za c2088za2 : listM12725a2) {
                    if (c2088za2 != null) {
                        m7540f().m7404D().m7415a("User property expired", c2088za2.f12635a, m7550p().m7375c(c2088za2.f12637c.f6488a), c2088za2.f12637c.m7712a());
                        m7551q().m12736b(str, c2088za2.f12637c.f6488a);
                        if (c2088za2.f12645k != null) {
                            arrayList.add(c2088za2.f12645k);
                        }
                        m7551q().m12741e(str, c2088za2.f12637c.f6488a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    m7509b(new C2104zq((C2104zq) obj, j), c2084yx);
                }
                C2091zd c2091zdM7551q3 = m7551q();
                String str2 = c2104zq.f12690a;
                C1221aj.m7067a(str);
                C1221aj.m7067a(str2);
                c2091zdM7551q3.mo7376c();
                c2091zdM7551q3.m7584Q();
                if (j < 0) {
                    c2091zdM7551q3.mo7393t().m7401A().m7415a("Invalid time querying triggered conditional properties", aac.m7397a(str), c2091zdM7551q3.mo7388o().m7371a(str2), Long.valueOf(j));
                    listM12725a3 = Collections.emptyList();
                } else {
                    listM12725a3 = c2091zdM7551q3.m12725a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(listM12725a3.size());
                for (C2088za c2088za3 : listM12725a3) {
                    if (c2088za3 != null) {
                        aeh aehVar = c2088za3.f12637c;
                        aej aejVar = new aej(c2088za3.f12635a, c2088za3.f12636b, aehVar.f6488a, j, aehVar.m7712a());
                        if (m7551q().m12730a(aejVar)) {
                            m7540f().m7404D().m7415a("User property triggered", c2088za3.f12635a, m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                        } else {
                            m7540f().m7410y().m7415a("Too many active user properties, ignoring", aac.m7397a(c2088za3.f12635a), m7550p().m7375c(aejVar.f6498c), aejVar.f6500e);
                        }
                        if (c2088za3.f12643i != null) {
                            arrayList3.add(c2088za3.f12643i);
                        }
                        c2088za3.f12637c = new aeh(aejVar);
                        c2088za3.f12639e = true;
                        m7551q().m12732a(c2088za3);
                    }
                }
                m7509b(c2104zq, c2084yx);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    m7509b(new C2104zq((C2104zq) obj2, j), c2084yx);
                }
                m7551q().m12748y();
            } finally {
                m7551q().m12749z();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7526a(C2104zq c2104zq, String str) {
        C2083yw c2083ywM12734b = m7551q().m12734b(str);
        if (c2083ywM12734b == null || TextUtils.isEmpty(c2083ywM12734b.m12644i())) {
            m7540f().m7404D().m7413a("No app data available; dropping event", str);
            return;
        }
        try {
            String str2 = C2040xg.m12562a(this.f6236b).m12560b(str, 0).versionName;
            if (c2083ywM12734b.m12644i() != null && !c2083ywM12734b.m12644i().equals(str2)) {
                m7540f().m7401A().m7413a("App version does not match; dropping event. appId", aac.m7397a(str));
                return;
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (!"_ui".equals(c2104zq.f12690a)) {
                m7540f().m7401A().m7413a("Could not find package. appId", aac.m7397a(str));
            }
        }
        m7525a(c2104zq, new C2084yx(str, c2083ywM12734b.m12630d(), c2083ywM12734b.m12644i(), c2083ywM12734b.m12646j(), c2083ywM12734b.m12648k(), c2083ywM12734b.m12650l(), c2083ywM12734b.m12652m(), (String) null, c2083ywM12734b.m12655n(), false, c2083ywM12734b.m12636f(), c2083ywM12734b.m12617A(), 0L, 0, c2083ywM12734b.m12618B()));
    }

    /* JADX INFO: renamed from: a */
    final void m7527a(Runnable runnable) {
        m7542h().mo7376c();
        if (this.f6227G == null) {
            this.f6227G = new ArrayList();
        }
        this.f6227G.add(runnable);
    }

    /* JADX INFO: renamed from: a */
    final void m7528a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        boolean z = true;
        m7542h().mo7376c();
        m7518a();
        C1221aj.m7067a(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f6232L = false;
                m7495P();
            }
        }
        m7540f().m7405E().m7413a("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        m7551q().m12747x();
        try {
            C2083yw c2083ywM12734b = m7551q().m12734b(str);
            boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
            if (c2083ywM12734b == null) {
                m7540f().m7401A().m7413a("App does not exist in onConfigFetched. appId", aac.m7397a(str));
            } else if (z2 || i == 404) {
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i == 404 || i == 304) {
                    if (m7544j().m7458a(str) == null && !m7544j().m7460a(str, null, null)) {
                        return;
                    }
                } else if (!m7544j().m7460a(str, bArr, str2)) {
                    return;
                }
                c2083ywM12734b.m12640g(this.f6250p.mo7252a());
                m7551q().m12726a(c2083ywM12734b);
                if (i == 404) {
                    m7540f().m7402B().m7413a("Config not found. Using empty config. appId", str);
                } else {
                    m7540f().m7405E().m7414a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (m7553s().m7419y() && m7492M()) {
                    m7514E();
                } else {
                    m7493N();
                }
            } else {
                c2083ywM12734b.m12643h(this.f6250p.mo7252a());
                m7551q().m12726a(c2083ywM12734b);
                m7540f().m7405E().m7414a("Fetching config failed. code, error", Integer.valueOf(i), th);
                m7544j().m7463c(str);
                m7539e().f6143d.m7443a(this.f6250p.mo7252a());
                if (i != 503 && i != 429) {
                    z = false;
                }
                if (z) {
                    m7539e().f6144e.m7443a(this.f6250p.mo7252a());
                }
                m7493N();
            }
            m7551q().m12748y();
        } finally {
            m7551q().m12749z();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7529a(boolean z) {
        m7493N();
    }

    /* JADX INFO: renamed from: b */
    final void m7530b(aeh aehVar, C2084yx c2084yx) {
        m7542h().mo7376c();
        m7518a();
        if (TextUtils.isEmpty(c2084yx.f12575b)) {
            return;
        }
        if (!c2084yx.f12581h) {
            m7510d(c2084yx);
            return;
        }
        m7540f().m7404D().m7413a("Removing user property", m7550p().m7375c(aehVar.f6488a));
        m7551q().m12747x();
        try {
            m7510d(c2084yx);
            m7551q().m12736b(c2084yx.f12574a, aehVar.f6488a);
            m7551q().m12748y();
            m7540f().m7404D().m7413a("User property removed", m7550p().m7375c(aehVar.f6488a));
        } finally {
            m7551q().m12749z();
        }
    }

    /* JADX INFO: renamed from: b */
    final void m7531b(C2084yx c2084yx) {
        m7542h().mo7376c();
        m7518a();
        C1221aj.m7067a(c2084yx.f12574a);
        m7510d(c2084yx);
    }

    /* JADX INFO: renamed from: b */
    final void m7532b(C2088za c2088za) {
        C2084yx c2084yxM7507b = m7507b(c2088za.f12635a);
        if (c2084yxM7507b != null) {
            m7533b(c2088za, c2084yxM7507b);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m7533b(C2088za c2088za, C2084yx c2084yx) {
        C1221aj.m7065a(c2088za);
        C1221aj.m7067a(c2088za.f12635a);
        C1221aj.m7065a(c2088za.f12637c);
        C1221aj.m7067a(c2088za.f12637c.f6488a);
        m7542h().mo7376c();
        m7518a();
        if (TextUtils.isEmpty(c2084yx.f12575b)) {
            return;
        }
        if (!c2084yx.f12581h) {
            m7510d(c2084yx);
            return;
        }
        m7551q().m12747x();
        try {
            m7510d(c2084yx);
            C2088za c2088zaM12739d = m7551q().m12739d(c2088za.f12635a, c2088za.f12637c.f6488a);
            if (c2088zaM12739d != null) {
                m7540f().m7404D().m7414a("Removing conditional user property", c2088za.f12635a, m7550p().m7375c(c2088za.f12637c.f6488a));
                m7551q().m12741e(c2088za.f12635a, c2088za.f12637c.f6488a);
                if (c2088zaM12739d.f12639e) {
                    m7551q().m12736b(c2088za.f12635a, c2088za.f12637c.f6488a);
                }
                if (c2088za.f12645k != null) {
                    m7509b(m7549o().m7749a(c2088za.f12645k.f12690a, c2088za.f12645k.f12691b != null ? c2088za.f12645k.f12691b.m12769b() : null, c2088zaM12739d.f12636b, c2088za.f12645k.f12693d, true, false), c2084yx);
                }
            } else {
                m7540f().m7401A().m7414a("Conditional user property doesn't exist", aac.m7397a(c2088za.f12635a), m7550p().m7375c(c2088za.f12637c.f6488a));
            }
            m7551q().m12748y();
        } finally {
            m7551q().m12749z();
        }
    }

    /* JADX INFO: renamed from: b */
    protected final boolean m7534b() {
        boolean z = false;
        m7518a();
        m7542h().mo7376c();
        if (this.f6222B == null || this.f6223C == 0 || (this.f6222B != null && !this.f6222B.booleanValue() && Math.abs(this.f6250p.mo7253b() - this.f6223C) > 1000)) {
            this.f6223C = this.f6250p.mo7253b();
            if (m7549o().m7768h("android.permission.INTERNET") && m7549o().m7768h("android.permission.ACCESS_NETWORK_STATE") && (C2040xg.m12562a(this.f6236b).m12557a() || (aau.m7450a(this.f6236b) && adu.m7679a(this.f6236b, false)))) {
                z = true;
            }
            this.f6222B = Boolean.valueOf(z);
            if (this.f6222B.booleanValue()) {
                this.f6222B = Boolean.valueOf(m7549o().m7767f(m7559y().m12781A()));
            }
        }
        return this.f6222B.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m7535b(C2104zq c2104zq, String str) {
        long j;
        m7518a();
        m7542h().mo7376c();
        m7486D();
        C1221aj.m7065a(c2104zq);
        C1221aj.m7067a(str);
        aey aeyVar = new aey();
        m7551q().m12747x();
        try {
            C2083yw c2083ywM12734b = m7551q().m12734b(str);
            if (c2083ywM12734b == null) {
                m7540f().m7404D().m7413a("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!c2083ywM12734b.m12655n()) {
                m7540f().m7404D().m7413a("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            if (("_iap".equals(c2104zq.f12690a) || "ecommerce_purchase".equals(c2104zq.f12690a)) && !m7505a(str, c2104zq)) {
                m7540f().m7401A().m7413a("Failed to handle purchase event at single event bundle creation. appId", aac.m7397a(str));
            }
            aez aezVar = new aez();
            aeyVar.f6565a = new aez[]{aezVar};
            aezVar.f6576a = 1;
            aezVar.f6584i = "android";
            aezVar.f6590o = c2083ywM12734b.m12623b();
            aezVar.f6589n = c2083ywM12734b.m12648k();
            aezVar.f6591p = c2083ywM12734b.m12644i();
            long jM12646j = c2083ywM12734b.m12646j();
            aezVar.f6569C = jM12646j == -2147483648L ? null : Integer.valueOf((int) jM12646j);
            aezVar.f6592q = Long.valueOf(c2083ywM12734b.m12650l());
            aezVar.f6600y = c2083ywM12734b.m12630d();
            aezVar.f6597v = Long.valueOf(c2083ywM12734b.m12652m());
            if (m7512B() && C2090zc.m12678B() && this.f6237c.m12686c(aezVar.f6590o)) {
                m7559y();
                aezVar.f6573G = null;
            }
            Pair<String, Boolean> pairM7429a = m7539e().m7429a(c2083ywM12734b.m12623b());
            if (c2083ywM12734b.m12618B() && pairM7429a != null && !TextUtils.isEmpty((CharSequence) pairM7429a.first)) {
                aezVar.f6594s = (String) pairM7429a.first;
                aezVar.f6595t = (Boolean) pairM7429a.second;
            }
            m7558x().m7584Q();
            aezVar.f6586k = Build.MODEL;
            m7558x().m7584Q();
            aezVar.f6585j = Build.VERSION.RELEASE;
            aezVar.f6588m = Integer.valueOf((int) m7558x().m12758x());
            aezVar.f6587l = m7558x().m12759y();
            aezVar.f6596u = c2083ywM12734b.m12627c();
            aezVar.f6568B = c2083ywM12734b.m12636f();
            List<aej> listM12722a = m7551q().m12722a(c2083ywM12734b.m12623b());
            aezVar.f6578c = new afb[listM12722a.size()];
            for (int i = 0; i < listM12722a.size(); i++) {
                afb afbVar = new afb();
                aezVar.f6578c[i] = afbVar;
                afbVar.f6606b = listM12722a.get(i).f6498c;
                afbVar.f6605a = Long.valueOf(listM12722a.get(i).f6499d);
                m7549o().m7754a(afbVar, listM12722a.get(i).f6500e);
            }
            Bundle bundleM12769b = c2104zq.f12691b.m12769b();
            if ("_iap".equals(c2104zq.f12690a)) {
                bundleM12769b.putLong("_c", 1L);
                m7540f().m7404D().m7412a("Marking in-app purchase as real-time");
                bundleM12769b.putLong("_r", 1L);
            }
            bundleM12769b.putString("_o", c2104zq.f12692c);
            if (m7549o().m7769j(aezVar.f6590o)) {
                m7549o().m7752a(bundleM12769b, "_dbg", (Object) 1L);
                m7549o().m7752a(bundleM12769b, "_r", (Object) 1L);
            }
            C2099zl c2099zlM12720a = m7551q().m12720a(str, c2104zq.f12690a);
            if (c2099zlM12720a == null) {
                m7551q().m12727a(new C2099zl(str, c2104zq.f12690a, 1L, 0L, c2104zq.f12693d, 0L, null, null, null));
                j = 0;
            } else {
                j = c2099zlM12720a.f12681e;
                m7551q().m12727a(c2099zlM12720a.m12763a(c2104zq.f12693d).m12762a());
            }
            C2098zk c2098zk = new C2098zk(this, c2104zq.f12692c, str, c2104zq.f12690a, c2104zq.f12693d, j, bundleM12769b);
            aew aewVar = new aew();
            aezVar.f6577b = new aew[]{aewVar};
            aewVar.f6556c = Long.valueOf(c2098zk.f12673c);
            aewVar.f6555b = c2098zk.f12672b;
            aewVar.f6557d = Long.valueOf(c2098zk.f12674d);
            aewVar.f6554a = new aex[c2098zk.f12675e.m12767a()];
            int i2 = 0;
            for (String str2 : c2098zk.f12675e) {
                aex aexVar = new aex();
                aewVar.f6554a[i2] = aexVar;
                aexVar.f6560a = str2;
                m7549o().m7753a(aexVar, c2098zk.f12675e.m12768a(str2));
                i2++;
            }
            aezVar.f6567A = m7506a(c2083ywM12734b.m12623b(), aezVar.f6578c, aezVar.f6577b);
            aezVar.f6580e = aewVar.f6556c;
            aezVar.f6581f = aewVar.f6556c;
            long jM12642h = c2083ywM12734b.m12642h();
            aezVar.f6583h = jM12642h != 0 ? Long.valueOf(jM12642h) : null;
            long jM12639g = c2083ywM12734b.m12639g();
            if (jM12639g != 0) {
                jM12642h = jM12639g;
            }
            aezVar.f6582g = jM12642h != 0 ? Long.valueOf(jM12642h) : null;
            c2083ywM12734b.m12660r();
            aezVar.f6598w = Integer.valueOf((int) c2083ywM12734b.m12656o());
            aezVar.f6593r = 11910L;
            aezVar.f6579d = Long.valueOf(this.f6250p.mo7252a());
            aezVar.f6601z = Boolean.TRUE;
            c2083ywM12734b.m12620a(aezVar.f6580e.longValue());
            c2083ywM12734b.m12624b(aezVar.f6581f.longValue());
            m7551q().m12726a(c2083ywM12734b);
            m7551q().m12748y();
            try {
                byte[] bArr = new byte[aeyVar.m10166f()];
                bru bruVarM10108a = bru.m10108a(bArr, 0, bArr.length);
                aeyVar.mo7777a(bruVarM10108a);
                bruVarM10108a.m10122a();
                return m7549o().m7758a(bArr);
            } catch (IOException e) {
                m7540f().m7410y().m7414a("Data loss. Failed to bundle and serialize. appId", aac.m7397a(str), e);
                return null;
            }
        } finally {
            m7551q().m12749z();
        }
    }

    /* JADX INFO: renamed from: c */
    protected final void m7536c() {
        m7542h().mo7376c();
        m7551q().m12712D();
        if (m7539e().f6142c.m7442a() == 0) {
            m7539e().f6142c.m7443a(this.f6250p.mo7252a());
        }
        if (Long.valueOf(m7539e().f6147h.m7442a()).longValue() == 0) {
            m7540f().m7405E().m7413a("Persisting first open", Long.valueOf(this.f6235O));
            m7539e().f6147h.m7443a(this.f6235O);
        }
        if (m7534b()) {
            if (!TextUtils.isEmpty(m7559y().m12781A())) {
                String strM7437y = m7539e().m7437y();
                if (strM7437y == null) {
                    m7539e().m7433c(m7559y().m12781A());
                } else if (!strM7437y.equals(m7559y().m12781A())) {
                    m7540f().m7403C().m7412a("Rechecking which service to use due to a GMP App Id change");
                    m7539e().m7427B();
                    this.f6252r.m7661E();
                    this.f6252r.m7659C();
                    m7539e().m7433c(m7559y().m12781A());
                    m7539e().f6147h.m7443a(this.f6235O);
                    m7539e().f6148i.m7449a(null);
                }
            }
            m7546l().m7613a(m7539e().f6148i.m7448a());
            if (!TextUtils.isEmpty(m7559y().m12781A())) {
                acf acfVarM7546l = m7546l();
                acfVarM7546l.mo7376c();
                acfVarM7546l.m7584Q();
                if (acfVarM7546l.f6329p.m7534b()) {
                    acfVarM7546l.mo7382i().m7658B();
                    String strM7428C = acfVarM7546l.mo7394u().m7428C();
                    if (!TextUtils.isEmpty(strM7428C)) {
                        acfVarM7546l.mo7381h().m7584Q();
                        if (!strM7428C.equals(Build.VERSION.RELEASE)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_po", strM7428C);
                            acfVarM7546l.m7614a("auto", "_ou", bundle);
                        }
                    }
                }
                m7557w().m7668a(new AtomicReference<>());
            }
        } else if (m7512B()) {
            if (!m7549o().m7768h("android.permission.INTERNET")) {
                m7540f().m7410y().m7412a("App is missing INTERNET permission");
            }
            if (!m7549o().m7768h("android.permission.ACCESS_NETWORK_STATE")) {
                m7540f().m7410y().m7412a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C2040xg.m12562a(this.f6236b).m12557a()) {
                if (!aau.m7450a(this.f6236b)) {
                    m7540f().m7410y().m7412a("AppMeasurementReceiver not registered/enabled");
                }
                if (!adu.m7679a(this.f6236b, false)) {
                    m7540f().m7410y().m7412a("AppMeasurementService not registered/enabled");
                }
            }
            m7540f().m7410y().m7412a("Uploading is not possible. App measurement disabled");
        }
        m7493N();
    }

    /* JADX INFO: renamed from: c */
    public final void m7537c(C2084yx c2084yx) {
        int i;
        ApplicationInfo applicationInfoM12556a;
        m7542h().mo7376c();
        m7518a();
        C1221aj.m7065a(c2084yx);
        C1221aj.m7067a(c2084yx.f12574a);
        if (TextUtils.isEmpty(c2084yx.f12575b)) {
            return;
        }
        C2083yw c2083ywM12734b = m7551q().m12734b(c2084yx.f12574a);
        if (c2083ywM12734b != null && TextUtils.isEmpty(c2083ywM12734b.m12630d()) && !TextUtils.isEmpty(c2084yx.f12575b)) {
            c2083ywM12734b.m12640g(0L);
            m7551q().m12726a(c2083ywM12734b);
            m7544j().m7466d(c2084yx.f12574a);
        }
        if (!c2084yx.f12581h) {
            m7510d(c2084yx);
            return;
        }
        long jMo7252a = c2084yx.f12586m;
        if (jMo7252a == 0) {
            jMo7252a = this.f6250p.mo7252a();
        }
        int i2 = c2084yx.f12587n;
        if (i2 == 0 || i2 == 1) {
            i = i2;
        } else {
            m7540f().m7401A().m7414a("Incorrect app type, assuming installed app. appId, appType", aac.m7397a(c2084yx.f12574a), Integer.valueOf(i2));
            i = 0;
        }
        m7551q().m12747x();
        try {
            C2083yw c2083ywM12734b2 = m7551q().m12734b(c2084yx.f12574a);
            if (c2083ywM12734b2 != null && c2083ywM12734b2.m12630d() != null && !c2083ywM12734b2.m12630d().equals(c2084yx.f12575b)) {
                m7540f().m7401A().m7413a("New GMP App Id passed in. Removing cached database data. appId", aac.m7397a(c2083ywM12734b2.m12623b()));
                C2091zd c2091zdM7551q = m7551q();
                String strM12623b = c2083ywM12734b2.m12623b();
                c2091zdM7551q.m7584Q();
                c2091zdM7551q.mo7376c();
                C1221aj.m7067a(strM12623b);
                try {
                    SQLiteDatabase sQLiteDatabaseM12709A = c2091zdM7551q.m12709A();
                    String[] strArr = {strM12623b};
                    int iDelete = sQLiteDatabaseM12709A.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("events", "app_id=?", strArr) + 0 + sQLiteDatabaseM12709A.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseM12709A.delete("property_filters", "app_id=?", strArr);
                    if (iDelete > 0) {
                        c2091zdM7551q.mo7393t().m7405E().m7414a("Deleted application data. app, records", strM12623b, Integer.valueOf(iDelete));
                    }
                } catch (SQLiteException e) {
                    c2091zdM7551q.mo7393t().m7410y().m7414a("Error deleting application data. appId, error", aac.m7397a(strM12623b), e);
                }
                c2083ywM12734b2 = null;
            }
            if (c2083ywM12734b2 != null && c2083ywM12734b2.m12644i() != null && !c2083ywM12734b2.m12644i().equals(c2084yx.f12576c)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", c2083ywM12734b2.m12644i());
                m7525a(new C2104zq("_au", new C2100zm(bundle), "auto", jMo7252a), c2084yx);
            }
            m7510d(c2084yx);
            C2099zl c2099zlM12720a = null;
            if (i == 0) {
                c2099zlM12720a = m7551q().m12720a(c2084yx.f12574a, "_f");
            } else if (i == 1) {
                c2099zlM12720a = m7551q().m12720a(c2084yx.f12574a, "_v");
            }
            if (c2099zlM12720a == null) {
                long j = (1 + (jMo7252a / 3600000)) * 3600000;
                if (i == 0) {
                    m7521a(new aeh("_fot", jMo7252a, Long.valueOf(j), "auto"), c2084yx);
                    m7542h().mo7376c();
                    m7518a();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("_c", 1L);
                    bundle2.putLong("_r", 1L);
                    bundle2.putLong("_uwa", 0L);
                    bundle2.putLong("_pfo", 0L);
                    bundle2.putLong("_sys", 0L);
                    bundle2.putLong("_sysu", 0L);
                    if (this.f6236b.getPackageManager() == null) {
                        m7540f().m7410y().m7413a("PackageManager is null, first open report might be inaccurate. appId", aac.m7397a(c2084yx.f12574a));
                    } else {
                        PackageInfo packageInfoM12560b = null;
                        try {
                            packageInfoM12560b = C2040xg.m12562a(this.f6236b).m12560b(c2084yx.f12574a, 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            m7540f().m7410y().m7414a("Package info is null, first open report might be inaccurate. appId", aac.m7397a(c2084yx.f12574a), e2);
                        }
                        if (packageInfoM12560b != null && packageInfoM12560b.firstInstallTime != 0) {
                            boolean z = false;
                            if (packageInfoM12560b.firstInstallTime != packageInfoM12560b.lastUpdateTime) {
                                bundle2.putLong("_uwa", 1L);
                            } else {
                                z = true;
                            }
                            m7521a(new aeh("_fi", jMo7252a, Long.valueOf(z ? 1L : 0L), "auto"), c2084yx);
                        }
                        try {
                            applicationInfoM12556a = C2040xg.m12562a(this.f6236b).m12556a(c2084yx.f12574a, 0);
                        } catch (PackageManager.NameNotFoundException e3) {
                            m7540f().m7410y().m7414a("Application info is null, first open report might be inaccurate. appId", aac.m7397a(c2084yx.f12574a), e3);
                            applicationInfoM12556a = null;
                        }
                        if (applicationInfoM12556a != null) {
                            if ((applicationInfoM12556a.flags & 1) != 0) {
                                bundle2.putLong("_sys", 1L);
                            }
                            if ((applicationInfoM12556a.flags & 128) != 0) {
                                bundle2.putLong("_sysu", 1L);
                            }
                        }
                    }
                    C2091zd c2091zdM7551q2 = m7551q();
                    String str = c2084yx.f12574a;
                    C1221aj.m7067a(str);
                    c2091zdM7551q2.mo7376c();
                    c2091zdM7551q2.m7584Q();
                    long jM12746h = c2091zdM7551q2.m12746h(str, "first_open_count");
                    if (jM12746h >= 0) {
                        bundle2.putLong("_pfo", jM12746h);
                    }
                    m7525a(new C2104zq("_f", new C2100zm(bundle2), "auto", jMo7252a), c2084yx);
                } else if (i == 1) {
                    m7521a(new aeh("_fvt", jMo7252a, Long.valueOf(j), "auto"), c2084yx);
                    m7542h().mo7376c();
                    m7518a();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1L);
                    bundle3.putLong("_r", 1L);
                    m7525a(new C2104zq("_v", new C2100zm(bundle3), "auto", jMo7252a), c2084yx);
                }
                Bundle bundle4 = new Bundle();
                bundle4.putLong("_et", 1L);
                m7525a(new C2104zq("_e", new C2100zm(bundle4), "auto", jMo7252a), c2084yx);
            } else if (c2084yx.f12582i) {
                m7525a(new C2104zq("_cd", new C2100zm(new Bundle()), "auto", jMo7252a), c2084yx);
            }
            m7551q().m12748y();
        } finally {
            m7551q().m12749z();
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2090zc m7538d() {
        return this.f6237c;
    }

    /* JADX INFO: renamed from: e */
    public final aan m7539e() {
        m7500a((acc) this.f6238d);
        return this.f6238d;
    }

    /* JADX INFO: renamed from: f */
    public final aac m7540f() {
        m7508b(this.f6239e);
        return this.f6239e;
    }

    /* JADX INFO: renamed from: g */
    public final aac m7541g() {
        if (this.f6239e == null || !this.f6239e.m7583P()) {
            return null;
        }
        return this.f6239e;
    }

    /* JADX INFO: renamed from: h */
    public final aay m7542h() {
        m7508b(this.f6240f);
        return this.f6240f;
    }

    /* JADX INFO: renamed from: i */
    public final adz m7543i() {
        m7508b(this.f6241g);
        return this.f6241g;
    }

    /* JADX INFO: renamed from: j */
    public final aax m7544j() {
        m7508b(this.f6242h);
        return this.f6242h;
    }

    /* JADX INFO: renamed from: k */
    final aay m7545k() {
        return this.f6240f;
    }

    /* JADX INFO: renamed from: l */
    public final acf m7546l() {
        m7508b(this.f6254t);
        return this.f6254t;
    }

    /* JADX INFO: renamed from: m */
    public final AppMeasurement m7547m() {
        return this.f6243i;
    }

    /* JADX INFO: renamed from: n */
    public final FirebaseAnalytics m7548n() {
        return this.f6244j;
    }

    /* JADX INFO: renamed from: o */
    public final aek m7549o() {
        m7500a((acc) this.f6245k);
        return this.f6245k;
    }

    /* JADX INFO: renamed from: p */
    public final aaa m7550p() {
        m7500a((acc) this.f6246l);
        return this.f6246l;
    }

    /* JADX INFO: renamed from: q */
    public final C2091zd m7551q() {
        m7508b(this.f6247m);
        return this.f6247m;
    }

    /* JADX INFO: renamed from: r */
    public final C2112zy m7552r() {
        m7508b(this.f6248n);
        return this.f6248n;
    }

    /* JADX INFO: renamed from: s */
    public final aag m7553s() {
        m7508b(this.f6249o);
        return this.f6249o;
    }

    /* JADX INFO: renamed from: t */
    public final Context m7554t() {
        return this.f6236b;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC1300d m7555u() {
        return this.f6250p;
    }

    /* JADX INFO: renamed from: v */
    public final acv m7556v() {
        m7508b(this.f6251q);
        return this.f6251q;
    }

    /* JADX INFO: renamed from: w */
    public final acz m7557w() {
        m7508b(this.f6252r);
        return this.f6252r;
    }

    /* JADX INFO: renamed from: x */
    public final C2097zj m7558x() {
        m7508b(this.f6253s);
        return this.f6253s;
    }

    /* JADX INFO: renamed from: y */
    public final C2111zx m7559y() {
        m7508b(this.f6255u);
        return this.f6255u;
    }

    /* JADX INFO: renamed from: z */
    public final C2086yz m7560z() {
        m7508b(this.f6258x);
        return this.f6258x;
    }
}
