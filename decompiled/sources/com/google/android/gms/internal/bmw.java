package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class bmw extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bmv f8452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bmw(bmv bmvVar, int i, ThreadFactory threadFactory) {
        super(1, threadFactory);
        this.f8452a = bmvVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
            } catch (ExecutionException e3) {
                th = e3.getCause();
            }
        }
        if (th != null) {
            this.f8452a.mo8814a(th);
        }
    }
}
