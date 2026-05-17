package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.y */
/* JADX INFO: loaded from: classes.dex */
final class C1278y implements InterfaceC1277x {

    /* JADX INFO: renamed from: a */
    private final IBinder f5979a;

    C1278y(IBinder iBinder) {
        this.f5979a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1277x
    /* JADX INFO: renamed from: a */
    public final void mo7218a(InterfaceC1275v interfaceC1275v, C1255bq c1255bq) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC1275v.asBinder());
            parcelObtain.writeInt(1);
            c1255bq.writeToParcel(parcelObtain, 0);
            this.f5979a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5979a;
    }
}
