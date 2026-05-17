package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1256c;
import com.google.android.gms.common.internal.C1248bj;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0939d extends AbstractC1256c<InterfaceC0954s> {

    /* JADX INFO: renamed from: d */
    private final GoogleSignInOptions f5090d;

    public C0939d(Context context, Looper looper, C1248bj c1248bj, GoogleSignInOptions googleSignInOptions, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        super(context, looper, 91, c1248bj, bVar, cVar);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.C0927a().m6147d() : googleSignInOptions;
        if (!c1248bj.m7152e().isEmpty()) {
            GoogleSignInOptions.C0927a c0927a = new GoogleSignInOptions.C0927a(googleSignInOptions);
            Iterator<Scope> it = c1248bj.m7152e().iterator();
            while (it.hasNext()) {
                c0927a.m6143a(it.next(), new Scope[0]);
            }
            googleSignInOptions = c0927a.m6147d();
        }
        this.f5090d = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ IInterface mo6166a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0954s ? (InterfaceC0954s) iInterfaceQueryLocalInterface : new C0955t(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: b */
    protected final String mo6167b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.api.C1074a.f
    /* JADX INFO: renamed from: c */
    public final boolean mo6168c() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av, com.google.android.gms.common.api.C1074a.f
    /* JADX INFO: renamed from: d */
    public final Intent mo6169d() {
        return C0940e.m6172a(m7127s(), this.f5090d);
    }

    /* JADX INFO: renamed from: e */
    public final GoogleSignInOptions m6170e() {
        return this.f5090d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1233av
    /* JADX INFO: renamed from: j_ */
    protected final String mo6171j_() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
