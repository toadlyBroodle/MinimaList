package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;
import com.google.android.gms.internal.bao;

/* JADX INFO: renamed from: com.google.firebase.auth.x */
/* JADX INFO: loaded from: classes.dex */
public class C2210x extends AbstractC2158a {
    public static final Parcelable.Creator<C2210x> CREATOR = new C2211y();

    /* JADX INFO: renamed from: a */
    private final String f12866a;

    /* JADX INFO: renamed from: b */
    private final String f12867b;

    /* JADX INFO: renamed from: c */
    private final String f12868c;

    /* JADX INFO: renamed from: d */
    private final bao f12869d;

    C2210x(String str, String str2, String str3, bao baoVar) {
        this.f12866a = str;
        this.f12867b = str2;
        this.f12868c = str3;
        this.f12869d = baoVar;
    }

    /* JADX INFO: renamed from: a */
    public static bao m12914a(C2210x c2210x) {
        C1221aj.m7065a(c2210x);
        return c2210x.f12869d != null ? c2210x.f12869d : new bao(c2210x.f12867b, c2210x.f12868c, c2210x.mo12846a(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public static C2210x m12915a(bao baoVar) {
        return new C2210x(null, null, null, (bao) C1221aj.m7066a(baoVar, "Must specify a non-null webSignInCredential"));
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return this.f12866a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, mo12846a(), false);
        C2014wh.m12524a(parcel, 2, this.f12867b, false);
        C2014wh.m12524a(parcel, 3, this.f12868c, false);
        C2014wh.m12520a(parcel, 4, (Parcelable) this.f12869d, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
