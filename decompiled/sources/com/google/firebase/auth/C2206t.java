package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.t */
/* JADX INFO: loaded from: classes.dex */
public class C2206t extends AbstractC2158a {
    public static final Parcelable.Creator<C2206t> CREATOR = new C2167ai();

    /* JADX INFO: renamed from: a */
    private final String f12863a;

    C2206t(String str) {
        this.f12863a = C1221aj.m7067a(str);
    }

    /* JADX INFO: renamed from: a */
    public static bao m12912a(C2206t c2206t) {
        C1221aj.m7065a(c2206t);
        return new bao(null, null, c2206t.mo12846a(), null, null, c2206t.f12863a);
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12863a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
