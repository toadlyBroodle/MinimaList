package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class bxw extends bns implements bxv {
    public bxw() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo5708a((bwx) bnt.m9734a(parcel, bwx.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                String strA = mo5707a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 3:
                boolean zC = mo5711c();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zC);
                break;
            case 4:
                String strB = mo5710b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                break;
            case 5:
                mo5709a((bwx) bnt.m9734a(parcel, bwx.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
