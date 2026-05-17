package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ciq extends bns implements cip {
    public ciq() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cis ciuVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10868a();
                break;
            case 2:
                mo10875b();
                break;
            case 3:
                mo10869a(parcel.readInt());
                break;
            case 4:
                mo10876c();
                break;
            case 5:
                mo10877d();
                break;
            case 6:
                mo10878e();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    ciuVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    ciuVar = iInterfaceQueryLocalInterface instanceof cis ? (cis) iInterfaceQueryLocalInterface : new ciu(strongBinder);
                }
                mo10873a(ciuVar);
                break;
            case 8:
                mo10879f();
                break;
            case 9:
                mo10874a(parcel.readString(), parcel.readString());
                break;
            case 10:
                mo10870a(cdw.m10743a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                mo10880g();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
