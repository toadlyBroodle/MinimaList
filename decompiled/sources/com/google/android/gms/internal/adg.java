package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class adg implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6415a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acz f6416b;

    adg(acz aczVar, C2084yx c2084yx) {
        this.f6416b = aczVar;
        this.f6415a = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6416b.f6398b;
        if (interfaceC2108zu == null) {
            this.f6416b.mo7393t().m7410y().m7412a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            interfaceC2108zu.mo7580b(this.f6415a);
            this.f6416b.m7644F();
        } catch (RemoteException e) {
            this.f6416b.mo7393t().m7410y().m7413a("Failed to send measurementEnabled to the service", e);
        }
    }
}
