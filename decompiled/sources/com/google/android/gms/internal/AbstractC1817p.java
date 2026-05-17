package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.p */
/* JADX INFO: loaded from: classes.dex */
@cnb
public abstract class AbstractC1817p implements InterfaceC1616ho<Void>, InterfaceC1763n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1702kt<C1979v> f11256a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1763n f11257b;

    /* JADX INFO: renamed from: c */
    private final Object f11258c = new Object();

    public AbstractC1817p(InterfaceC1702kt<C1979v> interfaceC1702kt, InterfaceC1763n interfaceC1763n) {
        this.f11256a = interfaceC1702kt;
        this.f11257b = interfaceC1763n;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11976a();

    @Override // com.google.android.gms.internal.InterfaceC1763n
    /* JADX INFO: renamed from: a */
    public final void mo11152a(C2087z c2087z) {
        synchronized (this.f11258c) {
            this.f11257b.mo11152a(c2087z);
            mo11976a();
        }
    }

    /* JADX INFO: renamed from: a */
    final boolean m11977a(InterfaceC1359ae interfaceC1359ae, C1979v c1979v) {
        try {
            interfaceC1359ae.mo7703a(c1979v, new BinderC2060y(this));
            return true;
        } catch (Throwable th) {
            C1560fm.m11613c("Could not fetch ad response from ad request service due to an Exception.", th);
            C0710au.m5573i().m11292a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f11257b.mo11152a(new C2087z(0));
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC1359ae mo11978b();

    @Override // com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: c */
    public final void mo11075c() {
        mo11976a();
    }

    @Override // com.google.android.gms.internal.InterfaceC1616ho
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Void mo11076d() {
        InterfaceC1359ae interfaceC1359aeMo11978b = mo11978b();
        if (interfaceC1359aeMo11978b == null) {
            this.f11257b.mo11152a(new C2087z(0));
            mo11976a();
        } else {
            this.f11256a.mo11659a(new C1844q(this, interfaceC1359aeMo11978b), new C1871r(this));
        }
        return null;
    }
}
