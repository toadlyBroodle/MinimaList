package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ciz extends bns implements ciy {
    public ciz() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                String strA = mo10987a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 3:
                List listB = mo10989b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                break;
            case 4:
                String strC = mo10991c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                break;
            case 5:
                ccy ccyVarD = mo10993d();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccyVarD);
                break;
            case 6:
                String strE = mo10994e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                break;
            case 7:
                String strF = mo10995f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                break;
            case 8:
                mo10996g();
                parcel2.writeNoException();
                break;
            case 9:
                mo10988a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                mo10990b(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                boolean zH = mo10997h();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zH);
                break;
            case 12:
                boolean zI = mo10998i();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zI);
                break;
            case 13:
                Bundle bundleJ = mo10999j();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleJ);
                break;
            case 14:
                mo10992c(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                InterfaceC0652a interfaceC0652aK = mo11000k();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aK);
                break;
            case 16:
                byx byxVarL = mo11001l();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarL);
                break;
            case 19:
                ccu ccuVarM = mo11002m();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccuVarM);
                break;
            case 20:
                InterfaceC0652a interfaceC0652aN = mo11003n();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aN);
                break;
            case 21:
                InterfaceC0652a interfaceC0652aO = mo11004o();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aO);
                break;
        }
        return true;
    }
}
