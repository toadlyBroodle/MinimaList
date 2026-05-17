package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C0915a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C1207f;
import com.google.android.gms.common.api.AbstractC1079f;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.u */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0956u extends AbstractBinderC0951p {

    /* JADX INFO: renamed from: a */
    private final Context f5103a;

    public BinderC0956u(Context context) {
        this.f5103a = context;
    }

    /* JADX INFO: renamed from: c */
    private final void m6192c() {
        if (C1207f.m7307a(this.f5103a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException(new StringBuilder(52).append("Calling UID ").append(Binder.getCallingUid()).append(" is not Google Play services.").toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0950o
    /* JADX INFO: renamed from: a */
    public final void mo6188a() {
        m6192c();
        C0959x c0959xM6194a = C0959x.m6194a(this.f5103a);
        GoogleSignInAccount googleSignInAccountM6199a = c0959xM6194a.m6199a();
        GoogleSignInOptions googleSignInOptionsM6202b = GoogleSignInOptions.f5052f;
        if (googleSignInAccountM6199a != null) {
            googleSignInOptionsM6202b = c0959xM6194a.m6202b();
        }
        AbstractC1079f abstractC1079fM6693b = new AbstractC1079f.a(this.f5103a).m6689a(C0915a.f5000e, googleSignInOptionsM6202b).m6693b();
        try {
            if (abstractC1079fM6693b.mo6680f().m6612b()) {
                if (googleSignInAccountM6199a != null) {
                    C0915a.f5003h.mo6152c(abstractC1079fM6693b);
                } else {
                    abstractC1079fM6693b.mo6683i();
                }
            }
        } finally {
            abstractC1079fM6693b.mo6681g();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.InterfaceC0950o
    /* JADX INFO: renamed from: b */
    public final void mo6189b() {
        m6192c();
        C0948m.m6181a(this.f5103a).m6183a();
    }
}
