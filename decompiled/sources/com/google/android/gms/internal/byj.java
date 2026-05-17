package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class byj extends bns implements byi {
    public byj() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* JADX INFO: renamed from: a */
    public static byi m10417a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof byi ? (byi) iInterfaceQueryLocalInterface : new byk(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo10385a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
