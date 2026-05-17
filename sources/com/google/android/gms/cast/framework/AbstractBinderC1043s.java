package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.C1051g;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1043s extends bns implements InterfaceC1042r {
    public AbstractBinderC1043s() {
        attachInterface(this, "com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo6385a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 2:
                mo6384a(parcel.readString(), (C1051g) bnt.m9734a(parcel, C1051g.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                mo6383a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                mo6382a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(11910208);
                break;
            default:
                return false;
        }
        return true;
    }
}
