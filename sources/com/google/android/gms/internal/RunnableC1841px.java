package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.px */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1841px implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1878rg f11337a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ ServiceConnectionC1840pw f11338b;

    RunnableC1841px(ServiceConnectionC1840pw serviceConnectionC1840pw, InterfaceC1878rg interfaceC1878rg) {
        this.f11338b = serviceConnectionC1840pw;
        this.f11337a = interfaceC1878rg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11338b.f11334a.m12091b()) {
            return;
        }
        this.f11338b.f11334a.m12027c("Connected to service after a timeout");
        this.f11338b.f11334a.m12086a(this.f11337a);
    }
}
