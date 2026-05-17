package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2135o extends bns implements InterfaceC2134n {
    public AbstractBinderC2135o() {
        attachInterface(this, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        mo8052a(parcel.readString(), parcel.readString(), (Bundle) bnt.m9734a(parcel, Bundle.CREATOR), parcel.readLong());
        parcel2.writeNoException();
        return true;
    }
}
