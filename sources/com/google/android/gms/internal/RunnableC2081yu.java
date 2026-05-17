package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.yu */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2081yu implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f12542a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f12543b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2079ys f12544c;

    RunnableC2081yu(C2079ys c2079ys, String str, long j) {
        this.f12544c = c2079ys;
        this.f12542a = str;
        this.f12543b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12544c.m12613b(this.f12542a, this.f12543b);
    }
}
