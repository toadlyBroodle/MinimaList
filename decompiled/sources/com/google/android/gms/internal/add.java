package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class add implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6410a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acz f6411b;

    add(acz aczVar, C2084yx c2084yx) {
        this.f6411b = aczVar;
        this.f6410a = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6411b.f6398b;
        if (interfaceC2108zu == null) {
            this.f6411b.mo7393t().m7410y().m7412a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            interfaceC2108zu.mo7574a(this.f6410a);
            this.f6411b.m7666a(interfaceC2108zu, null, this.f6410a);
            this.f6411b.m7644F();
        } catch (RemoteException e) {
            this.f6411b.mo7393t().m7410y().m7413a("Failed to send app launch to the service", e);
        }
    }
}
