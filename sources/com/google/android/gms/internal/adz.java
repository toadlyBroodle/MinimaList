package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: loaded from: classes.dex */
public final class adz extends acd {

    /* JADX INFO: renamed from: a */
    private Handler f6472a;

    /* JADX INFO: renamed from: b */
    private long f6473b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2095zh f6474c;

    /* JADX INFO: renamed from: d */
    private final AbstractC2095zh f6475d;

    adz(abd abdVar) {
        super(abdVar);
        this.f6474c = new aea(this, this.f6329p);
        this.f6475d = new aeb(this, this.f6329p);
        this.f6473b = mo7384k().mo7253b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m7693a(long j) {
        mo7376c();
        m7698y();
        this.f6474c.m12756c();
        this.f6475d.m12756c();
        mo7393t().m7405E().m7413a("Activity resumed, time", Long.valueOf(j));
        this.f6473b = j;
        if (mo7384k().mo7252a() - mo7394u().f6150k.m7442a() > mo7394u().f6152m.m7442a()) {
            mo7394u().f6151l.m7439a(true);
            mo7394u().f6153n.m7443a(0L);
        }
        if (mo7394u().f6151l.m7440a()) {
            this.f6474c.m12754a(Math.max(0L, mo7394u().f6149j.m7442a() - mo7394u().f6153n.m7442a()));
        } else {
            this.f6475d.m12754a(Math.max(0L, 3600000 - mo7394u().f6153n.m7442a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m7696b(long j) {
        mo7376c();
        m7698y();
        this.f6474c.m12756c();
        this.f6475d.m12756c();
        mo7393t().m7405E().m7413a("Activity paused, time", Long.valueOf(j));
        if (this.f6473b != 0) {
            mo7394u().f6153n.m7443a(mo7394u().f6153n.m7442a() + (j - this.f6473b));
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m7698y() {
        synchronized (this) {
            if (this.f6472a == null) {
                this.f6472a = new Handler(Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final void m7699z() {
        mo7376c();
        m7700a(false);
        mo7377d().m12614a(mo7384k().mo7253b());
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7700a(boolean z) {
        mo7376c();
        m7584Q();
        long jMo7253b = mo7384k().mo7253b();
        mo7394u().f6152m.m7443a(mo7384k().mo7252a());
        long j = jMo7253b - this.f6473b;
        if (!z && j < 1000) {
            mo7393t().m7405E().m7413a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
            return false;
        }
        mo7394u().f6153n.m7443a(j);
        mo7393t().m7405E().m7413a("Recording user engagement, ms", Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j);
        acv.m7632a(mo7383j().m7642y(), bundle);
        mo7379f().m7614a("auto", "_e", bundle);
        this.f6473b = jMo7253b;
        this.f6475d.m12756c();
        this.f6475d.m12754a(Math.max(0L, 3600000 - mo7394u().f6153n.m7442a()));
        return true;
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
}
