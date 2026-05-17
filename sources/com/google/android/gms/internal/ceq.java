package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ceq extends bns implements cep {
    /* JADX INFO: renamed from: a */
    public static cep m10780a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cep ? (cep) iInterfaceQueryLocalInterface : new cer(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo10779a(bye.m10415a(parcel.readStrongBinder()), InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
