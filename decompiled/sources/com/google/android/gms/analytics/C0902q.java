package com.google.android.gms.analytics;

import com.google.android.gms.analytics.C0902q;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.analytics.q */
/* JADX INFO: loaded from: classes.dex */
public class C0902q<T extends C0902q> {

    /* JADX INFO: renamed from: a */
    protected final C0900o f4964a;

    /* JADX INFO: renamed from: b */
    private final C0903r f4965b;

    /* JADX INFO: renamed from: c */
    private final List<Object> f4966c;

    protected C0902q(C0903r c0903r, InterfaceC1300d interfaceC1300d) {
        C1221aj.m7065a(c0903r);
        this.f4965b = c0903r;
        this.f4966c = new ArrayList();
        C0900o c0900o = new C0900o(this, interfaceC1300d);
        c0900o.m6064j();
        this.f4964a = c0900o;
    }

    /* JADX INFO: renamed from: a */
    protected void mo6024a(C0900o c0900o) {
    }

    /* JADX INFO: renamed from: b */
    protected final void m6069b(C0900o c0900o) {
        Iterator<Object> it = this.f4966c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: renamed from: h */
    public C0900o mo6028h() {
        C0900o c0900oM6051a = this.f4964a.m6051a();
        m6069b(c0900oM6051a);
        return c0900oM6051a;
    }

    /* JADX INFO: renamed from: i */
    protected final C0903r m6070i() {
        return this.f4965b;
    }
}
