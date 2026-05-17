package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.C0990d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.vc */
/* JADX INFO: loaded from: classes.dex */
public final class C1982vc extends AbstractC2011we {
    public static final Parcelable.Creator<C1982vc> CREATOR = new C1983vd();

    /* JADX INFO: renamed from: a */
    private double f11781a;

    /* JADX INFO: renamed from: b */
    private boolean f11782b;

    /* JADX INFO: renamed from: c */
    private int f11783c;

    /* JADX INFO: renamed from: d */
    private C0990d f11784d;

    /* JADX INFO: renamed from: e */
    private int f11785e;

    public C1982vc() {
        this(Double.NaN, false, -1, null, -1);
    }

    C1982vc(double d, boolean z, int i, C0990d c0990d, int i2) {
        this.f11781a = d;
        this.f11782b = z;
        this.f11783c = i;
        this.f11784d = c0990d;
        this.f11785e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final double m12430a() {
        return this.f11781a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12431b() {
        return this.f11782b;
    }

    /* JADX INFO: renamed from: c */
    public final int m12432c() {
        return this.f11783c;
    }

    /* JADX INFO: renamed from: d */
    public final int m12433d() {
        return this.f11785e;
    }

    /* JADX INFO: renamed from: e */
    public final C0990d m12434e() {
        return this.f11784d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1982vc)) {
            return false;
        }
        C1982vc c1982vc = (C1982vc) obj;
        return this.f11781a == c1982vc.f11781a && this.f11782b == c1982vc.f11782b && this.f11783c == c1982vc.f11783c && C1981vb.m12427a(this.f11784d, c1982vc.f11784d) && this.f11785e == c1982vc.f11785e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f11781a), Boolean.valueOf(this.f11782b), Integer.valueOf(this.f11783c), this.f11784d, Integer.valueOf(this.f11785e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12514a(parcel, 2, this.f11781a);
        C2014wh.m12526a(parcel, 3, this.f11782b);
        C2014wh.m12516a(parcel, 4, this.f11783c);
        C2014wh.m12520a(parcel, 5, (Parcelable) this.f11784d, i, false);
        C2014wh.m12516a(parcel, 6, this.f11785e);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
