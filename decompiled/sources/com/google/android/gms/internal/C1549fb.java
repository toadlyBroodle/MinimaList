package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.fb */
/* JADX INFO: loaded from: classes.dex */
final class C1549fb {

    /* JADX INFO: renamed from: a */
    private final Object f10625a;

    /* JADX INFO: renamed from: b */
    private volatile int f10626b;

    /* JADX INFO: renamed from: c */
    private volatile long f10627c;

    private C1549fb() {
        this.f10625a = new Object();
        this.f10626b = C1550fc.f10628a;
        this.f10627c = 0L;
    }

    /* JADX INFO: renamed from: a */
    private final void m11324a(int i, int i2) {
        m11325d();
        long jMo7252a = C0710au.m5575k().mo7252a();
        synchronized (this.f10625a) {
            if (this.f10626b != i) {
                return;
            }
            this.f10626b = i2;
            if (this.f10626b == C1550fc.f10630c) {
                this.f10627c = jMo7252a;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m11325d() {
        long jMo7252a = C0710au.m5575k().mo7252a();
        synchronized (this.f10625a) {
            if (this.f10626b == C1550fc.f10630c) {
                if (this.f10627c + ((Long) bxm.m10409f().m10546a(can.f9546cM)).longValue() <= jMo7252a) {
                    this.f10626b = C1550fc.f10628a;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11326a(boolean z) {
        if (z) {
            m11324a(C1550fc.f10628a, C1550fc.f10629b);
        } else {
            m11324a(C1550fc.f10629b, C1550fc.f10628a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11327a() {
        m11325d();
        return this.f10626b == C1550fc.f10629b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11328b() {
        m11325d();
        return this.f10626b == C1550fc.f10630c;
    }

    /* JADX INFO: renamed from: c */
    public final void m11329c() {
        m11324a(C1550fc.f10629b, C1550fc.f10630c);
    }
}
