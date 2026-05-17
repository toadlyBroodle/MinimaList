package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public final class ckm extends bnr implements ckl {
    ckm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ckl
    /* JADX INFO: renamed from: a */
    public final IBinder mo11067a(InterfaceC0652a interfaceC0652a) {
        Parcel parcelM9733o_ = m9733o_();
        bnt.m9735a(parcelM9733o_, interfaceC0652a);
        Parcel parcelM9730a = m9730a(1, parcelM9733o_);
        IBinder strongBinder = parcelM9730a.readStrongBinder();
        parcelM9730a.recycle();
        return strongBinder;
    }
}
