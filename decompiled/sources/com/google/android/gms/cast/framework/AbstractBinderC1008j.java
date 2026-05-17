package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1008j extends bns implements InterfaceC0999af {
    public AbstractBinderC1008j() {
        attachInterface(this, "com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aA = mo6351a(parcel.readString());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aA);
                break;
            case 2:
                boolean zA = mo6352a();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zA);
                break;
            case 3:
                String strB = mo6353b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                break;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(11910208);
                break;
        }
        return true;
    }
}
