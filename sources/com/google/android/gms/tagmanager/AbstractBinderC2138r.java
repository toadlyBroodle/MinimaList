package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2138r extends bns implements InterfaceC2137q {
    public AbstractBinderC2138r() {
        attachInterface(this, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2131k c2133m = null;
        InterfaceC2134n c2136p = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                mo12818a(parcel.readString(), parcel.readString(), (Bundle) bnt.m9734a(parcel, Bundle.CREATOR), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 11:
                Map mapA = mo12815a();
                parcel2.writeNoException();
                parcel2.writeMap(mapA);
                break;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                    c2136p = iInterfaceQueryLocalInterface instanceof InterfaceC2134n ? (InterfaceC2134n) iInterfaceQueryLocalInterface : new C2136p(strongBinder);
                }
                mo12817a(c2136p);
                parcel2.writeNoException();
                break;
            case 22:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
                    c2133m = iInterfaceQueryLocalInterface2 instanceof InterfaceC2131k ? (InterfaceC2131k) iInterfaceQueryLocalInterface2 : new C2133m(strongBinder2);
                }
                mo12816a(c2133m);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
