package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.bn */
/* JADX INFO: loaded from: classes.dex */
final class C1437bn implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1435bl f8455a;

    C1437bn(C1435bl c1435bl) {
        this.f8455a = c1435bl;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f8455a.f8358b) {
            if (this.f8455a.f8361e.isDone()) {
                return;
            }
            C1451br c1451br = new C1451br(-2, map);
            if (this.f8455a.f8359c.equals(c1451br.m10016h())) {
                String strM10013e = c1451br.m10013e();
                if (strM10013e == null) {
                    C1560fm.m11615e("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (strM10013e.contains("%40mediation_adapters%40")) {
                    String strReplaceAll = strM10013e.replaceAll("%40mediation_adapters%40", C1555fh.m11339a(this.f8455a.f8357a, map.get("check_adapters"), this.f8455a.f8360d));
                    c1451br.m10009a(strReplaceAll);
                    String strValueOf = String.valueOf(strReplaceAll);
                    C1560fm.m11343a(strValueOf.length() != 0 ? "Ad request URL modified to ".concat(strValueOf) : new String("Ad request URL modified to "));
                }
                this.f8455a.f8361e.m11657b(c1451br);
            }
        }
    }
}
