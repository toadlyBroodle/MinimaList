package com.google.android.gms.analytics.p049a;

import com.google.android.gms.analytics.AbstractC0901p;
import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0886c {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f4911a = new HashMap();

    /* JADX INFO: renamed from: a */
    private final void m5956a(String str, String str2) {
        C1221aj.m7066a(str, (Object) "Name should be non-null");
        this.f4911a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public C0886c m5957a(String str) {
        m5956a("id", str);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0886c m5958b(String str) {
        m5956a("nm", str);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0886c m5959c(String str) {
        m5956a("cr", str);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0886c m5960d(String str) {
        m5956a("ps", str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m5961e(String str) {
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : this.f4911a.entrySet()) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(entry.getKey());
            map.put(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), entry.getValue());
        }
        return map;
    }

    public String toString() {
        return AbstractC0901p.m6067a((Map) this.f4911a);
    }
}
