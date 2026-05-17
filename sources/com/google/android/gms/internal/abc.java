package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class abc extends Thread {

    /* JADX INFO: renamed from: a */
    private final Object f6217a;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue<abb<?>> f6218b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ aay f6219c;

    public abc(aay aayVar, String str, BlockingQueue<abb<?>> blockingQueue) {
        this.f6219c = aayVar;
        C1221aj.m7065a(str);
        C1221aj.m7065a(blockingQueue);
        this.f6217a = new Object();
        this.f6218b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    private final void m7484a(InterruptedException interruptedException) {
        this.f6219c.mo7393t().m7401A().m7413a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX INFO: renamed from: a */
    public final void m7485a() {
        synchronized (this.f6217a) {
            this.f6217a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f6219c.f6207i.acquire();
                z = true;
            } catch (InterruptedException e) {
                m7484a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                abb<?> abbVarPoll = this.f6218b.poll();
                if (abbVarPoll == null) {
                    synchronized (this.f6217a) {
                        if (this.f6218b.peek() == null && !this.f6219c.f6208j) {
                            try {
                                this.f6217a.wait(30000L);
                            } catch (InterruptedException e2) {
                                m7484a(e2);
                            }
                        }
                    }
                    synchronized (this.f6219c.f6206h) {
                        if (this.f6218b.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(abbVarPoll.f6213a ? threadPriority : 10);
                    abbVarPoll.run();
                }
            }
            synchronized (this.f6219c.f6206h) {
                this.f6219c.f6207i.release();
                this.f6219c.f6206h.notifyAll();
                if (this == this.f6219c.f6200b) {
                    aay.m7468a(this.f6219c, null);
                } else if (this == this.f6219c.f6201c) {
                    aay.m7471b(this.f6219c, null);
                } else {
                    this.f6219c.mo7393t().m7410y().m7412a("Current scheduler thread is neither worker nor network");
                }
            }
        } catch (Throwable th) {
            synchronized (this.f6219c.f6206h) {
                this.f6219c.f6207i.release();
                this.f6219c.f6206h.notifyAll();
                if (this == this.f6219c.f6200b) {
                    aay.m7468a(this.f6219c, null);
                } else if (this == this.f6219c.f6201c) {
                    aay.m7471b(this.f6219c, null);
                } else {
                    this.f6219c.mo7393t().m7410y().m7412a("Current scheduler thread is neither worker nor network");
                }
                throw th;
            }
        }
    }
}
