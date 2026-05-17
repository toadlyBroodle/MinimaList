package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class byh extends bnr implements byg {
    byh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.byg
    /* JADX INFO: renamed from: a */
    public final IBinder mo10416a(InterfaceC0652a interfaceC0652a, bxb bxbVar, String str, cii ciiVar, int i, int i2) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        bnt.m9736a(parcelM9733o_, bxbVar);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, ciiVar);
        parcelM9733o_.writeInt(11910000);
        parcelM9733o_.writeInt(i2);
        Parcel parcelM9730a = m9730a(2, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        parcelM9730a.recycle();
        return strongBinder;
    }
}
