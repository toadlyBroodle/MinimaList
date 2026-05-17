package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.p045b.C0667d;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class ccm extends AbstractC2011we {
    public static final Parcelable.Creator<ccm> CREATOR = new ccn();

    /* JADX INFO: renamed from: a */
    public final int f9814a;

    /* JADX INFO: renamed from: b */
    public final boolean f9815b;

    /* JADX INFO: renamed from: c */
    public final int f9816c;

    /* JADX INFO: renamed from: d */
    public final boolean f9817d;

    /* JADX INFO: renamed from: e */
    public final int f9818e;

    /* JADX INFO: renamed from: f */
    public final bzw f9819f;

    public ccm(int i, boolean z, int i2, boolean z2, int i3, bzw bzwVar) {
        this.f9814a = i;
        this.f9815b = z;
        this.f9816c = i2;
        this.f9817d = z2;
        this.f9818e = i3;
        this.f9819f = bzwVar;
    }

    public ccm(C0667d c0667d) {
        this(3, c0667d.m5347a(), c0667d.m5348b(), c0667d.m5349c(), c0667d.m5350d(), c0667d.m5351e() != null ? new bzw(c0667d.m5351e()) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f9814a);
        C2014wh.m12526a(parcel, 2, this.f9815b);
        C2014wh.m12516a(parcel, 3, this.f9816c);
        C2014wh.m12526a(parcel, 4, this.f9817d);
        C2014wh.m12516a(parcel, 5, this.f9818e);
        C2014wh.m12520a(parcel, 6, (Parcelable) this.f9819f, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
