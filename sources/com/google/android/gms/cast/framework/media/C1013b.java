package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.android.gms.cast.framework.media.b */
/* JADX INFO: loaded from: classes.dex */
public class C1013b extends AbstractC2011we {
    public static final Parcelable.Creator<C1013b> CREATOR = new C1031t();

    /* JADX INFO: renamed from: a */
    private final int f5292a;

    /* JADX INFO: renamed from: b */
    private final int f5293b;

    /* JADX INFO: renamed from: c */
    private final int f5294c;

    public C1013b(int i, int i2, int i3) {
        this.f5292a = i;
        this.f5293b = i2;
        this.f5294c = i3;
    }

    /* JADX INFO: renamed from: a */
    public int m6425a() {
        return this.f5292a;
    }

    /* JADX INFO: renamed from: b */
    public int m6426b() {
        return this.f5293b;
    }

    /* JADX INFO: renamed from: c */
    public int m6427c() {
        return this.f5294c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 2, m6425a());
        C2014wh.m12516a(parcel, 3, m6426b());
        C2014wh.m12516a(parcel, 4, m6427c());
        C2014wh.m12513a(parcel, iM12512a);
    }
}
