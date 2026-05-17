package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cbs;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bo */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0731bo implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbs f4572a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0728bl f4573b;

    RunnableC0731bo(BinderC0728bl binderC0728bl, cbs cbsVar) {
        this.f4573b = binderC0728bl;
        this.f4572a = cbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4573b.f4405e.f4532r != null) {
                this.f4573b.f4405e.f4532r.mo10749a(this.f4572a);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
