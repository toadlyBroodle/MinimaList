package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: loaded from: classes.dex */
public abstract class bye extends bns implements byd {
    public bye() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX INFO: renamed from: a */
    public static byd m10415a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof byd ? (byd) iInterfaceQueryLocalInterface : new byf(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byp byrVar = null;
        bxs bxuVar = null;
        byi bykVar = null;
        bxp bxrVar = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                InterfaceC0652a interfaceC0652aJ = mo5480j();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, interfaceC0652aJ);
                break;
            case 2:
                mo5479i();
                parcel2.writeNoException();
                break;
            case 3:
                boolean zL = mo5482l();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zL);
                break;
            case 4:
                boolean zB = mo5473b((bwx) bnt.m9734a(parcel, bwx.CREATOR));
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zB);
                break;
            case 5:
                mo5484n();
                parcel2.writeNoException();
                break;
            case 6:
                mo5485o();
                parcel2.writeNoException();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    bxuVar = iInterfaceQueryLocalInterface instanceof bxs ? (bxs) iInterfaceQueryLocalInterface : new bxu(strongBinder);
                }
                mo5452a(bxuVar);
                parcel2.writeNoException();
                break;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    bykVar = iInterfaceQueryLocalInterface2 instanceof byi ? (byi) iInterfaceQueryLocalInterface2 : new byk(strongBinder2);
                }
                mo5453a(bykVar);
                parcel2.writeNoException();
                break;
            case 9:
                mo5503D();
                parcel2.writeNoException();
                break;
            case 10:
                mo5486p();
                parcel2.writeNoException();
                break;
            case 11:
                mo5483m();
                parcel2.writeNoException();
                break;
            case 12:
                bxb bxbVarK = mo5481k();
                parcel2.writeNoException();
                bnt.m9740b(parcel2, bxbVarK);
                break;
            case 13:
                mo5450a((bxb) bnt.m9734a(parcel, bxb.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                mo5459a(ckq.m11069a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                mo5460a(ckw.m11071a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strA = mo5549a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 19:
                mo5458a(cbi.m10591a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    bxrVar = iInterfaceQueryLocalInterface3 instanceof bxp ? (bxp) iInterfaceQueryLocalInterface3 : new bxr(strongBinder3);
                }
                mo5451a(bxrVar);
                parcel2.writeNoException();
                break;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    byrVar = iInterfaceQueryLocalInterface4 instanceof byp ? (byp) iInterfaceQueryLocalInterface4 : new byr(strongBinder4);
                }
                mo5454a(byrVar);
                parcel2.writeNoException();
                break;
            case 22:
                mo5472b(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            case 23:
                boolean zQ = mo5487q();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zQ);
                break;
            case 24:
                mo5461a(AbstractBinderC1488cv.m11155a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 25:
                mo5464a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 26:
                byx byxVarR = mo5488r();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byxVarR);
                break;
            case 29:
                mo5456a((bzw) bnt.m9734a(parcel, bzw.CREATOR));
                parcel2.writeNoException();
                break;
            case 30:
                mo5455a((bzd) bnt.m9734a(parcel, bzd.CREATOR));
                parcel2.writeNoException();
                break;
            case 31:
                String strA2 = mo5443A();
                parcel2.writeNoException();
                parcel2.writeString(strA2);
                break;
            case 32:
                byi byiVarB = mo5444B();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, byiVarB);
                break;
            case 33:
                bxs bxsVarC = mo5445C();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bxsVarC);
                break;
            case 34:
                mo5474c(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            case 35:
                String strF_ = mo5554f_();
                parcel2.writeNoException();
                parcel2.writeString(strF_);
                break;
        }
        return true;
    }
}
