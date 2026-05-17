package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cbq;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ag */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0696ag implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbq f4432a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0692ac f4433b;

    RunnableC0696ag(BinderC0692ac binderC0692ac, cbq cbqVar) {
        this.f4433b = binderC0692ac;
        this.f4432a = cbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4433b.f4405e.f4531q != null) {
                this.f4433b.f4405e.f4531q.mo10746a(this.f4432a);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
