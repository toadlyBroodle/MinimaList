package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abs implements Callable<List<C2088za>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6299a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6300b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6301c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ abi f6302d;

    abs(abi abiVar, String str, String str2, String str3) {
        this.f6302d = abiVar;
        this.f6299a = str;
        this.f6300b = str2;
        this.f6301c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C2088za> call() {
        this.f6302d.f6271a.m7516G();
        return this.f6302d.f6271a.m7551q().m12735b(this.f6299a, this.f6300b, this.f6301c);
    }
}
