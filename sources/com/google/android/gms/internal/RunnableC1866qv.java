package com.google.android.gms.internal;

import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.qv */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1866qv implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC1865qu f11394a;

    RunnableC1866qv(AbstractC1865qu abstractC1865qu) {
        this.f11394a = abstractC1865qu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f11394a.f11391a.m12062g().m6080a(this);
            return;
        }
        boolean zM12188c = this.f11394a.m12188c();
        AbstractC1865qu.m12182a(this.f11394a, 0L);
        if (zM12188c) {
            this.f11394a.mo12094a();
        }
    }
}
