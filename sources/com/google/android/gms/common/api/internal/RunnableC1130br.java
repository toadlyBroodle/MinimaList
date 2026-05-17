package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.br */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1130br implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ BinderC1129bq f5675a;

    RunnableC1130br(BinderC1129bq binderC1129bq) {
        this.f5675a = binderC1129bq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5675a.f5674h.mo6844b(new C1071a(4));
    }
}
