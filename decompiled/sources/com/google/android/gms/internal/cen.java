package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class cen extends bns implements cem {
    /* JADX INFO: renamed from: a */
    public static cem m10778a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnGoogleNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cem ? (cem) iInterfaceQueryLocalInterface : new ceo(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
