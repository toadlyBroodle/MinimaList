package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p018i.C0207a;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ys */
/* JADX INFO: loaded from: classes.dex */
public final class C2079ys extends acc {

    /* JADX INFO: renamed from: a */
    private final Map<String, Long> f12536a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Integer> f12537b;

    /* JADX INFO: renamed from: c */
    private long f12538c;

    public C2079ys(abd abdVar) {
        super(abdVar);
        this.f12537b = new C0207a();
        this.f12536a = new C0207a();
    }

    /* JADX INFO: renamed from: a */
    private final void m12606a(long j, AppMeasurement.C2120g c2120g) {
        if (c2120g == null) {
            mo7393t().m7405E().m7412a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            mo7393t().m7405E().m7413a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        acv.m7632a(c2120g, bundle);
        mo7379f().m7614a("am", "_xa", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m12609a(String str, long j) {
        mo7376c();
        C1221aj.m7067a(str);
        if (this.f12537b.isEmpty()) {
            this.f12538c = j;
        }
        Integer num = this.f12537b.get(str);
        if (num != null) {
            this.f12537b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f12537b.size() >= 100) {
            mo7393t().m7401A().m7412a("Too many ads visible");
        } else {
            this.f12537b.put(str, 1);
            this.f12536a.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m12610a(String str, long j, AppMeasurement.C2120g c2120g) {
        if (c2120g == null) {
            mo7393t().m7405E().m7412a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            mo7393t().m7405E().m7413a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        acv.m7632a(c2120g, bundle);
        mo7379f().m7614a("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m12611b(long j) {
        Iterator<String> it = this.f12536a.keySet().iterator();
        while (it.hasNext()) {
            this.f12536a.put(it.next(), Long.valueOf(j));
        }
        if (this.f12536a.isEmpty()) {
            return;
        }
        this.f12538c = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m12613b(String str, long j) {
        mo7376c();
        C1221aj.m7067a(str);
        Integer num = this.f12537b.get(str);
        if (num == null) {
            mo7393t().m7410y().m7413a("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        acy acyVarM7642y = mo7383j().m7642y();
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            this.f12537b.put(str, Integer.valueOf(iIntValue));
            return;
        }
        this.f12537b.remove(str);
        Long l = this.f12536a.get(str);
        if (l == null) {
            mo7393t().m7410y().m7412a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            this.f12536a.remove(str);
            m12610a(str, jLongValue, acyVarM7642y);
        }
        if (this.f12537b.isEmpty()) {
            if (this.f12538c == 0) {
                mo7393t().m7410y().m7412a("First ad exposure time was never set");
            } else {
                m12606a(j - this.f12538c, acyVarM7642y);
                this.f12538c = 0L;
            }
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final void m12614a(long j) {
        acy acyVarM7642y = mo7383j().m7642y();
        for (String str : this.f12536a.keySet()) {
            m12610a(str, j - this.f12536a.get(str).longValue(), acyVarM7642y);
        }
        if (!this.f12536a.isEmpty()) {
            m12606a(j - this.f12538c, acyVarM7642y);
        }
        m12611b(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m12615a(String str) {
        if (str == null || str.length() == 0) {
            mo7393t().m7410y().m7412a("Ad unit id must be a non-empty string");
        } else {
            mo7392s().m7479a(new RunnableC2080yt(this, str, mo7384k().mo7253b()));
        }
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    /* JADX INFO: renamed from: b */
    public final void m12616b(String str) {
        if (str == null || str.length() == 0) {
            mo7393t().m7410y().m7412a("Ad unit id must be a non-empty string");
        } else {
            mo7392s().m7479a(new RunnableC2081yu(this, str, mo7384k().mo7253b()));
        }
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
}
