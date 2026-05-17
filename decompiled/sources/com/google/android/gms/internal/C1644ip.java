package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.ip */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1644ip {

    /* JADX INFO: renamed from: a */
    private HandlerThread f10798a = null;

    /* JADX INFO: renamed from: b */
    private Handler f10799b = null;

    /* JADX INFO: renamed from: c */
    private int f10800c = 0;

    /* JADX INFO: renamed from: d */
    private final Object f10801d = new Object();

    /* JADX INFO: renamed from: a */
    public final Looper m11535a() {
        Looper looper;
        synchronized (this.f10801d) {
            if (this.f10800c != 0) {
                C1221aj.m7066a(this.f10798a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f10798a == null) {
                C1560fm.m11343a("Starting the looper thread.");
                this.f10798a = new HandlerThread("LooperProvider");
                this.f10798a.start();
                this.f10799b = new Handler(this.f10798a.getLooper());
                C1560fm.m11343a("Looper thread started.");
            } else {
                C1560fm.m11343a("Resuming the looper thread");
                this.f10801d.notifyAll();
            }
            this.f10800c++;
            looper = this.f10798a.getLooper();
        }
        return looper;
    }

    /* JADX INFO: renamed from: b */
    public final Handler m11536b() {
        return this.f10799b;
    }
}
