package com.google.android.gms.tagmanager;

import android.os.Parcel;
import com.google.android.gms.internal.bns;
import com.google.android.gms.internal.bnt;

/* JADX INFO: renamed from: com.google.android.gms.tagmanager.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2129i extends bns implements InterfaceC2128h {
    public AbstractBinderC2129i() {
        attachInterface(this, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo12819a(parcel.readString(), bnt.m9741c(parcel));
                parcel2.writeNoException();
                break;
            case 2:
                String strB = mo12820b(parcel.readString(), bnt.m9741c(parcel));
                parcel2.writeNoException();
                parcel2.writeString(strB);
                break;
        }
        return true;
    }
}
