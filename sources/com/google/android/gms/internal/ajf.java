package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class ajf implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ aje f6924a;

    ajf(aje ajeVar) {
        this.f6924a = ajeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6924a.f6923a.f6897n == 1 || this.f6924a.f6923a.f6897n == 2) {
            this.f6924a.f6923a.f6897n = 4;
            ahs.m7942a("Container load timed out after 5000ms.");
            while (!this.f6924a.f6923a.f6898o.isEmpty()) {
                this.f6924a.f6923a.f6890g.execute((Runnable) this.f6924a.f6923a.f6898o.remove());
            }
        }
    }
}
