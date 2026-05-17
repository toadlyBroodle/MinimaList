package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.nq */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1780nq implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f11194a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC1779np f11195b;

    RunnableC1780nq(BinderC1779np binderC1779np, Map map) {
        this.f11195b = binderC1779np;
        this.f11194a = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11195b.f11180a.m11751a("pubVideoCmd", this.f11194a);
    }
}
