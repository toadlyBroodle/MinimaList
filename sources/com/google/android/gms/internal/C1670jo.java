package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.jo */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1670jo extends AbstractC2011we {
    public static final Parcelable.Creator<C1670jo> CREATOR = new C1671jp();

    /* JADX INFO: renamed from: a */
    public String f10855a;

    /* JADX INFO: renamed from: b */
    public int f10856b;

    /* JADX INFO: renamed from: c */
    public int f10857c;

    /* JADX INFO: renamed from: d */
    public boolean f10858d;

    /* JADX INFO: renamed from: e */
    public boolean f10859e;

    public C1670jo(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public C1670jo(int i, int i2, boolean z, boolean z2) {
        this(11910000, i2, true, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private C1670jo(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        this(new StringBuilder(String.valueOf("afma-sdk-a-v").length() + 24 + String.valueOf(str).length()).append("afma-sdk-a-v").append(i).append(".").append(i2).append(".").append(str).toString(), i, i2, z, z3);
    }

    C1670jo(String str, int i, int i2, boolean z, boolean z2) {
        this.f10855a = str;
        this.f10856b = i;
        this.f10857c = i2;
        this.f10858d = z;
        this.f10859e = z2;
    }

    /* JADX INFO: renamed from: a */
    public static C1670jo m11616a() {
        return new C1670jo(11910208, 11910208, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f10855a, false);
        C2014wh.m12516a(parcel, 3, this.f10856b);
        C2014wh.m12516a(parcel, 4, this.f10857c);
        C2014wh.m12526a(parcel, 5, this.f10858d);
        C2014wh.m12526a(parcel, 6, this.f10859e);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
