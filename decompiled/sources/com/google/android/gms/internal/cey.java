package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1233av;
import com.google.android.gms.common.internal.InterfaceC1235ax;
import com.google.android.gms.common.internal.InterfaceC1236ay;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cey extends AbstractC1233av<cfd> {
    cey(Context context, Looper looper, InterfaceC1235ax interfaceC1235ax, InterfaceC1236ay interfaceC1236ay) {
        super(context, looper, 166, interfaceC1235ax, interfaceC1236ay, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof cfd ? (cfd) iInterfaceQueryLocalInterface : new cfe(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* JADX INFO: renamed from: e */
    public final cfd m10781e() {
        return (cfd) super.m7131w();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
