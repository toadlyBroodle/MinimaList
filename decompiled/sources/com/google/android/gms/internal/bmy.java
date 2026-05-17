package com.google.android.gms.internal;

import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class bmy implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bmx f8454a;

    bmy(bmx bmxVar) {
        this.f8454a = bmxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.f8454a.f8453a.mo8814a(th);
    }
}
