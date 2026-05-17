package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.as */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1379as implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1542ev f7197a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1377ar f7198b;

    RunnableC1379as(C1377ar c1377ar, C1542ev c1542ev) {
        this.f7198b = c1377ar;
        this.f7197a = c1542ev;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7198b.f7119h.mo5462a(this.f7197a);
        if (this.f7198b.f7123l != null) {
            this.f7198b.f7123l.m5719a();
            this.f7198b.f7123l = null;
        }
    }
}
