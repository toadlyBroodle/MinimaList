package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cek extends bns implements cei {
    public cek() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* JADX INFO: renamed from: a */
    public static cei m10777a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cei ? (cei) iInterfaceQueryLocalInterface : new cel(iBinder);
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
        mo10753a(cdxVar);
        parcel2.writeNoException();
        return true;
    }
}
