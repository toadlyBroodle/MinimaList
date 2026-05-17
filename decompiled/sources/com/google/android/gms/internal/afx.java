package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class afx extends bns implements afw {
    public afx() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 3:
                bnt.m9734a(parcel, C1071a.CREATOR);
                bnt.m9734a(parcel, aft.CREATOR);
                break;
            case 4:
                bnt.m9734a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                bnt.m9734a(parcel, Status.CREATOR);
                break;
            case 7:
                bnt.m9734a(parcel, Status.CREATOR);
                bnt.m9734a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo6899a((agd) bnt.m9734a(parcel, agd.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
