package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ccv extends bns implements ccu {
    public ccv() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* JADX INFO: renamed from: a */
    public static ccu m10737a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof ccu ? (ccu) iInterfaceQueryLocalInterface : new ccw(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                String strA = mo10595a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 3:
                List<ccy> listB = mo10596b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                break;
        }
        return true;
    }
}
