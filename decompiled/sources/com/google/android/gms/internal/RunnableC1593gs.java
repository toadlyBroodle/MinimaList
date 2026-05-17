package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.C0710au;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.gs */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1593gs implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1700kr f10705a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ Callable f10706b;

    RunnableC1593gs(C1700kr c1700kr, Callable callable) {
        this.f10705a = c1700kr;
        this.f10706b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.f10705a.m11657b(this.f10706b.call());
        } catch (Exception e) {
            C0710au.m5573i().m11292a(e, "AdThreadPool.submit");
            this.f10705a.m11656a(e);
        }
    }
}
