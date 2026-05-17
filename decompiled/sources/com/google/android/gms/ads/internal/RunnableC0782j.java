package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.bwx;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.j */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0782j implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bwx f4685a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f4686b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ BinderC0780h f4687c;

    RunnableC0782j(BinderC0780h binderC0780h, bwx bwxVar, int i) {
        this.f4687c = binderC0780h;
        this.f4685a = bwxVar;
        this.f4686b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4687c.f4682s) {
            this.f4687c.m5702b(this.f4685a, this.f4686b);
        }
    }
}
