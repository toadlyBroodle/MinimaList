package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cbt implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbs f9762a;

    cbt(cbs cbsVar) {
        this.f9762a = cbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9762a.f9761n != null) {
            this.f9762a.f9761n.mo10675g();
            this.f9762a.f9761n.mo10674f();
        }
        cbs.m10633a(this.f9762a, null);
    }
}
