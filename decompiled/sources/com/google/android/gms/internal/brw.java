package com.google.android.gms.internal;

import com.google.android.gms.internal.brw;

/* JADX INFO: loaded from: classes.dex */
public abstract class brw<M extends brw<M>> extends bsc {

    /* JADX INFO: renamed from: X */
    protected bry f8769X;

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    protected int mo7775a() {
        if (this.f8769X == null) {
            return 0;
        }
        int iM10150a = 0;
        for (int i = 0; i < this.f8769X.m10143a(); i++) {
            iM10150a += this.f8769X.m10146b(i).m10150a();
        }
        return iM10150a;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: a */
    public void mo7777a(bru bruVar) {
        if (this.f8769X == null) {
            return;
        }
        for (int i = 0; i < this.f8769X.m10143a(); i++) {
            this.f8769X.m10146b(i).m10151a(bruVar);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m10136a(brt brtVar, int i) {
        int iM10101l = brtVar.m10101l();
        if (!brtVar.m10088b(i)) {
            return false;
        }
        int i2 = i >>> 3;
        bse bseVar = new bse(i, brtVar.m10085a(iM10101l, brtVar.m10101l() - iM10101l));
        brz brzVarM10144a = null;
        if (this.f8769X == null) {
            this.f8769X = new bry();
        } else {
            brzVarM10144a = this.f8769X.m10144a(i2);
        }
        if (brzVarM10144a == null) {
            brzVarM10144a = new brz();
            this.f8769X.m10145a(i2, brzVarM10144a);
        }
        brzVarM10144a.m10152a(bseVar);
        return true;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M clone() {
        M m = (M) super.clone();
        bsa.m10155a(this, m);
        return m;
    }

    @Override // com.google.android.gms.internal.bsc
    /* JADX INFO: renamed from: d */
    public /* synthetic */ bsc clone() {
        return (brw) clone();
    }
}
