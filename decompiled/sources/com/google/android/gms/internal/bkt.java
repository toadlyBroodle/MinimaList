package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bkt extends bch<bkp, bln> {

    /* JADX INFO: renamed from: a */
    private boolean f8341a = false;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bku f8342b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bkr f8343c;

    bkt(bkr bkrVar, bku bkuVar) {
        this.f8343c = bkrVar;
        this.f8342b = bkuVar;
    }

    @Override // com.google.android.gms.internal.bch
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo8908a(bkp bkpVar, bln blnVar) {
        bkp bkpVar2 = bkpVar;
        bln blnVar2 = blnVar;
        if (!this.f8341a && bkpVar2.compareTo(bkp.m9552c()) > 0) {
            this.f8341a = true;
            this.f8342b.mo8908a(bkp.m9552c(), this.f8343c.mo9573f());
        }
        this.f8342b.mo8908a(bkpVar2, blnVar2);
    }
}
