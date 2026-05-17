package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.ad */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2232ad extends bns implements InterfaceC2231ac {
    public AbstractBinderC2232ad() {
        attachInterface(this, "com.google.firebase.database.connection.idl.IListenHashProvider");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                String strA = mo12978a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 2:
                boolean zB = mo12979b();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
            case 3:
                C2228a c2228aC = mo12980c();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, c2228aC);
                break;
        }
        return true;
    }
}
