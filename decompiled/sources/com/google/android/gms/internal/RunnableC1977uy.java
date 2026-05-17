package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.uy */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1977uy implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1973uu f11719a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1982vc f11720b;

    RunnableC1977uy(BinderC1975uw binderC1975uw, C1973uu c1973uu, C1982vc c1982vc) {
        this.f11719a = c1973uu;
        this.f11720b = c1982vc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11719a.m12388a(this.f11720b);
    }
}
