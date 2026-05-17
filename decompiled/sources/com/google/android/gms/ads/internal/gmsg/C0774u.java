package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.C1560fm;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.u */
/* JADX INFO: loaded from: classes.dex */
final class C0774u implements InterfaceC0748aa<Object> {
    C0774u() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        String strValueOf = String.valueOf(map.get("string"));
        C1560fm.m11614d(strValueOf.length() != 0 ? "Received log message: ".concat(strValueOf) : new String("Received log message: "));
    }
}
