package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1541eu;
import com.google.android.gms.internal.C1542ev;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ad */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0693ad implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1542ev f4421a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0692ac f4422b;

    RunnableC0693ad(BinderC0692ac binderC0692ac, C1542ev c1542ev) {
        this.f4422b = binderC0692ac;
        this.f4421a = c1542ev;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4422b.mo5471b(new C1541eu(this.f4421a, null, null, null, null, null, null, null));
    }
}
