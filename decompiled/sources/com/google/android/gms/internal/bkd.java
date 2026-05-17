package com.google.android.gms.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bkd implements bke {

    /* JADX INFO: renamed from: a */
    private final bkg f8309a;

    /* JADX INFO: renamed from: b */
    private final ble f8310b;

    /* JADX INFO: renamed from: c */
    private final int f8311c;

    /* JADX INFO: renamed from: d */
    private final boolean f8312d;

    public bkd(bjp bjpVar) {
        this.f8309a = new bkg(bjpVar);
        this.f8310b = bjpVar.m9473i();
        this.f8311c = bjpVar.m9472h();
        this.f8312d = !bjpVar.m9474j();
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final bke mo9520a() {
        return this.f8309a.mo9520a();
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9521a(blf blfVar, bkp bkpVar, bln blnVar, bfa bfaVar, bkf bkfVar, bkb bkbVar) {
        bln blnVarM9605j = !this.f8309a.m9526a(new blm(bkpVar, blnVar)) ? bld.m9605j() : blnVar;
        if (blfVar.m9616a().mo9570c(bkpVar).equals(blnVarM9605j)) {
            return blfVar;
        }
        if (blfVar.m9616a().mo9569c() < this.f8311c) {
            return this.f8309a.mo9520a().mo9521a(blfVar, bkpVar, blnVarM9605j, bfaVar, bkfVar, bkbVar);
        }
        blm blmVar = new blm(bkpVar, blnVarM9605j);
        blm blmVarM9619c = this.f8312d ? blfVar.m9619c() : blfVar.m9620d();
        boolean zM9526a = this.f8309a.m9526a(blmVar);
        if (!blfVar.m9616a().mo9565a(bkpVar)) {
            if (blnVarM9605j.mo9568b() || !zM9526a || this.f8310b.m9606a(blmVarM9619c, blmVar, this.f8312d) < 0) {
                return blfVar;
            }
            if (bkbVar != null) {
                bkbVar.m9519a(bjg.m9449b(blmVarM9619c.m9626c(), blmVarM9619c.m9627d()));
                bkbVar.m9519a(bjg.m9445a(bkpVar, blnVarM9605j));
            }
            return blfVar.m9615a(bkpVar, blnVarM9605j).m9615a(blmVarM9619c.m9626c(), bld.m9605j());
        }
        bln blnVarMo9570c = blfVar.m9616a().mo9570c(bkpVar);
        blm blmVarMo9509a = bkfVar.mo9509a(this.f8310b, blmVarM9619c, this.f8312d);
        while (blmVarMo9509a != null && (blmVarMo9509a.m9626c().equals(bkpVar) || blfVar.m9616a().mo9565a(blmVarMo9509a.m9626c()))) {
            blmVarMo9509a = bkfVar.mo9509a(this.f8310b, blmVarMo9509a, this.f8312d);
        }
        if (zM9526a && !blnVarM9605j.mo9568b() && (blmVarMo9509a == null ? 1 : this.f8310b.m9606a(blmVarMo9509a, blmVar, this.f8312d)) >= 0) {
            if (bkbVar != null) {
                bkbVar.m9519a(bjg.m9446a(bkpVar, blnVarM9605j, blnVarMo9570c));
            }
            return blfVar.m9615a(bkpVar, blnVarM9605j);
        }
        if (bkbVar != null) {
            bkbVar.m9519a(bjg.m9449b(bkpVar, blnVarMo9570c));
        }
        blf blfVarM9615a = blfVar.m9615a(bkpVar, bld.m9605j());
        if (!(blmVarMo9509a != null && this.f8309a.m9526a(blmVarMo9509a))) {
            return blfVarM9615a;
        }
        if (bkbVar != null) {
            bkbVar.m9519a(bjg.m9445a(blmVarMo9509a.m9626c(), blmVarMo9509a.m9627d()));
        }
        return blfVarM9615a.m9615a(blmVarMo9509a.m9626c(), blmVarMo9509a.m9627d());
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9522a(blf blfVar, blf blfVar2, bkb bkbVar) {
        blf blfVarM9612a;
        blm blmVarM9528e;
        blm blmVarM9528e2;
        int i;
        Iterator<blm> it;
        if (blfVar2.m9616a().mo9572e() || blfVar2.m9616a().mo9568b()) {
            blfVarM9612a = blf.m9612a(bld.m9605j(), this.f8310b);
        } else {
            blf blfVarM9617b = blfVar2.m9617b(bld.m9605j());
            if (this.f8312d) {
                Iterator<blm> itM9618b = blfVar2.m9618b();
                blmVarM9528e2 = this.f8309a.m9528e();
                blmVarM9528e = this.f8309a.m9527d();
                it = itM9618b;
                i = -1;
            } else {
                Iterator<blm> it2 = blfVar2.iterator();
                blm blmVarM9527d = this.f8309a.m9527d();
                blmVarM9528e = this.f8309a.m9528e();
                blmVarM9528e2 = blmVarM9527d;
                i = 1;
                it = it2;
            }
            int i2 = 0;
            blfVarM9612a = blfVarM9617b;
            boolean z = false;
            while (it.hasNext()) {
                blm next = it.next();
                if (!z && this.f8310b.compare(blmVarM9528e2, next) * i <= 0) {
                    z = true;
                }
                if (z && i2 < this.f8311c && this.f8310b.compare(next, blmVarM9528e) * i <= 0) {
                    i2++;
                } else {
                    blfVarM9612a = blfVarM9612a.m9615a(next.m9626c(), bld.m9605j());
                }
            }
        }
        return this.f8309a.mo9520a().mo9522a(blfVar, blfVarM9612a, bkbVar);
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: a */
    public final blf mo9523a(blf blfVar, bln blnVar) {
        return blfVar;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: b */
    public final ble mo9524b() {
        return this.f8310b;
    }

    @Override // com.google.android.gms.internal.bke
    /* JADX INFO: renamed from: c */
    public final boolean mo9525c() {
        return true;
    }
}
