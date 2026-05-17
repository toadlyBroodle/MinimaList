package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2088za f6279a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6280b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6281c;

    abl(abi abiVar, C2088za c2088za, C2084yx c2084yx) {
        this.f6281c = abiVar;
        this.f6279a = c2088za;
        this.f6280b = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6281c.f6271a.m7516G();
        this.f6281c.f6271a.m7524a(this.f6279a, this.f6280b);
    }
}
