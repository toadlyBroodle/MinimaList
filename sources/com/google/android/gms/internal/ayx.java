package com.google.android.gms.internal;

import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.p051b.C0965f;
import com.google.firebase.auth.C2204r;

/* JADX INFO: loaded from: classes.dex */
final class ayx<ResultT, CallbackT> extends ayt<azc, ResultT> implements azn<ResultT> {

    /* JADX INFO: renamed from: a */
    private final String f7597a;

    /* JADX INFO: renamed from: b */
    private azo<ResultT, CallbackT> f7598b;

    /* JADX INFO: renamed from: c */
    private C0965f<ResultT> f7599c;

    public ayx(azo<ResultT, CallbackT> azoVar, String str) {
        this.f7598b = azoVar;
        this.f7598b.f7620h = this;
        this.f7597a = str;
    }

    @Override // com.google.android.gms.internal.ayt
    /* JADX INFO: renamed from: a */
    final String mo8699a() {
        return this.f7597a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1137by
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ void mo6905a(C1074a.c cVar, C0965f c0965f) {
        this.f7599c = c0965f;
        azo<ResultT, CallbackT> azoVar = this.f7598b;
        azoVar.f7617e = ((azc) cVar).mo8711e();
        azoVar.mo8708a();
    }

    @Override // com.google.android.gms.internal.azn
    /* JADX INFO: renamed from: a */
    public final void mo8710a(ResultT resultt, Status status) {
        C1221aj.m7066a(this.f7599c, "doExecute must be called before onComplete");
        if (status == null) {
            this.f7599c.m6219a(resultt);
        } else if (this.f7598b.f7630r == null) {
            this.f7599c.m6218a(aze.m8713a(status));
        } else {
            this.f7599c.m6218a(aze.m8712a(status, (C2204r) this.f7598b.f7630r.clone()));
            this.f7598b.f7630r = null;
        }
    }
}
