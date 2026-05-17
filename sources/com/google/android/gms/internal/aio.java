package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class aio extends Thread {

    /* JADX INFO: renamed from: a */
    private static final boolean f6866a = C1498de.f10438a;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue<cej<?>> f6867b;

    /* JADX INFO: renamed from: c */
    private final BlockingQueue<cej<?>> f6868c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1957ue f6869d;

    /* JADX INFO: renamed from: e */
    private final cmf f6870e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f6871f = false;

    /* JADX INFO: renamed from: g */
    private final bnu f6872g = new bnu(this);

    public aio(BlockingQueue<cej<?>> blockingQueue, BlockingQueue<cej<?>> blockingQueue2, InterfaceC1957ue interfaceC1957ue, cmf cmfVar) {
        this.f6867b = blockingQueue;
        this.f6868c = blockingQueue2;
        this.f6869d = interfaceC1957ue;
        this.f6870e = cmfVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m8023a() {
        this.f6871f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f6866a) {
            C1498de.m11168a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6869d.mo11650a();
        while (true) {
            try {
                cej<?> cejVarTake = this.f6867b.take();
                cejVarTake.m10765b("cache-queue-take");
                C2048xo c2048xoMo11649a = this.f6869d.mo11649a(cejVarTake.m10769e());
                if (c2048xoMo11649a == null) {
                    cejVarTake.m10765b("cache-miss");
                    if (!this.f6872g.m9743b(cejVarTake)) {
                        this.f6868c.put(cejVarTake);
                    }
                } else if (c2048xoMo11649a.m12577a()) {
                    cejVarTake.m10765b("cache-hit-expired");
                    cejVarTake.m10757a(c2048xoMo11649a);
                    if (!this.f6872g.m9743b(cejVarTake)) {
                        this.f6868c.put(cejVarTake);
                    }
                } else {
                    cejVarTake.m10765b("cache-hit");
                    cjk<?> cjkVarMo10758a = cejVarTake.mo10758a(new cch(c2048xoMo11649a.f12305a, c2048xoMo11649a.f12311g));
                    cejVarTake.m10765b("cache-hit-parsed");
                    if (c2048xoMo11649a.f12310f < System.currentTimeMillis()) {
                        cejVarTake.m10765b("cache-hit-refresh-needed");
                        cejVarTake.m10757a(c2048xoMo11649a);
                        cjkVarMo10758a.f10174d = true;
                        if (this.f6872g.m9743b(cejVarTake)) {
                            this.f6870e.mo10329a(cejVarTake, cjkVarMo10758a);
                        } else {
                            this.f6870e.mo10330a(cejVarTake, cjkVarMo10758a, new bbo(this, cejVarTake));
                        }
                    } else {
                        this.f6870e.mo10329a(cejVarTake, cjkVarMo10758a);
                    }
                }
            } catch (InterruptedException e) {
                if (this.f6871f) {
                    return;
                }
            }
        }
    }
}
