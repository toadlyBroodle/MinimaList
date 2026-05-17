package com.google.android.gms.p051b;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.b.m */
/* JADX INFO: loaded from: classes.dex */
final class C0972m<TResult> implements InterfaceC0974o<TResult> {

    /* JADX INFO: renamed from: a */
    private final Executor f5123a;

    /* JADX INFO: renamed from: b */
    private final Object f5124b = new Object();

    /* JADX INFO: renamed from: c */
    private InterfaceC0962c<? super TResult> f5125c;

    public C0972m(Executor executor, InterfaceC0962c<? super TResult> interfaceC0962c) {
        this.f5123a = executor;
        this.f5125c = interfaceC0962c;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0974o
    /* JADX INFO: renamed from: a */
    public final void mo6233a() {
        synchronized (this.f5124b) {
            this.f5125c = null;
        }
    }

    @Override // com.google.android.gms.p051b.InterfaceC0974o
    /* JADX INFO: renamed from: a */
    public final void mo6234a(AbstractC0964e<TResult> abstractC0964e) {
        if (abstractC0964e.mo6214b()) {
            synchronized (this.f5124b) {
                if (this.f5125c != null) {
                    this.f5123a.execute(new RunnableC0973n(this, abstractC0964e));
                }
            }
        }
    }
}
