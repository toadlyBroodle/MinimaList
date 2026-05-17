package com.google.android.gms.internal;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgy implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f8139a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfa f8140b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bgo f8141c;

    bgy(bgo bgoVar, Map map, bfa bfaVar) {
        this.f8141c = bgoVar;
        this.f8139a = map;
        this.f8140b = bfaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        beo beoVarM9097b = beo.m9097b((Map<bfa, bln>) this.f8139a);
        this.f8141c.f8099g.mo9372b(this.f8140b, beoVarM9097b);
        return this.f8141c.m9265a(new bht(bhw.f8192b, this.f8140b, beoVarM9097b));
    }
}
