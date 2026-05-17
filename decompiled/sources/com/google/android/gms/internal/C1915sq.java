package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: renamed from: com.google.android.gms.internal.sq */
/* JADX INFO: loaded from: classes.dex */
public final class C1915sq extends AbstractC1256c<InterfaceC1916sr> {
    public C1915sq(Context context, Looper looper, C1248bj c1248bj, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 74, c1248bj, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1916sr ? (InterfaceC1916sr) iInterfaceQueryLocalInterface : new C1917ss(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }
}
