package com.google.firebase.database.connection.idl;

import android.os.RemoteException;
import com.google.android.gms.internal.bcx;
import com.google.android.gms.internal.bcy;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.g */
/* JADX INFO: loaded from: classes.dex */
final class C2246g implements bcx {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2262w f12926a;

    C2246g(InterfaceC2262w interfaceC2262w) {
        this.f12926a = interfaceC2262w;
    }

    @Override // com.google.android.gms.internal.bcx
    /* JADX INFO: renamed from: a */
    public final void mo8939a(boolean z, bcy bcyVar) {
        try {
            this.f12926a.mo12987a(z, new BinderC2247h(this, bcyVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
