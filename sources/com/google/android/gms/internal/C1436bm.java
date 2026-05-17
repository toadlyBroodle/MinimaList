package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.bm */
/* JADX INFO: loaded from: classes.dex */
final class C1436bm implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1435bl f8400a;

    C1436bm(C1435bl c1435bl) {
        this.f8400a = c1435bl;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f8400a.f8358b) {
            if (this.f8400a.f8361e.isDone()) {
                return;
            }
            if (this.f8400a.f8359c.equals(map.get("request_id"))) {
                C1451br c1451br = new C1451br(1, map);
                String strM10014f = c1451br.m10014f();
                String strValueOf = String.valueOf(c1451br.m10010b());
                C1560fm.m11615e(new StringBuilder(String.valueOf(strM10014f).length() + 24 + String.valueOf(strValueOf).length()).append("Invalid ").append(strM10014f).append(" request error: ").append(strValueOf).toString());
                this.f8400a.f8361e.m11657b(c1451br);
            }
        }
    }
}
