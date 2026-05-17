package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.fj */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1557fj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC1556fi f10652a;

    RunnableC1557fj(AbstractC1556fi abstractC1556fi) {
        this.f10652a = abstractC1556fi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10652a.f10650b = Thread.currentThread();
        this.f10652a.mo5769a();
    }
}
