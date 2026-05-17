package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class cbi extends bns implements cbh {
    public cbi() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* JADX INFO: renamed from: a */
    public static cbh m10591a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cbh ? (cbh) iInterfaceQueryLocalInterface : new cbj(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cbd cbfVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            cbfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            cbfVar = iInterfaceQueryLocalInterface instanceof cbd ? (cbd) iInterfaceQueryLocalInterface : new cbf(strongBinder);
        }
        mo10590a(cbfVar);
        parcel2.writeNoException();
        return true;
    }
}
