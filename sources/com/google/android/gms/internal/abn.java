package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2088za f6284a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ abi f6285b;

    abn(abi abiVar, C2088za c2088za) {
        this.f6285b = abiVar;
        this.f6284a = c2088za;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6285b.f6271a.m7516G();
        this.f6285b.f6271a.m7523a(this.f6284a);
    }
}
