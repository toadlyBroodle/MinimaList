package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.pj */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1827pj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1877rf f11295a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1823pf f11296b;

    RunnableC1827pj(C1823pf c1823pf, C1877rf c1877rf) {
        this.f11296b = c1823pf;
        this.f11295a = c1877rf;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f11296b.f11287a.m12140a(this.f11295a);
    }
}
