package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC0901p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ot */
/* JADX INFO: loaded from: classes.dex */
public final class C1810ot extends AbstractC0901p<C1810ot> {

    /* JADX INFO: renamed from: a */
    private Map<Integer, String> f11237a = new HashMap(4);

    /* JADX INFO: renamed from: a */
    public final Map<Integer, String> m11962a() {
        return Collections.unmodifiableMap(this.f11237a);
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        ((C1810ot) abstractC0901p).f11237a.putAll(this.f11237a);
    }

    public final String toString() {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, String> entry : this.f11237a.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            map.put(new StringBuilder(String.valueOf(strValueOf).length() + 9).append("dimension").append(strValueOf).toString(), entry.getValue());
        }
        return m6065a((Object) map);
    }
}
