package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cij extends bns implements cii {
    public cij() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX INFO: renamed from: a */
    public static cii m10937a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof cii ? (cii) iInterfaceQueryLocalInterface : new cik(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                cim cimVarA = mo10934a(parcel.readString());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, cimVarA);
                break;
            case 2:
                boolean zB = mo10936b(parcel.readString());
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
        }
        return true;
    }
}
