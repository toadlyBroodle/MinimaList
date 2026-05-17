package com.google.android.gms.p051b;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.b.i */
/* JADX INFO: loaded from: classes.dex */
final class C0968i<TResult> implements InterfaceC0974o<TResult> {

    /* JADX INFO: renamed from: a */
    private final Executor f5113a;

    /* JADX INFO: renamed from: b */
    private final Object f5114b = new Object();

    /* JADX INFO: renamed from: c */
    private InterfaceC0960a<TResult> f5115c;

    public C0968i(Executor executor, InterfaceC0960a<TResult> interfaceC0960a) {
        this.f5113a = executor;
        this.f5115c = interfaceC0960a;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0974o
    /* JADX INFO: renamed from: a */
    public final void mo6233a() {
        synchronized (this.f5114b) {
            this.f5115c = null;
        }
    }

    @Override // com.google.android.gms.p051b.InterfaceC0974o
    /* JADX INFO: renamed from: a */
    public final void mo6234a(AbstractC0964e<TResult> abstractC0964e) {
        synchronized (this.f5114b) {
            if (this.f5115c == null) {
                return;
            }
            this.f5113a.execute(new RunnableC0969j(this, abstractC0964e));
        }
    }
}
