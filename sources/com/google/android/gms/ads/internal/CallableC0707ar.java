package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.afj;
import com.google.android.gms.internal.afk;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ar */
/* JADX INFO: loaded from: classes.dex */
final class CallableC0707ar implements Callable<afk> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BinderC0704ao f4461a;

    CallableC0707ar(BinderC0704ao binderC0704ao) {
        this.f4461a = binderC0704ao;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ afk call() {
        return new afk(afj.m7805a(this.f4461a.f4450a.f10855a, this.f4461a.f4453d, false));
    }
}
