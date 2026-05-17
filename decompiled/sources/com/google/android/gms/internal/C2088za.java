package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.za */
/* JADX INFO: loaded from: classes.dex */
public final class C2088za extends AbstractC2011we {
    public static final Parcelable.Creator<C2088za> CREATOR = new C2089zb();

    /* JADX INFO: renamed from: a */
    public String f12635a;

    /* JADX INFO: renamed from: b */
    public String f12636b;

    /* JADX INFO: renamed from: c */
    public aeh f12637c;

    /* JADX INFO: renamed from: d */
    public long f12638d;

    /* JADX INFO: renamed from: e */
    public boolean f12639e;

    /* JADX INFO: renamed from: f */
    public String f12640f;

    /* JADX INFO: renamed from: g */
    public C2104zq f12641g;

    /* JADX INFO: renamed from: h */
    public long f12642h;

    /* JADX INFO: renamed from: i */
    public C2104zq f12643i;

    /* JADX INFO: renamed from: j */
    public long f12644j;

    /* JADX INFO: renamed from: k */
    public C2104zq f12645k;

    /* JADX INFO: renamed from: l */
    private int f12646l;

    C2088za(int i, String str, String str2, aeh aehVar, long j, boolean z, String str3, C2104zq c2104zq, long j2, C2104zq c2104zq2, long j3, C2104zq c2104zq3) {
        this.f12646l = i;
        this.f12635a = str;
        this.f12636b = str2;
        this.f12637c = aehVar;
        this.f12638d = j;
        this.f12639e = z;
        this.f12640f = str3;
        this.f12641g = c2104zq;
        this.f12642h = j2;
        this.f12643i = c2104zq2;
        this.f12644j = j3;
        this.f12645k = c2104zq3;
    }

    C2088za(C2088za c2088za) {
        this.f12646l = 1;
        C1221aj.m7065a(c2088za);
        this.f12635a = c2088za.f12635a;
        this.f12636b = c2088za.f12636b;
        this.f12637c = c2088za.f12637c;
        this.f12638d = c2088za.f12638d;
        this.f12639e = c2088za.f12639e;
        this.f12640f = c2088za.f12640f;
        this.f12641g = c2088za.f12641g;
        this.f12642h = c2088za.f12642h;
        this.f12643i = c2088za.f12643i;
        this.f12644j = c2088za.f12644j;
        this.f12645k = c2088za.f12645k;
    }

    C2088za(String str, String str2, aeh aehVar, long j, boolean z, String str3, C2104zq c2104zq, long j2, C2104zq c2104zq2, long j3, C2104zq c2104zq3) {
        this.f12646l = 1;
        this.f12635a = str;
        this.f12636b = str2;
        this.f12637c = aehVar;
        this.f12638d = j;
        this.f12639e = z;
        this.f12640f = str3;
        this.f12641g = c2104zq;
        this.f12642h = j2;
        this.f12643i = c2104zq2;
        this.f12644j = j3;
        this.f12645k = c2104zq3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f12646l);
        C2014wh.m12524a(parcel, 2, this.f12635a, false);
        C2014wh.m12524a(parcel, 3, this.f12636b, false);
        C2014wh.m12520a(parcel, 4, (Parcelable) this.f12637c, i, false);
        C2014wh.m12517a(parcel, 5, this.f12638d);
        C2014wh.m12526a(parcel, 6, this.f12639e);
        C2014wh.m12524a(parcel, 7, this.f12640f, false);
        C2014wh.m12520a(parcel, 8, (Parcelable) this.f12641g, i, false);
        C2014wh.m12517a(parcel, 9, this.f12642h);
        C2014wh.m12520a(parcel, 10, (Parcelable) this.f12643i, i, false);
        C2014wh.m12517a(parcel, 11, this.f12644j);
        C2014wh.m12520a(parcel, 12, (Parcelable) this.f12645k, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
