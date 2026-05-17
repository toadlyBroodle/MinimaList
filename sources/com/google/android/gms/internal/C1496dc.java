package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.dc */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1496dc extends AbstractC1556fi implements InterfaceC1503dj, InterfaceC1506dm {

    /* JADX INFO: renamed from: a */
    private final C1542ev f10423a;

    /* JADX INFO: renamed from: b */
    private final Context f10424b;

    /* JADX INFO: renamed from: c */
    private final C1510dq f10425c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1506dm f10426d;

    /* JADX INFO: renamed from: f */
    private final String f10428f;

    /* JADX INFO: renamed from: g */
    private final String f10429g;

    /* JADX INFO: renamed from: h */
    private final chs f10430h;

    /* JADX INFO: renamed from: i */
    private final long f10431i;

    /* JADX INFO: renamed from: l */
    private C1500dg f10434l;

    /* JADX INFO: renamed from: j */
    private int f10432j = 0;

    /* JADX INFO: renamed from: k */
    private int f10433k = 3;

    /* JADX INFO: renamed from: e */
    private final Object f10427e = new Object();

    public C1496dc(Context context, String str, String str2, chs chsVar, C1542ev c1542ev, C1510dq c1510dq, InterfaceC1506dm interfaceC1506dm, long j) {
        this.f10424b = context;
        this.f10428f = str;
        this.f10429g = str2;
        this.f10430h = chsVar;
        this.f10423a = c1542ev;
        this.f10425c = c1510dq;
        this.f10426d = interfaceC1506dm;
        this.f10431i = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m11157a(bwx bwxVar, cim cimVar) {
        this.f10425c.m11200b().m11188a((InterfaceC1506dm) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f10428f)) {
                cimVar.mo10951a(bwxVar, this.f10429g, this.f10430h.f10015a);
            } else {
                cimVar.mo10950a(bwxVar, this.f10429g);
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Fail to load ad from adapter.", e);
            mo11164a(this.f10428f, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m11159a(long j) {
        long jMo7253b = this.f10431i - (C0710au.m5575k().mo7253b() - j);
        if (jMo7253b <= 0) {
            this.f10433k = 4;
            return false;
        }
        try {
            this.f10427e.wait(jMo7253b);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f10433k = 5;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        if (this.f10425c == null || this.f10425c.m11200b() == null || this.f10425c.m11199a() == null) {
            return;
        }
        BinderC1505dl binderC1505dlM11200b = this.f10425c.m11200b();
        binderC1505dlM11200b.m11188a((InterfaceC1506dm) null);
        binderC1505dlM11200b.m11187a((InterfaceC1503dj) this);
        bwx bwxVar = this.f10423a.f10560a.f11753c;
        cim cimVarM11199a = this.f10425c.m11199a();
        try {
            if (cimVarM11199a.mo10958g()) {
                C1657jb.f10832a.post(new RunnableC1497dd(this, bwxVar, cimVarM11199a));
            } else {
                C1657jb.f10832a.post(new RunnableC1499df(this, cimVarM11199a, bwxVar, binderC1505dlM11200b));
            }
        } catch (RemoteException e) {
            C1560fm.m11613c("Fail to check if adapter is initialized.", e);
            mo11164a(this.f10428f, 0);
        }
        long jMo7253b = C0710au.m5575k().mo7253b();
        while (true) {
            synchronized (this.f10427e) {
                if (this.f10432j != 0) {
                    this.f10434l = new C1502di().m11181a(C0710au.m5575k().mo7253b() - jMo7253b).m11180a(1 == this.f10432j ? 6 : this.f10433k).m11182a(this.f10428f).m11183b(this.f10430h.f10018d).m11179a();
                } else if (!m11159a(jMo7253b)) {
                    this.f10434l = new C1502di().m11180a(this.f10433k).m11181a(C0710au.m5575k().mo7253b() - jMo7253b).m11182a(this.f10428f).m11183b(this.f10430h.f10018d).m11179a();
                }
            }
        }
        binderC1505dlM11200b.m11188a((InterfaceC1506dm) null);
        binderC1505dlM11200b.m11187a((InterfaceC1503dj) null);
        if (this.f10432j == 1) {
            this.f10426d.mo11163a(this.f10428f);
        } else {
            this.f10426d.mo11164a(this.f10428f, this.f10433k);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1503dj
    /* JADX INFO: renamed from: a */
    public final void mo11162a(int i) {
        mo11164a(this.f10428f, 0);
    }

    @Override // com.google.android.gms.internal.InterfaceC1506dm
    /* JADX INFO: renamed from: a */
    public final void mo11163a(String str) {
        synchronized (this.f10427e) {
            this.f10432j = 1;
            this.f10427e.notify();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1506dm
    /* JADX INFO: renamed from: a */
    public final void mo11164a(String str, int i) {
        synchronized (this.f10427e) {
            this.f10432j = 2;
            this.f10433k = i;
            this.f10427e.notify();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
    }

    /* JADX INFO: renamed from: e */
    public final C1500dg m11165e() {
        C1500dg c1500dg;
        synchronized (this.f10427e) {
            c1500dg = this.f10434l;
        }
        return c1500dg;
    }

    /* JADX INFO: renamed from: f */
    public final chs m11166f() {
        return this.f10430h;
    }

    @Override // com.google.android.gms.internal.InterfaceC1503dj
    /* JADX INFO: renamed from: g */
    public final void mo11167g() {
        m11157a(this.f10423a.f10560a.f11753c, this.f10425c.m11199a());
    }
}
