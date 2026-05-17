package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2144x extends bns implements InterfaceC2143w {
    public AbstractBinderC2144x() {
        attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public static InterfaceC2143w asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2143w ? (InterfaceC2143w) iInterfaceQueryLocalInterface : new C2145y(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2137q c2139s;
        InterfaceC2128h c2130j = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c2139s = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
            c2139s = iInterfaceQueryLocalInterface instanceof InterfaceC2137q ? (InterfaceC2137q) iInterfaceQueryLocalInterface : new C2139s(strongBinder);
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
            c2130j = iInterfaceQueryLocalInterface2 instanceof InterfaceC2128h ? (InterfaceC2128h) iInterfaceQueryLocalInterface2 : new C2130j(strongBinder2);
        }
        aho service = getService(interfaceC0652aM5328a, c2139s, c2130j);
        parcel2.writeNoException();
        bnt.m9735a(parcel2, service);
        return true;
    }
}
