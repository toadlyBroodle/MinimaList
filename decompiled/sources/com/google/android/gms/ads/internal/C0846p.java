package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.cnb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.p */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0846p extends AbstractC2011we {
    public static final Parcelable.Creator<C0846p> CREATOR = new C0847q();

    /* JADX INFO: renamed from: a */
    public final boolean f4840a;

    /* JADX INFO: renamed from: b */
    public final boolean f4841b;

    /* JADX INFO: renamed from: c */
    public final boolean f4842c;

    /* JADX INFO: renamed from: d */
    public final float f4843d;

    /* JADX INFO: renamed from: e */
    public final int f4844e;

    /* JADX INFO: renamed from: f */
    public final boolean f4845f;

    /* JADX INFO: renamed from: g */
    public final boolean f4846g;

    /* JADX INFO: renamed from: h */
    private String f4847h;

    C0846p(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5) {
        this.f4840a = z;
        this.f4841b = z2;
        this.f4847h = str;
        this.f4842c = z3;
        this.f4843d = f;
        this.f4844e = i;
        this.f4845f = z4;
        this.f4846g = z5;
    }

    public C0846p(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5) {
        this(z, z2, null, z3, f, i, z4, z5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12526a(parcel, 2, this.f4840a);
        C2014wh.m12526a(parcel, 3, this.f4841b);
        C2014wh.m12524a(parcel, 4, this.f4847h, false);
        C2014wh.m12526a(parcel, 5, this.f4842c);
        C2014wh.m12515a(parcel, 6, this.f4843d);
        C2014wh.m12516a(parcel, 7, this.f4844e);
        C2014wh.m12526a(parcel, 8, this.f4845f);
        C2014wh.m12526a(parcel, 9, this.f4846g);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
