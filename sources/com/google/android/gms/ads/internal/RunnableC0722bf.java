package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.bf */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0722bf implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1542ev f4555a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0720bd f4556b;

    RunnableC0722bf(BinderC0720bd binderC0720bd, C1542ev c1542ev) {
        this.f4556b = binderC0720bd;
        this.f4555a = c1542ev;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4556b.mo5471b(new C1541eu(this.f4555a, null, null, null, null, null, null, null));
    }
}
