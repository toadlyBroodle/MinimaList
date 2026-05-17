package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1483cq extends bns implements InterfaceC1482cp {
    public AbstractBinderC1483cq() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1482cp m11154a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1482cp ? (InterfaceC1482cp) iInterfaceQueryLocalInterface : new C1484cr(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC1487cu c1489cw;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10908a((C1494da) bnt.m9734a(parcel, C1494da.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo10905a();
                parcel2.writeNoException();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1489cw = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c1489cw = iInterfaceQueryLocalInterface instanceof InterfaceC1487cu ? (InterfaceC1487cu) iInterfaceQueryLocalInterface : new C1489cw(strongBinder);
                }
                mo10907a(c1489cw);
                parcel2.writeNoException();
                break;
            case 5:
                boolean zB = mo10912b();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
            case 6:
                mo10913c();
                parcel2.writeNoException();
                break;
            case 7:
                mo10915d();
                parcel2.writeNoException();
                break;
            case 8:
                mo10916e();
                parcel2.writeNoException();
                break;
            case 9:
                mo10906a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                mo10911b(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                mo10914c(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                String strF = mo10917f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                break;
            case 13:
                mo10909a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 34:
                mo10910a(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
