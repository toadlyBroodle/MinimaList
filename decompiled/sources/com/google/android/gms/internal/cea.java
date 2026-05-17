package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cea extends bns implements cdz {
    public cea() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* JADX INFO: renamed from: a */
    public static cdz m10748a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cdz ? (cdz) iInterfaceQueryLocalInterface : new ceb(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cdn cdpVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            cdpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            cdpVar = iInterfaceQueryLocalInterface instanceof cdn ? (cdn) iInterfaceQueryLocalInterface : new cdp(strongBinder);
        }
        mo10746a(cdpVar);
        parcel2.writeNoException();
        return true;
    }
}
