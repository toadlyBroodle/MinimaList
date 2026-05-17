package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class azx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ azy f7642a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ azs f7643b;

    azx(azs azsVar, azy azyVar) {
        this.f7643b = azsVar;
        this.f7642a = azyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f7643b.f7637a.f7621i) {
            if (!this.f7643b.f7637a.f7621i.isEmpty()) {
                this.f7642a.mo8750a(this.f7643b.f7637a.f7621i.get(0), new Object[0]);
            }
        }
    }
}
