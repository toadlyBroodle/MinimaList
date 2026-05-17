package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C0929b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.AbstractC1080g;
import com.google.android.gms.common.api.C1081h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1098am;
import com.google.android.gms.internal.C2032wz;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0940e {

    /* JADX INFO: renamed from: a */
    private static C2032wz f5091a = new C2032wz("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static Intent m6172a(Context context, GoogleSignInOptions googleSignInOptions) {
        f5091a.m12550b("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static C0929b m6173a(Intent intent) {
        if (intent == null || !(intent.hasExtra("googleSignInStatus") || intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f5451a;
        }
        return new C0929b(googleSignInAccount, status);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1080g<Status> m6174a(AbstractC1079f abstractC1079f, Context context, boolean z) {
        f5091a.m12550b("Signing out", new Object[0]);
        m6175a(context);
        return z ? C1081h.m6700a(Status.f5451a, abstractC1079f) : abstractC1079f.mo6674b(new C0941f(abstractC1079f));
    }

    /* JADX INFO: renamed from: a */
    private static void m6175a(Context context) {
        C0948m.m6181a(context).m6183a();
        Iterator<AbstractC1079f> it = AbstractC1079f.m6664a().iterator();
        while (it.hasNext()) {
            it.next().mo6678d();
        }
        C1098am.m6784b();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1080g<Status> m6176b(AbstractC1079f abstractC1079f, Context context, boolean z) {
        f5091a.m12550b("Revoking access", new Object[0]);
        m6175a(context);
        return z ? C1081h.m6701a(Status.f5456f, abstractC1079f) : abstractC1079f.mo6674b(new C0943h(abstractC1079f));
    }
}
