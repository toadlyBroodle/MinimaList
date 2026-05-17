package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgz implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfa f8142a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bgo f8143b;

    bgz(bgo bgoVar, bfa bfaVar) {
        this.f8143b = bgoVar;
        this.f8142a = bfaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        this.f8143b.f8099g.mo9375d(bjs.m9481a(this.f8142a));
        return this.f8143b.m9265a(new bhs(bhw.f8192b, this.f8142a));
    }
}
