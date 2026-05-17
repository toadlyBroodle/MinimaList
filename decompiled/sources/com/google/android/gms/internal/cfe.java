package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class cfe extends bnr implements cfd {
    cfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.cfd
    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor mo10783a(cez cezVar) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9736a(parcelM9733o_, cezVar);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bnt.m9734a(parcelM9730a, ParcelFileDescriptor.CREATOR);
        parcelM9730a.recycle();
        return parcelFileDescriptor;
    }
}
