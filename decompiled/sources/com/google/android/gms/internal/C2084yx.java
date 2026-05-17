package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.yx */
/* JADX INFO: loaded from: classes.dex */
public final class C2084yx extends AbstractC2011we {
    public static final Parcelable.Creator<C2084yx> CREATOR = new C2085yy();

    /* JADX INFO: renamed from: a */
    public final String f12574a;

    /* JADX INFO: renamed from: b */
    public final String f12575b;

    /* JADX INFO: renamed from: c */
    public final String f12576c;

    /* JADX INFO: renamed from: d */
    public final String f12577d;

    /* JADX INFO: renamed from: e */
    public final long f12578e;

    /* JADX INFO: renamed from: f */
    public final long f12579f;

    /* JADX INFO: renamed from: g */
    public final String f12580g;

    /* JADX INFO: renamed from: h */
    public final boolean f12581h;

    /* JADX INFO: renamed from: i */
    public final boolean f12582i;

    /* JADX INFO: renamed from: j */
    public final long f12583j;

    /* JADX INFO: renamed from: k */
    public final String f12584k;

    /* JADX INFO: renamed from: l */
    public final long f12585l;

    /* JADX INFO: renamed from: m */
    public final long f12586m;

    /* JADX INFO: renamed from: n */
    public final int f12587n;

    /* JADX INFO: renamed from: o */
    public final boolean f12588o;

    C2084yx(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3) {
        C1221aj.m7067a(str);
        this.f12574a = str;
        this.f12575b = TextUtils.isEmpty(str2) ? null : str2;
        this.f12576c = str3;
        this.f12583j = j;
        this.f12577d = str4;
        this.f12578e = j2;
        this.f12579f = j3;
        this.f12580g = str5;
        this.f12581h = z;
        this.f12582i = z2;
        this.f12584k = str6;
        this.f12585l = j4;
        this.f12586m = j5;
        this.f12587n = i;
        this.f12588o = z3;
    }

    C2084yx(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3) {
        this.f12574a = str;
        this.f12575b = str2;
        this.f12576c = str3;
        this.f12583j = j3;
        this.f12577d = str4;
        this.f12578e = j;
        this.f12579f = j2;
        this.f12580g = str5;
        this.f12581h = z;
        this.f12582i = z2;
        this.f12584k = str6;
        this.f12585l = j4;
        this.f12586m = j5;
        this.f12587n = i;
        this.f12588o = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f12574a, false);
        C2014wh.m12524a(parcel, 3, this.f12575b, false);
        C2014wh.m12524a(parcel, 4, this.f12576c, false);
        C2014wh.m12524a(parcel, 5, this.f12577d, false);
        C2014wh.m12517a(parcel, 6, this.f12578e);
        C2014wh.m12517a(parcel, 7, this.f12579f);
        C2014wh.m12524a(parcel, 8, this.f12580g, false);
        C2014wh.m12526a(parcel, 9, this.f12581h);
        C2014wh.m12526a(parcel, 10, this.f12582i);
        C2014wh.m12517a(parcel, 11, this.f12583j);
        C2014wh.m12524a(parcel, 12, this.f12584k, false);
        C2014wh.m12517a(parcel, 13, this.f12585l);
        C2014wh.m12517a(parcel, 14, this.f12586m);
        C2014wh.m12516a(parcel, 15, this.f12587n);
        C2014wh.m12526a(parcel, 16, this.f12588o);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
