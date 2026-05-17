package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bht extends bhu {

    /* JADX INFO: renamed from: c */
    private final beo f8182c;

    public bht(bhw bhwVar, bfa bfaVar, beo beoVar) {
        super(bhv.Merge, bhwVar, bfaVar);
        this.f8182c = beoVar;
    }

    /* JADX INFO: renamed from: a */
    public final beo m9347a() {
        return this.f8182c;
    }

    @Override // com.google.android.gms.internal.bhu
    /* JADX INFO: renamed from: a */
    public final bhu mo9344a(bkp bkpVar) {
        if (!this.f8184b.m9162h()) {
            if (this.f8184b.m9158d().equals(bkpVar)) {
                return new bht(this.f8183a, this.f8184b.m9159e(), this.f8182c);
            }
            return null;
        }
        beo beoVarM9108d = this.f8182c.m9108d(new bfa(bkpVar));
        if (beoVarM9108d.m9110e()) {
            return null;
        }
        return beoVarM9108d.m9104b() != null ? new bhy(this.f8183a, bfa.m9147a(), beoVarM9108d.m9104b()) : new bht(this.f8183a, bfa.m9147a(), beoVarM9108d);
    }

    public final String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", this.f8184b, this.f8183a, this.f8182c);
    }
}
