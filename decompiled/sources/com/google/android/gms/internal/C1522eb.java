package com.google.android.gms.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.eb */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1522eb implements InterfaceC1529ei {

    /* JADX INFO: renamed from: a */
    private InterfaceC1530ej f10493a;

    public C1522eb(InterfaceC1530ej interfaceC1530ej) {
        this.f10493a = interfaceC1530ej;
    }

    @Override // com.google.android.gms.internal.InterfaceC1529ei
    /* JADX INFO: renamed from: a */
    public final InterfaceC1528eh mo11216a(Context context, C1670jo c1670jo, C2087z c2087z) {
        if (c2087z.f12599K == null) {
            return null;
        }
        return new C1517dx(context, c1670jo, c2087z.f12599K, c2087z.f12609a, this.f10493a);
    }
}
