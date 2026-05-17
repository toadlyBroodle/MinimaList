package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class adq implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC2108zu f6457a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ adn f6458b;

    adq(adn adnVar, InterfaceC2108zu interfaceC2108zu) {
        this.f6458b = adnVar;
        this.f6457a = interfaceC2108zu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6458b) {
            adn.m7675a(this.f6458b, false);
            if (!this.f6458b.f6450a.m7672y()) {
                this.f6458b.f6450a.mo7393t().m7404D().m7412a("Connected to remote service");
                this.f6458b.f6450a.m7665a(this.f6457a);
            }
        }
    }
}
