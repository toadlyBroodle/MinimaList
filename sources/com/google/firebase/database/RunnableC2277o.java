package com.google.firebase.database;

import com.google.android.gms.internal.bln;
import com.google.android.gms.internal.bnb;
import com.google.firebase.database.C2266d;

/* JADX INFO: renamed from: com.google.firebase.database.o */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2277o implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bln f12957a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bnb f12958b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2266d f12959c;

    RunnableC2277o(C2266d c2266d, bln blnVar, bnb bnbVar) {
        this.f12959c = c2266d;
        this.f12957a = blnVar;
        this.f12958b = bnbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12959c.f12951a.m9201a(this.f12959c.f12952b, this.f12957a, (C2266d.a) this.f12958b.m9688b());
    }
}
