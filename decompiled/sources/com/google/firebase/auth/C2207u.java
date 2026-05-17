package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.u */
/* JADX INFO: loaded from: classes.dex */
public class C2207u extends AbstractC2158a {
    public static final Parcelable.Creator<C2207u> CREATOR = new C2168aj();

    /* JADX INFO: renamed from: a */
    private String f12864a;

    /* JADX INFO: renamed from: b */
    private String f12865b;

    C2207u(String str, String str2) {
        this.f12864a = C1221aj.m7067a(str);
        this.f12865b = C1221aj.m7067a(str2);
    }

    /* JADX INFO: renamed from: a */
    public static bao m12913a(C2207u c2207u) {
        C1221aj.m7065a(c2207u);
        return new bao(null, c2207u.f12864a, c2207u.mo12846a(), null, c2207u.f12865b);
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12864a, false);
        C2014wh.m12524a(parcel, 2, this.f12865b, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
