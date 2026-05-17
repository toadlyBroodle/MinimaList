package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class byy extends bns implements byx {
    public byy() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX INFO: renamed from: a */
    public static byx m10432a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof byx ? (byx) iInterfaceQueryLocalInterface : new byz(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        bza bzcVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo10420a();
                parcel2.writeNoException();
                break;
            case 2:
                mo10423b();
                parcel2.writeNoException();
                break;
            case 3:
                mo10422a(bnt.m9738a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                boolean zC = mo10424c();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zC);
                break;
            case 5:
                int iD = mo10425d();
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                break;
            case 6:
                float f = mo10427f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 7:
                float fG = mo10428g();
                parcel2.writeNoException();
                parcel2.writeFloat(fG);
                break;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    bzcVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    bzcVar = iInterfaceQueryLocalInterface instanceof bza ? (bza) iInterfaceQueryLocalInterface : new bzc(strongBinder);
                }
                mo10421a(bzcVar);
                parcel2.writeNoException();
                break;
            case 9:
                float fE = mo10426e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                break;
            case 10:
                boolean zI = mo10430i();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zI);
                break;
            case 11:
                bza bzaVarH = mo10429h();
                parcel2.writeNoException();
                bnt.m9735a(parcel2, bzaVarH);
                break;
            case 12:
                boolean zJ = mo10431j();
                parcel2.writeNoException();
                bnt.m9737a(parcel2, zJ);
                break;
            default:
                return false;
        }
        return true;
    }
}
