package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.bcs;
import com.google.android.gms.internal.bdc;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.al */
/* JADX INFO: loaded from: classes.dex */
final class C2240al implements bdc {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2231ac f12920a;

    C2240al(IPersistentConnectionImpl iPersistentConnectionImpl, InterfaceC2231ac interfaceC2231ac) {
        this.f12920a = interfaceC2231ac;
    }

    @Override // com.google.android.gms.internal.bdc
    /* JADX INFO: renamed from: a */
    public final String mo8956a() {
        try {
            return this.f12920a.mo12978a();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdc
    /* JADX INFO: renamed from: b */
    public final boolean mo8957b() {
        try {
            return this.f12920a.mo12979b();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.bdc
    /* JADX INFO: renamed from: c */
    public final bcs mo8958c() {
        try {
            return C2228a.m12974a(this.f12920a.mo12980c());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
