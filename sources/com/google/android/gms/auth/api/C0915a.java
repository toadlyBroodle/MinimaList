package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.InterfaceC0921a;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.p050a.InterfaceC0916a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.InterfaceC0928a;
import com.google.android.gms.auth.api.signin.internal.C0938c;
import com.google.android.gms.auth.api.signin.internal.C0939d;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.internal.C1914sp;
import com.google.android.gms.internal.C1915sq;
import com.google.android.gms.internal.C1919su;
import com.google.android.gms.internal.C1920sv;
import com.google.android.gms.internal.C1928tc;
import com.google.android.gms.internal.InterfaceC1913so;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0915a {

    /* JADX INFO: renamed from: a */
    public static final C1074a.g<C1920sv> f4996a = new C1074a.g<>();

    /* JADX INFO: renamed from: i */
    private static C1074a.g<C1915sq> f5004i = new C1074a.g<>();

    /* JADX INFO: renamed from: b */
    public static final C1074a.g<C0939d> f4997b = new C1074a.g<>();

    /* JADX INFO: renamed from: j */
    private static final C1074a.b<C1920sv, a> f5005j = new C0917b();

    /* JADX INFO: renamed from: k */
    private static final C1074a.b<C1915sq, Object> f5006k = new C0918c();

    /* JADX INFO: renamed from: l */
    private static final C1074a.b<C0939d, GoogleSignInOptions> f5007l = new C0923d();

    /* JADX INFO: renamed from: c */
    public static final C1074a<C0926g> f4998c = C0924e.f5030a;

    /* JADX INFO: renamed from: d */
    public static final C1074a<a> f4999d = new C1074a<>("Auth.CREDENTIALS_API", f5005j, f4996a);

    /* JADX INFO: renamed from: e */
    public static final C1074a<GoogleSignInOptions> f5000e = new C1074a<>("Auth.GOOGLE_SIGN_IN_API", f5007l, f4997b);

    /* JADX INFO: renamed from: m */
    private static C1074a<Object> f5008m = new C1074a<>("Auth.ACCOUNT_STATUS_API", f5006k, f5004i);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0916a f5001f = new C1928tc();

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0921a f5002g = new C1919su();

    /* JADX INFO: renamed from: n */
    private static InterfaceC1913so f5009n = new C1914sp();

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0928a f5003h = new C0938c();

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.a$a */
    @Deprecated
    public static class a implements C1074a.a.e {

        /* JADX INFO: renamed from: a */
        private static a f5010a = new C2331a().m6100a();

        /* JADX INFO: renamed from: b */
        private final String f5011b = null;

        /* JADX INFO: renamed from: c */
        private final PasswordSpecification f5012c;

        /* JADX INFO: renamed from: d */
        private final boolean f5013d;

        /* JADX INFO: renamed from: com.google.android.gms.auth.api.a$a$a, reason: collision with other inner class name */
        @Deprecated
        public static class C2331a {

            /* JADX INFO: renamed from: a */
            protected PasswordSpecification f5014a = PasswordSpecification.f5016a;

            /* JADX INFO: renamed from: b */
            protected Boolean f5015b = false;

            /* JADX INFO: renamed from: a */
            public a m6100a() {
                return new a(this);
            }
        }

        public a(C2331a c2331a) {
            this.f5012c = c2331a.f5014a;
            this.f5013d = c2331a.f5015b.booleanValue();
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m6099a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putParcelable("password_specification", this.f5012c);
            bundle.putBoolean("force_save_dialog", this.f5013d);
            return bundle;
        }
    }
}
