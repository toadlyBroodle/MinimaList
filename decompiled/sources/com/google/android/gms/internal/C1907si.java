package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: renamed from: com.google.android.gms.internal.si */
/* JADX INFO: loaded from: classes.dex */
public final class C1907si extends AbstractC1256c<InterfaceC1911sm> {

    /* JADX INFO: renamed from: d */
    private final String f11515d;

    public C1907si(Context context, Looper looper, AbstractC1079f.b bVar, AbstractC1079f.c cVar, C1248bj c1248bj) {
        super(context, looper, 77, c1248bj, bVar, cVar);
        this.f11515d = c1248bj.m7154g();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1911sm ? (InterfaceC1911sm) iInterfaceQueryLocalInterface : new C1912sn(iBinder);
    }

    /* JADX INFO: renamed from: a */
    public final void m12308a(InterfaceC1909sk interfaceC1909sk) {
        try {
            ((InterfaceC1911sm) m7131w()).mo12309a(interfaceC1909sk);
        } catch (RemoteException e) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.appinvite.internal.IAppInviteService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.appinvite.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: u */
    protected final Bundle mo7129u() {
        Bundle bundle = new Bundle();
        bundle.putString("authPackage", this.f11515d);
        return bundle;
    }
}
