package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.bns;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0951p extends bns implements InterfaceC0950o {
    public AbstractBinderC0951p() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo6188a();
                break;
            case 2:
                mo6189b();
                break;
        }
        return true;
    }
}
