package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ced extends bns implements cec {
    public ced() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* JADX INFO: renamed from: a */
    public static cec m10750a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cec ? (cec) iInterfaceQueryLocalInterface : new cee(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cdr cdtVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            cdtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            cdtVar = iInterfaceQueryLocalInterface instanceof cdr ? (cdr) iInterfaceQueryLocalInterface : new cdt(strongBinder);
        }
        mo10749a(cdtVar);
        parcel2.writeNoException();
        return true;
    }
}
