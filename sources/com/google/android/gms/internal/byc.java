package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class byc extends bnr implements byb {
    byc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.byb
    /* JADX INFO: renamed from: a */
    public final IBinder mo10414a(InterfaceC0652a interfaceC0652a, String str, cii ciiVar, int i) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        parcelM9733o_.writeString(str);
        bnt.m9735a(parcelM9733o_, ciiVar);
        parcelM9733o_.writeInt(11910000);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        parcelM9730a.recycle();
        return strongBinder;
    }
}
