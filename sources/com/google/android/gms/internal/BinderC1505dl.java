package com.google.android.gms.internal;

import com.google.android.gms.p043a.BinderC0654c;
import com.google.android.gms.p043a.InterfaceC0652a;

/* JADX INFO: renamed from: com.google.android.gms.internal.dl */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC1505dl extends AbstractBinderC1512ds {

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC1503dj f10455a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC1506dm f10456b;

    /* JADX INFO: renamed from: c */
    private volatile InterfaceC1504dk f10457c;

    public BinderC1505dl(InterfaceC1504dk interfaceC1504dk) {
        this.f10457c = interfaceC1504dk;
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: a */
    public final void mo11184a(InterfaceC0652a interfaceC0652a) {
        if (this.f10455a != null) {
            this.f10455a.mo11167g();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: a */
    public final void mo11185a(InterfaceC0652a interfaceC0652a, int i) {
        if (this.f10455a != null) {
            this.f10455a.mo11162a(i);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: a */
    public final void mo11186a(InterfaceC0652a interfaceC0652a, C1515dv c1515dv) {
        if (this.f10457c != null) {
            this.f10457c.mo11017a(c1515dv);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11187a(InterfaceC1503dj interfaceC1503dj) {
        this.f10455a = interfaceC1503dj;
    }

    /* JADX INFO: renamed from: a */
    public final void m11188a(InterfaceC1506dm interfaceC1506dm) {
        this.f10456b = interfaceC1506dm;
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: b */
    public final void mo11189b(InterfaceC0652a interfaceC0652a) {
        if (this.f10456b != null) {
            this.f10456b.mo11163a(BinderC0654c.m5330a(interfaceC0652a).getClass().getName());
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: b */
    public final void mo11190b(InterfaceC0652a interfaceC0652a, int i) {
        if (this.f10456b != null) {
            this.f10456b.mo11164a(BinderC0654c.m5330a(interfaceC0652a).getClass().getName(), i);
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: c */
    public final void mo11191c(InterfaceC0652a interfaceC0652a) {
        if (this.f10457c != null) {
            this.f10457c.mo11010H();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: d */
    public final void mo11192d(InterfaceC0652a interfaceC0652a) {
        if (this.f10457c != null) {
            this.f10457c.mo11011I();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: e */
    public final void mo11193e(InterfaceC0652a interfaceC0652a) {
        if (this.f10457c != null) {
            this.f10457c.mo11012J();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: f */
    public final void mo11194f(InterfaceC0652a interfaceC0652a) {
        if (this.f10457c != null) {
            this.f10457c.mo11013K();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC1511dr
    /* JADX INFO: renamed from: g */
    public final void mo11195g(InterfaceC0652a interfaceC0652a) {
        if (this.f10457c != null) {
            this.f10457c.mo11014L();
        }
    }
}
