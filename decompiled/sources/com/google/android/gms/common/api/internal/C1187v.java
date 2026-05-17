package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.agd;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v */
/* JADX INFO: loaded from: classes.dex */
final class C1187v extends AbstractC1095aj {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1179n f5814a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ agd f5815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1187v(BinderC1186u binderC1186u, InterfaceC1093ah interfaceC1093ah, C1179n c1179n, agd agdVar) {
        super(interfaceC1093ah);
        this.f5814a = c1179n;
        this.f5815b = agdVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1095aj
    /* JADX INFO: renamed from: a */
    public final void mo6776a() {
        this.f5814a.m6997a(this.f5815b);
    }
}
