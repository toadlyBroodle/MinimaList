package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.wg */
/* JADX INFO: loaded from: classes.dex */
public final class C2013wg extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2013wg(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        super(new StringBuilder(String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(iDataPosition).append(" size=").append(parcel.dataSize()).toString());
    }
}
