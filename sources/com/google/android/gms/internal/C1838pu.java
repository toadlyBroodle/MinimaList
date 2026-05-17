package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.stats.C1290a;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.internal.pu */
/* JADX INFO: loaded from: classes.dex */
public final class C1838pu extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private final ServiceConnectionC1840pw f11329a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1878rg f11330b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1865qu f11331c;

    /* JADX INFO: renamed from: d */
    private final C1895rx f11332d;

    protected C1838pu(C1834pq c1834pq) {
        super(c1834pq);
        this.f11332d = new C1895rx(c1834pq.m12058c());
        this.f11329a = new ServiceConnectionC1840pw(this);
        this.f11331c = new C1839pv(this, c1834pq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m12083a(ComponentName componentName) {
        C0903r.m6076d();
        if (this.f11330b != null) {
            this.f11330b = null;
            m12020a("Disconnected from device AnalyticsService", componentName);
            m12043o().m12013e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m12086a(InterfaceC1878rg interfaceC1878rg) {
        C0903r.m6076d();
        this.f11330b = interfaceC1878rg;
        m12088e();
        m12043o().m12014f();
    }

    /* JADX INFO: renamed from: e */
    private final void m12088e() {
        this.f11332d.m12279a();
        this.f11331c.m12185a(C1872ra.f11400A.m12204a().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m12089f() {
        C0903r.m6076d();
        if (m12091b()) {
            m12023b("Inactivity, disconnecting from device AnalyticsService");
            m12093d();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12090a(C1877rf c1877rf) {
        C1221aj.m7065a(c1877rf);
        C0903r.m6076d();
        m12052y();
        InterfaceC1878rg interfaceC1878rg = this.f11330b;
        if (interfaceC1878rg == null) {
            return false;
        }
        try {
            interfaceC1878rg.mo12218a(c1877rf.m12211b(), c1877rf.m12213d(), c1877rf.m12215f() ? C1863qs.m12176h() : C1863qs.m12177i(), Collections.emptyList());
            m12088e();
            return true;
        } catch (RemoteException e) {
            m12023b("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12091b() {
        C0903r.m6076d();
        m12052y();
        return this.f11330b != null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12092c() {
        C0903r.m6076d();
        m12052y();
        if (this.f11330b != null) {
            return true;
        }
        InterfaceC1878rg interfaceC1878rgM12095a = this.f11329a.m12095a();
        if (interfaceC1878rgM12095a == null) {
            return false;
        }
        this.f11330b = interfaceC1878rgM12095a;
        m12088e();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m12093d() {
        C0903r.m6076d();
        m12052y();
        try {
            C1290a.m7240a();
            m12038j().unbindService(this.f11329a);
        } catch (IllegalArgumentException e) {
        } catch (IllegalStateException e2) {
        }
        if (this.f11330b != null) {
            this.f11330b = null;
            m12043o().m12013e();
        }
    }
}
