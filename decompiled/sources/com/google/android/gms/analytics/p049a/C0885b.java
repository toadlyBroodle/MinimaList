package com.google.android.gms.analytics.p049a;

import com.google.android.gms.analytics.AbstractC0901p;
import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0885b {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f4910a = new HashMap();

    public C0885b(String str) {
        m5945a("&pa", str);
    }

    /* JADX INFO: renamed from: a */
    private final void m5945a(String str, String str2) {
        C1221aj.m7066a(str, (Object) "Name should be non-null");
        this.f4910a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public C0885b m5946a(double d) {
        m5945a("&tr", Double.toString(d));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0885b m5947a(int i) {
        m5945a("&cos", Integer.toString(i));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0885b m5948a(String str) {
        m5945a("&ti", str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m5949a() {
        return new HashMap(this.f4910a);
    }

    /* JADX INFO: renamed from: b */
    public C0885b m5950b(double d) {
        m5945a("&tt", Double.toString(d));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0885b m5951b(String str) {
        m5945a("&ta", str);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0885b m5952c(double d) {
        m5945a("&ts", Double.toString(d));
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0885b m5953c(String str) {
        m5945a("&tcc", str);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0885b m5954d(String str) {
        m5945a("&col", str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0885b m5955e(String str) {
        m5945a("&pal", str);
        return this;
    }

    public String toString() {
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : this.f4910a.entrySet()) {
            if (entry.getKey().startsWith("&")) {
                map.put(entry.getKey().substring(1), entry.getValue());
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0901p.m6067a((Map) map);
    }
}
