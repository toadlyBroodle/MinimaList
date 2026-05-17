package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.zh */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2095zh {

    /* JADX INFO: renamed from: b */
    private static volatile Handler f12662b;

    /* JADX INFO: renamed from: a */
    private final abd f12663a;

    /* JADX INFO: renamed from: c */
    private final Runnable f12664c;

    /* JADX INFO: renamed from: d */
    private volatile long f12665d;

    /* JADX INFO: renamed from: e */
    private boolean f12666e;

    AbstractC2095zh(abd abdVar) {
        C1221aj.m7065a(abdVar);
        this.f12663a = abdVar;
        this.f12666e = true;
        this.f12664c = new RunnableC2096zi(this);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ long m12750a(AbstractC2095zh abstractC2095zh, long j) {
        abstractC2095zh.f12665d = 0L;
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    private final Handler m12753d() {
        Handler handler;
        if (f12662b != null) {
            return f12662b;
        }
        synchronized (AbstractC2095zh.class) {
            if (f12662b == null) {
                f12662b = new Handler(this.f12663a.m7554t().getMainLooper());
            }
            handler = f12662b;
        }
        return handler;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7674a();

    /* JADX INFO: renamed from: a */
    public final void m12754a(long j) {
        m12756c();
        if (j >= 0) {
            this.f12665d = this.f12663a.m7555u().mo7252a();
            if (m12753d().postDelayed(this.f12664c, j)) {
                return;
            }
            this.f12663a.m7540f().m7410y().m7413a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12755b() {
        return this.f12665d != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m12756c() {
        this.f12665d = 0L;
        m12753d().removeCallbacks(this.f12664c);
    }
}
