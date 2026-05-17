package com.google.android.gms.analytics;

import android.util.Log;
import com.google.android.gms.analytics.C0903r;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: com.google.android.gms.analytics.t */
/* JADX INFO: loaded from: classes.dex */
final class C0905t<T> extends FutureTask<T> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0903r.a f4978a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0905t(C0903r.a aVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f4978a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C0903r.this.f4973g;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String strValueOf = String.valueOf(th);
            Log.e("GAv4", new StringBuilder(String.valueOf(strValueOf).length() + 37).append("MeasurementExecutor: job failed with ").append(strValueOf).toString());
        }
        super.setException(th);
    }
}
