package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bna implements bmt {

    /* JADX INFO: renamed from: a */
    private final bmt f8456a;

    /* JADX INFO: renamed from: b */
    private long f8457b;

    public bna(bmt bmtVar, long j) {
        this.f8457b = 0L;
        this.f8456a = bmtVar;
        this.f8457b = 0L;
    }

    @Override // com.google.android.gms.internal.bmt
    /* JADX INFO: renamed from: a */
    public final long mo9681a() {
        return this.f8456a.mo9681a() + this.f8457b;
    }

    /* JADX INFO: renamed from: a */
    public final void m9686a(long j) {
        this.f8457b = j;
    }
}
