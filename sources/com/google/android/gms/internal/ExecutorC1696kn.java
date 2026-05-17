package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.kn */
/* JADX INFO: loaded from: classes.dex */
final class ExecutorC1696kn implements Executor {

    /* JADX INFO: renamed from: a */
    private final Handler f10897a = new Handler(Looper.getMainLooper());

    ExecutorC1696kn() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.f10897a.post(runnable);
        }
    }
}
