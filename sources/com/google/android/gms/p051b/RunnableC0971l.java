package com.google.android.gms.p051b;

/* JADX INFO: renamed from: com.google.android.gms.b.l */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0971l implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC0964e f5121a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0970k f5122b;

    RunnableC0971l(C0970k c0970k, AbstractC0964e abstractC0964e) {
        this.f5122b = c0970k;
        this.f5121a = abstractC0964e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5122b.f5119b) {
            if (this.f5122b.f5120c != null) {
                this.f5122b.f5120c.mo6205a(this.f5121a.mo6216d());
            }
        }
    }
}
