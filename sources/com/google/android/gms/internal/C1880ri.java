package com.google.android.gms.internal;

import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: renamed from: com.google.android.gms.internal.ri */
/* JADX INFO: loaded from: classes.dex */
public final class C1880ri {

    /* JADX INFO: renamed from: a */
    private final long f11459a;

    /* JADX INFO: renamed from: b */
    private final int f11460b;

    /* JADX INFO: renamed from: c */
    private double f11461c;

    /* JADX INFO: renamed from: d */
    private long f11462d;

    /* JADX INFO: renamed from: e */
    private final Object f11463e;

    /* JADX INFO: renamed from: f */
    private final String f11464f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC1300d f11465g;

    private C1880ri(int i, long j, String str, InterfaceC1300d interfaceC1300d) {
        this.f11463e = new Object();
        this.f11460b = 60;
        this.f11461c = this.f11460b;
        this.f11459a = 2000L;
        this.f11464f = str;
        this.f11465g = interfaceC1300d;
    }

    public C1880ri(String str, InterfaceC1300d interfaceC1300d) {
        this(60, 2000L, str, interfaceC1300d);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12219a() {
        boolean z;
        synchronized (this.f11463e) {
            long jMo7252a = this.f11465g.mo7252a();
            if (this.f11461c < this.f11460b) {
                double d = (jMo7252a - this.f11462d) / this.f11459a;
                if (d > 0.0d) {
                    this.f11461c = Math.min(this.f11460b, d + this.f11461c);
                }
            }
            this.f11462d = jMo7252a;
            if (this.f11461c >= 1.0d) {
                this.f11461c -= 1.0d;
                z = true;
            } else {
                String str = this.f11464f;
                C1881rj.m12224b(new StringBuilder(String.valueOf(str).length() + 34).append("Excessive ").append(str).append(" detected; call ignored.").toString());
                z = false;
            }
        }
        return z;
    }
}
