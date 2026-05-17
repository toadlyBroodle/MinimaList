package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgx implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfa f8136a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bln f8137b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bgo f8138c;

    bgx(bgo bgoVar, bfa bfaVar, bln blnVar) {
        this.f8138c = bgoVar;
        this.f8136a = bfaVar;
        this.f8137b = blnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        this.f8138c.f8099g.mo9369a(bjs.m9481a(this.f8136a), this.f8137b);
        return this.f8138c.m9265a(new bhy(bhw.f8192b, this.f8136a, this.f8137b));
    }
}
