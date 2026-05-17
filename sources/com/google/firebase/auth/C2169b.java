package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.firebase.auth.b */
/* JADX INFO: loaded from: classes.dex */
public class C2169b extends AbstractC2158a {
    public static final Parcelable.Creator<C2169b> CREATOR = new C2212z();

    /* JADX INFO: renamed from: a */
    private String f12795a;

    /* JADX INFO: renamed from: b */
    private String f12796b;

    C2169b(String str, String str2) {
        this.f12795a = C1221aj.m7067a(str);
        this.f12796b = C1221aj.m7067a(str2);
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "password";
    }

    /* JADX INFO: renamed from: b */
    public final String m12848b() {
        return this.f12795a;
    }

    /* JADX INFO: renamed from: c */
    public final String m12849c() {
        return this.f12796b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12795a, false);
        C2014wh.m12524a(parcel, 2, this.f12796b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
