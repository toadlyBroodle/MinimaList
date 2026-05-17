package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.iid.f */
/* JADX INFO: loaded from: classes.dex */
final class C2294f {

    /* JADX INFO: renamed from: a */
    final Intent f13004a;

    /* JADX INFO: renamed from: b */
    private final BroadcastReceiver.PendingResult f13005b;

    /* JADX INFO: renamed from: c */
    private boolean f13006c = false;

    /* JADX INFO: renamed from: d */
    private final ScheduledFuture<?> f13007d;

    C2294f(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f13004a = intent;
        this.f13005b = pendingResult;
        this.f13007d = scheduledExecutorService.schedule(new RunnableC2295g(this, intent), 9500L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m13076a() {
        if (!this.f13006c) {
            this.f13005b.finish();
            this.f13007d.cancel(false);
            this.f13006c = true;
        }
    }
}
