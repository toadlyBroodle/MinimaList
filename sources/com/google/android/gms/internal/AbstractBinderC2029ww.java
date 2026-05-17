package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ww */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2029ww extends bns implements InterfaceC2028wv {
    public AbstractBinderC2029ww() {
        attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo12540a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
