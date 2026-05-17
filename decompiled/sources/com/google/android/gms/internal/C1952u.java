package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1233av;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: renamed from: com.google.android.gms.internal.u */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1952u extends AbstractC1233av<InterfaceC1359ae> {

    /* JADX INFO: renamed from: d */
    private int f11625d;

    public C1952u(Context context, Looper looper, InterfaceC1235ax interfaceC1235ax, InterfaceC1236ay interfaceC1236ay, int i) {
        super(context.getApplicationContext() != null ? context.getApplicationContext() : context, looper, 8, interfaceC1235ax, interfaceC1236ay, null);
        this.f11625d = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1359ae ? (InterfaceC1359ae) iInterfaceQueryLocalInterface : new C1361ag(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC1359ae m12351e() {
        return (InterfaceC1359ae) super.m7131w();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.ads.service.START";
    }
}
