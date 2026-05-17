package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.j */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1655j implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1702kt f10823a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cne f10824b;

    RunnableC1655j(cne cneVar, InterfaceC1702kt interfaceC1702kt) {
        this.f10824b = cneVar;
        this.f10823a = interfaceC1702kt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10824b.f10409d) {
            this.f10824b.f10406a = this.f10824b.m11150a(this.f10824b.f10408c.f11879j, this.f10823a);
            if (this.f10824b.f10406a == null) {
                this.f10824b.m11146a(0, "Could not start the ad request service.");
                C1596gv.f10711a.removeCallbacks(this.f10824b.f10414i);
            }
        }
    }
}
