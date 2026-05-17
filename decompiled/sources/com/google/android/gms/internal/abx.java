package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ aeh f6314a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6315b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6316c;

    abx(abi abiVar, aeh aehVar, C2084yx c2084yx) {
        this.f6316c = abiVar;
        this.f6314a = aehVar;
        this.f6315b = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6316c.f6271a.m7516G();
        this.f6316c.f6271a.m7530b(this.f6314a, this.f6315b);
    }
}
