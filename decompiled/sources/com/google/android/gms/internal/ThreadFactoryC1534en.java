package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.en */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC1534en implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f10518a = new AtomicInteger(1);

    ThreadFactoryC1534en(C1532el c1532el) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, new StringBuilder(42).append("AdWorker(SCION_TASK_EXECUTOR) #").append(this.f10518a.getAndIncrement()).toString());
    }
}
