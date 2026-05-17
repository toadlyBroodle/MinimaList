package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class bwm {

    /* JADX INFO: renamed from: a */
    private final byte[] f9190a;

    /* JADX INFO: renamed from: b */
    private int f9191b;

    /* JADX INFO: renamed from: c */
    private int f9192c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bwk f9193d;

    private bwm(bwk bwkVar, byte[] bArr) {
        this.f9193d = bwkVar;
        this.f9190a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final bwm m10359a(int i) {
        this.f9191b = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10360a() {
        try {
            if (this.f9193d.f9189b) {
                this.f9193d.f9188a.mo10184a(this.f9190a);
                this.f9193d.f9188a.mo10181a(this.f9191b);
                this.f9193d.f9188a.mo10186b(this.f9192c);
                this.f9193d.f9188a.mo10185a((int[]) null);
                this.f9193d.f9188a.mo10180a();
            }
        } catch (RemoteException e) {
            C1668jm.m11608a("Clearcut log failed", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final bwm m10361b(int i) {
        this.f9192c = i;
        return this;
    }
}
