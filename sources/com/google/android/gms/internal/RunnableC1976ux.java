package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.ux */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1976ux implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1973uu f11717a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f11718b;

    RunnableC1976ux(BinderC1975uw binderC1975uw, C1973uu c1973uu, int i) {
        this.f11717a = c1973uu;
        this.f11718b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11717a.f11690g.mo6322a(this.f11718b);
    }
}
