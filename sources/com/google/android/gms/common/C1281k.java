package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.common.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1281k extends AbstractC2011we {
    public static final Parcelable.Creator<C1281k> CREATOR = new C1282l();

    /* JADX INFO: renamed from: a */
    private String f5980a;

    /* JADX INFO: renamed from: b */
    private int f5981b;

    public C1281k(String str, int i) {
        this.f5980a = str;
        this.f5981b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f5980a, false);
        C2014wh.m12516a(parcel, 2, this.f5981b);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
