package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aam implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f6138a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aal f6139b;

    aam(aal aalVar, boolean z) {
        this.f6139b = aalVar;
        this.f6138a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6139b.f6135b.m7529a(this.f6138a);
    }
}
