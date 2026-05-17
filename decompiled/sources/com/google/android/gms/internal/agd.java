package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1071a;
import com.google.android.gms.common.internal.C1224am;

/* JADX INFO: loaded from: classes.dex */
public final class agd extends AbstractC2011we {
    public static final Parcelable.Creator<agd> CREATOR = new age();

    /* JADX INFO: renamed from: a */
    private int f6684a;

    /* JADX INFO: renamed from: b */
    private final C1071a f6685b;

    /* JADX INFO: renamed from: c */
    private final C1224am f6686c;

    public agd(int i) {
        this(new C1071a(8, null), null);
    }

    agd(int i, C1071a c1071a, C1224am c1224am) {
        this.f6684a = i;
        this.f6685b = c1071a;
        this.f6686c = c1224am;
    }

    private agd(C1071a c1071a, C1224am c1224am) {
        this(1, c1071a, null);
    }

    /* JADX INFO: renamed from: a */
    public final C1071a m7834a() {
        return this.f6685b;
    }

    /* JADX INFO: renamed from: b */
    public final C1224am m7835b() {
        return this.f6686c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f6684a);
        C2014wh.m12520a(parcel, 2, (Parcelable) this.f6685b, i, false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f6686c, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
