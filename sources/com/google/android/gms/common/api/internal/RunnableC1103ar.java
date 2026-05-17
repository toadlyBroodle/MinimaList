package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ar */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1103ar implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1071a f5607a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1100ao f5608b;

    RunnableC1103ar(C1100ao c1100ao, C1071a c1071a) {
        this.f5608b = c1100ao;
        this.f5607a = c1071a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5608b.mo4766a(this.f5607a);
    }
}
