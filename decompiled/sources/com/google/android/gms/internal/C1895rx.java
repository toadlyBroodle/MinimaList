package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: renamed from: com.google.android.gms.internal.rx */
/* JADX INFO: loaded from: classes.dex */
final class C1895rx {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1300d f11497a;

    /* JADX INFO: renamed from: b */
    private long f11498b;

    public C1895rx(InterfaceC1300d interfaceC1300d) {
        C1221aj.m7065a(interfaceC1300d);
        this.f11497a = interfaceC1300d;
    }

    public C1895rx(InterfaceC1300d interfaceC1300d, long j) {
        C1221aj.m7065a(interfaceC1300d);
        this.f11497a = interfaceC1300d;
        this.f11498b = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m12279a() {
        this.f11498b = this.f11497a.mo7253b();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12280a(long j) {
        return this.f11498b == 0 || this.f11497a.mo7253b() - this.f11498b > j;
    }

    /* JADX INFO: renamed from: b */
    public final void m12281b() {
        this.f11498b = 0L;
    }
}
