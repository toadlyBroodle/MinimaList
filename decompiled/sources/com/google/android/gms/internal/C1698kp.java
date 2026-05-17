package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.kp */
/* JADX INFO: loaded from: classes.dex */
final class C1698kp extends AbstractExecutorServiceC1672jq {

    /* JADX INFO: renamed from: a */
    private final Executor f10898a;

    private C1698kp(Executor executor) {
        this.f10898a = executor;
    }

    /* synthetic */ C1698kp(Executor executor, ExecutorC1696kn executorC1696kn) {
        this(executor);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10898a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
