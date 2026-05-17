package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class bsx extends bnr implements bsv {
    bsx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.bsv
    /* JADX INFO: renamed from: a */
    public final String mo10188a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.bsv
    /* JADX INFO: renamed from: a */
    public final boolean mo10189a(boolean z) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9737a(parcelM9733o_, true);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }

    @Override // com.google.android.gms.internal.bsv
    /* JADX INFO: renamed from: b */
    public final boolean mo10190b() {
        Parcel parcelM9730a = m9730a(6, m9733o_());
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
