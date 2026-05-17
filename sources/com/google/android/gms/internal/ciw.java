package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ciw extends bns implements civ {
    public ciw() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                String strA = mo10967a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 3:
                List listB = mo10969b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                break;
            case 4:
                String strC = mo10971c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                break;
            case 5:
                ccy ccyVarD = mo10973d();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccyVarD);
                break;
            case 6:
                String strE = mo10974e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                break;
            case 7:
                double dF = mo10975f();
                parcel2.writeNoException();
                parcel2.writeDouble(dF);
                break;
            case 8:
                String strG = mo10976g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                break;
            case 9:
                String strH = mo10977h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                break;
            case 10:
                mo10978i();
                parcel2.writeNoException();
                break;
            case 11:
                mo10968a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                mo10970b(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                boolean zJ = mo10979j();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zJ);
                break;
            case 14:
                boolean zK = mo10980k();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zK);
                break;
            case 15:
                Bundle bundleL = mo10981l();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleL);
                break;
            case 16:
                mo10972c(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 17:
                byx byxVarM = mo10982m();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarM);
                break;
            case 18:
                InterfaceC0652a interfaceC0652aN = mo10983n();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aN);
                break;
            case 19:
                ccu ccuVarO = mo10984o();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccuVarO);
                break;
            case 20:
                InterfaceC0652a interfaceC0652aP = mo10985p();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aP);
                break;
            case 21:
                InterfaceC0652a interfaceC0652aQ = mo10986q();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aQ);
                break;
        }
        return true;
    }
}
