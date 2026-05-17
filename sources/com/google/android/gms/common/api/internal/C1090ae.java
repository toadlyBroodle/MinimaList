package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C0959x;
import com.google.android.gms.common.api.AbstractC1079f;
import com.google.android.gms.common.api.InterfaceC1193k;
import com.google.android.gms.common.api.InterfaceC1194l;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.ae */
/* JADX INFO: loaded from: classes.dex */
final class C1090ae implements InterfaceC1194l<Status> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1134bv f5551a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f5552b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ AbstractC1079f f5553c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ C1086aa f5554d;

    C1090ae(C1086aa c1086aa, C1134bv c1134bv, boolean z, AbstractC1079f abstractC1079f) {
        this.f5554d = c1086aa;
        this.f5551a = c1134bv;
        this.f5552b = z;
        this.f5553c = abstractC1079f;
    }

    @Override // com.google.android.gms.common.api.InterfaceC1194l
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo4791a(InterfaceC1193k interfaceC1193k) {
        Status status = (Status) interfaceC1193k;
        C0959x.m6194a(this.f5554d.f5531k).m6203c();
        if (status.m6626d() && this.f5554d.mo6684j()) {
            this.f5554d.mo6682h();
        }
        this.f5551a.m6708a(status);
        if (this.f5552b) {
            this.f5553c.mo6681g();
        }
    }
}
