package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aec implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long f6478a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ adz f6479b;

    aec(adz adzVar, long j) {
        this.f6479b = adzVar;
        this.f6478a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6479b.m7693a(this.f6478a);
    }
}
