package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cbq;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bn */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0730bn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbq f4570a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0728bl f4571b;

    RunnableC0730bn(BinderC0728bl binderC0728bl, cbq cbqVar) {
        this.f4571b = binderC0728bl;
        this.f4570a = cbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4571b.f4405e.f4531q != null) {
                this.f4571b.f4405e.f4531q.mo10746a(this.f4570a);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
