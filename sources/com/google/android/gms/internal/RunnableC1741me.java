package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.me */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class RunnableC1741me implements Runnable {

    /* JADX INFO: renamed from: a */
    private C1726lq f11040a;

    /* JADX INFO: renamed from: b */
    private boolean f11041b = false;

    RunnableC1741me(C1726lq c1726lq) {
        this.f11040a = c1726lq;
    }

    /* JADX INFO: renamed from: c */
    private final void m11769c() {
        C1596gv.f10711a.removeCallbacks(this);
        C1596gv.f10711a.postDelayed(this, 250L);
    }

    /* JADX INFO: renamed from: a */
    public final void m11770a() {
        this.f11041b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m11771b() {
        this.f11041b = false;
        m11769c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11041b) {
            return;
        }
        this.f11040a.m11719o();
        m11769c();
    }
}
