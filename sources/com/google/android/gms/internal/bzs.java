package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.p047d.C0682a;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzs extends AbstractC2011we {
    public static final Parcelable.Creator<bzs> CREATOR = new bzt();

    /* JADX INFO: renamed from: a */
    public final String f9376a;

    public bzs(C0682a c0682a) {
        this.f9376a = c0682a.m5419a();
    }

    bzs(String str) {
        this.f9376a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 15, this.f9376a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
