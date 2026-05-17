package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bg */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1119bg implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ LifecycleCallback f5652a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f5653b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ FragmentC1118bf f5654c;

    RunnableC1119bg(FragmentC1118bf fragmentC1118bf, LifecycleCallback lifecycleCallback, String str) {
        this.f5654c = fragmentC1118bf;
        this.f5652a = lifecycleCallback;
        this.f5653b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5654c.f5650c > 0) {
            this.f5652a.mo6718a(this.f5654c.f5651d != null ? this.f5654c.f5651d.getBundle(this.f5653b) : null);
        }
        if (this.f5654c.f5650c >= 2) {
            this.f5652a.mo6720b();
        }
        if (this.f5654c.f5650c >= 3) {
            this.f5652a.mo6722c();
        }
        if (this.f5654c.f5650c >= 4) {
            this.f5652a.mo6250d();
        }
        if (this.f5654c.f5650c >= 5) {
            this.f5652a.m6723e();
        }
    }
}
