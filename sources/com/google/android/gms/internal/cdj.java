package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdj extends bns implements cdh {
    public cdj() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* JADX INFO: renamed from: a */
    public static cdh m10740a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof cdh ? (cdh) iInterfaceQueryLocalInterface : new cdk(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10736a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 2:
                mo10735a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
