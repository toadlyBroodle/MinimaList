package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: loaded from: classes.dex */
final class aee {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1300d f6482a;

    /* JADX INFO: renamed from: b */
    private long f6483b;

    public aee(InterfaceC1300d interfaceC1300d) {
        C1221aj.m7065a(interfaceC1300d);
        this.f6482a = interfaceC1300d;
    }

    /* JADX INFO: renamed from: a */
    public final void m7704a() {
        this.f6483b = this.f6482a.mo7253b();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7705a(long j) {
        return this.f6483b == 0 || this.f6482a.mo7253b() - this.f6483b >= 3600000;
    }

    /* JADX INFO: renamed from: b */
    public final void m7706b() {
        this.f6483b = 0L;
    }
}
