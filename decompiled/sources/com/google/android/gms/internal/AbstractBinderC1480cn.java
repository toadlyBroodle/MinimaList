package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.cn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1480cn extends bns implements InterfaceC1479cm {
    public AbstractBinderC1480cn() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                String strA = mo10851a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                break;
            case 2:
                int iB = mo10852b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                break;
        }
        return true;
    }
}
