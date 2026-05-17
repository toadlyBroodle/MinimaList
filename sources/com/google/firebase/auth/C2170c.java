package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.c */
/* JADX INFO: loaded from: classes.dex */
public class C2170c extends AbstractC2158a {
    public static final Parcelable.Creator<C2170c> CREATOR = new C2159aa();

    /* JADX INFO: renamed from: a */
    private final String f12797a;

    C2170c(String str) {
        this.f12797a = C1221aj.m7067a(str);
    }

    /* JADX INFO: renamed from: a */
    public static bao m12850a(C2170c c2170c) {
        C1221aj.m7065a(c2170c);
        return new bao(null, c2170c.f12797a, c2170c.mo12846a(), null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12797a, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
