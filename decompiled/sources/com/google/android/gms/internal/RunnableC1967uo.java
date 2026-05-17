package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.uo */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1967uo implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC1965um f11673a;

    private RunnableC1967uo(AbstractC1965um abstractC1965um) {
        this.f11673a = abstractC1965um;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11673a.f11669b = false;
        this.f11673a.m12368a(this.f11673a.mo12369a(this.f11673a.f11668a.mo7253b()));
    }
}
