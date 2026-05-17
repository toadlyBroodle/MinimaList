package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ccs implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ ccd f9848a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ccr f9849b;

    ccs(ccr ccrVar, ccd ccdVar) {
        this.f9849b = ccrVar;
        this.f9848a = ccdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9849b.m10729a(this.f9848a);
    }
}
