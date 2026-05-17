package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.da */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1494da extends AbstractC2011we {
    public static final Parcelable.Creator<C1494da> CREATOR = new C1495db();

    /* JADX INFO: renamed from: a */
    public final bwx f10421a;

    /* JADX INFO: renamed from: b */
    public final String f10422b;

    public C1494da(bwx bwxVar, String str) {
        this.f10421a = bwxVar;
        this.f10422b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f10421a, i, false);
        C2014wh.m12524a(parcel, 3, this.f10422b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
