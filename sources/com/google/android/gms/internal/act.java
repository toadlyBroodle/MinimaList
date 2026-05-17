package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class act implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ acf f6379a;

    act(acf acfVar) {
        this.f6379a = acfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acf acfVar = this.f6379a;
        acfVar.mo7376c();
        acfVar.m7584Q();
        acfVar.mo7393t().m7404D().m7412a("Resetting analytics data (FE)");
        acfVar.mo7382i().m7657A();
    }
}
