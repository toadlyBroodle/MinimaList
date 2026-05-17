package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.BinderC0822l;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.C0733bq;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cgv extends bye {

    /* JADX INFO: renamed from: a */
    private final String f9973a;

    /* JADX INFO: renamed from: b */
    private boolean f9974b;

    /* JADX INFO: renamed from: c */
    private final cfm f9975c;

    /* JADX INFO: renamed from: d */
    private BinderC0822l f9976d;

    /* JADX INFO: renamed from: e */
    private final cgn f9977e;

    public cgv(Context context, String str, cii ciiVar, C1670jo c1670jo, C0733bq c0733bq) {
        this(str, new cfm(context, ciiVar, c1670jo, c0733bq));
    }

    private cgv(String str, cfm cfmVar) {
        this.f9973a = str;
        this.f9975c = cfmVar;
        this.f9977e = new cgn();
        C0710au.m5581q().m10818a(cfmVar);
    }

    /* JADX INFO: renamed from: c */
    private final void m10845c() {
        if (this.f9976d != null) {
            return;
        }
        this.f9976d = this.f9975c.m10792a(this.f9973a);
        this.f9977e.m10805a(this.f9976d);
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: A */
    public final String mo5443A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: B */
    public final byi mo5444B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: C */
    public final bxs mo5445C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: D */
    public final void mo5503D() {
        if (this.f9976d == null) {
            C1560fm.m11615e("Interstitial ad must be loaded before showInterstitial().");
        } else {
            this.f9976d.mo5474c(this.f9974b);
            this.f9976d.mo5503D();
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final String mo5549a() {
        if (this.f9976d != null) {
            return this.f9976d.mo5549a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5450a(bxb bxbVar) {
        if (this.f9976d != null) {
            this.f9976d.mo5450a(bxbVar);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5451a(bxp bxpVar) {
        this.f9977e.f9947d = bxpVar;
        if (this.f9976d != null) {
            this.f9977e.m10805a(this.f9976d);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5452a(bxs bxsVar) {
        this.f9977e.f9944a = bxsVar;
        if (this.f9976d != null) {
            this.f9977e.m10805a(this.f9976d);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5453a(byi byiVar) {
        this.f9977e.f9945b = byiVar;
        if (this.f9976d != null) {
            this.f9977e.m10805a(this.f9976d);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5454a(byp bypVar) {
        m10845c();
        if (this.f9976d != null) {
            this.f9976d.mo5454a(bypVar);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5455a(bzd bzdVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5456a(bzw bzwVar) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5458a(cbh cbhVar) {
        this.f9977e.f9946c = cbhVar;
        if (this.f9976d != null) {
            this.f9977e.m10805a(this.f9976d);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5459a(ckp ckpVar) {
        C1560fm.m11615e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5460a(ckv ckvVar, String str) {
        C1560fm.m11615e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5461a(InterfaceC1487cu interfaceC1487cu) {
        this.f9977e.f9948e = interfaceC1487cu;
        if (this.f9976d != null) {
            this.f9977e.m10805a(this.f9976d);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: a */
    public final void mo5464a(String str) {
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final void mo5472b(boolean z) {
        m10845c();
        if (this.f9976d != null) {
            this.f9976d.mo5472b(z);
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: b */
    public final boolean mo5473b(bwx bwxVar) {
        if (!cgq.m10806a(bwxVar).contains("gw")) {
            m10845c();
        }
        if (cgq.m10806a(bwxVar).contains("_skipMediation")) {
            m10845c();
        }
        if (bwxVar.f9216j != null) {
            m10845c();
        }
        if (this.f9976d != null) {
            return this.f9976d.mo5473b(bwxVar);
        }
        cgq cgqVarM5581q = C0710au.m5581q();
        if (cgq.m10806a(bwxVar).contains("_ad")) {
            cgqVarM5581q.m10819b(bwxVar, this.f9973a);
        }
        cgt cgtVarM10816a = cgqVarM5581q.m10816a(bwxVar, this.f9973a);
        if (cgtVarM10816a == null) {
            m10845c();
            cgu.m10834a().m10839e();
            return this.f9976d.mo5473b(bwxVar);
        }
        if (cgtVarM10816a.f9964e) {
            cgu.m10834a().m10838d();
        } else {
            cgtVarM10816a.m10833a();
            cgu.m10834a().m10839e();
        }
        this.f9976d = cgtVarM10816a.f9960a;
        cgtVarM10816a.f9962c.m10796a(this.f9977e);
        this.f9977e.m10805a(this.f9976d);
        return cgtVarM10816a.f9965f;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: c */
    public final void mo5474c(boolean z) {
        this.f9974b = z;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: f_ */
    public final String mo5554f_() {
        if (this.f9976d != null) {
            return this.f9976d.mo5554f_();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: i */
    public final void mo5479i() {
        if (this.f9976d != null) {
            this.f9976d.mo5479i();
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: j */
    public final InterfaceC0652a mo5480j() {
        if (this.f9976d != null) {
            return this.f9976d.mo5480j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: k */
    public final bxb mo5481k() {
        if (this.f9976d != null) {
            return this.f9976d.mo5481k();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: l */
    public final boolean mo5482l() {
        return this.f9976d != null && this.f9976d.mo5482l();
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: m */
    public final void mo5483m() {
        if (this.f9976d != null) {
            this.f9976d.mo5483m();
        } else {
            C1560fm.m11615e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: n */
    public final void mo5484n() {
        if (this.f9976d != null) {
            this.f9976d.mo5484n();
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: o */
    public final void mo5485o() {
        if (this.f9976d != null) {
            this.f9976d.mo5485o();
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: p */
    public final void mo5486p() {
        if (this.f9976d != null) {
            this.f9976d.mo5486p();
        }
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: q */
    public final boolean mo5487q() {
        return this.f9976d != null && this.f9976d.mo5487q();
    }

    @Override // com.google.android.gms.internal.byd
    /* JADX INFO: renamed from: r */
    public final byx mo5488r() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }
}
