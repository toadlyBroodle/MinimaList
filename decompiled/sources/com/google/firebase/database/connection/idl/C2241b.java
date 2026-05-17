package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.bdw;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.b */
/* JADX INFO: loaded from: classes.dex */
final class C2241b implements bdw {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2248i f12921a;

    C2241b(InterfaceC2248i interfaceC2248i) {
        this.f12921a = interfaceC2248i;
    }

    @Override // com.google.android.gms.internal.bdw
    /* JADX INFO: renamed from: a */
    public final void mo9046a(String str, String str2) {
        try {
            this.f12921a.mo12988a(str, str2);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
