package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C0857j;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzw extends AbstractC2011we {
    public static final Parcelable.Creator<bzw> CREATOR = new bzx();

    /* JADX INFO: renamed from: a */
    public final boolean f9378a;

    /* JADX INFO: renamed from: b */
    public final boolean f9379b;

    /* JADX INFO: renamed from: c */
    public final boolean f9380c;

    public bzw(C0857j c0857j) {
        this(c0857j.m5829a(), c0857j.m5830b(), c0857j.m5831c());
    }

    public bzw(boolean z, boolean z2, boolean z3) {
        this.f9378a = z;
        this.f9379b = z2;
        this.f9380c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12526a(parcel, 2, this.f9378a);
        C2014wh.m12526a(parcel, 3, this.f9379b);
        C2014wh.m12526a(parcel, 4, this.f9380c);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
