package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bau extends AbstractC2011we {
    public static final Parcelable.Creator<bau> CREATOR = new bav();

    /* JADX INFO: renamed from: a */
    private String f7702a;

    /* JADX INFO: renamed from: b */
    private String f7703b;

    public bau(String str, String str2) {
        this.f7702a = str;
        this.f7703b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7702a, false);
        C2014wh.m12524a(parcel, 3, this.f7703b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
