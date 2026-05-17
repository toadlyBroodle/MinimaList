package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aed implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long f6480a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ adz f6481b;

    aed(adz adzVar, long j) {
        this.f6481b = adzVar;
        this.f6480a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6481b.m7696b(this.f6480a);
    }
}
