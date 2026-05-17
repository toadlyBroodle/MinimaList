package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bfk implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfz f8022a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfd f8023b;

    bfk(bfd bfdVar, bfz bfzVar) {
        this.f8023b = bfdVar;
        this.f8022a = bfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8023b.m9200a(new bhl(this.f8023b, this.f8022a.f8056c, bjs.m9481a(this.f8022a.f8054a)));
    }
}
