package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.qk */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1855qk implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1853qi f11375a;

    CallableC1855qk(C1853qi c1853qi) {
        this.f11375a = c1853qi;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f11375a.m12153e();
    }
}
