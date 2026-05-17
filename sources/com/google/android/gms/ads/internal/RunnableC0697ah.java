package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cbs;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ah */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0697ah implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbs f4434a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0692ac f4435b;

    RunnableC0697ah(BinderC0692ac binderC0692ac, cbs cbsVar) {
        this.f4435b = binderC0692ac;
        this.f4434a = cbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4435b.f4405e.f4532r != null) {
                this.f4435b.f4405e.f4532r.mo10749a(this.f4434a);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
