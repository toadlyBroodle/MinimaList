package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cds extends bns implements cdr {
    public cds() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                InterfaceC0652a interfaceC0652aJ = mo10645j();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aJ);
                break;
            case 3:
                String strA = mo10634a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 4:
                List listB = mo10612b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                break;
            case 5:
                String strE = mo10640e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                break;
            case 6:
                ccy ccyVarF = mo10641f();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccyVarF);
                break;
            case 7:
                String strG = mo10642g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                break;
            case 8:
                String strH = mo10643h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                break;
            case 9:
                Bundle bundleN = mo10646n();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleN);
                break;
            case 10:
                mo10648q();
                parcel2.writeNoException();
                break;
            case 11:
                byx byxVarI = mo10644i();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarI);
                break;
            case 12:
                mo10635a((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                boolean zB = mo10636b((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
            case 14:
                mo10638c((Bundle) bnt.m9734a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                ccu ccuVarP = mo10647p();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccuVarP);
                break;
            case 16:
                InterfaceC0652a interfaceC0652aC = mo10637c();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aC);
                break;
            case 17:
                String strD = mo10639d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                break;
            default:
                return false;
        }
        return true;
    }
}
