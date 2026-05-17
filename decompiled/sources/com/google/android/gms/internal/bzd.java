package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzd extends AbstractC2011we {
    public static final Parcelable.Creator<bzd> CREATOR = new bze();

    /* JADX INFO: renamed from: a */
    public final int f9307a;

    public bzd(int i) {
        this.f9307a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 2, this.f9307a);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
