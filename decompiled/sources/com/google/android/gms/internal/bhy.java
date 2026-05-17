package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bhy extends bhu {

    /* JADX INFO: renamed from: c */
    private final bln f8199c;

    public bhy(bhw bhwVar, bfa bfaVar, bln blnVar) {
        super(bhv.Overwrite, bhwVar, bfaVar);
        this.f8199c = blnVar;
    }

    @Override // com.google.android.gms.internal.bhu
    /* JADX INFO: renamed from: a */
    public final bhu mo9344a(bkp bkpVar) {
        return this.f8184b.m9162h() ? new bhy(this.f8183a, bfa.m9147a(), this.f8199c.mo9570c(bkpVar)) : new bhy(this.f8183a, this.f8184b.m9159e(), this.f8199c);
    }

    /* JADX INFO: renamed from: a */
    public final bln m9355a() {
        return this.f8199c;
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", this.f8184b, this.f8183a, this.f8199c);
    }
}
