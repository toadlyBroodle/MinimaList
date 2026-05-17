package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class bzr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bzq f9375a;

    bzr(bzq bzqVar) {
        this.f9375a = bzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9375a.f9374a != null) {
            try {
                this.f9375a.f9374a.mo10365a(1);
            } catch (RemoteException e) {
                C1668jm.m11613c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
