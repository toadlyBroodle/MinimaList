package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1010l extends bns implements InterfaceC1009k {
    public AbstractBinderC1010l() {
        attachInterface(this, "com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aA = mo6396a();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aA);
                break;
            case 2:
                mo6400b((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                mo6402d((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo6398a(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                long jB = mo6399b();
                parcel2.writeNoException();
                parcel2.writeLong(jB);
                break;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(11910208);
                break;
            case 7:
                mo6397a((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                mo6401c((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
