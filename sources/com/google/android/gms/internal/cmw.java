package com.google.android.gms.internal;

import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class cmw implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Thread.UncaughtExceptionHandler f10400a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cmv f10401b;

    cmw(cmv cmvVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f10401b = cmvVar;
        this.f10400a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f10401b.m11142a(thread, th);
                if (this.f10400a != null) {
                    this.f10400a.uncaughtException(thread, th);
                }
            } catch (Throwable th2) {
                C1668jm.m11612c("AdMob exception reporter failed reporting the exception.");
                if (this.f10400a != null) {
                    this.f10400a.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th3) {
            if (this.f10400a != null) {
                this.f10400a.uncaughtException(thread, th);
            }
            throw th3;
        }
    }
}
