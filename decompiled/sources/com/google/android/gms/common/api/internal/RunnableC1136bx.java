package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bx */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1136bx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ LifecycleCallback f5682a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f5683b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1135bw f5684c;

    RunnableC1136bx(C1135bw c1135bw, LifecycleCallback lifecycleCallback, String str) {
        this.f5684c = c1135bw;
        this.f5682a = lifecycleCallback;
        this.f5683b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5684c.f5680c > 0) {
            this.f5682a.mo6718a(this.f5684c.f5681d != null ? this.f5684c.f5681d.getBundle(this.f5683b) : null);
        }
        if (this.f5684c.f5680c >= 2) {
            this.f5682a.mo6720b();
        }
        if (this.f5684c.f5680c >= 3) {
            this.f5682a.mo6722c();
        }
        if (this.f5684c.f5680c >= 4) {
            this.f5682a.mo6250d();
        }
        if (this.f5684c.f5680c >= 5) {
            this.f5682a.m6723e();
        }
    }
}
