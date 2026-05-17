package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0837l;

/* JADX INFO: loaded from: classes.dex */
final class cjq implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AdOverlayInfoParcel f10182a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ zzwl f10183b;

    cjq(zzwl zzwlVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f10183b = zzwlVar;
        this.f10182a = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0710au.m5567c();
        C0837l.m5804a(this.f10183b.f12750a, this.f10182a, true);
    }
}
