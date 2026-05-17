package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C0939d;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.internal.C1248bj;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.d */
/* JADX INFO: loaded from: classes.dex */
final class C0923d extends C1074a.b<C0939d, GoogleSignInOptions> {
    C0923d() {
    }

    @Override // com.google.android.gms.common.api.C1074a.b
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1074a.f mo6098a(Context context, Looper looper, C1248bj c1248bj, GoogleSignInOptions googleSignInOptions, AbstractC1079f.b bVar, AbstractC1079f.c cVar) {
        return new C0939d(context, looper, c1248bj, googleSignInOptions, bVar, cVar);
    }

    @Override // com.google.android.gms.common.api.C1074a.e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List mo6110a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m6139a();
    }
}
