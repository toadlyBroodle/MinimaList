package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdd extends bns implements cdc {
    public cdd() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX INFO: renamed from: a */
    public static cdc m10739a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof cdc ? (cdc) iInterfaceQueryLocalInterface : new cde(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10726a(parcel.readString(), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 2:
                InterfaceC0652a interfaceC0652aA = mo10722a(parcel.readString());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aA);
                break;
            case 3:
                mo10724a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo10723a();
                parcel2.writeNoException();
                break;
            case 5:
                mo10725a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
