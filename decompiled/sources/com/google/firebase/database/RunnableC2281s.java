package com.google.firebase.database;

import com.google.android.gms.internal.bex;

/* JADX INFO: renamed from: com.google.firebase.database.s */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2281s implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bex f12964a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2273k f12965b;

    RunnableC2281s(C2273k c2273k, bex bexVar) {
        this.f12965b = c2273k;
        this.f12964a = bexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12965b.f12951a.m9204b(this.f12964a);
    }
}
