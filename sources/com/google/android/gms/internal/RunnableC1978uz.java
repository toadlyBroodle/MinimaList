package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.uz */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1978uz implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1973uu f11721a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1962uj f11722b;

    RunnableC1978uz(BinderC1975uw binderC1975uw, C1973uu c1973uu, C1962uj c1962uj) {
        this.f11721a = c1973uu;
        this.f11722b = c1962uj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11721a.m12384a(this.f11722b);
    }
}
