package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abt implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6303a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ abi f6304b;

    abt(abi abiVar, C2084yx c2084yx) {
        this.f6304b = abiVar;
        this.f6303a = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6304b.f6271a.m7516G();
        this.f6304b.f6271a.m7522a(this.f6303a);
    }
}
