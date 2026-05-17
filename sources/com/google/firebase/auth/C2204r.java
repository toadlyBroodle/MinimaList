package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: renamed from: com.google.firebase.auth.r */
/* JADX INFO: loaded from: classes.dex */
public class C2204r extends AbstractC2158a implements Cloneable {
    public static final Parcelable.Creator<C2204r> CREATOR = new C2166ah();

    /* JADX INFO: renamed from: a */
    private String f12856a;

    /* JADX INFO: renamed from: b */
    private String f12857b;

    /* JADX INFO: renamed from: c */
    private boolean f12858c;

    /* JADX INFO: renamed from: d */
    private String f12859d;

    /* JADX INFO: renamed from: e */
    private boolean f12860e;

    /* JADX INFO: renamed from: f */
    private String f12861f;

    C2204r(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        C1221aj.m7075b((z && !TextUtils.isEmpty(str3)) || !((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, ortemprary proof.");
        this.f12856a = str;
        this.f12857b = str2;
        this.f12858c = z;
        this.f12859d = str3;
        this.f12860e = z2;
        this.f12861f = str4;
    }

    @Override // com.google.firebase.auth.AbstractC2158a
    /* JADX INFO: renamed from: a */
    public String mo12846a() {
        return "phone";
    }

    /* JADX INFO: renamed from: b */
    public String m12906b() {
        return this.f12857b;
    }

    public /* synthetic */ Object clone() {
        return new C2204r(this.f12856a, m12906b(), this.f12858c, this.f12859d, this.f12860e, this.f12861f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 1, this.f12856a, false);
        C2014wh.m12524a(parcel, 2, m12906b(), false);
        C2014wh.m12526a(parcel, 3, this.f12858c);
        C2014wh.m12524a(parcel, 4, this.f12859d, false);
        C2014wh.m12526a(parcel, 5, this.f12860e);
        C2014wh.m12524a(parcel, 6, this.f12861f, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
