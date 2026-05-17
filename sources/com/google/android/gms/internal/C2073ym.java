package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ym */
/* JADX INFO: loaded from: classes.dex */
public final class C2073ym extends bnr implements InterfaceC2072yl {
    C2073ym(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.InterfaceC2072yl
    /* JADX INFO: renamed from: a */
    public final C2070yj mo12605a(C2068yh c2068yh) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, c2068yh);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        C2070yj c2070yj = (C2070yj) bnt.m9734a(parcelM9730a, C2070yj.CREATOR);
        parcelM9730a.recycle();
        return c2070yj;
    }
}
