package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
final class cam<T> implements Callable<T> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cac f9399a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cal f9400b;

    cam(cal calVar, cac cacVar) {
        this.f9400b = calVar;
        this.f9399a = cacVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f9399a.mo10532a(this.f9400b.f9397d);
    }
}
