package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ciu extends bnr implements cis {
    ciu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // com.google.android.gms.internal.cis
    /* JADX INFO: renamed from: a */
    public final int mo10904a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        int i = parcelM9730a.readInt();
        parcelM9730a.recycle();
        return i;
    }
}
