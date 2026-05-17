package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.p043a.BinderC0654c;

/* JADX INFO: renamed from: com.google.android.gms.internal.df */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1499df implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cim f10443a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bwx f10444b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ BinderC1505dl f10445c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1496dc f10446d;

    RunnableC1499df(C1496dc c1496dc, cim cimVar, bwx bwxVar, BinderC1505dl binderC1505dl) {
        this.f10446d = c1496dc;
        this.f10443a = cimVar;
        this.f10444b = bwxVar;
        this.f10445c = binderC1505dl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10443a.mo10944a(BinderC0654c.m5329a(this.f10446d.f10424b), this.f10444b, (String) null, this.f10445c, this.f10446d.f10429g);
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(this.f10446d.f10428f);
            C1560fm.m11613c(strValueOf.length() != 0 ? "Fail to initialize adapter ".concat(strValueOf) : new String("Fail to initialize adapter "), e);
            this.f10446d.mo11164a(this.f10446d.f10428f, 0);
        }
    }
}
