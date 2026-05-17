package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ai */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1363ai extends bns implements InterfaceC1362ah {
    public AbstractBinderC1363ai() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo7903a((C2087z) bnt.m9734a(parcel, C2087z.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
