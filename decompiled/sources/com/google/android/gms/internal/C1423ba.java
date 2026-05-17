package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ba */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1423ba extends AbstractC2011we {
    public static final Parcelable.Creator<C1423ba> CREATOR = new C1424bb();

    /* JADX INFO: renamed from: a */
    String f7644a;

    public C1423ba(String str) {
        this.f7644a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7644a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
