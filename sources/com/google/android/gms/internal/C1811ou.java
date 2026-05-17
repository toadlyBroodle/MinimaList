package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC0901p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ou */
/* JADX INFO: loaded from: classes.dex */
public final class C1811ou extends AbstractC0901p<C1811ou> {

    /* JADX INFO: renamed from: a */
    private Map<Integer, Double> f11238a = new HashMap(4);

    /* JADX INFO: renamed from: a */
    public final Map<Integer, Double> m11963a() {
        return Collections.unmodifiableMap(this.f11238a);
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        ((C1811ou) abstractC0901p).f11238a.putAll(this.f11238a);
    }

    public final String toString() {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.f11238a.entrySet()) {
            String strValueOf = String.valueOf(entry.getKey());
            map.put(new StringBuilder(String.valueOf(strValueOf).length() + 6).append("metric").append(strValueOf).toString(), entry.getValue());
        }
        return m6065a((Object) map);
    }
}
