package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bje {

    /* JADX INFO: renamed from: a */
    private final blf f8246a;

    /* JADX INFO: renamed from: b */
    private final boolean f8247b;

    /* JADX INFO: renamed from: c */
    private final boolean f8248c;

    public bje(blf blfVar, boolean z, boolean z2) {
        this.f8246a = blfVar;
        this.f8247b = z;
        this.f8248c = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9436a() {
        return this.f8247b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9437a(bfa bfaVar) {
        return bfaVar.m9162h() ? this.f8247b && !this.f8248c : m9438a(bfaVar.m9158d());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9438a(bkp bkpVar) {
        return (this.f8247b && !this.f8248c) || this.f8246a.m9616a().mo9565a(bkpVar);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9439b() {
        return this.f8248c;
    }

    /* JADX INFO: renamed from: c */
    public final bln m9440c() {
        return this.f8246a.m9616a();
    }

    /* JADX INFO: renamed from: d */
    public final blf m9441d() {
        return this.f8246a;
    }
}
