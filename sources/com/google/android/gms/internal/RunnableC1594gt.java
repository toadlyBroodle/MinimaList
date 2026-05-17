package com.google.android.gms.internal;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.gt */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1594gt implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1700kr f10707a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Future f10708b;

    RunnableC1594gt(C1700kr c1700kr, Future future) {
        this.f10707a = c1700kr;
        this.f10708b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10707a.isCancelled()) {
            this.f10708b.cancel(true);
        }
    }
}
