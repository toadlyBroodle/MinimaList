package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;

/* JADX INFO: loaded from: classes.dex */
final class bfr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfz f8036a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2226b f8037b;

    bfr(bfd bfdVar, bfz bfzVar, C2226b c2226b) {
        this.f8036a = bfzVar;
        this.f8037b = c2226b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8036a.f8055b.m13016a(this.f8037b, false, null);
    }
}
