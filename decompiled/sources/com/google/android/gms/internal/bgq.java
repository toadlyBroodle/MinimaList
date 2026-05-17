package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgq implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bhg f8109a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfa f8110b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Map f8111c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bgo f8112d;

    bgq(bgo bgoVar, bhg bhgVar, bfa bfaVar, Map map) {
        this.f8112d = bgoVar;
        this.f8109a = bhgVar;
        this.f8110b = bfaVar;
        this.f8111c = map;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        bjs bjsVarM9278b = this.f8112d.m9278b(this.f8109a);
        if (bjsVarM9278b == null) {
            return Collections.emptyList();
        }
        bfa bfaVarM9148a = bfa.m9148a(bjsVarM9278b.m9482a(), this.f8110b);
        beo beoVarM9097b = beo.m9097b((Map<bfa, bln>) this.f8111c);
        this.f8112d.f8099g.mo9372b(this.f8110b, beoVarM9097b);
        return this.f8112d.m9269a(bjsVarM9278b, new bht(bhw.m9351a(bjsVarM9278b.m9483b()), bfaVarM9148a, beoVarM9097b));
    }
}
