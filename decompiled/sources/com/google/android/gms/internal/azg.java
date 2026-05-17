package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C2204r;

/* JADX INFO: loaded from: classes.dex */
public abstract class azg extends bns implements azf {
    public azg() {
        attachInterface(this, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo8721a((bae) bnt.m9734a(parcel, bae.CREATOR));
                break;
            case 2:
                mo8722a((bae) bnt.m9734a(parcel, bae.CREATOR), (bac) bnt.m9734a(parcel, bac.CREATOR));
                break;
            case 3:
                mo8720a((baa) bnt.m9734a(parcel, baa.CREATOR));
                break;
            case 4:
                mo8723a((bak) bnt.m9734a(parcel, bak.CREATOR));
                break;
            case 5:
                mo8718a((Status) bnt.m9734a(parcel, Status.CREATOR));
                break;
            case 6:
                mo8717a();
                break;
            case 7:
                mo8726b();
                break;
            case 8:
                mo8725a(parcel.readString());
                break;
            case 9:
                mo8727b(parcel.readString());
                break;
            case 10:
                mo8724a((C2204r) bnt.m9734a(parcel, C2204r.CREATOR));
                break;
            case 11:
                mo8729c(parcel.readString());
                break;
            case 12:
                mo8719a((Status) bnt.m9734a(parcel, Status.CREATOR), (C2204r) bnt.m9734a(parcel, C2204r.CREATOR));
                break;
            case 13:
                mo8728c();
                break;
            default:
                return false;
        }
        return true;
    }
}
