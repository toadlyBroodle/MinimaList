package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class bxq extends bns implements bxp {
    public bxq() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo10363a();
        parcel2.writeNoException();
        return true;
    }
}
