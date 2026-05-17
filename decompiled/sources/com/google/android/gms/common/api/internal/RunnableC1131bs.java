package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.agd;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.bs */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1131bs implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ agd f5676a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ BinderC1129bq f5677b;

    RunnableC1131bs(BinderC1129bq binderC1129bq, agd agdVar) {
        this.f5677b = binderC1129bq;
        this.f5676a = agdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5677b.m6896b(this.f5676a);
    }
}
