package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.qu */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1865qu {

    /* JADX INFO: renamed from: b */
    private static volatile Handler f11390b;

    /* JADX INFO: renamed from: a */
    private final C1834pq f11391a;

    /* JADX INFO: renamed from: c */
    private final Runnable f11392c;

    /* JADX INFO: renamed from: d */
    private volatile long f11393d;

    AbstractC1865qu(C1834pq c1834pq) {
        C1221aj.m7065a(c1834pq);
        this.f11391a = c1834pq;
        this.f11392c = new RunnableC1866qv(this);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ long m12182a(AbstractC1865qu abstractC1865qu, long j) {
        abstractC1865qu.f11393d = 0L;
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    private final Handler m12184e() {
        Handler handler;
        if (f11390b != null) {
            return f11390b;
        }
        synchronized (AbstractC1865qu.class) {
            if (f11390b == null) {
                f11390b = new Handler(this.f11391a.m12056a().getMainLooper());
            }
            handler = f11390b;
        }
        return handler;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12094a();

    /* JADX INFO: renamed from: a */
    public final void m12185a(long j) {
        m12189d();
        if (j >= 0) {
            this.f11393d = this.f11391a.m12058c().mo7252a();
            if (m12184e().postDelayed(this.f11392c, j)) {
                return;
            }
            this.f11391a.m12060e().m12034e("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m12186b() {
        if (this.f11393d == 0) {
            return 0L;
        }
        return Math.abs(this.f11391a.m12058c().mo7252a() - this.f11393d);
    }

    /* JADX INFO: renamed from: b */
    public final void m12187b(long j) {
        if (m12188c()) {
            if (j < 0) {
                m12189d();
                return;
            }
            long jAbs = j - Math.abs(this.f11391a.m12058c().mo7252a() - this.f11393d);
            long j2 = jAbs >= 0 ? jAbs : 0L;
            m12184e().removeCallbacks(this.f11392c);
            if (m12184e().postDelayed(this.f11392c, j2)) {
                return;
            }
            this.f11391a.m12060e().m12034e("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12188c() {
        return this.f11393d != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m12189d() {
        this.f11393d = 0L;
        m12184e().removeCallbacks(this.f11392c);
    }
}
