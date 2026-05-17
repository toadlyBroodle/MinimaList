package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.zq */
/* JADX INFO: loaded from: classes.dex */
public final class C2104zq extends AbstractC2011we {
    public static final Parcelable.Creator<C2104zq> CREATOR = new C2105zr();

    /* JADX INFO: renamed from: a */
    public final String f12690a;

    /* JADX INFO: renamed from: b */
    public final C2100zm f12691b;

    /* JADX INFO: renamed from: c */
    public final String f12692c;

    /* JADX INFO: renamed from: d */
    public final long f12693d;

    C2104zq(C2104zq c2104zq, long j) {
        C1221aj.m7065a(c2104zq);
        this.f12690a = c2104zq.f12690a;
        this.f12691b = c2104zq.f12691b;
        this.f12692c = c2104zq.f12692c;
        this.f12693d = j;
    }

    public C2104zq(String str, C2100zm c2100zm, String str2, long j) {
        this.f12690a = str;
        this.f12691b = c2100zm;
        this.f12692c = str2;
        this.f12693d = j;
    }

    public final String toString() {
        String str = this.f12692c;
        String str2 = this.f12690a;
        String strValueOf = String.valueOf(this.f12691b);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(strValueOf).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f12690a, false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f12691b, i, false);
        C2014wh.m12524a(parcel, 4, this.f12692c, false);
        C2014wh.m12517a(parcel, 5, this.f12693d);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
