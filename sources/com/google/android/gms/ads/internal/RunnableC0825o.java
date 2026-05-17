package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0837l;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.o */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0825o implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AdOverlayInfoParcel f4777a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0824n f4778b;

    RunnableC0825o(C0824n c0824n, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f4778b = c0824n;
        this.f4777a = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0710au.m5567c();
        C0837l.m5804a(this.f4778b.f4775a.f4405e.f4517c, this.f4777a, true);
    }
}
