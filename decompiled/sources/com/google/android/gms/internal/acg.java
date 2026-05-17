package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class acg implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6337a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acf f6338b;

    acg(acf acfVar, boolean z) {
        this.f6338b = acfVar;
        this.f6337a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6338b.m7601c(this.f6337a);
    }
}
