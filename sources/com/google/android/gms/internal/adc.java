package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class adc implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6407a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6408b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ acz f6409c;

    adc(acz aczVar, AtomicReference atomicReference, C2084yx c2084yx) {
        this.f6409c = aczVar;
        this.f6407a = atomicReference;
        this.f6408b = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu;
        synchronized (this.f6407a) {
            try {
                try {
                    interfaceC2108zu = this.f6409c.f6398b;
                } catch (RemoteException e) {
                    this.f6409c.mo7393t().m7410y().m7413a("Failed to get app instance id", e);
                    this.f6407a.notify();
                }
                if (interfaceC2108zu == null) {
                    this.f6409c.mo7393t().m7410y().m7412a("Failed to get app instance id");
                    return;
                }
                this.f6407a.set(interfaceC2108zu.mo7581c(this.f6408b));
                String str = (String) this.f6407a.get();
                if (str != null) {
                    this.f6409c.mo7379f().m7613a(str);
                    this.f6409c.mo7394u().f6148i.m7449a(str);
                }
                this.f6409c.m7644F();
            } finally {
                this.f6407a.notify();
            }
        }
    }
}
