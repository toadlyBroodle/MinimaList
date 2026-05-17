package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class bzp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bzo f9373a;

    bzp(bzo bzoVar) {
        this.f9373a = bzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9373a.f9372a.f9371a != null) {
            try {
                this.f9373a.f9372a.f9371a.mo10365a(1);
            } catch (RemoteException e) {
                C1668jm.m11613c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
