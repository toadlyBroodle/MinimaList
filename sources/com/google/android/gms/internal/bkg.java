package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bkg implements bke {

    /* JADX INFO: renamed from: a */
    private final bkc f8313a;

    /* JADX INFO: renamed from: b */
    private final ble f8314b;

    /* JADX INFO: renamed from: c */
    private final blm f8315c;

    /* JADX INFO: renamed from: d */
    private final blm f8316d;

    public bkg(bjp bjpVar) {
        blm blmVarM9624a;
        blm blmVarMo9607a;
        this.f8313a = new bkc(bjpVar.m9473i());
        this.f8314b = bjpVar.m9473i();
        if (bjpVar.m9465a()) {
            blmVarM9624a = bjpVar.m9473i().mo9608a(bjpVar.m9467c(), bjpVar.m9466b());
        } else {
            bjpVar.m9473i();
            blmVarM9624a = blm.m9624a();
        }
        this.f8315c = blmVarM9624a;
        if (bjpVar.m9468d()) {
            blmVarMo9607a = bjpVar.m9473i().mo9608a(bjpVar.m9470f(), bjpVar.m9469e());
        } else {
            blmVarMo9607a = bjpVar.m9473i().mo9607a();
        }
        this.f8316d = blmVarMo9607a;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final bke mo9520a() {
        return this.f8313a;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9521a(blf blfVar, bkp bkpVar, bln blnVar, bfa bfaVar, bkf bkfVar, bkb bkbVar) {
        return this.f8313a.mo9521a(blfVar, bkpVar, !m9526a(new blm(bkpVar, blnVar)) ? bld.m9605j() : blnVar, bfaVar, bkfVar, bkbVar);
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9522a(blf blfVar, blf blfVar2, bkb bkbVar) {
        blf blfVarM9612a;
        if (!blfVar2.m9616a().mo9572e()) {
            blf blfVarM9617b = blfVar2.m9617b(bld.m9605j());
            Iterator<blm> it = blfVar2.iterator();
            while (true) {
                blfVarM9612a = blfVarM9617b;
                if (!it.hasNext()) {
                    break;
                }
                blm next = it.next();
                blfVarM9617b = !m9526a(next) ? blfVarM9612a.m9615a(next.m9626c(), bld.m9605j()) : blfVarM9612a;
            }
        } else {
            blfVarM9612a = blf.m9612a(bld.m9605j(), this.f8314b);
        }
        return this.f8313a.mo9522a(blfVar, blfVarM9612a, bkbVar);
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9523a(blf blfVar, bln blnVar) {
        return blfVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9526a(blm blmVar) {
        return this.f8314b.compare(this.f8315c, blmVar) <= 0 && this.f8314b.compare(blmVar, this.f8316d) <= 0;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: b */
    public final ble mo9524b() {
        return this.f8314b;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: c */
    public final boolean mo9525c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final blm m9527d() {
        return this.f8315c;
    }

    /* JADX INFO: renamed from: e */
    public final blm m9528e() {
        return this.f8316d;
    }
}
