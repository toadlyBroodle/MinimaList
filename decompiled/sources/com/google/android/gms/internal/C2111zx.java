package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1111az;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.zx */
/* JADX INFO: loaded from: classes.dex */
public final class C2111zx extends acd {

    /* JADX INFO: renamed from: a */
    private String f12738a;

    /* JADX INFO: renamed from: b */
    private String f12739b;

    /* JADX INFO: renamed from: c */
    private int f12740c;

    /* JADX INFO: renamed from: d */
    private String f12741d;

    /* JADX INFO: renamed from: e */
    private String f12742e;

    /* JADX INFO: renamed from: f */
    private long f12743f;

    /* JADX INFO: renamed from: g */
    private long f12744g;

    /* JADX INFO: renamed from: h */
    private int f12745h;

    /* JADX INFO: renamed from: i */
    private String f12746i;

    C2111zx(abd abdVar) {
        super(abdVar);
    }

    /* JADX INFO: renamed from: D */
    private final String m12780D() {
        mo7376c();
        try {
            return FirebaseInstanceId.m13027a().m13040c();
        } catch (IllegalStateException e) {
            mo7393t().m7401A().m7412a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    final String m12781A() {
        m7584Q();
        return this.f12746i;
    }

    /* JADX INFO: renamed from: B */
    final int m12782B() {
        m7584Q();
        return this.f12740c;
    }

    /* JADX INFO: renamed from: C */
    final int m12783C() {
        m7584Q();
        return this.f12745h;
    }

    /* JADX INFO: renamed from: a */
    final C2084yx m12784a(String str) {
        mo7376c();
        String strM12786z = m12786z();
        String strM12781A = m12781A();
        m7584Q();
        String str2 = this.f12739b;
        long jM12782B = m12782B();
        m7584Q();
        String str3 = this.f12741d;
        m7584Q();
        mo7376c();
        if (this.f12743f == 0) {
            this.f12743f = this.f6329p.m7549o().m7761b(mo7385l(), mo7385l().getPackageName());
        }
        long j = this.f12743f;
        boolean zM7512B = this.f6329p.m7512B();
        boolean z = !mo7394u().f6154o;
        String strM12780D = m12780D();
        m7584Q();
        long jM7513C = this.f6329p.m7513C();
        int iM12783C = m12783C();
        Boolean boolM12685b = mo7395v().m12685b("google_analytics_adid_collection_enabled");
        return new C2084yx(strM12786z, strM12781A, str2, jM12782B, str3, 11910L, j, str, zM7512B, z, strM12780D, 0L, jM7513C, iM12783C, Boolean.valueOf(boolM12685b == null || boolM12685b.booleanValue()).booleanValue());
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: l_ */
    protected final void mo7436l_() {
        String string;
        boolean z;
        String installerPackageName = "unknown";
        String str = "Unknown";
        int i = Integer.MIN_VALUE;
        string = "Unknown";
        String packageName = mo7385l().getPackageName();
        PackageManager packageManager = mo7385l().getPackageManager();
        if (packageManager == null) {
            mo7393t().m7410y().m7413a("PackageManager is null, app identity information might be inaccurate. appId", aac.m7397a(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException e) {
                mo7393t().m7410y().m7413a("Error retrieving app installer package name. appId", aac.m7397a(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(mo7385l().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    string = TextUtils.isEmpty(applicationLabel) ? "Unknown" : applicationLabel.toString();
                    str = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                mo7393t().m7410y().m7414a("Error retrieving package info. appId, appName", aac.m7397a(packageName), string);
            }
        }
        this.f12738a = packageName;
        this.f12741d = installerPackageName;
        this.f12739b = str;
        this.f12740c = i;
        this.f12742e = string;
        this.f12743f = 0L;
        Status statusM6847a = C1111az.m6847a(mo7385l());
        boolean z2 = statusM6847a != null && statusM6847a.m6626d();
        if (!z2) {
            if (statusM6847a == null) {
                mo7393t().m7410y().m7412a("GoogleService failed to initialize (no status)");
            } else {
                mo7393t().m7410y().m7414a("GoogleService failed to initialize, status", Integer.valueOf(statusM6847a.m6627e()), statusM6847a.m6624b());
            }
        }
        if (z2) {
            Boolean boolM12685b = mo7395v().m12685b("firebase_analytics_collection_enabled");
            if (mo7395v().m12688x()) {
                mo7393t().m7403C().m7412a("Collection disabled with firebase_analytics_collection_deactivated=1");
                z = false;
            } else if (boolM12685b != null && !boolM12685b.booleanValue()) {
                mo7393t().m7403C().m7412a("Collection disabled with firebase_analytics_collection_enabled=0");
                z = false;
            } else if (boolM12685b == null && C1111az.m6850b()) {
                mo7393t().m7403C().m7412a("Collection disabled with google_app_measurement_enable=0");
                z = false;
            } else {
                mo7393t().m7405E().m7412a("Collection enabled");
                z = true;
            }
        } else {
            z = false;
        }
        this.f12746i = "";
        this.f12744g = 0L;
        try {
            String strM6849a = C1111az.m6849a();
            if (TextUtils.isEmpty(strM6849a)) {
                strM6849a = "";
            }
            this.f12746i = strM6849a;
            if (z) {
                mo7393t().m7405E().m7414a("App package, google app id", this.f12738a, this.f12746i);
            }
        } catch (IllegalStateException e3) {
            mo7393t().m7410y().m7414a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", aac.m7397a(packageName), e3);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f12745h = C2038xe.m12553a(mo7385l()) ? 1 : 0;
        } else {
            this.f12745h = 0;
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    final String m12785y() {
        byte[] bArr = new byte[16];
        mo7389p().m7773z().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: z */
    final String m12786z() {
        m7584Q();
        return this.f12738a;
    }
}
