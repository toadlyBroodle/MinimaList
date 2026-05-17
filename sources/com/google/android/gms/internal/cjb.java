package com.google.android.gms.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class cjb extends byy {

    /* JADX INFO: renamed from: a */
    private final Object f10142a = new Object();

    /* JADX INFO: renamed from: b */
    private volatile bza f10143b;

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10420a() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10421a(bza bzaVar) {
        synchronized (this.f10142a) {
            this.f10143b = bzaVar;
        }
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: a */
    public final void mo10422a(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: b */
    public final void mo10423b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: c */
    public final boolean mo10424c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: d */
    public final int mo10425d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: e */
    public final float mo10426e() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: f */
    public final float mo10427f() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: g */
    public final float mo10428g() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: h */
    public final bza mo10429h() {
        bza bzaVar;
        synchronized (this.f10142a) {
            bzaVar = this.f10143b;
        }
        return bzaVar;
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: i */
    public final boolean mo10430i() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.byx
    /* JADX INFO: renamed from: j */
    public final boolean mo10431j() throws RemoteException {
        throw new RemoteException();
    }
}
