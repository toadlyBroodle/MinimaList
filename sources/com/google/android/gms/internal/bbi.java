package com.google.android.gms.internal;

import com.google.firebase.p053a.C2151d;

/* JADX INFO: loaded from: classes.dex */
final class bbi implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C2151d f7730a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bbh f7731b;

    bbi(bbh bbhVar, C2151d c2151d) {
        this.f7731b = bbhVar;
        this.f7730a = c2151d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7731b.f7728a.mo9093a(this.f7730a.m12827a());
    }
}
