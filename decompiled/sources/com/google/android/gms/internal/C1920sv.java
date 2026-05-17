package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C0915a;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: renamed from: com.google.android.gms.internal.sv */
/* JADX INFO: loaded from: classes.dex */
public final class C1920sv extends AbstractC1256c<InterfaceC1922sx> {

    /* JADX INFO: renamed from: d */
    private final C0915a.a f11528d;

    public C1920sv(Context context, Looper looper, C1248bj c1248bj, C0915a.a aVar, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 68, c1248bj, bVar, cVar);
        this.f11528d = aVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1922sx ? (InterfaceC1922sx) iInterfaceQueryLocalInterface : new C1923sy(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: u */
    protected final Bundle mo7129u() {
        return this.f11528d == null ? new Bundle() : this.f11528d.m6099a();
    }
}
