package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC0901p;
import com.google.android.gms.common.internal.C1221aj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ov */
/* JADX INFO: loaded from: classes.dex */
public final class C1812ov extends AbstractC0901p<C1812ov> {

    /* JADX INFO: renamed from: a */
    private final Map<String, Object> f11239a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m11964a() {
        return Collections.unmodifiableMap(this.f11239a);
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1812ov c1812ov = (C1812ov) abstractC0901p;
        C1221aj.m7065a(c1812ov);
        c1812ov.f11239a.putAll(this.f11239a);
    }

    /* JADX INFO: renamed from: a */
    public final void m11965a(String str, String str2) {
        C1221aj.m7067a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C1221aj.m7068a(str, (Object) "Name can not be empty or \"&\"");
        this.f11239a.put(str, str2);
    }

    public final String toString() {
        return m6065a((Object) this.f11239a);
    }
}
