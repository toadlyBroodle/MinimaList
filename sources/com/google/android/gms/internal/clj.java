package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class clj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1541eu f10272a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cli f10273b;

    clj(cli cliVar, C1541eu c1541eu) {
        this.f10273b = cliVar;
        this.f10272a = c1541eu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10273b.f10269a.mo5471b(this.f10272a);
    }
}
