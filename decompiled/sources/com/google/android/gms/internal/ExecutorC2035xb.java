package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.xb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2035xb implements Executor {

    /* JADX INFO: renamed from: a */
    private final Handler f12281a;

    public ExecutorC2035xb(Looper looper) {
        this.f12281a = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12281a.post(runnable);
    }
}
