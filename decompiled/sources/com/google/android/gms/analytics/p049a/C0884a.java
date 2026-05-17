package com.google.android.gms.analytics.p049a;

import com.google.android.gms.analytics.AbstractC0901p;
import com.google.android.gms.analytics.C0897l;
import com.google.android.gms.common.internal.C1221aj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0884a {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f4909a = new HashMap();

    /* JADX INFO: renamed from: a */
    private final void m5932a(String str, String str2) {
        C1221aj.m7066a(str, (Object) "Name should be non-null");
        this.f4909a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public C0884a m5933a(double d) {
        m5932a("pr", Double.toString(d));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0884a m5934a(int i) {
        m5932a("ps", Integer.toString(i));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0884a m5935a(int i, int i2) {
        m5932a(C0897l.m6049k(i), Integer.toString(i2));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0884a m5936a(int i, String str) {
        m5932a(C0897l.m6048j(i), str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0884a m5937a(String str) {
        m5932a("id", str);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0884a m5938b(int i) {
        m5932a("qt", Integer.toString(i));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0884a m5939b(String str) {
        m5932a("nm", str);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0884a m5940c(String str) {
        m5932a("br", str);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0884a m5941d(String str) {
        m5932a("ca", str);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C0884a m5942e(String str) {
        m5932a("va", str);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C0884a m5943f(String str) {
        m5932a("cc", str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, String> m5944g(String str) {
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : this.f4909a.entrySet()) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(entry.getKey());
            map.put(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), entry.getValue());
        }
        return map;
    }

    public String toString() {
        return AbstractC0901p.m6067a((Map) this.f4909a);
    }
}
