package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C0924e;
import com.google.android.gms.auth.api.C0926g;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: renamed from: com.google.android.gms.internal.sz */
/* JADX INFO: loaded from: classes.dex */
public final class C1924sz extends AbstractC1256c<InterfaceC1926ta> {

    /* JADX INFO: renamed from: d */
    private final Bundle f11529d;

    public C1924sz(Context context, Looper looper, C1248bj c1248bj, C0926g c0926g, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 16, c1248bj, bVar, cVar);
        if (c0926g != null) {
            throw new NoSuchMethodError();
        }
        this.f11529d = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1926ta ? (InterfaceC1926ta) iInterfaceQueryLocalInterface : new C1927tb(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.api.C1074a.f
    /* JADX INFO: renamed from: i */
    public final boolean mo6643i() {
        C1248bj c1248bjM7176n = m7176n();
        return (TextUtils.isEmpty(c1248bjM7176n.m7146a()) || c1248bjM7176n.m7147a(C0924e.f5030a).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: u */
    protected final Bundle mo7129u() {
        return this.f11529d;
    }
}
