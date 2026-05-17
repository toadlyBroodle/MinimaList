package com.google.firebase.database;

import com.google.android.gms.internal.bex;

/* JADX INFO: renamed from: com.google.firebase.database.r */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2280r implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bex f12962a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2273k f12963b;

    RunnableC2280r(C2273k c2273k, bex bexVar) {
        this.f12963b = c2273k;
        this.f12962a = bexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12963b.f12951a.m9200a(this.f12962a);
    }
}
