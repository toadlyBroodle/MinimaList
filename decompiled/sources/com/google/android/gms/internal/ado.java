package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ado implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2108zu f6453a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ adn f6454b;

    ado(adn adnVar, InterfaceC2108zu interfaceC2108zu) {
        this.f6454b = adnVar;
        this.f6453a = interfaceC2108zu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6454b) {
            adn.m7675a(this.f6454b, false);
            if (!this.f6454b.f6450a.m7672y()) {
                this.f6454b.f6450a.mo7393t().m7405E().m7412a("Connected to service");
                this.f6454b.f6450a.m7665a(this.f6453a);
            }
        }
    }
}
