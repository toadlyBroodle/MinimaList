package com.google.android.gms.internal;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class beh {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f7929a;

    /* JADX INFO: renamed from: b */
    private final bkl f7930b;

    /* JADX INFO: renamed from: c */
    private final long f7931c;

    /* JADX INFO: renamed from: d */
    private final long f7932d;

    /* JADX INFO: renamed from: e */
    private final double f7933e;

    /* JADX INFO: renamed from: f */
    private final double f7934f;

    /* JADX INFO: renamed from: g */
    private final Random f7935g;

    /* JADX INFO: renamed from: h */
    private ScheduledFuture<?> f7936h;

    /* JADX INFO: renamed from: i */
    private long f7937i;

    /* JADX INFO: renamed from: j */
    private boolean f7938j;

    private beh(ScheduledExecutorService scheduledExecutorService, bkl bklVar, long j, long j2, double d, double d2) {
        this.f7935g = new Random();
        this.f7938j = true;
        this.f7929a = scheduledExecutorService;
        this.f7930b = bklVar;
        this.f7931c = j;
        this.f7932d = j2;
        this.f7934f = d;
        this.f7933e = d2;
    }

    /* synthetic */ beh(ScheduledExecutorService scheduledExecutorService, bkl bklVar, long j, long j2, double d, double d2, bei beiVar) {
        this(scheduledExecutorService, bklVar, j, j2, d, d2);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ ScheduledFuture m9075a(beh behVar, ScheduledFuture scheduledFuture) {
        behVar.f7936h = null;
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m9076a() {
        this.f7938j = true;
        this.f7937i = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m9077a(Runnable runnable) {
        long jNextDouble = 0;
        bei beiVar = new bei(this, runnable);
        if (this.f7936h != null) {
            this.f7930b.m9540a("Cancelling previous scheduled retry", null, new Object[0]);
            this.f7936h.cancel(false);
            this.f7936h = null;
        }
        if (!this.f7938j) {
            if (this.f7937i == 0) {
                this.f7937i = this.f7931c;
            } else {
                this.f7937i = Math.min((long) (this.f7937i * this.f7934f), this.f7932d);
            }
            jNextDouble = (long) (((1.0d - this.f7933e) * this.f7937i) + (this.f7933e * this.f7937i * this.f7935g.nextDouble()));
        }
        this.f7938j = false;
        this.f7930b.m9540a("Scheduling retry in %dms", null, Long.valueOf(jNextDouble));
        this.f7936h = this.f7929a.schedule(beiVar, jNextDouble, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m9078b() {
        this.f7937i = this.f7932d;
    }

    /* JADX INFO: renamed from: c */
    public final void m9079c() {
        if (this.f7936h != null) {
            this.f7930b.m9540a("Cancelling existing retry attempt", null, new Object[0]);
            this.f7936h.cancel(false);
            this.f7936h = null;
        } else {
            this.f7930b.m9540a("No existing retry attempt to cancel", null, new Object[0]);
        }
        this.f7937i = 0L;
    }
}
