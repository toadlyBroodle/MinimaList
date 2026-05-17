package com.google.android.gms.p051b;

/* JADX INFO: renamed from: com.google.android.gms.b.j */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0969j implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC0964e f5116a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0968i f5117b;

    RunnableC0969j(C0968i c0968i, AbstractC0964e abstractC0964e) {
        this.f5117b = c0968i;
        this.f5116a = abstractC0964e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5117b.f5114b) {
            if (this.f5117b.f5115c != null) {
                this.f5117b.f5115c.mo4877a(this.f5116a);
            }
        }
    }
}
