package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.cnb;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.ad */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0751ad implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0752ae f4618a;

    public C0751ad(InterfaceC0752ae interfaceC0752ae) {
        this.f4618a = interfaceC0752ae;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        try {
        } catch (NumberFormatException e) {
            C1560fm.m11611b("Fail to parse float", e);
        }
        float f = map.get("blurRadius") != null ? Float.parseFloat(map.get("blurRadius")) : 0.0f;
        this.f4618a.mo5675a(zEquals);
        this.f4618a.mo5676a(zEquals2, f);
    }
}
