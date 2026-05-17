package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.pk */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1828pk implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1869qy f11297a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1823pf f11298b;

    RunnableC1828pk(C1823pf c1823pf, InterfaceC1869qy interfaceC1869qy) {
        this.f11298b = c1823pf;
        this.f11297a = interfaceC1869qy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11298b.f11287a.m12139a(this.f11297a);
    }
}
