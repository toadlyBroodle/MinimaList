package com.google.android.gms.internal;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: com.google.android.gms.internal.jq */
/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractExecutorServiceC1672jq extends AbstractExecutorService implements ExecutorService {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C1692kj(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C1692kj(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC1689kg) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC1689kg) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC1689kg) super.submit(callable);
    }
}
