package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.bcy;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.f */
/* JADX INFO: loaded from: classes.dex */
final class C2245f implements bcy {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2265z f12925a;

    C2245f(BinderC2244e binderC2244e, InterfaceC2265z interfaceC2265z) {
        this.f12925a = interfaceC2265z;
    }

    @Override // com.google.android.gms.internal.bcy
    /* JADX INFO: renamed from: a */
    public final void mo8940a(String str) {
        try {
            this.f12925a.mo12976a(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bcy
    /* JADX INFO: renamed from: b */
    public final void mo8941b(String str) {
        try {
            this.f12925a.mo12977b(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
