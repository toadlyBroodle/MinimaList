package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.C0826a;
import com.google.android.gms.ads.internal.overlay.C0837l;
import com.google.android.gms.ads.internal.overlay.C0843r;
import com.google.android.gms.ads.internal.overlay.C0844s;
import com.google.android.gms.ads.internal.p048js.C0808n;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.internal.C1458bu;
import com.google.android.gms.internal.C1532el;
import com.google.android.gms.internal.C1546ez;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1603hb;
import com.google.android.gms.internal.C1608hg;
import com.google.android.gms.internal.C1609hh;
import com.google.android.gms.internal.C1611hj;
import com.google.android.gms.internal.C1612hk;
import com.google.android.gms.internal.C1613hl;
import com.google.android.gms.internal.C1614hm;
import com.google.android.gms.internal.C1615hn;
import com.google.android.gms.internal.C1623hv;
import com.google.android.gms.internal.C1644ip;
import com.google.android.gms.internal.C1645iq;
import com.google.android.gms.internal.C1652ix;
import com.google.android.gms.internal.C1701ks;
import com.google.android.gms.internal.C1708kz;
import com.google.android.gms.internal.C1749mm;
import com.google.android.gms.internal.C1769nf;
import com.google.android.gms.internal.bus;
import com.google.android.gms.internal.bvp;
import com.google.android.gms.internal.bvq;
import com.google.android.gms.internal.bwe;
import com.google.android.gms.internal.cas;
import com.google.android.gms.internal.cgq;
import com.google.android.gms.internal.cha;
import com.google.android.gms.internal.cib;
import com.google.android.gms.internal.clf;
import com.google.android.gms.internal.cnb;
import com.google.android.gms.internal.cnc;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.au */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0710au {

    /* JADX INFO: renamed from: a */
    private static final Object f4467a = new Object();

    /* JADX INFO: renamed from: b */
    private static C0710au f4468b;

    /* JADX INFO: renamed from: A */
    private final C0690aa f4469A;

    /* JADX INFO: renamed from: B */
    private final bwe f4470B;

    /* JADX INFO: renamed from: C */
    private final C1532el f4471C;

    /* JADX INFO: renamed from: D */
    private final C1749mm f4472D;

    /* JADX INFO: renamed from: E */
    private final C1708kz f4473E;

    /* JADX INFO: renamed from: F */
    private final C0808n f4474F;

    /* JADX INFO: renamed from: G */
    private final C1615hn f4475G;

    /* JADX INFO: renamed from: H */
    private final C1652ix f4476H;

    /* JADX INFO: renamed from: c */
    private final C0826a f4477c = new C0826a();

    /* JADX INFO: renamed from: d */
    private final cnc f4478d = new cnc();

    /* JADX INFO: renamed from: e */
    private final C0837l f4479e = new C0837l();

    /* JADX INFO: renamed from: f */
    private final clf f4480f = new clf();

    /* JADX INFO: renamed from: g */
    private final C1596gv f4481g = new C1596gv();

    /* JADX INFO: renamed from: h */
    private final C1769nf f4482h = new C1769nf();

    /* JADX INFO: renamed from: i */
    private final C1603hb f4483i;

    /* JADX INFO: renamed from: j */
    private final bus f4484j;

    /* JADX INFO: renamed from: k */
    private final C1546ez f4485k;

    /* JADX INFO: renamed from: l */
    private final bvp f4486l;

    /* JADX INFO: renamed from: m */
    private final bvq f4487m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC1300d f4488n;

    /* JADX INFO: renamed from: o */
    private final C0739d f4489o;

    /* JADX INFO: renamed from: p */
    private final cas f4490p;

    /* JADX INFO: renamed from: q */
    private final C1623hv f4491q;

    /* JADX INFO: renamed from: r */
    private final C1458bu f4492r;

    /* JADX INFO: renamed from: s */
    private final C1701ks f4493s;

    /* JADX INFO: renamed from: t */
    private final cgq f4494t;

    /* JADX INFO: renamed from: u */
    private final cha f4495u;

    /* JADX INFO: renamed from: v */
    private final C1644ip f4496v;

    /* JADX INFO: renamed from: w */
    private final C0843r f4497w;

    /* JADX INFO: renamed from: x */
    private final C0844s f4498x;

    /* JADX INFO: renamed from: y */
    private final cib f4499y;

    /* JADX INFO: renamed from: z */
    private final C1645iq f4500z;

    static {
        C0710au c0710au = new C0710au();
        synchronized (f4467a) {
            f4468b = c0710au;
        }
    }

    protected C0710au() {
        int i = Build.VERSION.SDK_INT;
        this.f4483i = i >= 21 ? new C1614hm() : i >= 19 ? new C1613hl() : i >= 18 ? new C1611hj() : i >= 17 ? new C1609hh() : i >= 16 ? new C1612hk() : new C1608hg();
        this.f4484j = new bus();
        this.f4485k = new C1546ez(this.f4481g);
        this.f4486l = new bvp();
        this.f4487m = new bvq();
        this.f4488n = C1303g.m7263d();
        this.f4489o = new C0739d();
        this.f4490p = new cas();
        this.f4491q = new C1623hv();
        this.f4492r = new C1458bu();
        this.f4474F = new C0808n();
        this.f4493s = new C1701ks();
        this.f4494t = new cgq();
        this.f4495u = new cha();
        this.f4496v = new C1644ip();
        this.f4497w = new C0843r();
        this.f4498x = new C0844s();
        this.f4499y = new cib();
        this.f4500z = new C1645iq();
        this.f4469A = new C0690aa();
        this.f4470B = new bwe();
        this.f4471C = new C1532el();
        this.f4472D = new C1749mm();
        this.f4473E = new C1708kz();
        this.f4475G = new C1615hn();
        this.f4476H = new C1652ix();
    }

    /* JADX INFO: renamed from: A */
    public static C0808n m5561A() {
        return m5564D().f4474F;
    }

    /* JADX INFO: renamed from: B */
    public static C1615hn m5562B() {
        return m5564D().f4475G;
    }

    /* JADX INFO: renamed from: C */
    public static C1652ix m5563C() {
        return m5564D().f4476H;
    }

    /* JADX INFO: renamed from: D */
    private static C0710au m5564D() {
        C0710au c0710au;
        synchronized (f4467a) {
            c0710au = f4468b;
        }
        return c0710au;
    }

    /* JADX INFO: renamed from: a */
    public static cnc m5565a() {
        return m5564D().f4478d;
    }

    /* JADX INFO: renamed from: b */
    public static C0826a m5566b() {
        return m5564D().f4477c;
    }

    /* JADX INFO: renamed from: c */
    public static C0837l m5567c() {
        return m5564D().f4479e;
    }

    /* JADX INFO: renamed from: d */
    public static clf m5568d() {
        return m5564D().f4480f;
    }

    /* JADX INFO: renamed from: e */
    public static C1596gv m5569e() {
        return m5564D().f4481g;
    }

    /* JADX INFO: renamed from: f */
    public static C1769nf m5570f() {
        return m5564D().f4482h;
    }

    /* JADX INFO: renamed from: g */
    public static C1603hb m5571g() {
        return m5564D().f4483i;
    }

    /* JADX INFO: renamed from: h */
    public static bus m5572h() {
        return m5564D().f4484j;
    }

    /* JADX INFO: renamed from: i */
    public static C1546ez m5573i() {
        return m5564D().f4485k;
    }

    /* JADX INFO: renamed from: j */
    public static bvq m5574j() {
        return m5564D().f4487m;
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC1300d m5575k() {
        return m5564D().f4488n;
    }

    /* JADX INFO: renamed from: l */
    public static C0739d m5576l() {
        return m5564D().f4489o;
    }

    /* JADX INFO: renamed from: m */
    public static cas m5577m() {
        return m5564D().f4490p;
    }

    /* JADX INFO: renamed from: n */
    public static C1623hv m5578n() {
        return m5564D().f4491q;
    }

    /* JADX INFO: renamed from: o */
    public static C1458bu m5579o() {
        return m5564D().f4492r;
    }

    /* JADX INFO: renamed from: p */
    public static C1701ks m5580p() {
        return m5564D().f4493s;
    }

    /* JADX INFO: renamed from: q */
    public static cgq m5581q() {
        return m5564D().f4494t;
    }

    /* JADX INFO: renamed from: r */
    public static cha m5582r() {
        return m5564D().f4495u;
    }

    /* JADX INFO: renamed from: s */
    public static C1644ip m5583s() {
        return m5564D().f4496v;
    }

    /* JADX INFO: renamed from: t */
    public static C0843r m5584t() {
        return m5564D().f4497w;
    }

    /* JADX INFO: renamed from: u */
    public static C0844s m5585u() {
        return m5564D().f4498x;
    }

    /* JADX INFO: renamed from: v */
    public static cib m5586v() {
        return m5564D().f4499y;
    }

    /* JADX INFO: renamed from: w */
    public static C1645iq m5587w() {
        return m5564D().f4500z;
    }

    /* JADX INFO: renamed from: x */
    public static C1749mm m5588x() {
        return m5564D().f4472D;
    }

    /* JADX INFO: renamed from: y */
    public static C1708kz m5589y() {
        return m5564D().f4473E;
    }

    /* JADX INFO: renamed from: z */
    public static C1532el m5590z() {
        return m5564D().f4471C;
    }
}
