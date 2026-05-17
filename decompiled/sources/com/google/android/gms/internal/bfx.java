package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2266d;

/* JADX INFO: loaded from: classes.dex */
final class bfx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2266d.a f8047a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ C2226b f8048b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2266d f8049c;

    bfx(bfd bfdVar, C2266d.a aVar, C2226b c2226b, C2266d c2266d) {
        this.f8047a = aVar;
        this.f8048b = c2226b;
        this.f8049c = c2266d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8047a.mo9701a(this.f8048b, this.f8049c);
    }
}
