package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class adm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6446a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6447b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ boolean f6448c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ acz f6449d;

    adm(acz aczVar, AtomicReference atomicReference, C2084yx c2084yx, boolean z) {
        this.f6449d = aczVar;
        this.f6446a = atomicReference;
        this.f6447b = c2084yx;
        this.f6448c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2108zu interfaceC2108zu;
        synchronized (this.f6446a) {
            try {
                try {
                    interfaceC2108zu = this.f6449d.f6398b;
                } catch (RemoteException e) {
                    this.f6449d.mo7393t().m7410y().m7413a("Failed to get user properties", e);
                    this.f6446a.notify();
                }
                if (interfaceC2108zu == null) {
                    this.f6449d.mo7393t().m7410y().m7412a("Failed to get user properties");
                } else {
                    this.f6446a.set(interfaceC2108zu.mo7567a(this.f6447b, this.f6448c));
                    this.f6449d.m7644F();
                }
            } finally {
                this.f6446a.notify();
            }
        }
    }
}
