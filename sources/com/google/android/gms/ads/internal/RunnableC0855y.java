package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1596gv;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.y */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0855y implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f4865a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC0854x f4866b;

    RunnableC0855y(BinderC0854x binderC0854x, Runnable runnable) {
        this.f4866b = binderC0854x;
        this.f4865a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0710au.m5569e();
        C1596gv.m11394a(new RunnableC0856z(this));
    }
}
