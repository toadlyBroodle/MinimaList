package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class ade implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AppMeasurement.C2120g f6412a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acz f6413b;

    ade(acz aczVar, AppMeasurement.C2120g c2120g) {
        this.f6413b = aczVar;
        this.f6412a = c2120g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6413b.f6398b;
        if (interfaceC2108zu == null) {
            this.f6413b.mo7393t().m7410y().m7412a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f6412a == null) {
                interfaceC2108zu.mo7572a(0L, (String) null, (String) null, this.f6413b.mo7385l().getPackageName());
            } else {
                interfaceC2108zu.mo7572a(this.f6412a.f12761d, this.f6412a.f12759b, this.f6412a.f12760c, this.f6413b.mo7385l().getPackageName());
            }
            this.f6413b.m7644F();
        } catch (RemoteException e) {
            this.f6413b.mo7393t().m7410y().m7413a("Failed to send current screen to the service", e);
        }
    }
}
