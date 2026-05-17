package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class adx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ abd f6470a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Runnable f6471b;

    adx(adu aduVar, abd abdVar, Runnable runnable) {
        this.f6470a = abdVar;
        this.f6471b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6470a.m7516G();
        this.f6470a.m7527a(this.f6471b);
        this.f6470a.m7514E();
    }
}
