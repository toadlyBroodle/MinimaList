package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bog {

    /* JADX INFO: renamed from: a */
    private final bon f8520a;

    /* JADX INFO: renamed from: b */
    private final byte[] f8521b;

    private bog(int i) {
        this.f8521b = new byte[i];
        this.f8520a = bon.m9808a(this.f8521b);
    }

    /* synthetic */ bog(int i, boc bocVar) {
        this(i);
    }

    /* JADX INFO: renamed from: a */
    public final bob m9776a() {
        this.f8520a.m9857b();
        return new boi(this.f8521b);
    }

    /* JADX INFO: renamed from: b */
    public final bon m9777b() {
        return this.f8520a;
    }
}
