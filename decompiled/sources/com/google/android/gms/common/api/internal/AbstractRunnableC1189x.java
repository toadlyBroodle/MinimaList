package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractRunnableC1189x implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1179n f5817a;

    private AbstractRunnableC1189x(C1179n c1179n) {
        this.f5817a = c1179n;
    }

    /* synthetic */ AbstractRunnableC1189x(C1179n c1179n, RunnableC1180o runnableC1180o) {
        this(c1179n);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo7023a();

    @Override // java.lang.Runnable
    public void run() {
        this.f5817a.f5782b.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            mo7023a();
            return;
        } catch (RuntimeException e) {
            this.f5817a.f5781a.m6764a(e);
            return;
        } finally {
            this.f5817a.f5782b.unlock();
        }
        this.f5817a.f5782b.unlock();
    }
}
