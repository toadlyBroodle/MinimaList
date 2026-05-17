package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.zv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2109zv extends bns implements InterfaceC2108zu {
    public AbstractBinderC2109zv() {
        attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo7577a((C2104zq) bnt.m9734a(parcel, C2104zq.CREATOR), (C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo7573a((aeh) bnt.m9734a(parcel, aeh.CREATOR), (C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo7574a((C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo7578a((C2104zq) bnt.m9734a(parcel, C2104zq.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo7580b((C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List<aeh> listA = mo7567a((C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR), bnt.m9738a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                break;
            case 9:
                byte[] bArrA = mo7579a((C2104zq) bnt.m9734a(parcel, C2104zq.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrA);
                break;
            case 10:
                mo7572a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String strC = mo7581c((C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strC);
                break;
            case 12:
                mo7576a((C2088za) bnt.m9734a(parcel, C2088za.CREATOR), (C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo7575a((C2088za) bnt.m9734a(parcel, C2088za.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List<aeh> listA2 = mo7571a(parcel.readString(), parcel.readString(), bnt.m9738a(parcel), (C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listA2);
                break;
            case 15:
                List<aeh> listA3 = mo7570a(parcel.readString(), parcel.readString(), parcel.readString(), bnt.m9738a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listA3);
                break;
            case 16:
                List<C2088za> listA4 = mo7568a(parcel.readString(), parcel.readString(), (C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listA4);
                break;
            case 17:
                List<C2088za> listA5 = mo7569a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listA5);
                break;
            case 18:
                mo7582d((C2084yx) bnt.m9734a(parcel, C2084yx.CREATOR));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
