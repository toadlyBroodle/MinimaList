package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class adi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6423a = true;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f6424b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2088za f6425c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C2084yx f6426d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ C2088za f6427e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ acz f6428f;

    adi(acz aczVar, boolean z, boolean z2, C2088za c2088za, C2084yx c2084yx, C2088za c2088za2) {
        this.f6428f = aczVar;
        this.f6424b = z2;
        this.f6425c = c2088za;
        this.f6426d = c2084yx;
        this.f6427e = c2088za2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6428f.f6398b;
        if (interfaceC2108zu == null) {
            this.f6428f.mo7393t().m7410y().m7412a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f6423a) {
            this.f6428f.m7666a(interfaceC2108zu, this.f6424b ? null : this.f6425c, this.f6426d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6427e.f12635a)) {
                    interfaceC2108zu.mo7576a(this.f6425c, this.f6426d);
                } else {
                    interfaceC2108zu.mo7575a(this.f6425c);
                }
            } catch (RemoteException e) {
                this.f6428f.mo7393t().m7410y().m7413a("Failed to send conditional user property to the service", e);
            }
        }
        this.f6428f.m7644F();
    }
}
