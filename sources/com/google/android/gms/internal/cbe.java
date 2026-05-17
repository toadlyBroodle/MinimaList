package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cbe extends bns implements cbd {
    public cbe() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                String strA = mo10585a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 2:
                String strB = mo10587b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                break;
            case 3:
                mo10586a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo10588c();
                parcel2.writeNoException();
                break;
            case 5:
                mo10589d();
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
