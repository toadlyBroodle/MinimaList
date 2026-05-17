package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.common.util.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1303g implements InterfaceC1300d {

    /* JADX INFO: renamed from: a */
    private static C1303g f6034a = new C1303g();

    private C1303g() {
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC1300d m7263d() {
        return f6034a;
    }

    @Override // com.google.android.gms.common.util.InterfaceC1300d
    /* JADX INFO: renamed from: a */
    public final long mo7252a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1300d
    /* JADX INFO: renamed from: b */
    public final long mo7253b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.InterfaceC1300d
    /* JADX INFO: renamed from: c */
    public final long mo7254c() {
        return System.nanoTime();
    }
}
