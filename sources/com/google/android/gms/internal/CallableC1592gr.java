package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.gr */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1592gr implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Runnable f10704a;

    CallableC1592gr(Runnable runnable) {
        this.f10704a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f10704a.run();
        return null;
    }
}
