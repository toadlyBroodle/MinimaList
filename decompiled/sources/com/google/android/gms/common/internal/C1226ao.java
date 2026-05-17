package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1226ao extends AbstractC2011we {
    public static final Parcelable.Creator<C1226ao> CREATOR = new C1227ap();

    /* JADX INFO: renamed from: a */
    private int f5854a;

    /* JADX INFO: renamed from: b */
    private final int f5855b;

    /* JADX INFO: renamed from: c */
    private final int f5856c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    private final Scope[] f5857d;

    C1226ao(int i, int i2, int i3, Scope[] scopeArr) {
        this.f5854a = i;
        this.f5855b = i2;
        this.f5856c = i3;
        this.f5857d = scopeArr;
    }

    public C1226ao(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5854a);
        C2014wh.m12516a(parcel, 2, this.f5855b);
        C2014wh.m12516a(parcel, 3, this.f5856c);
        C2014wh.m12530a(parcel, 4, (Parcelable[]) this.f5857d, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
