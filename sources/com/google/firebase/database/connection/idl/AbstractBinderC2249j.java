package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2249j extends bns implements InterfaceC2248i {
    public AbstractBinderC2249j() {
        attachInterface(this, "com.google.firebase.database.connection.idl.IRequestResultCallback");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo12988a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
