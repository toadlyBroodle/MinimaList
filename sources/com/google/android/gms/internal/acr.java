package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class acr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6376a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acf f6377b;

    acr(acf acfVar, AtomicReference atomicReference) {
        this.f6377b = acfVar;
        this.f6376a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6377b.mo7382i().m7668a(this.f6376a);
    }
}
