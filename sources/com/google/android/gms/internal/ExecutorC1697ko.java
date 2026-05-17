package com.google.android.gms.internal;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ko */
/* JADX INFO: loaded from: classes.dex */
final class ExecutorC1697ko implements Executor {
    ExecutorC1697ko() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
