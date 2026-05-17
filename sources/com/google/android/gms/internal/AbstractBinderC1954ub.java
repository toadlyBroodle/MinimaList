package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ub */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1954ub extends bns implements InterfaceC1953ua {
    public AbstractBinderC1954ub() {
        attachInterface(this, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo12348a(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 2:
                parcel2.writeNoException();
                parcel2.writeInt(11910208);
                break;
        }
        return true;
    }
}
