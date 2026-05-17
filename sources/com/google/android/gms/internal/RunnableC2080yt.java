package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.yt */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2080yt implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f12539a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f12540b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2079ys f12541c;

    RunnableC2080yt(C2079ys c2079ys, String str, long j) {
        this.f12541c = c2079ys;
        this.f12539a = str;
        this.f12540b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12541c.m12609a(this.f12539a, this.f12540b);
    }
}
