package com.google.android.gms.internal;

import com.google.firebase.database.C2225a;

/* JADX INFO: loaded from: classes.dex */
final class bfi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfz f8019a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2225a f8020b;

    bfi(bfh bfhVar, bfz bfzVar, C2225a c2225a) {
        this.f8019a = bfzVar;
        this.f8020b = c2225a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8019a.f8055b.m13016a(null, true, this.f8020b);
    }
}
