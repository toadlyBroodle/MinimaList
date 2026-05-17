package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.BinderC0829d;

/* JADX INFO: renamed from: com.google.android.gms.internal.mz */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1762mz implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1759mw f11115a;

    RunnableC1762mz(C1759mw c1759mw) {
        this.f11115a = c1759mw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11115a.f11085a.mo11803G();
        BinderC0829d binderC0829dMo11829s = this.f11115a.f11085a.mo11829s();
        if (binderC0829dMo11829s != null) {
            binderC0829dMo11829s.m5799m();
        }
        if (this.f11115a.f11094l != null) {
            this.f11115a.f11094l.mo5623a();
            C1759mw.m11839a(this.f11115a, (InterfaceC1766nc) null);
        }
    }
}
