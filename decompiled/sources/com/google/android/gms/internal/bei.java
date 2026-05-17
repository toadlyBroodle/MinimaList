package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bei implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Runnable f7939a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ beh f7940b;

    bei(beh behVar, Runnable runnable) {
        this.f7940b = behVar;
        this.f7939a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        beh.m9075a(this.f7940b, null);
        this.f7939a.run();
    }
}
