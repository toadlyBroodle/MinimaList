package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: com.google.android.gms.internal.ig */
/* JADX INFO: loaded from: classes.dex */
final class C1635ig<T> implements InterfaceC1673jr<Throwable, T> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1640il f10782a;

    C1635ig(C1633ie c1633ie, InterfaceC1640il interfaceC1640il) {
        this.f10782a = interfaceC1640il;
    }

    @Override // com.google.android.gms.internal.InterfaceC1673jr
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceFutureC1689kg mo5652a(Throwable th) {
        Throwable th2 = th;
        C1560fm.m11611b("Error occurred while dispatching http response in getter.", th2);
        C0710au.m5573i().m11292a(th2, "HttpGetter.deliverResponse.1");
        return C1678jw.m11618a(this.f10782a.mo11112a());
    }
}
