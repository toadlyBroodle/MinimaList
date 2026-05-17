package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.yv */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2082yv implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long f12545a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2079ys f12546b;

    RunnableC2082yv(C2079ys c2079ys, long j) {
        this.f12546b = c2079ys;
        this.f12545a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12546b.m12611b(this.f12545a);
    }
}
