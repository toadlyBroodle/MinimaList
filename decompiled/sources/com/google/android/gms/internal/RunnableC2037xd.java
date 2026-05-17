package com.google.android.gms.internal;

import android.os.Process;

/* JADX INFO: renamed from: com.google.android.gms.internal.xd */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2037xd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Runnable f12286a;

    /* JADX INFO: renamed from: b */
    private final int f12287b;

    public RunnableC2037xd(Runnable runnable, int i) {
        this.f12286a = runnable;
        this.f12287b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f12287b);
        this.f12286a.run();
    }
}
