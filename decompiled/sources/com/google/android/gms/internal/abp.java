package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class abp implements Callable<List<aej>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6290a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6291b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6292c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ abi f6293d;

    abp(abi abiVar, String str, String str2, String str3) {
        this.f6293d = abiVar;
        this.f6290a = str;
        this.f6291b = str2;
        this.f6292c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aej> call() {
        this.f6293d.f6271a.m7516G();
        return this.f6293d.f6271a.m7551q().m12724a(this.f6290a, this.f6291b, this.f6292c);
    }
}
