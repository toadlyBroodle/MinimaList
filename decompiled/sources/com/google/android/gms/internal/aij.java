package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aij implements aib {

    /* JADX INFO: renamed from: a */
    private final long f6844a;

    /* JADX INFO: renamed from: b */
    private final int f6845b;

    /* JADX INFO: renamed from: c */
    private double f6846c;

    /* JADX INFO: renamed from: d */
    private long f6847d;

    /* JADX INFO: renamed from: e */
    private final Object f6848e;

    public aij() {
        this(60, 2000L);
    }

    private aij(int i, long j) {
        this.f6848e = new Object();
        this.f6845b = 60;
        this.f6846c = this.f6845b;
        this.f6844a = 2000L;
    }

    @Override // com.google.android.gms.internal.aib
    /* JADX INFO: renamed from: a */
    public final boolean mo7979a() {
        boolean z;
        synchronized (this.f6848e) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f6846c < this.f6845b) {
                double d = (jCurrentTimeMillis - this.f6847d) / this.f6844a;
                if (d > 0.0d) {
                    this.f6846c = Math.min(this.f6845b, d + this.f6846c);
                }
            }
            this.f6847d = jCurrentTimeMillis;
            if (this.f6846c >= 1.0d) {
                this.f6846c -= 1.0d;
                z = true;
            } else {
                ahs.m7944b("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
