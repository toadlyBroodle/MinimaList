package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class bzb extends bns implements bza {
    public bzb() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10433a();
                break;
            case 2:
                mo10435b();
                break;
            case 3:
                mo10436c();
                break;
            case 4:
                mo10437d();
                break;
            case 5:
                mo10434a(bnt.m9738a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
