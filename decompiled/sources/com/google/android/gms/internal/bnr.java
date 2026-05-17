package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class bnr implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f8499a;

    /* JADX INFO: renamed from: b */
    private final String f8500b;

    protected bnr(IBinder iBinder, String str) {
        this.f8499a = iBinder;
        this.f8500b = str;
    }

    /* JADX INFO: renamed from: a */
    protected final Parcel m9730a(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8499a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f8499a;
    }

    /* JADX INFO: renamed from: b */
    protected final void m9731b(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8499a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    protected final void m9732c(int i, Parcel parcel) {
        try {
            this.f8499a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: o_ */
    protected final Parcel m9733o_() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8500b);
        return parcelObtain;
    }
}
