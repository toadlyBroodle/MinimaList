package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class bxt extends bns implements bxs {
    public bxt() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10364a();
                break;
            case 2:
                mo10365a(parcel.readInt());
                break;
            case 3:
                mo10366b();
                break;
            case 4:
                mo10367c();
                break;
            case 5:
                mo10368d();
                break;
            case 6:
                mo10369e();
                break;
            case 7:
                mo10370f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
