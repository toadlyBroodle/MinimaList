package com.google.firebase.database;

import com.google.android.gms.internal.bex;
import com.google.android.gms.internal.bfa;
import com.google.android.gms.internal.bfd;
import com.google.android.gms.internal.bhl;
import com.google.android.gms.internal.bhq;
import com.google.android.gms.internal.bjp;
import com.google.android.gms.internal.bjs;

/* JADX INFO: renamed from: com.google.firebase.database.k */
/* JADX INFO: loaded from: classes.dex */
public class C2273k {

    /* JADX INFO: renamed from: a */
    protected final bfd f12951a;

    /* JADX INFO: renamed from: b */
    protected final bfa f12952b;

    /* JADX INFO: renamed from: c */
    private bjp f12953c = bjp.f8274a;

    /* JADX INFO: renamed from: d */
    private final boolean f12954d = false;

    C2273k(bfd bfdVar, bfa bfaVar) {
        this.f12951a = bfdVar;
        this.f12952b = bfaVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m13008a(bex bexVar) {
        bhq.m9341a().m9343c(bexVar);
        this.f12951a.m9203a(new RunnableC2280r(this, bexVar));
    }

    /* JADX INFO: renamed from: b */
    private final void m13009b(bex bexVar) {
        bhq.m9341a().m9342b(bexVar);
        this.f12951a.m9203a(new RunnableC2281s(this, bexVar));
    }

    /* JADX INFO: renamed from: a */
    public void m13010a(InterfaceC2276n interfaceC2276n) {
        m13009b(new bhl(this.f12951a, new C2279q(this, interfaceC2276n), m13013f()));
    }

    /* JADX INFO: renamed from: b */
    public void m13011b(InterfaceC2276n interfaceC2276n) {
        if (interfaceC2276n == null) {
            throw new NullPointerException("listener must not be null");
        }
        m13008a(new bhl(this.f12951a, interfaceC2276n, m13013f()));
    }

    /* JADX INFO: renamed from: e */
    public final bfa m13012e() {
        return this.f12952b;
    }

    /* JADX INFO: renamed from: f */
    public final bjs m13013f() {
        return new bjs(this.f12952b, this.f12953c);
    }
}
