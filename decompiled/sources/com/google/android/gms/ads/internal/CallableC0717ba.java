package com.google.android.gms.ads.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ba */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0717ba implements Callable<String> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractBinderC0714ay f4550a;

    CallableC0717ba(AbstractBinderC0714ay abstractBinderC0714ay) {
        this.f4550a = abstractBinderC0714ay;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f4550a.f4405e.f4518d.m7810a().mo5656a(this.f4550a.f4405e.f4517c);
    }
}
