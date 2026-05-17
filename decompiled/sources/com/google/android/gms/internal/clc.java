package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class clc implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1541eu f10266a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ cla f10267b;

    clc(cla claVar, C1541eu c1541eu) {
        this.f10267b = claVar;
        this.f10266a = c1541eu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10267b.f10261c) {
            cla claVar = this.f10267b;
            claVar.f10259a.mo5471b(this.f10266a);
        }
    }
}
