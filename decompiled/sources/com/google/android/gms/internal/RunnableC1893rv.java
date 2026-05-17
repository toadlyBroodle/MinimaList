package com.google.android.gms.internal;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.rv */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1893rv implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1892ru f11496a;

    RunnableC1893rv(C1892ru c1892ru) {
        this.f11496a = c1892ru;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11496a.f11491a != null) {
            if (((InterfaceC1894rw) this.f11496a.f11494d.f11490b).mo5928a(this.f11496a.f11491a.intValue())) {
                this.f11496a.f11492b.m12023b("Local AnalyticsService processed last dispatch request");
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.f11496a.f11492b.m12023b("AnalyticsJobService processed last dispatch request");
            ((InterfaceC1894rw) this.f11496a.f11494d.f11490b).mo5927a(this.f11496a.f11493c, false);
        }
    }
}
