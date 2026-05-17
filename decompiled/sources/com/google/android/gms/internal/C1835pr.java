package com.google.android.gms.internal;

import java.lang.Thread;

/* JADX INFO: renamed from: com.google.android.gms.internal.pr */
/* JADX INFO: loaded from: classes.dex */
final class C1835pr implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1834pq f11320a;

    C1835pr(C1834pq c1834pq) {
        this.f11320a = c1834pq;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C1882rk c1882rkM12061f = this.f11320a.m12061f();
        if (c1882rkM12061f != null) {
            c1882rkM12061f.m12034e("Job execution failed", th);
        }
    }
}
