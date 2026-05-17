package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class agn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agl f6732a;

    agn(agl aglVar) {
        this.f6732a = aglVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6732a.f6728m == 2) {
            this.f6732a.f6727l.m7995a();
        }
    }
}
