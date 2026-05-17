package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bwc extends bnr implements bwb {
    bwc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.bwb
    /* JADX INFO: renamed from: a */
    public final bvv mo10351a(bvy bvyVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, bvyVar);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        bvv bvvVar = (bvv) bnt.m9734a(parcelM9730a, bvv.CREATOR);
        parcelM9730a.recycle();
        return bvvVar;
    }
}
