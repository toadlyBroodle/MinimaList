package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bhb implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bhg f8149a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfa f8150b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bln f8151c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bgo f8152d;

    bhb(bgo bgoVar, bhg bhgVar, bfa bfaVar, bln blnVar) {
        this.f8152d = bgoVar;
        this.f8149a = bhgVar;
        this.f8150b = bfaVar;
        this.f8151c = blnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        bjs bjsVarM9278b = this.f8152d.m9278b(this.f8149a);
        if (bjsVarM9278b == null) {
            return Collections.emptyList();
        }
        bfa bfaVarM9148a = bfa.m9148a(bjsVarM9278b.m9482a(), this.f8150b);
        this.f8152d.f8099g.mo9369a(bfaVarM9148a.m9162h() ? bjsVarM9278b : bjs.m9481a(this.f8150b), this.f8151c);
        return this.f8152d.m9269a(bjsVarM9278b, new bhy(bhw.m9351a(bjsVarM9278b.m9483b()), bfaVarM9148a, this.f8151c));
    }
}
