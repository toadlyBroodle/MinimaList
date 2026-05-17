package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C0934g();

    /* JADX INFO: renamed from: a */
    @Deprecated
    private String f5073a;

    /* JADX INFO: renamed from: b */
    private GoogleSignInAccount f5074b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    private String f5075c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5074b = googleSignInAccount;
        this.f5073a = C1221aj.m7068a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f5075c = C1221aj.m7068a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    /* JADX INFO: renamed from: a */
    public final GoogleSignInAccount m6148a() {
        return this.f5074b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 4, this.f5073a, false);
        C2014wh.m12520a(parcel, 7, (Parcelable) this.f5074b, i, false);
        C2014wh.m12524a(parcel, 8, this.f5075c, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
