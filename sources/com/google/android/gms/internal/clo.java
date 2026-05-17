package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class clo implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1541eu f10292a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cln f10293b;

    clo(cln clnVar, C1541eu c1541eu) {
        this.f10293b = clnVar;
        this.f10292a = c1541eu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10293b.f10286a.mo5471b(this.f10292a);
    }
}
