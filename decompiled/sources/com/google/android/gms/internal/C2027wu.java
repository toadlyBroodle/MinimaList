package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: renamed from: com.google.android.gms.internal.wu */
/* JADX INFO: loaded from: classes.dex */
public final class C2027wu extends AbstractC1256c<InterfaceC2030wx> {
    public C2027wu(Context context, Looper looper, C1248bj c1248bj, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 39, c1248bj, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2030wx ? (InterfaceC2030wx) iInterfaceQueryLocalInterface : new C2031wy(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    public final String mo6171j_() {
        return "com.google.android.gms.common.service.START";
    }
}
