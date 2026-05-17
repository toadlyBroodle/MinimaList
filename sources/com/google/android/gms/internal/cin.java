package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cin extends bns implements cim {
    public cin() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cip cirVar;
        cip cirVar2;
        cip cirVar3;
        cip cirVar4 = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aM5328a = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                bxb bxbVar = (bxb) bnt.m9734a(parcel, bxb.CREATOR);
                bwx bwxVar = (bwx) bnt.m9734a(parcel, bwx.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    cirVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    cirVar3 = iInterfaceQueryLocalInterface instanceof cip ? (cip) iInterfaceQueryLocalInterface : new cir(strongBinder);
                }
                mo10947a(interfaceC0652aM5328a, bxbVar, bwxVar, string, cirVar3);
                parcel2.writeNoException();
                break;
            case 2:
                InterfaceC0652a interfaceC0652aA = mo10941a();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aA);
                break;
            case 3:
                InterfaceC0652a interfaceC0652aM5328a2 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                bwx bwxVar2 = (bwx) bnt.m9734a(parcel, bwx.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    cirVar4 = iInterfaceQueryLocalInterface2 instanceof cip ? (cip) iInterfaceQueryLocalInterface2 : new cir(strongBinder2);
                }
                mo10943a(interfaceC0652aM5328a2, bwxVar2, string2, cirVar4);
                parcel2.writeNoException();
                break;
            case 4:
                mo10953b();
                parcel2.writeNoException();
                break;
            case 5:
                mo10954c();
                parcel2.writeNoException();
                break;
            case 6:
                InterfaceC0652a interfaceC0652aM5328a3 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                bxb bxbVar2 = (bxb) bnt.m9734a(parcel, bxb.CREATOR);
                bwx bwxVar3 = (bwx) bnt.m9734a(parcel, bwx.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    cirVar4 = iInterfaceQueryLocalInterface3 instanceof cip ? (cip) iInterfaceQueryLocalInterface3 : new cir(strongBinder3);
                }
                mo10948a(interfaceC0652aM5328a3, bxbVar2, bwxVar3, string3, string4, cirVar4);
                parcel2.writeNoException();
                break;
            case 7:
                InterfaceC0652a interfaceC0652aM5328a4 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                bwx bwxVar4 = (bwx) bnt.m9734a(parcel, bwx.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    cirVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    cirVar2 = iInterfaceQueryLocalInterface4 instanceof cip ? (cip) iInterfaceQueryLocalInterface4 : new cir(strongBinder4);
                }
                mo10945a(interfaceC0652aM5328a4, bwxVar4, string5, string6, cirVar2);
                parcel2.writeNoException();
                break;
            case 8:
                mo10955d();
                parcel2.writeNoException();
                break;
            case 9:
                mo10956e();
                parcel2.writeNoException();
                break;
            case 10:
                mo10944a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), (bwx) bnt.m9734a(parcel, bwx.CREATOR), parcel.readString(), AbstractBinderC1512ds.m11201a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                mo10950a((bwx) bnt.m9734a(parcel, bwx.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                mo10957f();
                parcel2.writeNoException();
                break;
            case 13:
                boolean zG = mo10958g();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zG);
                break;
            case 14:
                InterfaceC0652a interfaceC0652aM5328a5 = InterfaceC0652a.a.m5328a(parcel.readStrongBinder());
                bwx bwxVar5 = (bwx) bnt.m9734a(parcel, bwx.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    cirVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    cirVar = iInterfaceQueryLocalInterface5 instanceof cip ? (cip) iInterfaceQueryLocalInterface5 : new cir(strongBinder5);
                }
                mo10946a(interfaceC0652aM5328a5, bwxVar5, string7, string8, cirVar, (ccm) bnt.m9734a(parcel, ccm.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
                civ civVarH = mo10959h();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, civVarH);
                break;
            case 16:
                ciy ciyVarI = mo10960i();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, ciyVarI);
                break;
            case 17:
                Bundle bundleJ = mo10961j();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleJ);
                break;
            case 18:
                Bundle bundleK = mo10962k();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleK);
                break;
            case 19:
                Bundle bundleL = mo10963l();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bundleL);
                break;
            case 20:
                mo10951a((bwx) bnt.m9734a(parcel, bwx.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                mo10942a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                boolean zM = mo10964m();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zM);
                break;
            case 23:
                mo10949a(InterfaceC0652a.a.m5328a(parcel.readStrongBinder()), AbstractBinderC1512ds.m11201a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                cdv cdvVarN = mo10965n();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, cdvVarN);
                break;
            case 25:
                mo10952a(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                byx byxVarO = mo10966o();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarO);
                break;
            default:
                return false;
        }
        return true;
    }
}
