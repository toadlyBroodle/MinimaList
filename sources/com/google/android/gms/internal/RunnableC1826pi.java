package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.pi */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1826pi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f11292a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Runnable f11293b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1823pf f11294c;

    RunnableC1826pi(C1823pf c1823pf, String str, Runnable runnable) {
        this.f11294c = c1823pf;
        this.f11292a = str;
        this.f11293b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11294c.f11287a.m12141a(this.f11292a);
        if (this.f11293b != null) {
            this.f11293b.run();
        }
    }
}
