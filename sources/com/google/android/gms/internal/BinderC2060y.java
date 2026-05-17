package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.y */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class BinderC2060y extends AbstractBinderC1363ai {

    /* JADX INFO: renamed from: a */
    private final WeakReference<InterfaceC1763n> f12517a;

    public BinderC2060y(InterfaceC1763n interfaceC1763n) {
        this.f12517a = new WeakReference<>(interfaceC1763n);
    }

    @Override // com.google.android.gms.internal.InterfaceC1362ah
    /* JADX INFO: renamed from: a */
    public final void mo7903a(C2087z c2087z) {
        InterfaceC1763n interfaceC1763n = this.f12517a.get();
        if (interfaceC1763n != null) {
            interfaceC1763n.mo11152a(c2087z);
        }
    }
}
