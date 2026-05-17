package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C1981vb;
import com.google.android.gms.internal.C2014wh;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.cast.g */
/* JADX INFO: loaded from: classes.dex */
public class C1051g extends AbstractC2011we {
    public static final Parcelable.Creator<C1051g> CREATOR = new C1060p();

    /* JADX INFO: renamed from: a */
    private boolean f5377a;

    /* JADX INFO: renamed from: b */
    private String f5378b;

    public C1051g() {
        this(false, C1981vb.m12425a(Locale.getDefault()));
    }

    C1051g(boolean z, String str) {
        this.f5377a = z;
        this.f5378b = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m6539a() {
        return this.f5377a;
    }

    /* JADX INFO: renamed from: b */
    public String m6540b() {
        return this.f5378b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1051g)) {
            return false;
        }
        C1051g c1051g = (C1051g) obj;
        return this.f5377a == c1051g.f5377a && C1981vb.m12427a(this.f5378b, c1051g.f5378b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5377a), this.f5378b});
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", Boolean.valueOf(this.f5377a), this.f5378b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12526a(parcel, 2, m6539a());
        C2014wh.m12524a(parcel, 3, m6540b(), false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
