package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1273t extends bns implements InterfaceC1272s {
    public AbstractBinderC1273t() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1272s m7217a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1272s ? (InterfaceC1272s) iInterfaceQueryLocalInterface : new C1274u(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aA = mo7215a();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aA);
                break;
            case 2:
                int iB = mo7216b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                break;
        }
        return true;
    }
}
