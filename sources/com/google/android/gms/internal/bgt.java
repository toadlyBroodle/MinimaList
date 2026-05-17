package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class bgt implements biw<bgn, Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bgo f8119a;

    bgt(bgo bgoVar) {
        this.f8119a = bgoVar;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void mo8856a(bfa bfaVar, bgn bgnVar, Void r8) {
        bgn bgnVar2 = bgnVar;
        if (!bfaVar.m9162h() && bgnVar2.m9254c()) {
            bjs bjsVarM9488a = bgnVar2.m9255d().m9488a();
            bhe bheVar = this.f8119a.f8098f;
            bgo bgoVar = this.f8119a;
            bheVar.mo9211a(bgo.m9260a(bjsVarM9488a), this.f8119a.m9275b(bjsVarM9488a));
            return null;
        }
        Iterator<bjt> it = bgnVar2.m9252b().iterator();
        while (it.hasNext()) {
            bjs bjsVarM9488a2 = it.next().m9488a();
            bhe bheVar2 = this.f8119a.f8098f;
            bgo bgoVar2 = this.f8119a;
            bheVar2.mo9211a(bgo.m9260a(bjsVarM9488a2), this.f8119a.m9275b(bjsVarM9488a2));
        }
        return null;
    }
}
