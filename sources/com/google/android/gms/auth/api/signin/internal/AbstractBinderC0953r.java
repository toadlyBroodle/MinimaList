package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0953r extends bns implements InterfaceC0952q {
    public AbstractBinderC0953r() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 101:
                mo6160a((GoogleSignInAccount) bnt.m9734a(parcel, GoogleSignInAccount.CREATOR), (Status) bnt.m9734a(parcel, Status.CREATOR));
                break;
            case 102:
                mo6161a((Status) bnt.m9734a(parcel, Status.CREATOR));
                break;
            case 103:
                mo6162b((Status) bnt.m9734a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
