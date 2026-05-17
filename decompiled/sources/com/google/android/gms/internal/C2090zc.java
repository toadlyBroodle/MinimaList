package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1312p;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.google.android.gms.internal.zc */
/* JADX INFO: loaded from: classes.dex */
public final class C2090zc extends acc {

    /* JADX INFO: renamed from: a */
    private Boolean f12647a;

    C2090zc(abd abdVar) {
        super(abdVar);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m12678B() {
        return C2106zs.f12709a.m12779b().booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public static long m12679y() {
        return C2106zs.f12699F.m12779b().longValue();
    }

    /* JADX INFO: renamed from: z */
    public static long m12680z() {
        return C2106zs.f12714f.m12779b().longValue();
    }

    /* JADX INFO: renamed from: A */
    public final String m12681A() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e) {
            mo7393t().m7410y().m7413a("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            mo7393t().m7410y().m7413a("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            mo7393t().m7410y().m7413a("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo7393t().m7410y().m7413a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m12682a(String str) {
        return m12684b(str, C2106zs.f12725q);
    }

    /* JADX INFO: renamed from: a */
    public final long m12683a(String str, C2107zt<Long> c2107zt) {
        if (str == null) {
            return c2107zt.m12779b().longValue();
        }
        String strM7459a = mo7390q().m7459a(str, c2107zt.m12778a());
        if (TextUtils.isEmpty(strM7459a)) {
            return c2107zt.m12779b().longValue();
        }
        try {
            return c2107zt.m12777a(Long.valueOf(Long.valueOf(strM7459a).longValue())).longValue();
        } catch (NumberFormatException e) {
            return c2107zt.m12779b().longValue();
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: b */
    public final int m12684b(String str, C2107zt<Integer> c2107zt) {
        if (str == null) {
            return c2107zt.m12779b().intValue();
        }
        String strM7459a = mo7390q().m7459a(str, c2107zt.m12778a());
        if (TextUtils.isEmpty(strM7459a)) {
            return c2107zt.m12779b().intValue();
        }
        try {
            return c2107zt.m12777a(Integer.valueOf(Integer.valueOf(strM7459a).intValue())).intValue();
        } catch (NumberFormatException e) {
            return c2107zt.m12779b().intValue();
        }
    }

    /* JADX INFO: renamed from: b */
    final Boolean m12685b(String str) {
        Boolean boolValueOf = null;
        C1221aj.m7067a(str);
        try {
            if (mo7385l().getPackageManager() == null) {
                mo7393t().m7410y().m7412a("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo applicationInfoM12556a = C2040xg.m12562a(mo7385l()).m12556a(mo7385l().getPackageName(), 128);
                if (applicationInfoM12556a == null) {
                    mo7393t().m7410y().m7412a("Failed to load metadata: ApplicationInfo is null");
                } else if (applicationInfoM12556a.metaData == null) {
                    mo7393t().m7410y().m7412a("Failed to load metadata: Metadata bundle is null");
                } else if (applicationInfoM12556a.metaData.containsKey(str)) {
                    boolValueOf = Boolean.valueOf(applicationInfoM12556a.metaData.getBoolean(str));
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            mo7393t().m7410y().m7413a("Failed to load metadata: Package name not found", e);
        }
        return boolValueOf;
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

    /* JADX INFO: renamed from: c */
    public final boolean m12686c(String str) {
        return "1".equals(mo7390q().m7459a(str, "gaia_collection_enabled"));
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

    /* JADX INFO: renamed from: w */
    public final boolean m12687w() {
        if (this.f12647a == null) {
            synchronized (this) {
                if (this.f12647a == null) {
                    ApplicationInfo applicationInfo = mo7385l().getApplicationInfo();
                    String strM7287a = C1312p.m7287a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f12647a = Boolean.valueOf(str != null && str.equals(strM7287a));
                    }
                    if (this.f12647a == null) {
                        this.f12647a = Boolean.TRUE;
                        mo7393t().m7410y().m7412a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f12647a.booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m12688x() {
        Boolean boolM12685b = m12685b("firebase_analytics_collection_deactivated");
        return boolM12685b != null && boolM12685b.booleanValue();
    }
}
