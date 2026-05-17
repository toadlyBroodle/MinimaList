package com.google.android.gms.common.internal;

import com.google.android.gms.common.C1071a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.be */
/* JADX INFO: loaded from: classes.dex */
public final class C1243be implements InterfaceC1240bb {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AbstractC1233av f5899a;

    public C1243be(AbstractC1233av abstractC1233av) {
        this.f5899a = abstractC1233av;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1240bb
    /* JADX INFO: renamed from: a */
    public final void mo6842a(C1071a c1071a) {
        if (c1071a.m6612b()) {
            this.f5899a.m7115a((InterfaceC1268o) null, this.f5899a.mo7123o());
        } else if (this.f5899a.f5883v != null) {
            this.f5899a.f5883v.mo7138a(c1071a);
        }
    }
}
