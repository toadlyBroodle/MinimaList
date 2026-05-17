package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class byt extends bns implements bys {
    public byt() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo5821a();
                parcel2.writeNoException();
                break;
            case 2:
                mo5822a(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 3:
                mo5824a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                mo5826a(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                mo5823a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo5825a(parcel.readString(), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                float fB = mo5827b();
                parcel2.writeNoException();
                parcel2.writeFloat(fB);
                break;
            case 8:
                boolean zC = mo5828c();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zC);
                break;
        }
        return true;
    }
}
