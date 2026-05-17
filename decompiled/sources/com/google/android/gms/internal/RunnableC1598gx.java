package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.gx */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1598gx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Context f10722a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C1596gv f10723b;

    RunnableC1598gx(C1596gv c1596gv, Context context) {
        this.f10723b = c1596gv;
        this.f10722a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10723b.f10712b) {
            this.f10723b.f10714d = C1596gv.m11418d(this.f10722a);
            this.f10723b.f10712b.notifyAll();
        }
    }
}
