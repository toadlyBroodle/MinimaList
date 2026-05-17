package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.gq */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1591gq implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Runnable f10703a;

    CallableC1591gq(Runnable runnable) {
        this.f10703a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f10703a.run();
        return null;
    }
}
