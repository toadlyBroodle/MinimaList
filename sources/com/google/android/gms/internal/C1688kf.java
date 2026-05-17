package com.google.android.gms.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.google.android.gms.internal.kf */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1688kf<T> implements InterfaceFutureC1689kg<T> {

    /* JADX INFO: renamed from: a */
    private final T f10881a;

    /* JADX INFO: renamed from: b */
    private final C1690kh f10882b = new C1690kh();

    C1688kf(T t) {
        this.f10881a = t;
        this.f10882b.m11632a();
    }

    @Override // com.google.android.gms.internal.InterfaceFutureC1689kg
    /* JADX INFO: renamed from: a */
    public final void mo11631a(Runnable runnable, Executor executor) {
        this.f10882b.m11633a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f10881a;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.f10881a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
