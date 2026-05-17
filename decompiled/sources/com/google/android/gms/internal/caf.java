package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class caf extends Thread {

    /* JADX INFO: renamed from: a */
    private final BlockingQueue<cej<?>> f9386a;

    /* JADX INFO: renamed from: b */
    private final bzk f9387b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1957ue f9388c;

    /* JADX INFO: renamed from: d */
    private final cmf f9389d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f9390e = false;

    public caf(BlockingQueue<cej<?>> blockingQueue, bzk bzkVar, InterfaceC1957ue interfaceC1957ue, cmf cmfVar) {
        this.f9386a = blockingQueue;
        this.f9387b = bzkVar;
        this.f9388c = interfaceC1957ue;
        this.f9389d = cmfVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10538a() {
        this.f9390e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        cej<?> cejVarTake;
        cch cchVarMo10516a;
        Process.setThreadPriority(10);
        while (true) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                cejVarTake = this.f9386a.take();
                try {
                    cejVarTake.m10765b("network-queue-take");
                    TrafficStats.setThreadStatsTag(cejVarTake.m10768d());
                    cchVarMo10516a = this.f9387b.mo10516a(cejVarTake);
                    cejVarTake.m10765b("network-http-complete");
                } catch (C1471ce e) {
                    e.m10747a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f9389d.mo10328a(cejVarTake, e);
                    cejVarTake.m10776l();
                } catch (Exception e2) {
                    C1498de.m11169a(e2, "Unhandled exception %s", e2.toString());
                    C1471ce c1471ce = new C1471ce(e2);
                    c1471ce.m10747a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f9389d.mo10328a(cejVarTake, c1471ce);
                    cejVarTake.m10776l();
                }
            } catch (InterruptedException e3) {
                if (this.f9390e) {
                    return;
                }
            }
            if (cchVarMo10516a.f9804e && cejVarTake.m10775k()) {
                cejVarTake.m10767c("not-modified");
                cejVarTake.m10776l();
            } else {
                cjk<?> cjkVarMo10758a = cejVarTake.mo10758a(cchVarMo10516a);
                cejVarTake.m10765b("network-parse-complete");
                if (cejVarTake.m10771g() && cjkVarMo10758a.f10172b != null) {
                    this.f9388c.mo11651a(cejVarTake.m10769e(), cjkVarMo10758a.f10172b);
                    cejVarTake.m10765b("network-cache-written");
                }
                cejVarTake.m10774j();
                this.f9389d.mo10329a(cejVarTake, cjkVarMo10758a);
                cejVarTake.m10761a(cjkVarMo10758a);
            }
        }
    }
}
