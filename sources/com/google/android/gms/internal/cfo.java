package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cfo extends bxt {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cfn f9929a;

    cfo(cfn cfnVar) {
        this.f9929a = cfnVar;
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: a */
    public final void mo10364a() {
        this.f9929a.f9928a.add(new cfp(this));
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: a */
    public final void mo10365a(int i) {
        this.f9929a.f9928a.add(new cfq(this, i));
        C1560fm.m11343a("Pooled interstitial failed to load.");
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: b */
    public final void mo10366b() {
        this.f9929a.f9928a.add(new cfr(this));
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: c */
    public final void mo10367c() {
        this.f9929a.f9928a.add(new cfs(this));
        C1560fm.m11343a("Pooled interstitial loaded.");
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: d */
    public final void mo10368d() {
        this.f9929a.f9928a.add(new cft(this));
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: e */
    public final void mo10369e() {
        this.f9929a.f9928a.add(new cfv(this));
    }

    @Override // com.google.android.gms.internal.bxs
    /* JADX INFO: renamed from: f */
    public final void mo10370f() {
        this.f9929a.f9928a.add(new cfu(this));
    }
}
