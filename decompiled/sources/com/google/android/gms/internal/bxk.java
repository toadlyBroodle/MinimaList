package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bxk implements Runnable {

    /* JADX INFO: renamed from: a */
    private final cej f9288a;

    /* JADX INFO: renamed from: b */
    private final cjk f9289b;

    /* JADX INFO: renamed from: c */
    private final Runnable f9290c;

    public bxk(bvm bvmVar, cej cejVar, cjk cjkVar, Runnable runnable) {
        this.f9288a = cejVar;
        this.f9289b = cjkVar;
        this.f9290c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9289b.f10173c == null) {
            this.f9288a.mo10762a(this.f9289b.f10171a);
        } else {
            this.f9288a.m10759a(this.f9289b.f10173c);
        }
        if (this.f9289b.f10174d) {
            this.f9288a.m10765b("intermediate-response");
        } else {
            this.f9288a.m10767c("done");
        }
        if (this.f9290c != null) {
            this.f9290c.run();
        }
    }
}
