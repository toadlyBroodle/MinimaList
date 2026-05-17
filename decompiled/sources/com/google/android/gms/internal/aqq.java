package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class aqq {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f7092a;

    /* JADX INFO: renamed from: b */
    private ScheduledFuture<?> f7093b;

    /* JADX INFO: renamed from: c */
    private String f7094c;

    /* JADX INFO: renamed from: d */
    private boolean f7095d;

    public aqq() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    private aqq(ScheduledExecutorService scheduledExecutorService) {
        this.f7093b = null;
        this.f7094c = null;
        this.f7092a = scheduledExecutorService;
        this.f7095d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m8164a(Context context, aqc aqcVar, long j, aps apsVar) {
        synchronized (this) {
            if (this.f7093b != null) {
                this.f7093b.cancel(false);
            }
            this.f7093b = this.f7092a.schedule(new aqp(context, aqcVar, apsVar), 0L, TimeUnit.MILLISECONDS);
        }
    }
}
