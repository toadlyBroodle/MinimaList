package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cce implements InterfaceC0748aa<Object> {

    /* JADX INFO: renamed from: a */
    private final WeakReference<cca> f9794a;

    /* JADX INFO: renamed from: b */
    private final String f9795b;

    public cce(cca ccaVar, String str) {
        this.f9794a = new WeakReference<>(ccaVar);
        this.f9795b = str;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.InterfaceC0748aa
    public final void zza(Object obj, Map<String, String> map) {
        cca ccaVar;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (TextUtils.isEmpty(str) || !this.f9795b.equals(str)) {
            return;
        }
        try {
            Integer.parseInt(map.get("eventType"));
        } catch (Exception e) {
            C1560fm.m11611b("Parse Scion log event type error", e);
        }
        if ("_ai".equals(str2)) {
            cca ccaVar2 = this.f9794a.get();
            if (ccaVar2 != null) {
                ccaVar2.m10690w();
                return;
            }
            return;
        }
        if (!"_ac".equals(str2) || (ccaVar = this.f9794a.get()) == null) {
            return;
        }
        ccaVar.m10691x();
    }
}
