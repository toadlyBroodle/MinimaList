package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abo implements Callable<List<aej>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6286a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6287b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6288c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ abi f6289d;

    abo(abi abiVar, C2084yx c2084yx, String str, String str2) {
        this.f6289d = abiVar;
        this.f6286a = c2084yx;
        this.f6287b = str;
        this.f6288c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aej> call() {
        this.f6289d.f6271a.m7516G();
        return this.f6289d.f6271a.m7551q().m12724a(this.f6286a.f12574a, this.f6287b, this.f6288c);
    }
}
