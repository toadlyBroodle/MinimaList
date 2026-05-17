package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bak extends AbstractC2011we {
    public static final Parcelable.Creator<bak> CREATOR = new bal();

    /* JADX INFO: renamed from: a */
    private String f7674a;

    /* JADX INFO: renamed from: b */
    private String f7675b;

    /* JADX INFO: renamed from: c */
    private String f7676c;

    public bak() {
    }

    bak(String str, String str2, String str3) {
        this.f7674a = str;
        this.f7675b = str2;
        this.f7676c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7674a, false);
        C2014wh.m12524a(parcel, 3, this.f7675b, false);
        C2014wh.m12524a(parcel, 4, this.f7676c, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
