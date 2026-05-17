package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1303g;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: loaded from: classes.dex */
public final class aod implements ajz {

    /* JADX INFO: renamed from: a */
    private InterfaceC1300d f6992a = C1303g.m7263d();

    /* JADX INFO: renamed from: a */
    public final void m8093a(InterfaceC1300d interfaceC1300d) {
        this.f6992a = (InterfaceC1300d) C1221aj.m7065a(interfaceC1300d);
    }

    @Override // com.google.android.gms.internal.ajz
    /* JADX INFO: renamed from: b */
    public final arh<?> mo8076b(aii aiiVar, arh<?>... arhVarArr) {
        C1221aj.m7074b(arhVarArr != null);
        C1221aj.m7074b(arhVarArr.length == 0);
        return new arl(Double.valueOf(this.f6992a.mo7252a()));
    }
}
