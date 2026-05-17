package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.q */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2194q implements Executor {

    /* JADX INFO: renamed from: a */
    private static ExecutorC2194q f12848a = new ExecutorC2194q();

    /* JADX INFO: renamed from: b */
    private Handler f12849b = new Handler(Looper.getMainLooper());

    private ExecutorC2194q() {
    }

    /* JADX INFO: renamed from: a */
    public static ExecutorC2194q m12900a() {
        return f12848a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12849b.post(runnable);
    }
}
