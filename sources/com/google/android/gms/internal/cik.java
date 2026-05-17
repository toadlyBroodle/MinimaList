package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cik extends bnr implements cii {
    cik(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.cii
    /* JADX INFO: renamed from: a */
    public final cim mo10934a(String str) {
        cim cioVar;
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        if (strongBinder == null) {
            cioVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            cioVar = iInterfaceQueryLocalInterface instanceof cim ? (cim) iInterfaceQueryLocalInterface : new cio(strongBinder);
        }
        parcelM9730a.recycle();
        return cioVar;
    }

    @Override // com.google.android.gms.internal.cii
    /* JADX INFO: renamed from: b */
    public final boolean mo10936b(String str) {
        Parcel parcelM9733o_ = m9733o_();
        parcelM9733o_.writeString(str);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        boolean zM9738a = bnt.m9738a(parcelM9730a);
        parcelM9730a.recycle();
        return zM9738a;
    }
}
