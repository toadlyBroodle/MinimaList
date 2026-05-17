package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.yh */
/* JADX INFO: loaded from: classes.dex */
public final class C2068yh extends AbstractC2011we {
    public static final Parcelable.Creator<C2068yh> CREATOR = new C2069yi();

    /* JADX INFO: renamed from: a */
    private int f12526a;

    /* JADX INFO: renamed from: b */
    private String f12527b;

    /* JADX INFO: renamed from: c */
    private String f12528c;

    C2068yh(int i, String str, String str2) {
        this.f12526a = i;
        this.f12527b = str;
        this.f12528c = str2;
    }

    public C2068yh(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f12526a);
        C2014wh.m12524a(parcel, 2, this.f12527b, false);
        C2014wh.m12524a(parcel, 3, this.f12528c, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
