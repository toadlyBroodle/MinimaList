package com.google.android.gms.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bzu extends bxb {
    public bzu(bxb bxbVar) {
        super(bxbVar.f9247a, bxbVar.f9248b, bxbVar.f9249c, bxbVar.f9250d, bxbVar.f9251e, bxbVar.f9252f, bxbVar.f9253g, bxbVar.f9254h, bxbVar.f9255i, bxbVar.f9256j);
    }

    @Override // com.google.android.gms.internal.bxb, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f9247a, false);
        C2014wh.m12516a(parcel, 3, this.f9248b);
        C2014wh.m12516a(parcel, 6, this.f9251e);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
