package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.p018i.C0207a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class acv extends acd {

    /* JADX INFO: renamed from: a */
    protected acy f6381a;

    /* JADX INFO: renamed from: b */
    private volatile AppMeasurement.C2120g f6382b;

    /* JADX INFO: renamed from: c */
    private AppMeasurement.C2120g f6383c;

    /* JADX INFO: renamed from: d */
    private long f6384d;

    /* JADX INFO: renamed from: e */
    private final Map<Activity, acy> f6385e;

    /* JADX INFO: renamed from: f */
    private final CopyOnWriteArrayList<AppMeasurement.InterfaceC2119f> f6386f;

    /* JADX INFO: renamed from: g */
    private boolean f6387g;

    /* JADX INFO: renamed from: h */
    private AppMeasurement.C2120g f6388h;

    /* JADX INFO: renamed from: i */
    private String f6389i;

    public acv(abd abdVar) {
        super(abdVar);
        this.f6385e = new C0207a();
        this.f6386f = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    private static String m7628a(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return str.substring(0, 36);
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        return str2.length() > 36 ? str2.substring(0, 36) : str2;
    }

    /* JADX INFO: renamed from: a */
    private final void m7629a(Activity activity, acy acyVar, boolean z) {
        boolean z2;
        boolean zM12800a = true;
        AppMeasurement.C2120g c2120g = this.f6382b != null ? this.f6382b : (this.f6383c == null || Math.abs(mo7384k().mo7253b() - this.f6384d) >= 1000) ? null : this.f6383c;
        AppMeasurement.C2120g c2120g2 = c2120g != null ? new AppMeasurement.C2120g(c2120g) : null;
        this.f6387g = true;
        try {
            try {
                Iterator<AppMeasurement.InterfaceC2119f> it = this.f6386f.iterator();
                while (it.hasNext()) {
                    try {
                        zM12800a &= it.next().m12800a(c2120g2, acyVar);
                    } catch (Exception e) {
                        mo7393t().m7410y().m7413a("onScreenChangeCallback threw exception", e);
                    }
                }
                this.f6387g = false;
                z2 = zM12800a;
            } catch (Throwable th) {
                this.f6387g = false;
                throw th;
            }
        } catch (Exception e2) {
            z2 = zM12800a;
            mo7393t().m7410y().m7413a("onScreenChangeCallback loop threw exception", e2);
            this.f6387g = false;
        }
        AppMeasurement.C2120g c2120g3 = this.f6382b == null ? this.f6383c : this.f6382b;
        if (z2) {
            if (acyVar.f12760c == null) {
                acyVar.f12760c = m7628a(activity.getClass().getCanonicalName());
            }
            acy acyVar2 = new acy(acyVar);
            this.f6383c = this.f6382b;
            this.f6384d = mo7384k().mo7253b();
            this.f6382b = acyVar2;
            mo7392s().m7479a(new acw(this, z, c2120g3, acyVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7631a(acy acyVar) {
        mo7377d().m12614a(mo7384k().mo7253b());
        if (mo7391r().m7700a(acyVar.f6396a)) {
            acyVar.f6396a = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7632a(AppMeasurement.C2120g c2120g, Bundle bundle) {
        if (bundle == null || c2120g == null || bundle.containsKey("_sc")) {
            return;
        }
        if (c2120g.f12759b != null) {
            bundle.putString("_sn", c2120g.f12759b);
        }
        bundle.putString("_sc", c2120g.f12760c);
        bundle.putLong("_si", c2120g.f12761d);
    }

    /* JADX INFO: renamed from: a */
    final acy m7633a(Activity activity) {
        C1221aj.m7065a(activity);
        acy acyVar = this.f6385e.get(activity);
        if (acyVar != null) {
            return acyVar;
        }
        acy acyVar2 = new acy(null, m7628a(activity.getClass().getCanonicalName()), mo7389p().m7772y());
        this.f6385e.put(activity, acyVar2);
        return acyVar2;
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7634a(Activity activity, Bundle bundle) {
        acy acyVar;
        if (bundle == null || (acyVar = this.f6385e.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", acyVar.f12761d);
        bundle2.putString("name", acyVar.f12759b);
        bundle2.putString("referrer_name", acyVar.f12760c);
        bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
    }

    /* JADX INFO: renamed from: a */
    public final void m7635a(Activity activity, String str, String str2) {
        if (activity == null) {
            mo7393t().m7401A().m7412a("setCurrentScreen must be called with a non-null activity");
            return;
        }
        mo7392s();
        if (!aay.m7476y()) {
            mo7393t().m7401A().m7412a("setCurrentScreen must be called from the main thread");
            return;
        }
        if (this.f6387g) {
            mo7393t().m7401A().m7412a("Cannot call setCurrentScreen from onScreenChangeCallback");
            return;
        }
        if (this.f6382b == null) {
            mo7393t().m7401A().m7412a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f6385e.get(activity) == null) {
            mo7393t().m7401A().m7412a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m7628a(activity.getClass().getCanonicalName());
        }
        boolean zEquals = this.f6382b.f12760c.equals(str2);
        boolean zM7725a = aek.m7725a(this.f6382b.f12759b, str);
        if (zEquals && zM7725a) {
            mo7393t().m7402B().m7412a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            mo7393t().m7401A().m7413a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            mo7393t().m7401A().m7413a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        mo7393t().m7405E().m7414a("Setting current screen to name, class", str == null ? "null" : str, str2);
        acy acyVar = new acy(str, str2, mo7389p().m7772y());
        this.f6385e.put(activity, acyVar);
        m7629a(activity, acyVar, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m7636a(AppMeasurement.InterfaceC2119f interfaceC2119f) {
        if (interfaceC2119f == null) {
            mo7393t().m7401A().m7412a("Attempting to register null OnScreenChangeCallback");
        } else {
            this.f6386f.remove(interfaceC2119f);
            this.f6386f.add(interfaceC2119f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7637a(String str, AppMeasurement.C2120g c2120g) {
        mo7376c();
        synchronized (this) {
            if (this.f6389i == null || this.f6389i.equals(str) || c2120g != null) {
                this.f6389i = str;
                this.f6388h = c2120g;
            }
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    /* JADX INFO: renamed from: b */
    public final void m7638b(Activity activity) {
        m7629a(activity, m7633a(activity), false);
        C2079ys c2079ysMo7377d = mo7377d();
        c2079ysMo7377d.mo7392s().m7479a(new RunnableC2082yv(c2079ysMo7377d, c2079ysMo7377d.mo7384k().mo7253b()));
    }

    /* JADX INFO: renamed from: b */
    public final void m7639b(AppMeasurement.InterfaceC2119f interfaceC2119f) {
        this.f6386f.remove(interfaceC2119f);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    /* JADX INFO: renamed from: c */
    public final void m7640c(Activity activity) {
        acy acyVarM7633a = m7633a(activity);
        this.f6383c = this.f6382b;
        this.f6384d = mo7384k().mo7253b();
        this.f6382b = null;
        mo7392s().m7479a(new acx(this, acyVarM7633a));
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    /* JADX INFO: renamed from: d */
    public final void m7641d(Activity activity) {
        this.f6385e.remove(activity);
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

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final acy m7642y() {
        m7584Q();
        mo7376c();
        return this.f6381a;
    }

    /* JADX INFO: renamed from: z */
    public final AppMeasurement.C2120g m7643z() {
        AppMeasurement.C2120g c2120g = this.f6382b;
        if (c2120g == null) {
            return null;
        }
        return new AppMeasurement.C2120g(c2120g);
    }
}
