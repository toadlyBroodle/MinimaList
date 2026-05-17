package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.uj */
/* JADX INFO: loaded from: classes.dex */
public final class C1962uj extends AbstractC2011we {
    public static final Parcelable.Creator<C1962uj> CREATOR = new C1963uk();

    /* JADX INFO: renamed from: a */
    private String f11667a;

    public C1962uj() {
        this(null);
    }

    C1962uj(String str) {
        this.f11667a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m12365a() {
        return this.f11667a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1962uj) {
            return C1981vb.m12427a(this.f11667a, ((C1962uj) obj).f11667a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11667a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f11667a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
