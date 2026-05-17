package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.bo */
/* JADX INFO: loaded from: classes.dex */
final class C1438bo implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1435bl f8511a;

    C1438bo(C1435bl c1435bl) {
        this.f8511a = c1435bl;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f8511a.f8358b) {
            if (this.f8511a.f8361e.isDone()) {
                return;
            }
            C1451br c1451br = new C1451br(-2, map);
            if (this.f8511a.f8359c.equals(c1451br.m10016h())) {
                this.f8511a.f8361e.m11657b(c1451br);
            }
        }
    }
}
