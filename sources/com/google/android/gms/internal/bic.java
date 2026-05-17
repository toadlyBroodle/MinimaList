package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bic implements bhz {

    /* JADX INFO: renamed from: b */
    private long f8207b;

    public bic(long j) {
        this.f8207b = j;
    }

    @Override // com.google.android.gms.internal.bhz
    /* JADX INFO: renamed from: a */
    public final float mo9356a() {
        return 0.2f;
    }

    @Override // com.google.android.gms.internal.bhz
    /* JADX INFO: renamed from: a */
    public final boolean mo9357a(long j) {
        return j > 1000;
    }

    @Override // com.google.android.gms.internal.bhz
    /* JADX INFO: renamed from: a */
    public final boolean mo9358a(long j, long j2) {
        return j > this.f8207b || j2 > 1000;
    }

    @Override // com.google.android.gms.internal.bhz
    /* JADX INFO: renamed from: b */
    public final long mo9359b() {
        return 1000L;
    }
}
