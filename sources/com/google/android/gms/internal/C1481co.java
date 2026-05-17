package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.co */
/* JADX INFO: loaded from: classes.dex */
public final class C1481co extends bnr implements InterfaceC1479cm {
    C1481co(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.InterfaceC1479cm
    /* JADX INFO: renamed from: a */
    public final String mo10851a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        String string = parcelM9730a.readString();
        parcelM9730a.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.InterfaceC1479cm
    /* JADX INFO: renamed from: b */
    public final int mo10852b() {
        Parcel parcelM9730a = m9730a(2, m9733o_());
        int i = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i;
    }
}
