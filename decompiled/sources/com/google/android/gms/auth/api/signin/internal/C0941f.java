package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.f */
/* JADX INFO: loaded from: classes.dex */
final class C0941f extends AbstractC0945j<Status> {
    C0941f(AbstractC1079f abstractC1079f) {
        super(abstractC1079f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ InterfaceC1193k mo6177a(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1155cp
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ void mo6178a(C1074a.c cVar) {
        C0939d c0939d = (C0939d) cVar;
        ((InterfaceC0954s) c0939d.m7131w()).mo6190a(new BinderC0942g(this), c0939d.m6170e());
    }
}
