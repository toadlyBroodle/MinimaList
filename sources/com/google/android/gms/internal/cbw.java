package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cbw implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbu f9772a;

    cbw(cbu cbuVar) {
        this.f9772a = cbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9772a.f9770h != null) {
            this.f9772a.f9770h.mo10675g();
            this.f9772a.f9770h.mo10674f();
        }
        cbu.m10650a(this.f9772a, null);
    }
}
