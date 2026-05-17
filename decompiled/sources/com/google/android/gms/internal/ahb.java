package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ahb extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a */
    private final Context f6764a;

    public ahb(Context context, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(1, 1, 0L, timeUnit, blockingQueue, threadFactory);
        this.f6764a = context;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        if (th != null) {
            agw.m7887a("Uncaught exception: ", th, this.f6764a);
        }
    }
}
