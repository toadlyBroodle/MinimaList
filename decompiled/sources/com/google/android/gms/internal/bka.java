package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bka implements bkf {

    /* JADX INFO: renamed from: a */
    private final bhp f8304a;

    /* JADX INFO: renamed from: b */
    private final bjv f8305b;

    /* JADX INFO: renamed from: c */
    private final bln f8306c;

    public bka(bhp bhpVar, bjv bjvVar, bln blnVar) {
        this.f8304a = bhpVar;
        this.f8305b = bjvVar;
        this.f8306c = blnVar;
    }

    @Override // com.google.android.gms.internal.bkf
    /* JADX INFO: renamed from: a */
    public final blm mo9509a(ble bleVar, blm blmVar, boolean z) {
        return this.f8304a.m9335a(this.f8306c != null ? this.f8306c : this.f8305b.m9502d(), blmVar, z, bleVar);
    }

    @Override // com.google.android.gms.internal.bkf
    /* JADX INFO: renamed from: a */
    public final bln mo9510a(bkp bkpVar) {
        bje bjeVarM9497a = this.f8305b.m9497a();
        if (bjeVarM9497a.m9438a(bkpVar)) {
            return bjeVarM9497a.m9440c().mo9570c(bkpVar);
        }
        return this.f8304a.m9338a(bkpVar, this.f8306c != null ? new bje(blf.m9612a(this.f8306c, blg.m9621c()), true, false) : this.f8305b.m9501c());
    }
}
