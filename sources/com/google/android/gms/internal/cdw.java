package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdw extends bns implements cdv {
    public cdw() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* JADX INFO: renamed from: a */
    public static cdv m10743a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof cdv ? (cdv) iInterfaceQueryLocalInterface : new cdx(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                String strA = mo10651a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 2:
                ccy ccyVarB = mo10655b(parcel.readString());
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ccyVarB);
                break;
            case 3:
                List<String> listA = mo10652a();
                parcel2.writeNoException();
                parcel2.writeStringList(listA);
                break;
            case 4:
                String strL = mo10624l();
                parcel2.writeNoException();
                parcel2.writeString(strL);
                break;
            case 5:
                mo10657c(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo10658d();
                parcel2.writeNoException();
                break;
            case 7:
                byx byxVarC = mo10656c();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarC);
                break;
            case 8:
                mo10660f();
                parcel2.writeNoException();
                break;
            case 9:
                InterfaceC0652a interfaceC0652aE = mo10659e();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aE);
                break;
            case 10:
                boolean zA = mo10653a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zA);
                break;
            case 11:
                InterfaceC0652a interfaceC0652aB = mo10654b();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aB);
                break;
        }
        return true;
    }
}
