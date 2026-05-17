package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.aj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2238aj extends bns implements InterfaceC2237ai {
    public AbstractBinderC2238aj() {
        attachInterface(this, "com.google.firebase.database.connection.idl.IPersistentConnectionDelegate");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo12983a(parcel.createStringArrayList(), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), bnt.m9738a(parcel), parcel.readLong());
                break;
            case 2:
                mo12984a(parcel.createStringArrayList(), parcel.createTypedArrayList(C2251l.CREATOR), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 3:
                mo12981a();
                break;
            case 4:
                mo12986b();
                break;
            case 5:
                mo12985a(bnt.m9738a(parcel));
                break;
            case 6:
                mo12982a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
