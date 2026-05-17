package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bha implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bhg f8147a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bgo f8148b;

    bha(bgo bgoVar, bhg bhgVar) {
        this.f8148b = bgoVar;
        this.f8147a = bhgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        bjs bjsVarM9278b = this.f8148b.m9278b(this.f8147a);
        if (bjsVarM9278b == null) {
            return Collections.emptyList();
        }
        this.f8148b.f8099g.mo9375d(bjsVarM9278b);
        return this.f8148b.m9269a(bjsVarM9278b, new bhs(bhw.m9351a(bjsVarM9278b.m9483b()), bfa.m9147a()));
    }
}
