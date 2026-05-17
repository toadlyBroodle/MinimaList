package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bgj {

    /* JADX INFO: renamed from: a */
    private bln f8087a = null;

    /* JADX INFO: renamed from: b */
    private Map<bkp, bgj> f8088b = null;

    /* JADX INFO: renamed from: a */
    public final void m9242a(bfa bfaVar, bgm bgmVar) {
        if (this.f8087a != null) {
            bgmVar.mo9207a(bfaVar, this.f8087a);
            return;
        }
        bgk bgkVar = new bgk(this, bfaVar, bgmVar);
        if (this.f8088b != null) {
            for (Map.Entry<bkp, bgj> entry : this.f8088b.entrySet()) {
                bgkVar.mo9244a(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9243a(bfa bfaVar, bln blnVar) {
        while (!bfaVar.m9162h()) {
            if (this.f8087a != null) {
                this.f8087a = this.f8087a.mo9561a(bfaVar, blnVar);
                return;
            }
            if (this.f8088b == null) {
                this.f8088b = new HashMap();
            }
            bkp bkpVarM9158d = bfaVar.m9158d();
            if (!this.f8088b.containsKey(bkpVarM9158d)) {
                this.f8088b.put(bkpVarM9158d, new bgj());
            }
            bgj bgjVar = this.f8088b.get(bkpVarM9158d);
            bfaVar = bfaVar.m9159e();
            this = bgjVar;
        }
        this.f8087a = blnVar;
        this.f8088b = null;
    }
}
