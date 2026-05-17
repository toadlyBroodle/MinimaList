package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class acl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ long f6354a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acf f6355b;

    acl(acf acfVar, long j) {
        this.f6355b = acfVar;
        this.f6354a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6355b.mo7394u().f6149j.m7443a(this.f6354a);
        this.f6355b.mo7393t().m7404D().m7413a("Minimum session duration set", Long.valueOf(this.f6354a));
    }
}
