package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.c */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class C0930c implements Comparator {

    /* JADX INFO: renamed from: a */
    static final Comparator f5078a = new C0930c();

    private C0930c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).m6623a().compareTo(((Scope) obj2).m6623a());
    }
}
