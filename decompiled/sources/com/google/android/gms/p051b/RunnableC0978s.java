package com.google.android.gms.p051b;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.b.s */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0978s implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0977r f5137a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Callable f5138b;

    RunnableC0978s(C0977r c0977r, Callable callable) {
        this.f5137a = c0977r;
        this.f5138b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5137a.m6245a(this.f5138b.call());
        } catch (Exception e) {
            this.f5137a.m6244a(e);
        }
    }
}
