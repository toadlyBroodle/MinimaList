package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class aba implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private final String f6211a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aay f6212b;

    public aba(aay aayVar, String str) {
        this.f6212b = aayVar;
        C1221aj.m7065a(str);
        this.f6211a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f6212b.mo7393t().m7410y().m7413a(this.f6211a, th);
    }
}
