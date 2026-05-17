package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class baa extends AbstractC2011we {
    public static final Parcelable.Creator<baa> CREATOR = new bab();

    /* JADX INFO: renamed from: a */
    private String f7645a;

    /* JADX INFO: renamed from: b */
    private boolean f7646b;

    /* JADX INFO: renamed from: c */
    private String f7647c;

    /* JADX INFO: renamed from: d */
    private boolean f7648d;

    /* JADX INFO: renamed from: e */
    private bam f7649e;

    public baa() {
        this.f7649e = bam.m8782a();
    }

    public baa(String str, boolean z, String str2, boolean z2, bam bamVar) {
        this.f7645a = str;
        this.f7646b = z;
        this.f7647c = str2;
        this.f7648d = z2;
        this.f7649e = bamVar == null ? bam.m8782a() : bam.m8783a(bamVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f7645a, false);
        C2014wh.m12526a(parcel, 3, this.f7646b);
        C2014wh.m12524a(parcel, 4, this.f7647c, false);
        C2014wh.m12526a(parcel, 5, this.f7648d);
        C2014wh.m12520a(parcel, 6, (Parcelable) this.f7649e, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
