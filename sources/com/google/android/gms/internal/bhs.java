package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bhs extends bhu {
    public bhs(bhw bhwVar, bfa bfaVar) {
        super(bhv.ListenComplete, bhwVar, bfaVar);
    }

    @Override // com.google.android.gms.internal.bhu
    /* JADX INFO: renamed from: a */
    public final bhu mo9344a(bkp bkpVar) {
        return this.f8184b.m9162h() ? new bhs(this.f8183a, bfa.m9147a()) : new bhs(this.f8183a, this.f8184b.m9159e());
    }

    public final String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", this.f8184b, this.f8183a);
    }
}
