package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdo extends bns implements cdn {
    public cdo() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                InterfaceC0652a interfaceC0652aJ = mo10622j();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aJ);
                break;
            case 3:
                String strA = mo10609a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 4:
                List listB = mo10612b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                break;
            case 5:
                String strC = mo10614c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                break;
            case 6:
                ccy ccyVarD = mo10616d();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccyVarD);
                break;
            case 7:
                String strE = mo10617e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                break;
            case 8:
                double dF = mo10618f();
                parcel2.writeNoException();
                parcel2.writeDouble(dF);
                break;
            case 9:
                String strG = mo10619g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                break;
            case 10:
                String strH = mo10620h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                break;
            case 11:
                Bundle bundleN = mo10626n();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleN);
                break;
            case 12:
                mo10631s();
                parcel2.writeNoException();
                break;
            case 13:
                byx byxVarI = mo10621i();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarI);
                break;
            case 14:
                mo10610a((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                boolean zB = mo10613b((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
            case 16:
                mo10615c((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                ccu ccuVarR = mo10630r();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccuVarR);
                break;
            case 18:
                InterfaceC0652a interfaceC0652aP = mo10628p();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aP);
                break;
            case 19:
                String strQ = mo10629q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                break;
            default:
                return false;
        }
        return true;
    }
}
