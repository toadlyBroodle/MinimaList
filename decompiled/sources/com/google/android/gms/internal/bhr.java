package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bhr extends bhu {

    /* JADX INFO: renamed from: c */
    private final boolean f8180c;

    /* JADX INFO: renamed from: d */
    private final bit<Boolean> f8181d;

    public bhr(bfa bfaVar, bit<Boolean> bitVar, boolean z) {
        super(bhv.AckUserWrite, bhw.f8191a, bfaVar);
        this.f8181d = bitVar;
        this.f8180c = z;
    }

    @Override // com.google.android.gms.internal.bhu
    /* JADX INFO: renamed from: a */
    public final bhu mo9344a(bkp bkpVar) {
        if (!this.f8184b.m9162h()) {
            bne.m9697a(this.f8184b.m9158d().equals(bkpVar), "operationForChild called for unrelated child.");
            return new bhr(this.f8184b.m9159e(), this.f8181d, this.f8180c);
        }
        if (this.f8181d.m9415b() == null) {
            return new bhr(bfa.m9147a(), this.f8181d.m9419c(new bfa(bkpVar)), this.f8180c);
        }
        bne.m9697a(this.f8181d.m9418c().mo8876d(), "affectedTree should not have overlapping affected paths.");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final bit<Boolean> m9345a() {
        return this.f8181d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9346b() {
        return this.f8180c;
    }

    public final String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", this.f8184b, Boolean.valueOf(this.f8180c), this.f8181d);
    }
}
