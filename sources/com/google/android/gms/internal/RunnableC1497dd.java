package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.dd */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1497dd implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bwx f10435a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cim f10436b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1496dc f10437c;

    RunnableC1497dd(C1496dc c1496dc, bwx bwxVar, cim cimVar) {
        this.f10437c = c1496dc;
        this.f10435a = bwxVar;
        this.f10436b = cimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10437c.m11157a(this.f10435a, this.f10436b);
    }
}
