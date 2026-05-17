package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abz implements Callable<List<aej>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6320a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ abi f6321b;

    abz(abi abiVar, C2084yx c2084yx) {
        this.f6321b = abiVar;
        this.f6320a = c2084yx;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aej> call() {
        this.f6321b.f6271a.m7516G();
        return this.f6321b.f6271a.m7551q().m12722a(this.f6320a.f12574a);
    }
}
