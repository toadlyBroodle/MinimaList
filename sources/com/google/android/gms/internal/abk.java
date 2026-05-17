package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abk implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2088za f6276a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6277b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6278c;

    abk(abi abiVar, C2088za c2088za, C2084yx c2084yx) {
        this.f6278c = abiVar;
        this.f6276a = c2088za;
        this.f6277b = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6278c.f6271a.m7516G();
        this.f6278c.f6271a.m7533b(this.f6276a, this.f6277b);
    }
}
