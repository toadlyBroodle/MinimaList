package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: loaded from: classes.dex */
public final class aeh extends AbstractC2011we {
    public static final Parcelable.Creator<aeh> CREATOR = new aei();

    /* JADX INFO: renamed from: a */
    public final String f6488a;

    /* JADX INFO: renamed from: b */
    public final long f6489b;

    /* JADX INFO: renamed from: c */
    public final String f6490c;

    /* JADX INFO: renamed from: d */
    private int f6491d;

    /* JADX INFO: renamed from: e */
    private Long f6492e;

    /* JADX INFO: renamed from: f */
    private Float f6493f;

    /* JADX INFO: renamed from: g */
    private String f6494g;

    /* JADX INFO: renamed from: h */
    private Double f6495h;

    aeh(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f6491d = i;
        this.f6488a = str;
        this.f6489b = j;
        this.f6492e = l;
        this.f6493f = null;
        if (i == 1) {
            this.f6495h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f6495h = d;
        }
        this.f6494g = str2;
        this.f6490c = str3;
    }

    aeh(aej aejVar) {
        this(aejVar.f6498c, aejVar.f6499d, aejVar.f6500e, aejVar.f6497b);
    }

    aeh(String str, long j, Object obj, String str2) {
        C1221aj.m7067a(str);
        this.f6491d = 2;
        this.f6488a = str;
        this.f6489b = j;
        this.f6490c = str2;
        if (obj == null) {
            this.f6492e = null;
            this.f6493f = null;
            this.f6495h = null;
            this.f6494g = null;
            return;
        }
        if (obj instanceof Long) {
            this.f6492e = (Long) obj;
            this.f6493f = null;
            this.f6495h = null;
            this.f6494g = null;
            return;
        }
        if (obj instanceof String) {
            this.f6492e = null;
            this.f6493f = null;
            this.f6495h = null;
            this.f6494g = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f6492e = null;
        this.f6493f = null;
        this.f6495h = (Double) obj;
        this.f6494g = null;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7712a() {
        if (this.f6492e != null) {
            return this.f6492e;
        }
        if (this.f6495h != null) {
            return this.f6495h;
        }
        if (this.f6494g != null) {
            return this.f6494g;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f6491d);
        C2014wh.m12524a(parcel, 2, this.f6488a, false);
        C2014wh.m12517a(parcel, 3, this.f6489b);
        C2014wh.m12523a(parcel, 4, this.f6492e, false);
        C2014wh.m12522a(parcel, 5, (Float) null, false);
        C2014wh.m12524a(parcel, 6, this.f6494g, false);
        C2014wh.m12524a(parcel, 7, this.f6490c, false);
        C2014wh.m12521a(parcel, 8, this.f6495h, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
