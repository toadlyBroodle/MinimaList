package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class adl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6442a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aeh f6443b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2084yx f6444c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ acz f6445d;

    adl(acz aczVar, boolean z, aeh aehVar, C2084yx c2084yx) {
        this.f6445d = aczVar;
        this.f6442a = z;
        this.f6443b = aehVar;
        this.f6444c = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6445d.f6398b;
        if (interfaceC2108zu == null) {
            this.f6445d.mo7393t().m7410y().m7412a("Discarding data. Failed to set user attribute");
        } else {
            this.f6445d.m7666a(interfaceC2108zu, this.f6442a ? null : this.f6443b, this.f6444c);
            this.f6445d.m7644F();
        }
    }
}
