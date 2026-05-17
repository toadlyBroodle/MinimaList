package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6274a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ abi f6275b;

    abj(abi abiVar, C2084yx c2084yx) {
        this.f6275b = abiVar;
        this.f6274a = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6275b.f6271a.m7516G();
        this.f6275b.f6271a.m7531b(this.f6274a);
    }
}
