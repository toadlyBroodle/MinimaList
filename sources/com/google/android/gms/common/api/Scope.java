package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1201s();

    /* JADX INFO: renamed from: a */
    private int f5449a;

    /* JADX INFO: renamed from: b */
    private final String f5450b;

    Scope(int i, String str) {
        C1221aj.m7068a(str, (Object) "scopeUri must not be null or empty");
        this.f5449a = i;
        this.f5450b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* JADX INFO: renamed from: a */
    public final String m6623a() {
        return this.f5450b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f5450b.equals(((Scope) obj).f5450b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5450b.hashCode();
    }

    public final String toString() {
        return this.f5450b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f5449a);
        C2014wh.m12524a(parcel, 2, this.f5450b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
