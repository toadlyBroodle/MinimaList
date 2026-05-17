package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C1368aj extends bnr implements InterfaceC1362ah {
    C1368aj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // com.google.android.gms.internal.InterfaceC1362ah
    /* JADX INFO: renamed from: a */
    public final void mo7903a(C2087z c2087z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2087z);
        m9731b(1, parcelM9733o_);
    }
}
