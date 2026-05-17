package com.google.android.gms.internal;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgr implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bex f8113a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bgo f8114b;

    bgr(bgo bgoVar, bex bexVar) {
        this.f8114b = bgoVar;
        this.f8113a = bexVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        bln blnVar;
        boolean z;
        bgn bgnVar;
        bje bjeVar;
        bln blnVarM9247a;
        boolean z2;
        bln blnVar2;
        bjs bjsVarMo9132a = this.f8113a.mo9132a();
        bfa bfaVarM9482a = bjsVarMo9132a.m9482a();
        bln blnVarM9247a2 = null;
        bfa bfaVarM9159e = bfaVarM9482a;
        bit bitVarM9411a = this.f8114b.f8093a;
        boolean z3 = false;
        while (!bitVarM9411a.m9421d()) {
            bgn bgnVar2 = (bgn) bitVarM9411a.m9415b();
            if (bgnVar2 != null) {
                if (blnVarM9247a2 == null) {
                    blnVarM9247a2 = bgnVar2.m9247a(bfaVarM9159e);
                }
                z2 = z3 || bgnVar2.m9254c();
                blnVar2 = blnVarM9247a2;
            } else {
                z2 = z3;
                blnVar2 = blnVarM9247a2;
            }
            bitVarM9411a = bitVarM9411a.m9411a(bfaVarM9159e.m9162h() ? bkp.m9549a("") : bfaVarM9159e.m9158d());
            bfaVarM9159e = bfaVarM9159e.m9159e();
            blnVarM9247a2 = blnVar2;
            z3 = z2;
        }
        bgn bgnVar3 = (bgn) this.f8114b.f8093a.m9422e(bfaVarM9482a);
        if (bgnVar3 == null) {
            bgn bgnVar4 = new bgn(this.f8114b.f8099g);
            this.f8114b.f8093a = this.f8114b.f8093a.m9410a(bfaVarM9482a, bgnVar4);
            blnVar = blnVarM9247a2;
            z = z3;
            bgnVar = bgnVar4;
        } else {
            boolean z4 = z3 || bgnVar3.m9254c();
            if (blnVarM9247a2 == null) {
                blnVarM9247a2 = bgnVar3.m9247a(bfa.m9147a());
            }
            blnVar = blnVarM9247a2;
            z = z4;
            bgnVar = bgnVar3;
        }
        this.f8114b.f8099g.mo9373b(bjsVarMo9132a);
        if (blnVar != null) {
            bjeVar = new bje(blf.m9612a(blnVar, bjsVarMo9132a.m9484c()), true, false);
        } else {
            bje bjeVarMo9361a = this.f8114b.f8099g.mo9361a(bjsVarMo9132a);
            if (bjeVarMo9361a.m9436a()) {
                bjeVar = bjeVarMo9361a;
            } else {
                bln blnVarM9605j = bld.m9605j();
                for (Map.Entry entry : this.f8114b.f8093a.m9419c(bfaVarM9482a).m9418c()) {
                    bgn bgnVar5 = (bgn) ((bit) entry.getValue()).m9415b();
                    blnVarM9605j = (bgnVar5 == null || (blnVarM9247a = bgnVar5.m9247a(bfa.m9147a())) == null) ? blnVarM9605j : blnVarM9605j.mo9562a((bkp) entry.getKey(), blnVarM9247a);
                }
                for (blm blmVar : bjeVarMo9361a.m9440c()) {
                    if (!blnVarM9605j.mo9565a(blmVar.m9626c())) {
                        blnVarM9605j = blnVarM9605j.mo9562a(blmVar.m9626c(), blmVar.m9627d());
                    }
                }
                bjeVar = new bje(blf.m9612a(blnVarM9605j, bjsVarMo9132a.m9484c()), false, false);
            }
        }
        boolean zM9253b = bgnVar.m9253b(bjsVarMo9132a);
        if (!zM9253b && !bjsVarMo9132a.m9486e()) {
            bhg bhgVarM9256a = this.f8114b.m9256a();
            this.f8114b.f8096d.put(bjsVarMo9132a, bhgVarM9256a);
            this.f8114b.f8095c.put(bhgVarM9256a, bjsVarMo9132a);
        }
        List<bji> listM9249a = bgnVar.m9249a(this.f8113a, this.f8114b.f8094b.m9323a(bfaVarM9482a), bjeVar);
        if (!zM9253b && !z) {
            this.f8114b.m9273a(bjsVarMo9132a, bgnVar.m9246a(bjsVarMo9132a));
        }
        return listM9249a;
    }
}
