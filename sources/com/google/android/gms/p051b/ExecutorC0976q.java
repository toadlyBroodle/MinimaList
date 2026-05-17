package com.google.android.gms.p051b;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.b.q */
/* JADX INFO: loaded from: classes.dex */
final class ExecutorC0976q implements Executor {
    ExecutorC0976q() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
