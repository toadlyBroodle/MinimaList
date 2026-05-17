package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0947l extends AbstractC2011we {
    public static final Parcelable.Creator<C0947l> CREATOR = new C0946k();

    /* JADX INFO: renamed from: a */
    private int f5094a;

    /* JADX INFO: renamed from: b */
    private int f5095b;

    /* JADX INFO: renamed from: c */
    private Bundle f5096c;

    C0947l(int i, int i2, Bundle bundle) {
        this.f5094a = i;
        this.f5095b = i2;
        this.f5096c = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final int m6180a() {
        return this.f5095b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5094a);
        C2014wh.m12516a(parcel, 2, this.f5095b);
        C2014wh.m12518a(parcel, 3, this.f5096c, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
