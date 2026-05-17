package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1276w extends bns implements InterfaceC1275v {
    public AbstractBinderC1276w() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo7145a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                break;
            case 2:
                mo7144a(parcel.readInt(), (Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
