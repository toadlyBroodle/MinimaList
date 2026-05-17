package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class clt implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cbu f10313a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ clr f10314b;

    clt(clr clrVar, cbu cbuVar) {
        this.f10314b = clrVar;
        this.f10313a = cbuVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        this.f10314b.m11098a(this.f10313a, map.get("asset"));
    }
}
