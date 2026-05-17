package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.cast.C0990d;

/* JADX INFO: renamed from: com.google.android.gms.internal.vi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1988vi extends bns implements InterfaceC1987vh {
    public AbstractBinderC1988vi() {
        attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo12411a(parcel.readInt());
                break;
            case 2:
                mo12412a((C0990d) bnt.m9734a(parcel, C0990d.CREATOR), parcel.readString(), parcel.readString(), bnt.m9738a(parcel));
                break;
            case 3:
                mo12420b(parcel.readInt());
                break;
            case 4:
                mo12415a(parcel.readString(), parcel.readDouble(), bnt.m9738a(parcel));
                break;
            case 5:
                mo12418a(parcel.readString(), parcel.readString());
                break;
            case 6:
                mo12419a(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                mo12423d(parcel.readInt());
                break;
            case 8:
                mo12422c(parcel.readInt());
                break;
            case 9:
                mo12424e(parcel.readInt());
                break;
            case 10:
                mo12417a(parcel.readString(), parcel.readLong(), parcel.readInt());
                break;
            case 11:
                mo12416a(parcel.readString(), parcel.readLong());
                break;
            case 12:
                mo12413a((C1962uj) bnt.m9734a(parcel, C1962uj.CREATOR));
                break;
            case 13:
                mo12414a((C1982vc) bnt.m9734a(parcel, C1982vc.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
