package com.google.android.gms.ads.internal.p048js;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.js.j */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0804j implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC0809o f4721a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C0803i f4722b;

    RunnableC0804j(C0803i c0803i, InterfaceC0809o interfaceC0809o) {
        this.f4722b = c0803i;
        this.f4721a = interfaceC0809o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4722b.f4720a.f4715b.mo5717a(this.f4721a);
        this.f4721a.mo5730a();
    }
}
