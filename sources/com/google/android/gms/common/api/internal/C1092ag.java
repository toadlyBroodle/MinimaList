package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ag */
/* JADX INFO: loaded from: classes.dex */
final class C1092ag extends AbstractC1110ay {

    /* JADX INFO: renamed from: a */
    private WeakReference<C1086aa> f5556a;

    C1092ag(C1086aa c1086aa) {
        this.f5556a = new WeakReference<>(c1086aa);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1110ay
    /* JADX INFO: renamed from: a */
    public final void mo6748a() {
        C1086aa c1086aa = this.f5556a.get();
        if (c1086aa == null) {
            return;
        }
        c1086aa.m6738p();
    }
}
