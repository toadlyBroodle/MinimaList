package com.google.android.gms.internal;

import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: renamed from: com.google.android.gms.internal.vt */
/* JADX INFO: loaded from: classes.dex */
public final class C1999vt {

    /* JADX INFO: renamed from: b */
    private long f11825b;

    /* JADX INFO: renamed from: c */
    private long f11826c = -1;

    /* JADX INFO: renamed from: d */
    private long f11827d = 0;

    /* JADX INFO: renamed from: e */
    private InterfaceC1998vs f11828e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1300d f11829f;

    /* JADX INFO: renamed from: g */
    private static final C1992vm f11824g = new C1992vm("RequestTracker");

    /* JADX INFO: renamed from: a */
    public static final Object f11823a = new Object();

    public C1999vt(InterfaceC1300d interfaceC1300d, long j) {
        this.f11829f = interfaceC1300d;
        this.f11825b = j;
    }

    /* JADX INFO: renamed from: c */
    private final void m12468c() {
        this.f11826c = -1L;
        this.f11828e = null;
        this.f11827d = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m12469a() {
        synchronized (f11823a) {
            if (this.f11826c != -1) {
                m12468c();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12470a(long j, InterfaceC1998vs interfaceC1998vs) {
        InterfaceC1998vs interfaceC1998vs2;
        long j2;
        synchronized (f11823a) {
            interfaceC1998vs2 = this.f11828e;
            j2 = this.f11826c;
            this.f11826c = j;
            this.f11828e = interfaceC1998vs;
            this.f11827d = this.f11829f.mo7253b();
        }
        if (interfaceC1998vs2 != null) {
            interfaceC1998vs2.mo6512a(j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12471a(long j) {
        boolean z;
        synchronized (f11823a) {
            z = this.f11826c != -1 && this.f11826c == j;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12472a(long j, int i) {
        InterfaceC1998vs interfaceC1998vs;
        boolean z = true;
        long j2 = 0;
        synchronized (f11823a) {
            if (this.f11826c == -1 || j - this.f11827d < this.f11825b) {
                z = false;
                interfaceC1998vs = null;
            } else {
                f11824g.m12445a("request %d timed out", Long.valueOf(this.f11826c));
                j2 = this.f11826c;
                interfaceC1998vs = this.f11828e;
                m12468c();
            }
        }
        if (interfaceC1998vs != null) {
            interfaceC1998vs.mo6513a(j2, i, null);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12473a(long j, int i, Object obj) {
        boolean z = true;
        InterfaceC1998vs interfaceC1998vs = null;
        synchronized (f11823a) {
            if (this.f11826c == -1 || this.f11826c != j) {
                z = false;
            } else {
                f11824g.m12445a("request %d completed", Long.valueOf(this.f11826c));
                interfaceC1998vs = this.f11828e;
                m12468c();
            }
        }
        if (interfaceC1998vs != null) {
            interfaceC1998vs.mo6513a(j, i, obj);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12474b() {
        boolean z;
        synchronized (f11823a) {
            z = this.f11826c != -1;
        }
        return z;
    }
}
