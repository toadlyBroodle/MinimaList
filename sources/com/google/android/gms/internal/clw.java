package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
final class clw implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicInteger f10328a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ int f10329b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C1700kr f10330c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ List f10331d;

    clw(AtomicInteger atomicInteger, int i, C1700kr c1700kr, List list) {
        this.f10328a = atomicInteger;
        this.f10329b = i;
        this.f10330c = c1700kr;
        this.f10331d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10328a.incrementAndGet() >= this.f10329b) {
            try {
                this.f10330c.m11657b(clr.m11103c(this.f10331d));
            } catch (InterruptedException | ExecutionException e) {
                C1560fm.m11613c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
