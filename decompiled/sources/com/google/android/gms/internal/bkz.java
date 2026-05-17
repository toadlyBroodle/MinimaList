package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bkz implements bla {

    /* JADX INFO: renamed from: a */
    private final long f8356a;

    public bkz(bln blnVar) {
        this.f8356a = Math.max(512L, (long) Math.sqrt(bmz.m9684a(blnVar) * 100));
    }

    @Override // com.google.android.gms.internal.bla
    /* JADX INFO: renamed from: a */
    public final boolean mo9599a(bky bkyVar) {
        return ((long) bkyVar.m9597a()) > this.f8356a && (bkyVar.m9598b().m9162h() || !bkyVar.m9598b().m9161g().equals(bkp.m9552c()));
    }
}
