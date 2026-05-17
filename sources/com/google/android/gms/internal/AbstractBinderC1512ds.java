package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.internal.ds */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1512ds extends bns implements InterfaceC1511dr {
    public AbstractBinderC1512ds() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1511dr m11201a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1511dr ? (InterfaceC1511dr) iInterfaceQueryLocalInterface : new C1513dt(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo11184a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 2:
                mo11185a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo11189b(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 4:
                mo11191c(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 5:
                mo11192d(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 6:
                mo11193e(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 7:
                mo11186a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), (C1515dv) bnt.m9734a(parcel, C1515dv.CREATOR));
                break;
            case 8:
                mo11194f(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            case 9:
                mo11190b(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo11195g(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
