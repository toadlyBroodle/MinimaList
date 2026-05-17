package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.cv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1488cv extends bns implements InterfaceC1487cu {
    public AbstractBinderC1488cv() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1487cu m11155a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1487cu ? (InterfaceC1487cu) iInterfaceQueryLocalInterface : new C1489cw(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC1479cm c1481co;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10798a();
                break;
            case 2:
                mo10801b();
                break;
            case 3:
                mo10802c();
                break;
            case 4:
                mo10803d();
                break;
            case 5:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1481co = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    c1481co = iInterfaceQueryLocalInterface instanceof InterfaceC1479cm ? (InterfaceC1479cm) iInterfaceQueryLocalInterface : new C1481co(strongBinder);
                }
                mo10800a(c1481co);
                break;
            case 6:
                mo10804e();
                break;
            case 7:
                mo10799a(parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
