package com.google.android.gms.internal;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
final class bdn implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdf f7870a;

    bdn(bdf bdfVar) {
        this.f7870a = bdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bdf.m8987a(this.f7870a, (ScheduledFuture) null);
        if (this.f7870a.m9019m()) {
            this.f7870a.mo8972d("connection_idle");
        } else {
            this.f7870a.m9015k();
        }
    }
}
