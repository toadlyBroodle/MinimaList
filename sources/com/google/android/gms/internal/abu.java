package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class abu implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2104zq f6305a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2084yx f6306b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6307c;

    abu(abi abiVar, C2104zq c2104zq, C2084yx c2084yx) {
        this.f6307c = abiVar;
        this.f6305a = c2104zq;
        this.f6306b = c2084yx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6307c.f6271a.m7516G();
        this.f6307c.f6271a.m7525a(this.f6305a, this.f6306b);
    }
}
