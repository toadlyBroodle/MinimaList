package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: renamed from: com.google.android.gms.internal.mk */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1747mk extends AbstractC1556fi {

    /* JADX INFO: renamed from: a */
    final InterfaceC1739mc f11049a;

    /* JADX INFO: renamed from: b */
    final AbstractC1751mo f11050b;

    /* JADX INFO: renamed from: c */
    private final String f11051c;

    C1747mk(InterfaceC1739mc interfaceC1739mc, AbstractC1751mo abstractC1751mo, String str) {
        this.f11049a = interfaceC1739mc;
        this.f11050b = abstractC1751mo;
        this.f11051c = str;
        C0710au.m5588x().m11784a(this);
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: a */
    public final void mo5769a() {
        try {
            this.f11050b.mo11793a(this.f11051c);
        } finally {
            C1596gv.f10711a.post(new RunnableC1748ml(this));
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1556fi
    /* JADX INFO: renamed from: b */
    public final void mo5770b() {
        this.f11050b.mo11794b();
    }
}
