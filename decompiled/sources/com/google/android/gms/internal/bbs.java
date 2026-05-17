package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bbs implements biw<Void, Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bit f7749a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ List f7750b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bfa f7751c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bln f7752d;

    bbs(bbq bbqVar, bit bitVar, List list, bfa bfaVar, bln blnVar) {
        this.f7749a = bitVar;
        this.f7750b = list;
        this.f7751c = bfaVar;
        this.f7752d = blnVar;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void mo8856a(bfa bfaVar, Void r6, Void r7) {
        if (this.f7749a.m9422e(bfaVar) != null) {
            return null;
        }
        this.f7750b.add(new bnb(this.f7751c.m9152a(bfaVar), this.f7752d.mo9560a(bfaVar)));
        return null;
    }
}
