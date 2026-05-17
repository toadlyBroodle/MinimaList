package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bkc implements bke {

    /* JADX INFO: renamed from: a */
    private final ble f8308a;

    public bkc(ble bleVar) {
        this.f8308a = bleVar;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final bke mo9520a() {
        return this;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9521a(blf blfVar, bkp bkpVar, bln blnVar, bfa bfaVar, bkf bkfVar, bkb bkbVar) {
        bln blnVarM9616a = blfVar.m9616a();
        bln blnVarMo9570c = blnVarM9616a.mo9570c(bkpVar);
        if (blnVarMo9570c.mo9560a(bfaVar).equals(blnVar.mo9560a(bfaVar)) && blnVarMo9570c.mo9568b() == blnVar.mo9568b()) {
            return blfVar;
        }
        if (bkbVar != null) {
            if (blnVar.mo9568b()) {
                if (blnVarM9616a.mo9565a(bkpVar)) {
                    bkbVar.m9519a(bjg.m9449b(bkpVar, blnVarMo9570c));
                }
            } else if (blnVarMo9570c.mo9568b()) {
                bkbVar.m9519a(bjg.m9445a(bkpVar, blnVar));
            } else {
                bkbVar.m9519a(bjg.m9446a(bkpVar, blnVar, blnVarMo9570c));
            }
        }
        return (blnVarM9616a.mo9572e() && blnVar.mo9568b()) ? blfVar : blfVar.m9615a(bkpVar, blnVar);
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9522a(blf blfVar, blf blfVar2, bkb bkbVar) {
        if (bkbVar != null) {
            for (blm blmVar : blfVar.m9616a()) {
                if (!blfVar2.m9616a().mo9565a(blmVar.m9626c())) {
                    bkbVar.m9519a(bjg.m9449b(blmVar.m9626c(), blmVar.m9627d()));
                }
            }
            if (!blfVar2.m9616a().mo9572e()) {
                for (blm blmVar2 : blfVar2.m9616a()) {
                    if (blfVar.m9616a().mo9565a(blmVar2.m9626c())) {
                        bln blnVarMo9570c = blfVar.m9616a().mo9570c(blmVar2.m9626c());
                        if (!blnVarMo9570c.equals(blmVar2.m9627d())) {
                            bkbVar.m9519a(bjg.m9446a(blmVar2.m9626c(), blmVar2.m9627d(), blnVarMo9570c));
                        }
                    } else {
                        bkbVar.m9519a(bjg.m9445a(blmVar2.m9626c(), blmVar2.m9627d()));
                    }
                }
            }
        }
        return blfVar2;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9523a(blf blfVar, bln blnVar) {
        return blfVar.m9616a().mo9568b() ? blfVar : blfVar.m9617b(blnVar);
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: b */
    public final ble mo9524b() {
        return this.f8308a;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: c */
    public final boolean mo9525c() {
        return false;
    }
}
