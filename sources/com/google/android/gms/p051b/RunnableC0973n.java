package com.google.android.gms.p051b;

/* JADX INFO: renamed from: com.google.android.gms.b.n */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0973n implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC0964e f5126a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0972m f5127b;

    RunnableC0973n(C0972m c0972m, AbstractC0964e abstractC0964e) {
        this.f5127b = c0972m;
        this.f5126a = abstractC0964e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5127b.f5124b) {
            if (this.f5127b.f5125c != null) {
                this.f5127b.f5125c.mo6206a(this.f5126a.mo6215c());
            }
        }
    }
}
