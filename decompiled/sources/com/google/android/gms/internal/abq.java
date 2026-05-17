package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abq implements Callable<List<C2088za>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2084yx f6294a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6295b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6296c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ abi f6297d;

    abq(abi abiVar, C2084yx c2084yx, String str, String str2) {
        this.f6297d = abiVar;
        this.f6294a = c2084yx;
        this.f6295b = str;
        this.f6296c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C2088za> call() {
        this.f6297d.f6271a.m7516G();
        return this.f6297d.f6271a.m7551q().m12735b(this.f6294a.f12574a, this.f6295b, this.f6296c);
    }
}
