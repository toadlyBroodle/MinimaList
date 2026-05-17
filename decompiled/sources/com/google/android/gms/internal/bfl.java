package com.google.android.gms.internal;

import com.google.firebase.database.C2225a;
import com.google.firebase.database.C2226b;

/* JADX INFO: loaded from: classes.dex */
final class bfl implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfz f8024a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2226b f8025b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2225a f8026c;

    bfl(bfd bfdVar, bfz bfzVar, C2226b c2226b, C2225a c2225a) {
        this.f8024a = bfzVar;
        this.f8025b = c2226b;
        this.f8026c = c2225a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8024a.f8055b.m13016a(this.f8025b, false, this.f8026c);
    }
}
