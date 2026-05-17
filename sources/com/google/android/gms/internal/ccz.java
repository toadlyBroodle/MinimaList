package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ccz extends bns implements ccy {
    public ccz() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* JADX INFO: renamed from: a */
    public static ccy m10738a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof ccy ? (ccy) iInterfaceQueryLocalInterface : new cda(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aA = mo10604a();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aA);
                break;
            case 2:
                Uri uriB = mo10605b();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, uriB);
                break;
            case 3:
                double dC = mo10606c();
                parcel2.writeNoException();
                parcel2.writeDouble(dC);
                break;
        }
        return true;
    }
}
