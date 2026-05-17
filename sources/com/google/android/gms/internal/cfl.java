package com.google.android.gms.internal;

import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: loaded from: classes.dex */
final class cfl implements InterfaceC1236ay {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1700kr f9922a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cff f9923b;

    cfl(cff cffVar, C1700kr c1700kr) {
        this.f9923b = cffVar;
        this.f9922a = c1700kr;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1236ay
    /* JADX INFO: renamed from: a */
    public final void mo7138a(C1071a c1071a) {
        synchronized (this.f9923b.f9908d) {
            this.f9922a.m11656a(new RuntimeException("Connection failed."));
        }
    }
}
