package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.aa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2229aa extends bns implements InterfaceC2265z {
    public AbstractBinderC2229aa() {
        attachInterface(this, "com.google.firebase.database.connection.idl.IGetTokenCallback");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo12976a(parcel.readString());
                break;
            case 2:
                mo12977b(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
