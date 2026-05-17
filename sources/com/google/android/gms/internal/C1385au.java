package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.p048js.InterfaceC0805k;

/* JADX INFO: renamed from: com.google.android.gms.internal.au */
/* JADX INFO: loaded from: classes.dex */
final class C1385au implements InterfaceC1705kw<InterfaceC0805k> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ RunnableC1380at f7275a;

    C1385au(RunnableC1380at runnableC1380at) {
        this.f7275a = runnableC1380at;
    }

    @Override // com.google.android.gms.internal.InterfaceC1705kw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5715a(InterfaceC0805k interfaceC0805k) {
        try {
            interfaceC0805k.mo5728b("AFMA_getAdapterLessMediationAd", this.f7275a.f7234a);
        } catch (Exception e) {
            C1560fm.m11611b("Error requesting an ad url", e);
            C1377ar.f7117f.m5678b(this.f7275a.f7235b);
        }
    }
}
