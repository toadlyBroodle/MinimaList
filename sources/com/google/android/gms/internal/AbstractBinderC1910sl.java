package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.internal.sl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1910sl extends bns implements InterfaceC1909sk {
    public AbstractBinderC1910sl() {
        attachInterface(this, "com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo12303a((Status) bnt.m9734a(parcel, Status.CREATOR));
                break;
            case 2:
                mo12304a((Status) bnt.m9734a(parcel, Status.CREATOR), (Intent) bnt.m9734a(parcel, Intent.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
