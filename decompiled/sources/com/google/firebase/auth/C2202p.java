package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.p */
/* JADX INFO: loaded from: classes.dex */
public class C2202p extends AbstractC2158a {
    public static final Parcelable.Creator<C2202p> CREATOR = new C2165ag();

    /* JADX INFO: renamed from: a */
    private final String f12854a;

    /* JADX INFO: renamed from: b */
    private final String f12855b;

    C2202p(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        this.f12854a = m12904a(str, "idToken");
        this.f12855b = m12904a(str2, "accessToken");
    }

    /* JADX INFO: renamed from: a */
    public static bao m12903a(C2202p c2202p) {
        C1221aj.m7065a(c2202p);
        return new bao(c2202p.f12854a, c2202p.f12855b, c2202p.mo12846a(), null, null);
    }

    /* JADX INFO: renamed from: a */
    private static String m12904a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12854a, false);
        C2014wh.m12524a(parcel, 2, this.f12855b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
