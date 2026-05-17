package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.pg */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1824pg implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ int f11288a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1823pf f11289b;

    RunnableC1824pg(C1823pf c1823pf, int i) {
        this.f11289b = c1823pf;
        this.f11288a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11289b.f11287a.m12137a(((long) this.f11288a) * 1000);
    }
}
