package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.pf */
/* JADX INFO: loaded from: classes.dex */
public final class C1823pf extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private final C1847qc f11287a;

    public C1823pf(C1834pq c1834pq, C1836ps c1836ps) {
        super(c1834pq);
        C1221aj.m7065a(c1836ps);
        this.f11287a = new C1847qc(c1834pq, c1836ps);
    }

    /* JADX INFO: renamed from: a */
    public final long m12005a(C1837pt c1837pt) {
        m12052y();
        C1221aj.m7065a(c1837pt);
        C0903r.m6076d();
        long jM12136a = this.f11287a.m12136a(c1837pt, true);
        if (jM12136a == 0) {
            this.f11287a.m12138a(c1837pt);
        }
        return jM12136a;
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        this.f11287a.m12053z();
    }

    /* JADX INFO: renamed from: a */
    public final void m12006a(int i) {
        m12052y();
        m12024b("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        m12041m().m6080a(new RunnableC1824pg(this, i));
    }

    /* JADX INFO: renamed from: a */
    public final void m12007a(InterfaceC1869qy interfaceC1869qy) {
        m12052y();
        m12041m().m6080a(new RunnableC1828pk(this, interfaceC1869qy));
    }

    /* JADX INFO: renamed from: a */
    public final void m12008a(C1877rf c1877rf) {
        C1221aj.m7065a(c1877rf);
        m12052y();
        m12024b("Hit delivery requested", c1877rf);
        m12041m().m6080a(new RunnableC1827pj(this, c1877rf));
    }

    /* JADX INFO: renamed from: a */
    public final void m12009a(String str, Runnable runnable) {
        C1221aj.m7068a(str, (Object) "campaign param can't be empty");
        m12041m().m6080a(new RunnableC1826pi(this, str, runnable));
    }

    /* JADX INFO: renamed from: b */
    public final void m12010b() {
        this.f11287a.m12142b();
    }

    /* JADX INFO: renamed from: c */
    public final void m12011c() {
        m12052y();
        Context contextM12038j = m12038j();
        if (!C1890rs.m12270a(contextM12038j) || !C1891rt.m12273a(contextM12038j)) {
            m12007a((InterfaceC1869qy) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(contextM12038j, "com.google.android.gms.analytics.AnalyticsService"));
        contextM12038j.startService(intent);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12012d() {
        m12052y();
        try {
            m12041m().m6078a(new CallableC1829pl(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            m12031d("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            m12034e("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            m12031d("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12013e() {
        m12052y();
        C0903r.m6076d();
        C1847qc c1847qc = this.f11287a;
        C0903r.m6076d();
        c1847qc.m12052y();
        c1847qc.m12023b("Service disconnected");
    }

    /* JADX INFO: renamed from: f */
    final void m12014f() {
        C0903r.m6076d();
        this.f11287a.m12145e();
    }

    /* JADX INFO: renamed from: g */
    final void m12015g() {
        C0903r.m6076d();
        this.f11287a.m12144d();
    }
}
