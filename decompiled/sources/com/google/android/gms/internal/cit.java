package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cit extends bns implements cis {
    public cit() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        int iA = mo10904a();
        parcel2.writeNoException();
        parcel2.writeInt(iA);
        return true;
    }
}
