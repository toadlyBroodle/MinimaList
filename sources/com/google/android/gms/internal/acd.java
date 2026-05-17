package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class acd extends acc {

    /* JADX INFO: renamed from: a */
    private boolean f6330a;

    acd(abd abdVar) {
        super(abdVar);
        this.f6329p.m7520a(this);
    }

    /* JADX INFO: renamed from: P */
    final boolean m7583P() {
        return this.f6330a;
    }

    /* JADX INFO: renamed from: Q */
    protected final void m7584Q() {
        if (!m7583P()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m7585R() {
        if (this.f6330a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo7396w()) {
            return;
        }
        this.f6329p.m7515F();
        this.f6330a = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m7586S() {
        if (this.f6330a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo7436l_();
        this.f6329p.m7515F();
        this.f6330a = true;
    }

    /* JADX INFO: renamed from: l_ */
    protected void mo7436l_() {
    }

    /* JADX INFO: renamed from: w */
    protected abstract boolean mo7396w();
}
