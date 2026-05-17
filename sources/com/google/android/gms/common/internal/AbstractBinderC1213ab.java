package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ab */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1213ab extends bns implements InterfaceC1212aa {
    /* JADX INFO: renamed from: a */
    public static InterfaceC1212aa m7057a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1212aa ? (InterfaceC1212aa) iInterfaceQueryLocalInterface : new C1214ac(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
