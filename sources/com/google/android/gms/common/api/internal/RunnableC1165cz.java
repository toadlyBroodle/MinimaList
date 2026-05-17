package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cz */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1165cz implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1164cy f5758a;

    RunnableC1165cz(C1164cy c1164cy) {
        this.f5758a = c1164cy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5758a.f5756m.lock();
        try {
            this.f5758a.m6974h();
        } finally {
            this.f5758a.f5756m.unlock();
        }
    }
}
