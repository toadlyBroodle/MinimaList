package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.tm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1938tm extends bns implements InterfaceC1936tk {
    public AbstractBinderC1938tm() {
        attachInterface(this, "com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC1939tn c1940to;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) bnt.m9734a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1940to = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    c1940to = iInterfaceQueryLocalInterface instanceof InterfaceC1939tn ? (InterfaceC1939tn) iInterfaceQueryLocalInterface : new C1940to(strongBinder);
                }
                mo12327a(bundle, c1940to);
                parcel2.writeNoException();
                break;
            case 2:
                mo12326a((Bundle) bnt.m9734a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 3:
                mo12325a((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                boolean zB = mo12331b((Bundle) bnt.m9734a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
            case 5:
                mo12328a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo12324a();
                parcel2.writeNoException();
                break;
            case 7:
                boolean zB2 = mo12330b();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB2);
                break;
            case 8:
                Bundle bundleB = mo12329b(parcel.readString());
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleB);
                break;
            case 9:
                String strC = mo12332c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                break;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(11910208);
                break;
            default:
                return false;
        }
        return true;
    }
}
