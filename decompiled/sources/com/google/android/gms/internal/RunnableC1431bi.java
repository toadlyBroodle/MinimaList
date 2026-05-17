package com.google.android.gms.internal;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.bi */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1431bi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Future f8201a;

    RunnableC1431bi(BinderC1428bf binderC1428bf, Future future) {
        this.f8201a = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8201a.isDone()) {
            return;
        }
        this.f8201a.cancel(true);
    }
}
