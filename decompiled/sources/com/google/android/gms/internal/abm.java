package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2088za f6282a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ abi f6283b;

    abm(abi abiVar, C2088za c2088za) {
        this.f6283b = abiVar;
        this.f6282a = c2088za;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6283b.f6271a.m7516G();
        this.f6283b.f6271a.m7532b(this.f6282a);
    }
}
