package com.google.firebase.database.connection.idl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2263x extends bns implements InterfaceC2262w {
    public AbstractBinderC2263x() {
        attachInterface(this, "com.google.firebase.database.connection.idl.IConnectionAuthTokenProvider");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2265z c2230ab;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        boolean zM9738a = bnt.m9738a(parcel);
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c2230ab = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.firebase.database.connection.idl.IGetTokenCallback");
            c2230ab = iInterfaceQueryLocalInterface instanceof InterfaceC2265z ? (InterfaceC2265z) iInterfaceQueryLocalInterface : new C2230ab(strongBinder);
        }
        mo12987a(zM9738a, c2230ab);
        parcel2.writeNoException();
        return true;
    }
}
