package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.is */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1647is {

    /* JADX INFO: renamed from: a */
    private long f10806a;

    /* JADX INFO: renamed from: b */
    private long f10807b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    private Object f10808c = new Object();

    public C1647is(long j) {
        this.f10806a = j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11540a() {
        boolean z;
        synchronized (this.f10808c) {
            long jMo7253b = C0710au.m5575k().mo7253b();
            if (this.f10807b + this.f10806a > jMo7253b) {
                z = false;
            } else {
                this.f10807b = jMo7253b;
                z = true;
            }
        }
        return z;
    }
}
