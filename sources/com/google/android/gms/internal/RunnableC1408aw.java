package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.aw */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1408aw implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1377ar f7443a;

    RunnableC1408aw(C1377ar c1377ar) {
        this.f7443a = c1377ar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7443a.f7123l != null) {
            this.f7443a.f7123l.m5719a();
            this.f7443a.f7123l = null;
        }
    }
}
