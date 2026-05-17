package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class adh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6417a = true;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f6418b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2104zq f6419c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C2084yx f6420d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ String f6421e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ acz f6422f;

    adh(acz aczVar, boolean z, boolean z2, C2104zq c2104zq, C2084yx c2084yx, String str) {
        this.f6422f = aczVar;
        this.f6418b = z2;
        this.f6419c = c2104zq;
        this.f6420d = c2084yx;
        this.f6421e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu = this.f6422f.f6398b;
        if (interfaceC2108zu == null) {
            this.f6422f.mo7393t().m7410y().m7412a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6417a) {
            this.f6422f.m7666a(interfaceC2108zu, this.f6418b ? null : this.f6419c, this.f6420d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6421e)) {
                    interfaceC2108zu.mo7577a(this.f6419c, this.f6420d);
                } else {
                    interfaceC2108zu.mo7578a(this.f6419c, this.f6421e, this.f6422f.mo7393t().m7406F());
                }
            } catch (RemoteException e) {
                this.f6422f.mo7393t().m7410y().m7413a("Failed to send event to the service", e);
            }
        }
        this.f6422f.m7644F();
    }
}
