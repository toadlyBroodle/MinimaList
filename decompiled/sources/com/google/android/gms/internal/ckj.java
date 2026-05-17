package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ckj extends bns implements cki {
    public ckj() {
        attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* JADX INFO: renamed from: a */
    public static cki m11066a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof cki ? (cki) iInterfaceQueryLocalInterface : new ckk(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo5783a((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo5792f();
                parcel2.writeNoException();
                break;
            case 3:
                mo5793g();
                parcel2.writeNoException();
                break;
            case 4:
                mo5794h();
                parcel2.writeNoException();
                break;
            case 5:
                mo5795i();
                parcel2.writeNoException();
                break;
            case 6:
                Bundle bundle = (Bundle) bnt.m9734a(parcel, Bundle.CREATOR);
                mo5788b(bundle);
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundle);
                break;
            case 7:
                mo5796j();
                parcel2.writeNoException();
                break;
            case 8:
                mo5797k();
                parcel2.writeNoException();
                break;
            case 9:
                mo5798l();
                parcel2.writeNoException();
                break;
            case 10:
                mo5790d();
                parcel2.writeNoException();
                break;
            case 11:
                boolean zE = mo5791e();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zE);
                break;
            case 12:
                mo5782a(parcel.readInt(), parcel.readInt(), (Intent) bnt.m9734a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo5785a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
