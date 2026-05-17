package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class byq extends bns implements byp {
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        long jA = mo10411a();
        parcel2.writeNoException();
        parcel2.writeLong(jA);
        return true;
    }
}
