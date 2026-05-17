package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class byr extends bnr implements byp {
    byr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.byp
    /* JADX INFO: renamed from: a */
    public final long mo10411a() {
        Parcel parcelM9730a = m9730a(1, m9733o_());
        long j = parcelM9730a.readLong();
        parcelM9730a.recycle();
        return j;
    }
}
