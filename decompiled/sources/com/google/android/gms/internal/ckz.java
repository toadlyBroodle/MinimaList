package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ckz implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cky f10256a;

    ckz(cky ckyVar) {
        this.f10256a = ckyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10256a.f10255h.get()) {
            C1560fm.m11612c("Timed out waiting for WebView to finish loading.");
            this.f10256a.mo11075c();
        }
    }
}
