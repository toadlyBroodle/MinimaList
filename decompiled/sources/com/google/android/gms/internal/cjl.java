package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.C0631a;

/* JADX INFO: loaded from: classes.dex */
final class cjl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0631a.a f10175a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cjj f10176b;

    cjl(cjj cjjVar, C0631a.a aVar) {
        this.f10176b = cjjVar;
        this.f10175a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10176b.f10170a.mo10869a(cjn.m11028a(this.f10175a));
        } catch (RemoteException e) {
            C1668jm.m11613c("Could not call onAdFailedToLoad.", e);
        }
    }
}
