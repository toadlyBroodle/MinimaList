package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abv implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2104zq f6308a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6309b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6310c;

    abv(abi abiVar, C2104zq c2104zq, String str) {
        this.f6310c = abiVar;
        this.f6308a = c2104zq;
        this.f6309b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6310c.f6271a.m7516G();
        this.f6310c.f6271a.m7526a(this.f6308a, this.f6309b);
    }
}
