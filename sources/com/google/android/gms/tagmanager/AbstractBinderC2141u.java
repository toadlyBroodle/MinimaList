package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2141u extends bns implements InterfaceC2140t {
    public AbstractBinderC2141u() {
        attachInterface(this, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public static InterfaceC2140t asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2140t ? (InterfaceC2140t) iInterfaceQueryLocalInterface : new C2142v(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2137q c2139s;
        InterfaceC2137q c2139s2;
        InterfaceC2128h c2130j = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2139s2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    c2139s2 = iInterfaceQueryLocalInterface instanceof InterfaceC2137q ? (InterfaceC2137q) iInterfaceQueryLocalInterface : new C2139s(strongBinder);
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    c2130j = iInterfaceQueryLocalInterface2 instanceof InterfaceC2128h ? (InterfaceC2128h) iInterfaceQueryLocalInterface2 : new C2130j(strongBinder2);
                }
                initialize(interfaceC0652aM5328a, c2139s2, c2130j);
                break;
            case 2:
                preview((Intent) bnt.m9734a(parcel, Intent.CREATOR), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 3:
                Intent intent = (Intent) bnt.m9734a(parcel, Intent.CREATOR);
                InterfaceC0652a interfaceC0652aM5328a2 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                InterfaceC0652a interfaceC0652aM5328a3 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c2139s = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementProxy");
                    c2139s = iInterfaceQueryLocalInterface3 instanceof InterfaceC2137q ? (InterfaceC2137q) iInterfaceQueryLocalInterface3 : new C2139s(strongBinder3);
                }
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
                    c2130j = iInterfaceQueryLocalInterface4 instanceof InterfaceC2128h ? (InterfaceC2128h) iInterfaceQueryLocalInterface4 : new C2130j(strongBinder4);
                }
                previewIntent(intent, interfaceC0652aM5328a2, interfaceC0652aM5328a3, c2139s, c2130j);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
