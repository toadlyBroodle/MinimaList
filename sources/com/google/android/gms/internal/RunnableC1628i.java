package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.i */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1628i implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cne f10765a;

    RunnableC1628i(cne cneVar) {
        this.f10765a = cneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10765a.f10409d) {
            if (this.f10765a.f10406a == null) {
                return;
            }
            this.f10765a.mo5770b();
            this.f10765a.m11146a(2, "Timed out waiting for ad response.");
        }
    }
}
