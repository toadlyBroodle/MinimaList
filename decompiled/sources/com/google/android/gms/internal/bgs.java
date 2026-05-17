package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgs implements Callable<List<bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bjs f8115a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bex f8116b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2226b f8117c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bgo f8118d;

    bgs(bgo bgoVar, bjs bjsVar, bex bexVar, C2226b c2226b) {
        this.f8118d = bgoVar;
        this.f8115a = bjsVar;
        this.f8116b = bexVar;
        this.f8117c = c2226b;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<bjj> call() {
        boolean z;
        bfa bfaVarM9482a = this.f8115a.m9482a();
        bgn bgnVar = (bgn) this.f8118d.f8093a.m9422e(bfaVarM9482a);
        List<bjj> arrayList = new ArrayList<>();
        if (bgnVar != null && (this.f8115a.m9485d() || bgnVar.m9253b(this.f8115a))) {
            bnb<List<bjs>, List<bjj>> bnbVarM9248a = bgnVar.m9248a(this.f8115a, this.f8116b, this.f8117c);
            if (bgnVar.m9251a()) {
                this.f8118d.f8093a = this.f8118d.f8093a.m9420d(bfaVarM9482a);
            }
            List<bjs> listM9687a = bnbVarM9248a.m9687a();
            arrayList = bnbVarM9248a.m9688b();
            boolean z2 = false;
            for (bjs bjsVar : listM9687a) {
                this.f8118d.f8099g.mo9374c(this.f8115a);
                z2 = z2 || bjsVar.m9486e();
            }
            bit bitVar = this.f8118d.f8093a;
            boolean z3 = bitVar.m9415b() != null && ((bgn) bitVar.m9415b()).m9254c();
            Iterator<bkp> it = bfaVarM9482a.iterator();
            bit bitVarM9411a = bitVar;
            do {
                z = z3;
                if (!it.hasNext()) {
                    break;
                }
                bitVarM9411a = bitVarM9411a.m9411a(it.next());
                z3 = z || (bitVarM9411a.m9415b() != null && ((bgn) bitVarM9411a.m9415b()).m9254c());
                if (z3) {
                    break;
                }
            } while (!bitVarM9411a.m9421d());
            z = z3;
            if (z2 && !z) {
                bit bitVarM9419c = this.f8118d.f8093a.m9419c(bfaVarM9482a);
                if (!bitVarM9419c.m9421d()) {
                    for (bjt bjtVar : this.f8118d.m9267a((bit<bgn>) bitVarM9419c)) {
                        bhd bhdVar = new bhd(this.f8118d, bjtVar);
                        bjs bjsVarM9488a = bjtVar.m9488a();
                        bhe bheVar = this.f8118d.f8098f;
                        bgo bgoVar = this.f8118d;
                        bheVar.mo9212a(bgo.m9260a(bjsVarM9488a), bhdVar.f8154b, bhdVar, bhdVar);
                    }
                }
            }
            if (!z && !listM9687a.isEmpty() && this.f8117c == null) {
                if (z2) {
                    bhe bheVar2 = this.f8118d.f8098f;
                    bgo bgoVar2 = this.f8118d;
                    bheVar2.mo9211a(bgo.m9260a(this.f8115a), null);
                } else {
                    for (bjs bjsVar2 : listM9687a) {
                        bhg bhgVarM9275b = this.f8118d.m9275b(bjsVar2);
                        bhe bheVar3 = this.f8118d.f8098f;
                        bgo bgoVar3 = this.f8118d;
                        bheVar3.mo9211a(bgo.m9260a(bjsVar2), bhgVarM9275b);
                    }
                }
            }
            this.f8118d.m9274a((List<bjs>) listM9687a);
        }
        return arrayList;
    }
}
