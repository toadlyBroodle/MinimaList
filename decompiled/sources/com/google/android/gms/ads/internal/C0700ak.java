package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.bwx;
import com.google.android.gms.internal.cnb;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.ak */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0700ak {

    /* JADX INFO: renamed from: a */
    private final C0702am f4441a;

    /* JADX INFO: renamed from: b */
    private final Runnable f4442b;

    /* JADX INFO: renamed from: c */
    private bwx f4443c;

    /* JADX INFO: renamed from: d */
    private boolean f4444d;

    /* JADX INFO: renamed from: e */
    private boolean f4445e;

    /* JADX INFO: renamed from: f */
    private long f4446f;

    public C0700ak(AbstractBinderC0689a abstractBinderC0689a) {
        this(abstractBinderC0689a, new C0702am(C1596gv.f10711a));
    }

    private C0700ak(AbstractBinderC0689a abstractBinderC0689a, C0702am c0702am) {
        this.f4444d = false;
        this.f4445e = false;
        this.f4446f = 0L;
        this.f4441a = c0702am;
        this.f4442b = new RunnableC0701al(this, new WeakReference(abstractBinderC0689a));
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m5526a(C0700ak c0700ak, boolean z) {
        c0700ak.f4444d = false;
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m5527a() {
        this.f4444d = false;
        this.f4441a.m5534a(this.f4442b);
    }

    /* JADX INFO: renamed from: a */
    public final void m5528a(bwx bwxVar) {
        this.f4443c = bwxVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5529a(bwx bwxVar, long j) {
        if (this.f4444d) {
            C1560fm.m11615e("An ad refresh is already scheduled.");
            return;
        }
        this.f4443c = bwxVar;
        this.f4444d = true;
        this.f4446f = j;
        if (this.f4445e) {
            return;
        }
        C1560fm.m11614d(new StringBuilder(65).append("Scheduling ad refresh ").append(j).append(" milliseconds from now.").toString());
        this.f4441a.m5535a(this.f4442b, j);
    }

    /* JADX INFO: renamed from: b */
    public final void m5530b() {
        this.f4445e = true;
        if (this.f4444d) {
            this.f4441a.m5534a(this.f4442b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5531b(bwx bwxVar) {
        m5529a(bwxVar, 60000L);
    }

    /* JADX INFO: renamed from: c */
    public final void m5532c() {
        this.f4445e = false;
        if (this.f4444d) {
            this.f4444d = false;
            m5529a(this.f4443c, this.f4446f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5533d() {
        return this.f4444d;
    }
}
