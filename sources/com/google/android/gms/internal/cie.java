package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cie implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceFutureC1689kg f10107a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cic f10108b;

    cie(cic cicVar, InterfaceFutureC1689kg interfaceFutureC1689kg) {
        this.f10108b = cicVar;
        this.f10107a = interfaceFutureC1689kg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (InterfaceFutureC1689kg interfaceFutureC1689kg : this.f10108b.f10100k.keySet()) {
            if (interfaceFutureC1689kg != this.f10107a) {
                ((chw) this.f10108b.f10100k.get(interfaceFutureC1689kg)).m10901a();
            }
        }
    }
}
