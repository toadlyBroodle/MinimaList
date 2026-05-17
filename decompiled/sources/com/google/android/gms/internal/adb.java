package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class adb implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6405a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acz f6406b;

    adb(acz aczVar, C2084yx c2084yx) {
        this.f6406b = aczVar;
        this.f6405a = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6406b.f6398b;
        if (interfaceC2108zu == null) {
            this.f6406b.mo7393t().m7410y().m7412a("Failed to reset data on the service; null service");
            return;
        }
        try {
            interfaceC2108zu.mo7582d(this.f6405a);
        } catch (RemoteException e) {
            this.f6406b.mo7393t().m7410y().m7413a("Failed to reset data on the service", e);
        }
        this.f6406b.m7644F();
    }
}
