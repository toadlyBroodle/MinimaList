package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cbr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbq f9747a;

    cbr(cbq cbqVar) {
        this.f9747a = cbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9747a.f9746p != null) {
            this.f9747a.f9746p.mo10675g();
            this.f9747a.f9746p.mo10674f();
        }
        cbq.m10608a(this.f9747a, null);
    }
}
