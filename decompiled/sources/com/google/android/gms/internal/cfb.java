package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cfb extends AbstractC2011we {
    public static final Parcelable.Creator<cfb> CREATOR = new cfc();

    /* JADX INFO: renamed from: a */
    public final boolean f9897a;

    /* JADX INFO: renamed from: b */
    public final String f9898b;

    /* JADX INFO: renamed from: c */
    public final int f9899c;

    /* JADX INFO: renamed from: d */
    public final byte[] f9900d;

    /* JADX INFO: renamed from: e */
    public final String[] f9901e;

    /* JADX INFO: renamed from: f */
    public final String[] f9902f;

    /* JADX INFO: renamed from: g */
    public final boolean f9903g;

    /* JADX INFO: renamed from: h */
    public final long f9904h;

    cfb(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f9897a = z;
        this.f9898b = str;
        this.f9899c = i;
        this.f9900d = bArr;
        this.f9901e = strArr;
        this.f9902f = strArr2;
        this.f9903g = z2;
        this.f9904h = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12526a(parcel, 1, this.f9897a);
        C2014wh.m12524a(parcel, 2, this.f9898b, false);
        C2014wh.m12516a(parcel, 3, this.f9899c);
        C2014wh.m12527a(parcel, 4, this.f9900d, false);
        C2014wh.m12531a(parcel, 5, this.f9901e, false);
        C2014wh.m12531a(parcel, 6, this.f9902f, false);
        C2014wh.m12526a(parcel, 7, this.f9903g);
        C2014wh.m12517a(parcel, 8, this.f9904h);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
