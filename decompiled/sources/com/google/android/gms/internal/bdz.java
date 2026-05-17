package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bdz implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdx f7908a;

    bdz(bdx bdxVar) {
        this.f7908a = bdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7908a.f7896b != null) {
            this.f7908a.f7896b.mo9069a("0");
            this.f7908a.m9054c();
        }
    }
}
