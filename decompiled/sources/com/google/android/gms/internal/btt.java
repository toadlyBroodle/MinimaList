package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.p048js.InterfaceC0805k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class btt implements InterfaceC1705kw<InterfaceC0805k> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ JSONObject f8989a;

    btt(btq btqVar, JSONObject jSONObject) {
        this.f8989a = jSONObject;
    }

    @Override // com.google.android.gms.internal.InterfaceC1705kw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5715a(InterfaceC0805k interfaceC0805k) {
        interfaceC0805k.mo5728b("AFMA_updateActiveView", this.f8989a);
    }
}
