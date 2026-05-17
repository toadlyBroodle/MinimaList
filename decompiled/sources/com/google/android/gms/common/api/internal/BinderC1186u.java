package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.afv;
import com.google.android.gms.internal.agd;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.u */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1186u extends afv {

    /* JADX INFO: renamed from: a */
    private final WeakReference<C1179n> f5813a;

    BinderC1186u(C1179n c1179n) {
        this.f5813a = new WeakReference<>(c1179n);
    }

    @Override // com.google.android.gms.internal.afv, com.google.android.gms.internal.afw
    /* JADX INFO: renamed from: a */
    public final void mo6899a(agd agdVar) {
        C1179n c1179n = this.f5813a.get();
        if (c1179n == null) {
            return;
        }
        c1179n.f5781a.m6763a(new C1187v(this, c1179n, c1179n, agdVar));
    }
}
