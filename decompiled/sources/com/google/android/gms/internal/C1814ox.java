package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC0901p;
import com.google.android.gms.analytics.p049a.C0884a;
import com.google.android.gms.analytics.p049a.C0885b;
import com.google.android.gms.analytics.p049a.C0886c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ox */
/* JADX INFO: loaded from: classes.dex */
public final class C1814ox extends AbstractC0901p<C1814ox> {

    /* JADX INFO: renamed from: a */
    private final List<C0884a> f11246a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<C0886c> f11247b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Map<String, List<C0884a>> f11248c = new HashMap();

    /* JADX INFO: renamed from: d */
    private C0885b f11249d;

    /* JADX INFO: renamed from: a */
    public final C0885b m11968a() {
        return this.f11249d;
    }

    @Override // com.google.android.gms.analytics.AbstractC0901p
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6068a(AbstractC0901p abstractC0901p) {
        C1814ox c1814ox = (C1814ox) abstractC0901p;
        c1814ox.f11246a.addAll(this.f11246a);
        c1814ox.f11247b.addAll(this.f11247b);
        for (Map.Entry<String, List<C0884a>> entry : this.f11248c.entrySet()) {
            String key = entry.getKey();
            for (C0884a c0884a : entry.getValue()) {
                if (c0884a != null) {
                    String str = key == null ? "" : key;
                    if (!c1814ox.f11248c.containsKey(str)) {
                        c1814ox.f11248c.put(str, new ArrayList());
                    }
                    c1814ox.f11248c.get(str).add(c0884a);
                }
            }
        }
        if (this.f11249d != null) {
            c1814ox.f11249d = this.f11249d;
        }
    }

    /* JADX INFO: renamed from: b */
    public final List<C0884a> m11969b() {
        return Collections.unmodifiableList(this.f11246a);
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, List<C0884a>> m11970c() {
        return this.f11248c;
    }

    /* JADX INFO: renamed from: d */
    public final List<C0886c> m11971d() {
        return Collections.unmodifiableList(this.f11247b);
    }

    public final String toString() {
        HashMap map = new HashMap();
        if (!this.f11246a.isEmpty()) {
            map.put("products", this.f11246a);
        }
        if (!this.f11247b.isEmpty()) {
            map.put("promotions", this.f11247b);
        }
        if (!this.f11248c.isEmpty()) {
            map.put("impressions", this.f11248c);
        }
        map.put("productAction", this.f11249d);
        return m6065a((Object) map);
    }
}
