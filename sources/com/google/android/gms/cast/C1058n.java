package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.cast.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1058n extends AbstractC2011we {
    public static final Parcelable.Creator<C1058n> CREATOR = new C1059o();

    /* JADX INFO: renamed from: a */
    private int f5434a;

    public C1058n() {
        this(0);
    }

    C1058n(int i) {
        this.f5434a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1058n) && this.f5434a == ((C1058n) obj).f5434a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5434a)});
    }

    public final String toString() {
        String str;
        switch (this.f5434a) {
            case 0:
                str = "STRONG";
                break;
            case 1:
            default:
                str = "UNKNOWN";
                break;
            case 2:
                str = "INVISIBLE";
                break;
        }
        return String.format("joinOptions(connectionType=%s)", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 2, this.f5434a);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
