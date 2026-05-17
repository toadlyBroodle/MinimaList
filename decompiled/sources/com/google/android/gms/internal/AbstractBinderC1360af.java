package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.af */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1360af extends bns implements InterfaceC1359ae {
    public AbstractBinderC1360af() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC1370ak c1371al = null;
        InterfaceC1362ah c1368aj = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                C2087z c2087zA = mo7701a((C1979v) bnt.m9734a(parcel, C1979v.CREATOR));
                parcel2.writeNoException();
                bnt.m9740b(parcel2, c2087zA);
                break;
            case 2:
                C1979v c1979v = (C1979v) bnt.m9734a(parcel, C1979v.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    c1368aj = iInterfaceQueryLocalInterface instanceof InterfaceC1362ah ? (InterfaceC1362ah) iInterfaceQueryLocalInterface : new C1368aj(strongBinder);
                }
                mo7703a(c1979v, c1368aj);
                parcel2.writeNoException();
                break;
            case 3:
            default:
                return false;
            case 4:
                C1375ap c1375ap = (C1375ap) bnt.m9734a(parcel, C1375ap.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1371al = iInterfaceQueryLocalInterface2 instanceof InterfaceC1370ak ? (InterfaceC1370ak) iInterfaceQueryLocalInterface2 : new C1371al(strongBinder2);
                }
                mo7702a(c1375ap, c1371al);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
