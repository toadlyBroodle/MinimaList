package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.google.android.gms.internal.kj */
/* JADX INFO: loaded from: classes.dex */
@cnb
final class C1692kj<V> extends FutureTask<V> implements InterfaceFutureC1689kg<V> {

    /* JADX INFO: renamed from: a */
    private final C1690kh f10888a;

    C1692kj(Runnable runnable, V v) {
        super(runnable, v);
        this.f10888a = new C1690kh();
    }

    C1692kj(Callable<V> callable) {
        super(callable);
        this.f10888a = new C1690kh();
    }

    @Override // com.google.android.gms.internal.InterfaceFutureC1689kg
    /* JADX INFO: renamed from: a */
    public final void mo11631a(Runnable runnable, Executor executor) {
        this.f10888a.m11633a(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.f10888a.m11632a();
    }
}
