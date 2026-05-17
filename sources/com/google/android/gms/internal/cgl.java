package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class cgl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cgm f9942a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cgn f9943b;

    cgl(cfn cfnVar, cgm cgmVar, cgn cgnVar) {
        this.f9942a = cgmVar;
        this.f9943b = cgnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9942a.mo10797a(this.f9943b);
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not propagate interstitial ad event.", e);
        }
    }
}
