package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class acm implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long f6356a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acf f6357b;

    acm(acf acfVar, long j) {
        this.f6357b = acfVar;
        this.f6356a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6357b.mo7394u().f6150k.m7443a(this.f6356a);
        this.f6357b.mo7393t().m7404D().m7413a("Session timeout duration set", Long.valueOf(this.f6356a));
    }
}
