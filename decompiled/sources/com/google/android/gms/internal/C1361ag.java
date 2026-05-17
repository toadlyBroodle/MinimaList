package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1361ag extends bnr implements InterfaceC1359ae {
    C1361ag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.InterfaceC1359ae
    /* JADX INFO: renamed from: a */
    public final C2087z mo7701a(C1979v c1979v) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1979v);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        C2087z c2087z = (C2087z) bnt.m9734a(parcelM9730a, C2087z.CREATOR);
        parcelM9730a.recycle();
        return c2087z;
    }

    @Override // com.google.android.gms.internal.InterfaceC1359ae
    /* JADX INFO: renamed from: a */
    public final void mo7702a(C1375ap c1375ap, InterfaceC1370ak interfaceC1370ak) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1375ap);
        bnt.m9735a(parcelM9733o_, interfaceC1370ak);
        m9731b(4, parcelM9733o_);
    }

    @Override // com.google.android.gms.internal.InterfaceC1359ae
    /* JADX INFO: renamed from: a */
    public final void mo7703a(C1979v c1979v, InterfaceC1362ah interfaceC1362ah) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c1979v);
        bnt.m9735a(parcelM9733o_, interfaceC1362ah);
        m9731b(2, parcelM9733o_);
    }
}
