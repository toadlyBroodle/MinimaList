package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.o */
/* JADX INFO: loaded from: classes.dex */
public class C2201o extends AbstractC2158a {
    public static final Parcelable.Creator<C2201o> CREATOR = new C2164af();

    /* JADX INFO: renamed from: a */
    private String f12853a;

    C2201o(String str) {
        this.f12853a = C1221aj.m7067a(str);
    }

    /* JADX INFO: renamed from: a */
    public static bao m12902a(C2201o c2201o) {
        C1221aj.m7065a(c2201o);
        return new bao(null, c2201o.f12853a, c2201o.mo12846a(), null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12853a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
