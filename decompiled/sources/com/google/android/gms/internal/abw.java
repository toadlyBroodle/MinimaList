package com.google.android.gms.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abw implements Callable<byte[]> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2104zq f6311a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6312b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ abi f6313c;

    abw(abi abiVar, C2104zq c2104zq, String str) {
        this.f6313c = abiVar;
        this.f6311a = c2104zq;
        this.f6312b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f6313c.f6271a.m7516G();
        return this.f6313c.f6271a.m7535b(this.f6311a, this.f6312b);
    }
}
