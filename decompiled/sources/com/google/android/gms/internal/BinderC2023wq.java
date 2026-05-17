package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1156cq;

/* JADX INFO: renamed from: com.google.android.gms.internal.wq */
/* JADX INFO: loaded from: classes.dex */
final class BinderC2023wq extends BinderC2017wk {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1156cq<Status> f11900a;

    public BinderC2023wq(InterfaceC1156cq<Status> interfaceC1156cq) {
        this.f11900a = interfaceC1156cq;
    }

    @Override // com.google.android.gms.internal.BinderC2017wk, com.google.android.gms.internal.InterfaceC2028wv
    /* JADX INFO: renamed from: a */
    public final void mo12540a(int i) {
        this.f11900a.mo6179a(new Status(i));
    }
}
