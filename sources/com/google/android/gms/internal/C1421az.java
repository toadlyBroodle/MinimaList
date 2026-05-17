package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.az */
/* JADX INFO: loaded from: classes.dex */
public final class C1421az implements InterfaceC0748aa<Object> {
    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String strValueOf = String.valueOf(map.get("errors"));
        C1560fm.m11615e(strValueOf.length() != 0 ? "Invalid request: ".concat(strValueOf) : new String("Invalid request: "));
        C1377ar.f7117f.m5678b(str);
    }
}
