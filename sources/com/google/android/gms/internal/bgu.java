package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bgu extends bch<bkp, bit<bgn>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bln f8120a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bhp f8121b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bhu f8122c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ List f8123d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ bgo f8124e;

    bgu(bgo bgoVar, bln blnVar, bhp bhpVar, bhu bhuVar, List list) {
        this.f8124e = bgoVar;
        this.f8120a = blnVar;
        this.f8121b = bhpVar;
        this.f8122c = bhuVar;
        this.f8123d = list;
    }

    @Override // com.google.android.gms.internal.bch
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo8908a(bkp bkpVar, bit<bgn> bitVar) {
        bkp bkpVar2 = bkpVar;
        bit<bgn> bitVar2 = bitVar;
        bln blnVarMo9570c = this.f8120a != null ? this.f8120a.mo9570c(bkpVar2) : null;
        bhp bhpVarM9334a = this.f8121b.m9334a(bkpVar2);
        bhu bhuVarMo9344a = this.f8122c.mo9344a(bkpVar2);
        if (bhuVarMo9344a != null) {
            this.f8123d.addAll(this.f8124e.m9280b(bhuVarMo9344a, bitVar2, blnVarMo9570c, bhpVarM9334a));
        }
    }
}
