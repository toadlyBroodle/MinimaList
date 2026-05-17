package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ls */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1728ls implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1726lq f10970a;

    RunnableC1728ls(C1726lq c1726lq) {
        this.f10970a = c1726lq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10970a.m11703a("surfaceDestroyed", new String[0]);
    }
}
