package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.bh */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1430bh implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1979v f8144a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ InterfaceC1362ah f8145b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ BinderC1428bf f8146c;

    RunnableC1430bh(BinderC1428bf binderC1428bf, C1979v c1979v, InterfaceC1362ah interfaceC1362ah) {
        this.f8146c = binderC1428bf;
        this.f8144a = c1979v;
        this.f8145b = interfaceC1362ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2087z c2087z;
        try {
            c2087z = this.f8146c.mo7701a(this.f8144a);
        } catch (Exception e) {
            C0710au.m5573i().m11292a(e, "AdRequestServiceImpl.loadAdAsync");
            C1560fm.m11613c("Could not fetch ad response due to an Exception.", e);
            c2087z = null;
        }
        if (c2087z == null) {
            c2087z = new C2087z(0);
        }
        try {
            this.f8145b.mo7903a(c2087z);
        } catch (RemoteException e2) {
            C1560fm.m11613c("Fail to forward ad response.", e2);
        }
    }
}
