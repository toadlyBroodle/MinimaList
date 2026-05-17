package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0848r;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class clm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ CountDownLatch f10284a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cll f10285b;

    clm(cll cllVar, CountDownLatch countDownLatch) {
        this.f10285b = cllVar;
        this.f10284a = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10285b.f10262d) {
            this.f10285b.f10283m = C0848r.m5813a(this.f10285b.f10282l, this.f10285b.f10277g, this.f10284a);
        }
    }
}
