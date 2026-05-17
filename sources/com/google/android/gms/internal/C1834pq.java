package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.C0889d;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: renamed from: com.google.android.gms.internal.pq */
/* JADX INFO: loaded from: classes.dex */
public class C1834pq {

    /* JADX INFO: renamed from: a */
    private static volatile C1834pq f11304a;

    /* JADX INFO: renamed from: b */
    private final Context f11305b;

    /* JADX INFO: renamed from: c */
    private final Context f11306c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1300d f11307d;

    /* JADX INFO: renamed from: e */
    private final C1863qs f11308e;

    /* JADX INFO: renamed from: f */
    private final C1882rk f11309f;

    /* JADX INFO: renamed from: g */
    private final C0903r f11310g;

    /* JADX INFO: renamed from: h */
    private final C1823pf f11311h;

    /* JADX INFO: renamed from: i */
    private final C1868qx f11312i;

    /* JADX INFO: renamed from: j */
    private final C1899sa f11313j;

    /* JADX INFO: renamed from: k */
    private final C1886ro f11314k;

    /* JADX INFO: renamed from: l */
    private final C0889d f11315l;

    /* JADX INFO: renamed from: m */
    private final C1853qi f11316m;

    /* JADX INFO: renamed from: n */
    private final C1822pe f11317n;

    /* JADX INFO: renamed from: o */
    private final C1846qb f11318o;

    /* JADX INFO: renamed from: p */
    private final C1867qw f11319p;

    private C1834pq(C1836ps c1836ps) {
        Context contextM12073a = c1836ps.m12073a();
        C1221aj.m7066a(contextM12073a, "Application context can't be null");
        Context contextM12074b = c1836ps.m12074b();
        C1221aj.m7065a(contextM12074b);
        this.f11305b = contextM12073a;
        this.f11306c = contextM12074b;
        this.f11307d = C1303g.m7263d();
        this.f11308e = new C1863qs(this);
        C1882rk c1882rk = new C1882rk(this);
        c1882rk.m12053z();
        this.f11309f = c1882rk;
        C1882rk c1882rkM12060e = m12060e();
        String str = C1833pp.f11302a;
        c1882rkM12060e.m12030d(new StringBuilder(String.valueOf(str).length() + 134).append("Google Analytics ").append(str).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        C1886ro c1886ro = new C1886ro(this);
        c1886ro.m12053z();
        this.f11314k = c1886ro;
        C1899sa c1899sa = new C1899sa(this);
        c1899sa.m12053z();
        this.f11313j = c1899sa;
        C1823pf c1823pf = new C1823pf(this, c1836ps);
        C1853qi c1853qi = new C1853qi(this);
        C1822pe c1822pe = new C1822pe(this);
        C1846qb c1846qb = new C1846qb(this);
        C1867qw c1867qw = new C1867qw(this);
        C0903r c0903rM6071a = C0903r.m6071a(contextM12073a);
        c0903rM6071a.m6081a(new C1835pr(this));
        this.f11310g = c0903rM6071a;
        C0889d c0889d = new C0889d(this);
        c1853qi.m12053z();
        this.f11316m = c1853qi;
        c1822pe.m12053z();
        this.f11317n = c1822pe;
        c1846qb.m12053z();
        this.f11318o = c1846qb;
        c1867qw.m12053z();
        this.f11319p = c1867qw;
        C1868qx c1868qx = new C1868qx(this);
        c1868qx.m12053z();
        this.f11312i = c1868qx;
        c1823pf.m12053z();
        this.f11311h = c1823pf;
        c0889d.m5967a();
        this.f11315l = c0889d;
        c1823pf.m12010b();
    }

    /* JADX INFO: renamed from: a */
    public static C1834pq m12054a(Context context) {
        C1221aj.m7065a(context);
        if (f11304a == null) {
            synchronized (C1834pq.class) {
                if (f11304a == null) {
                    InterfaceC1300d interfaceC1300dM7263d = C1303g.m7263d();
                    long jMo7253b = interfaceC1300dM7263d.mo7253b();
                    C1834pq c1834pq = new C1834pq(new C1836ps(context));
                    f11304a = c1834pq;
                    C0889d.m5965c();
                    long jMo7253b2 = interfaceC1300dM7263d.mo7253b() - jMo7253b;
                    long jLongValue = C1872ra.f11404E.m12204a().longValue();
                    if (jMo7253b2 > jLongValue) {
                        c1834pq.m12060e().m12029c("Slow initialization (ms)", Long.valueOf(jMo7253b2), Long.valueOf(jLongValue));
                    }
                }
            }
        }
        return f11304a;
    }

    /* JADX INFO: renamed from: a */
    private static void m12055a(AbstractC1832po abstractC1832po) {
        C1221aj.m7066a(abstractC1832po, "Analytics service not created/initialized");
        C1221aj.m7075b(abstractC1832po.m12051x(), "Analytics service not initialized");
    }

    /* JADX INFO: renamed from: a */
    public final Context m12056a() {
        return this.f11305b;
    }

    /* JADX INFO: renamed from: b */
    public final Context m12057b() {
        return this.f11306c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1300d m12058c() {
        return this.f11307d;
    }

    /* JADX INFO: renamed from: d */
    public final C1863qs m12059d() {
        return this.f11308e;
    }

    /* JADX INFO: renamed from: e */
    public final C1882rk m12060e() {
        m12055a(this.f11309f);
        return this.f11309f;
    }

    /* JADX INFO: renamed from: f */
    public final C1882rk m12061f() {
        return this.f11309f;
    }

    /* JADX INFO: renamed from: g */
    public final C0903r m12062g() {
        C1221aj.m7065a(this.f11310g);
        return this.f11310g;
    }

    /* JADX INFO: renamed from: h */
    public final C1823pf m12063h() {
        m12055a(this.f11311h);
        return this.f11311h;
    }

    /* JADX INFO: renamed from: i */
    public final C1868qx m12064i() {
        m12055a(this.f11312i);
        return this.f11312i;
    }

    /* JADX INFO: renamed from: j */
    public final C0889d m12065j() {
        C1221aj.m7065a(this.f11315l);
        C1221aj.m7075b(this.f11315l.m5976b(), "Analytics instance not initialized");
        return this.f11315l;
    }

    /* JADX INFO: renamed from: k */
    public final C1899sa m12066k() {
        m12055a(this.f11313j);
        return this.f11313j;
    }

    /* JADX INFO: renamed from: l */
    public final C1886ro m12067l() {
        m12055a(this.f11314k);
        return this.f11314k;
    }

    /* JADX INFO: renamed from: m */
    public final C1886ro m12068m() {
        if (this.f11314k == null || !this.f11314k.m12051x()) {
            return null;
        }
        return this.f11314k;
    }

    /* JADX INFO: renamed from: n */
    public final C1822pe m12069n() {
        m12055a(this.f11317n);
        return this.f11317n;
    }

    /* JADX INFO: renamed from: o */
    public final C1853qi m12070o() {
        m12055a(this.f11316m);
        return this.f11316m;
    }

    /* JADX INFO: renamed from: p */
    public final C1846qb m12071p() {
        m12055a(this.f11318o);
        return this.f11318o;
    }

    /* JADX INFO: renamed from: q */
    public final C1867qw m12072q() {
        return this.f11319p;
    }
}
