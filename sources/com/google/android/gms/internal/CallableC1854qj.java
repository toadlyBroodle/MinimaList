package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.qj */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1854qj implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1853qi f11374a;

    CallableC1854qj(C1853qi c1853qi) {
        this.f11374a = c1853qi;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f11374a.m12156d();
    }
}
