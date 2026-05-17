package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.p045b.C0673j;

/* JADX INFO: loaded from: classes.dex */
public abstract class bxz extends bns implements bxy {
    public bxz() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byp byrVar = null;
        bxs bxuVar = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                bxv bxvVarA = mo5752a();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bxvVarA);
                break;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    bxuVar = iInterfaceQueryLocalInterface instanceof bxs ? (bxs) iInterfaceQueryLocalInterface : new bxu(strongBinder);
                }
                mo5754a(bxuVar);
                parcel2.writeNoException();
                break;
            case 3:
                mo5757a(cea.m10748a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo5758a(ced.m10750a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 5:
                mo5761a(parcel.readString(), cek.m10777a(parcel.readStrongBinder()), ceg.m10752a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 6:
                mo5756a((ccm) bnt.m9734a(parcel, ccm.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    byrVar = iInterfaceQueryLocalInterface2 instanceof byp ? (byp) iInterfaceQueryLocalInterface2 : new byr(strongBinder2);
                }
                mo5755a(byrVar);
                parcel2.writeNoException();
                break;
            case 8:
                mo5760a(ceq.m10780a(parcel.readStrongBinder()), (bxb) bnt.m9734a(parcel, bxb.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                mo5753a((C0673j) bnt.m9734a(parcel, C0673j.CREATOR));
                parcel2.writeNoException();
                break;
            case 10:
                mo5759a(cen.m10778a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
