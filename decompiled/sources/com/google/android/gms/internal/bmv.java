package com.google.android.gms.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class bmv implements bgd {

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor f8451a = new bmw(this, 1, new bmx(this, null));

    public bmv() {
        this.f8451a.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    @Override // com.google.android.gms.internal.bgd
    /* JADX INFO: renamed from: a */
    public final void mo9233a() {
        this.f8451a.setCorePoolSize(1);
    }

    @Override // com.google.android.gms.internal.bgd
    /* JADX INFO: renamed from: a */
    public final void mo9234a(Runnable runnable) {
        this.f8451a.execute(runnable);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8814a(Throwable th);

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService m9682b() {
        return this.f8451a;
    }
}
