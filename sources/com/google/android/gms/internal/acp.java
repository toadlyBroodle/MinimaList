package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class acp implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6372a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f6373b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ acf f6374c;

    acp(acf acfVar, AtomicReference atomicReference, boolean z) {
        this.f6374c = acfVar;
        this.f6372a = atomicReference;
        this.f6373b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6374c.mo7382i().m7671a(this.f6372a, this.f6373b);
    }
}
