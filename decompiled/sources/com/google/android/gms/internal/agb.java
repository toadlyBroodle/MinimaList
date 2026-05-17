package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1222ak;

/* JADX INFO: loaded from: classes.dex */
public final class agb extends AbstractC2011we {
    public static final Parcelable.Creator<agb> CREATOR = new agc();

    /* JADX INFO: renamed from: a */
    private int f6682a;

    /* JADX INFO: renamed from: b */
    private C1222ak f6683b;

    agb(int i, C1222ak c1222ak) {
        this.f6682a = i;
        this.f6683b = c1222ak;
    }

    public agb(C1222ak c1222ak) {
        this(1, c1222ak);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f6682a);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f6683b, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
