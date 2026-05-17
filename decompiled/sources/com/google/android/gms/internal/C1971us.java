package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;

/* JADX INFO: renamed from: com.google.android.gms.internal.us */
/* JADX INFO: loaded from: classes.dex */
public final class C1971us extends AbstractC1256c<InterfaceC1989vj> {
    public C1971us(Context context, Looper looper, C1248bj c1248bj, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 161, c1248bj, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1989vj ? (InterfaceC1989vj) iInterfaceQueryLocalInterface : new C1990vk(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
