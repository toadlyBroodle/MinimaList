package com.google.android.gms.p051b;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.b.k */
/* JADX INFO: loaded from: classes.dex */
final class C0970k<TResult> implements InterfaceC0974o<TResult> {

    /* JADX INFO: renamed from: a */
    private final Executor f5118a;

    /* JADX INFO: renamed from: b */
    private final Object f5119b = new Object();

    /* JADX INFO: renamed from: c */
    private InterfaceC0961b f5120c;

    public C0970k(Executor executor, InterfaceC0961b interfaceC0961b) {
        this.f5118a = executor;
        this.f5120c = interfaceC0961b;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0974o
    /* JADX INFO: renamed from: a */
    public final void mo6233a() {
        synchronized (this.f5119b) {
            this.f5120c = null;
        }
    }

    @Override // com.google.android.gms.p051b.InterfaceC0974o
    /* JADX INFO: renamed from: a */
    public final void mo6234a(AbstractC0964e<TResult> abstractC0964e) {
        if (abstractC0964e.mo6214b()) {
            return;
        }
        synchronized (this.f5119b) {
            if (this.f5120c != null) {
                this.f5118a.execute(new RunnableC0971l(this, abstractC0964e));
            }
        }
    }
}
