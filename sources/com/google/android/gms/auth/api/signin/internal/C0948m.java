package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0948m {

    /* JADX INFO: renamed from: a */
    private static C0948m f5097a = null;

    /* JADX INFO: renamed from: b */
    private C0959x f5098b;

    /* JADX INFO: renamed from: c */
    private GoogleSignInAccount f5099c;

    /* JADX INFO: renamed from: d */
    private GoogleSignInOptions f5100d;

    private C0948m(Context context) {
        this.f5098b = C0959x.m6194a(context);
        this.f5099c = this.f5098b.m6199a();
        this.f5100d = this.f5098b.m6202b();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0948m m6181a(Context context) {
        return m6182b(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: b */
    private static synchronized C0948m m6182b(Context context) {
        if (f5097a == null) {
            f5097a = new C0948m(context);
        }
        return f5097a;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6183a() {
        this.f5098b.m6204d();
        this.f5099c = null;
        this.f5100d = null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6184a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        C0959x c0959x = this.f5098b;
        C1221aj.m7065a(googleSignInAccount);
        C1221aj.m7065a(googleSignInOptions);
        c0959x.m6201a("defaultGoogleSignInAccount", googleSignInAccount.m6124j());
        c0959x.m6200a(googleSignInAccount, googleSignInOptions);
        this.f5099c = googleSignInAccount;
        this.f5100d = googleSignInOptions;
    }
}
