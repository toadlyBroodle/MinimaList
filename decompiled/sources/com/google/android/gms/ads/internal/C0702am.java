package com.google.android.gms.ads.internal;

import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.am */
/* JADX INFO: loaded from: classes.dex */
public final class C0702am {

    /* JADX INFO: renamed from: a */
    private final Handler f4449a;

    public C0702am(Handler handler) {
        this.f4449a = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m5534a(Runnable runnable) {
        this.f4449a.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5535a(Runnable runnable, long j) {
        return this.f4449a.postDelayed(runnable, j);
    }
}
