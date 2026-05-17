package com.google.android.gms.internal;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bej {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f7941a;

    /* JADX INFO: renamed from: b */
    private long f7942b = 1000;

    /* JADX INFO: renamed from: c */
    private double f7943c = 0.5d;

    /* JADX INFO: renamed from: d */
    private long f7944d = 30000;

    /* JADX INFO: renamed from: e */
    private double f7945e = 1.3d;

    /* JADX INFO: renamed from: f */
    private final bkl f7946f;

    public bej(ScheduledExecutorService scheduledExecutorService, bkm bkmVar, String str) {
        this.f7941a = scheduledExecutorService;
        this.f7946f = new bkl(bkmVar, str);
    }

    /* JADX INFO: renamed from: a */
    public final beh m9080a() {
        return new beh(this.f7941a, this.f7946f, this.f7942b, this.f7944d, this.f7945e, this.f7943c, null);
    }

    /* JADX INFO: renamed from: a */
    public final bej m9081a(double d) {
        this.f7945e = 1.3d;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final bej m9082a(long j) {
        this.f7942b = 1000L;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final bej m9083b(double d) {
        this.f7943c = 0.7d;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final bej m9084b(long j) {
        this.f7944d = 30000L;
        return this;
    }
}
