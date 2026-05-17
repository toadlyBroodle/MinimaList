package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ceg extends bns implements cef {
    public ceg() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* JADX INFO: renamed from: a */
    public static cef m10752a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof cef ? (cef) iInterfaceQueryLocalInterface : new ceh(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cdv cdxVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            cdxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            cdxVar = iInterfaceQueryLocalInterface instanceof cdv ? (cdv) iInterfaceQueryLocalInterface : new cdx(strongBinder);
        }
        mo10751a(cdxVar, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
