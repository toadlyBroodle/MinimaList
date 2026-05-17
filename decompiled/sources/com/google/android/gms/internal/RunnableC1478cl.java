package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.cl */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1478cl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1542ev f10257a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC1476cj f10258b;

    RunnableC1478cl(BinderC1476cj binderC1476cj, C1542ev c1542ev) {
        this.f10258b = binderC1476cj;
        this.f10257a = c1542ev;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10258b.mo5471b(new C1541eu(this.f10257a, null, null, null, null, null, null, null));
    }
}
