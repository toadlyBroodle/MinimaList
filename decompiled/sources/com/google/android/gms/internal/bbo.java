package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bbo implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cej f7741a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ aio f7742b;

    bbo(aio aioVar, cej cejVar) {
        this.f7742b = aioVar;
        this.f7741a = cejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7742b.f6868c.put(this.f7741a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
