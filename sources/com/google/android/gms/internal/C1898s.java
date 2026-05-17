package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.s */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1898s extends AbstractC1817p {

    /* JADX INFO: renamed from: a */
    private final Context f11501a;

    public C1898s(Context context, InterfaceC1702kt<C1979v> interfaceC1702kt, InterfaceC1763n interfaceC1763n) {
        super(interfaceC1702kt, interfaceC1763n);
        this.f11501a = context;
    }

    @Override // com.google.android.gms.internal.AbstractC1817p
    /* JADX INFO: renamed from: a */
    public final void mo11976a() {
    }

    @Override // com.google.android.gms.internal.AbstractC1817p
    /* JADX INFO: renamed from: b */
    public final InterfaceC1359ae mo11978b() {
        return BinderC1428bf.m9142a(this.f11501a, C1427be.m9067a(this.f11501a));
    }
}
