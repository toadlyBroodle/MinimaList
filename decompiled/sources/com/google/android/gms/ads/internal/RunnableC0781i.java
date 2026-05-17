package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.bwx;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.i */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0781i implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bwx f4683a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC0780h f4684b;

    RunnableC0781i(BinderC0780h binderC0780h, bwx bwxVar) {
        this.f4684b = binderC0780h;
        this.f4683a = bwxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4684b.f4682s) {
            if (this.f4684b.m5704d()) {
                this.f4684b.m5701b(this.f4683a);
            } else {
                this.f4684b.m5702b(this.f4683a, 1);
            }
        }
    }
}
