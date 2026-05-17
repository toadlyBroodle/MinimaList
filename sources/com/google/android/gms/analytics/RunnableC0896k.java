package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;

/* JADX INFO: renamed from: com.google.android.gms.analytics.k */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0896k implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BroadcastReceiver.PendingResult f4950a;

    RunnableC0896k(C0883a c0883a, BroadcastReceiver.PendingResult pendingResult) {
        this.f4950a = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4950a != null) {
            this.f4950a.finish();
        }
    }
}
