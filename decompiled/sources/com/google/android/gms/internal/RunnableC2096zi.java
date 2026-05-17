package com.google.android.gms.internal;

import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.zi */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2096zi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC2095zh f12667a;

    RunnableC2096zi(AbstractC2095zh abstractC2095zh) {
        this.f12667a = abstractC2095zh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f12667a.f12663a.m7542h().m7479a(this);
            return;
        }
        boolean zM12755b = this.f12667a.m12755b();
        AbstractC2095zh.m12750a(this.f12667a, 0L);
        if (zM12755b && this.f12667a.f12666e) {
            this.f12667a.mo7674a();
        }
    }
}
