package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.e */
/* JADX INFO: loaded from: classes.dex */
final class C0932e implements Comparator<Scope> {
    C0932e() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Scope scope, Scope scope2) {
        return scope.m6623a().compareTo(scope2.m6623a());
    }
}
