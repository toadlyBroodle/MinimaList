package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1218ag;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bwx extends AbstractC2011we {
    public static final Parcelable.Creator<bwx> CREATOR = new bwz();

    /* JADX INFO: renamed from: a */
    public final int f9207a;

    /* JADX INFO: renamed from: b */
    public final long f9208b;

    /* JADX INFO: renamed from: c */
    public final Bundle f9209c;

    /* JADX INFO: renamed from: d */
    public final int f9210d;

    /* JADX INFO: renamed from: e */
    public final List<String> f9211e;

    /* JADX INFO: renamed from: f */
    public final boolean f9212f;

    /* JADX INFO: renamed from: g */
    public final int f9213g;

    /* JADX INFO: renamed from: h */
    public final boolean f9214h;

    /* JADX INFO: renamed from: i */
    public final String f9215i;

    /* JADX INFO: renamed from: j */
    public final bzs f9216j;

    /* JADX INFO: renamed from: k */
    public final Location f9217k;

    /* JADX INFO: renamed from: l */
    public final String f9218l;

    /* JADX INFO: renamed from: m */
    public final Bundle f9219m;

    /* JADX INFO: renamed from: n */
    public final Bundle f9220n;

    /* JADX INFO: renamed from: o */
    public final List<String> f9221o;

    /* JADX INFO: renamed from: p */
    public final String f9222p;

    /* JADX INFO: renamed from: q */
    public final String f9223q;

    /* JADX INFO: renamed from: r */
    public final boolean f9224r;

    public bwx(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, bzs bzsVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f9207a = i;
        this.f9208b = j;
        this.f9209c = bundle == null ? new Bundle() : bundle;
        this.f9210d = i2;
        this.f9211e = list;
        this.f9212f = z;
        this.f9213g = i3;
        this.f9214h = z2;
        this.f9215i = str;
        this.f9216j = bzsVar;
        this.f9217k = location;
        this.f9218l = str2;
        this.f9219m = bundle2 == null ? new Bundle() : bundle2;
        this.f9220n = bundle3;
        this.f9221o = list2;
        this.f9222p = str3;
        this.f9223q = str4;
        this.f9224r = z3;
    }

    /* JADX INFO: renamed from: a */
    public static void m10373a(bwx bwxVar) {
        bwxVar.f9219m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bwxVar.f9209c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bwx)) {
            return false;
        }
        bwx bwxVar = (bwx) obj;
        return this.f9207a == bwxVar.f9207a && this.f9208b == bwxVar.f9208b && C1218ag.m7063a(this.f9209c, bwxVar.f9209c) && this.f9210d == bwxVar.f9210d && C1218ag.m7063a(this.f9211e, bwxVar.f9211e) && this.f9212f == bwxVar.f9212f && this.f9213g == bwxVar.f9213g && this.f9214h == bwxVar.f9214h && C1218ag.m7063a(this.f9215i, bwxVar.f9215i) && C1218ag.m7063a(this.f9216j, bwxVar.f9216j) && C1218ag.m7063a(this.f9217k, bwxVar.f9217k) && C1218ag.m7063a(this.f9218l, bwxVar.f9218l) && C1218ag.m7063a(this.f9219m, bwxVar.f9219m) && C1218ag.m7063a(this.f9220n, bwxVar.f9220n) && C1218ag.m7063a(this.f9221o, bwxVar.f9221o) && C1218ag.m7063a(this.f9222p, bwxVar.f9222p) && C1218ag.m7063a(this.f9223q, bwxVar.f9223q) && this.f9224r == bwxVar.f9224r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9207a), Long.valueOf(this.f9208b), this.f9209c, Integer.valueOf(this.f9210d), this.f9211e, Boolean.valueOf(this.f9212f), Integer.valueOf(this.f9213g), Boolean.valueOf(this.f9214h), this.f9215i, this.f9216j, this.f9217k, this.f9218l, this.f9219m, this.f9220n, this.f9221o, this.f9222p, this.f9223q, Boolean.valueOf(this.f9224r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f9207a);
        C2014wh.m12517a(parcel, 2, this.f9208b);
        C2014wh.m12518a(parcel, 3, this.f9209c, false);
        C2014wh.m12516a(parcel, 4, this.f9210d);
        C2014wh.m12535b(parcel, 5, this.f9211e, false);
        C2014wh.m12526a(parcel, 6, this.f9212f);
        C2014wh.m12516a(parcel, 7, this.f9213g);
        C2014wh.m12526a(parcel, 8, this.f9214h);
        C2014wh.m12524a(parcel, 9, this.f9215i, false);
        C2014wh.m12520a(parcel, 10, (Parcelable) this.f9216j, i, false);
        C2014wh.m12520a(parcel, 11, (Parcelable) this.f9217k, i, false);
        C2014wh.m12524a(parcel, 12, this.f9218l, false);
        C2014wh.m12518a(parcel, 13, this.f9219m, false);
        C2014wh.m12518a(parcel, 14, this.f9220n, false);
        C2014wh.m12535b(parcel, 15, this.f9221o, false);
        C2014wh.m12524a(parcel, 16, this.f9222p, false);
        C2014wh.m12524a(parcel, 17, this.f9223q, false);
        C2014wh.m12526a(parcel, 18, this.f9224r);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
