package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.AbstractC2011we;
import com.google.android.gms.internal.C2014wh;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC2011we implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C0957v();

    /* JADX INFO: renamed from: a */
    private final String f5079a;

    /* JADX INFO: renamed from: b */
    private GoogleSignInOptions f5080b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f5079a = C1221aj.m7067a(str);
        this.f5080b = googleSignInOptions;
    }

    /* JADX INFO: renamed from: a */
    public final GoogleSignInOptions m6155a() {
        return this.f5080b;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
                if (this.f5079a.equals(signInConfiguration.f5079a) && (this.f5080b != null ? this.f5080b.equals(signInConfiguration.f5080b) : signInConfiguration.f5080b == null)) {
                    z = true;
                }
            } catch (ClassCastException e) {
            }
        }
        return z;
    }

    public final int hashCode() {
        return new C0949n().m6186a(this.f5079a).m6186a(this.f5080b).m6185a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12524a(parcel, 2, this.f5079a, false);
        C2014wh.m12520a(parcel, 5, (Parcelable) this.f5080b, i, false);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
