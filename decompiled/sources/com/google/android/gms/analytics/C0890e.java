package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.p049a.C0884a;
import com.google.android.gms.analytics.p049a.C0885b;
import com.google.android.gms.analytics.p049a.C0886c;
import com.google.android.gms.internal.C1881rj;
import com.google.android.gms.internal.C1897rz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.e */
/* JADX INFO: loaded from: classes.dex */
public class C0890e {

    /* JADX INFO: renamed from: com.google.android.gms.analytics.e$a */
    public static class a extends b<a> {
        public a() {
            m5988a("&t", "exception");
        }

        /* JADX INFO: renamed from: a */
        public a m5982a(String str) {
            m5988a("&exd", str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m5983a(boolean z) {
            m5988a("&exf", C1897rz.m12286a(z));
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.analytics.e$b */
    public static class b<T extends b> {

        /* JADX INFO: renamed from: b */
        private C0885b f4926b;

        /* JADX INFO: renamed from: a */
        private Map<String, String> f4925a = new HashMap();

        /* JADX INFO: renamed from: c */
        private Map<String, List<C0884a>> f4927c = new HashMap();

        /* JADX INFO: renamed from: d */
        private List<C0886c> f4928d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private List<C0884a> f4929e = new ArrayList();

        protected b() {
        }

        /* JADX INFO: renamed from: a */
        public T m5984a(C0884a c0884a) {
            if (c0884a == null) {
                C1881rj.m12224b("product should be non-null");
            } else {
                this.f4929e.add(c0884a);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public T m5985a(C0884a c0884a, String str) {
            if (c0884a == null) {
                C1881rj.m12224b("product should be non-null");
            } else {
                if (str == null) {
                    str = "";
                }
                if (!this.f4927c.containsKey(str)) {
                    this.f4927c.put(str, new ArrayList());
                }
                this.f4927c.get(str).add(c0884a);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public T m5986a(C0885b c0885b) {
            this.f4926b = c0885b;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public T m5987a(C0886c c0886c) {
            if (c0886c == null) {
                C1881rj.m12224b("promotion should be non-null");
            } else {
                this.f4928d.add(c0886c);
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final T m5988a(String str, String str2) {
            if (str != null) {
                this.f4925a.put(str, str2);
            } else {
                C1881rj.m12224b("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final T m5989a(Map<String, String> map) {
            if (map != null) {
                this.f4925a.putAll(new HashMap(map));
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public Map<String, String> m5990a() {
            HashMap map = new HashMap(this.f4925a);
            if (this.f4926b != null) {
                map.putAll(this.f4926b.m5949a());
            }
            Iterator<C0886c> it = this.f4928d.iterator();
            int i = 1;
            while (it.hasNext()) {
                map.putAll(it.next().m5961e(C0897l.m6043e(i)));
                i++;
            }
            Iterator<C0884a> it2 = this.f4929e.iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                map.putAll(it2.next().m5944g(C0897l.m6041c(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry<String, List<C0884a>> entry : this.f4927c.entrySet()) {
                List<C0884a> value = entry.getValue();
                String strM6046h = C0897l.m6046h(i3);
                int i4 = 1;
                for (C0884a c0884a : value) {
                    String strValueOf = String.valueOf(strM6046h);
                    String strValueOf2 = String.valueOf(C0897l.m6045g(i4));
                    map.putAll(c0884a.m5944g(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty(entry.getKey())) {
                    String strValueOf3 = String.valueOf(strM6046h);
                    String strValueOf4 = String.valueOf("nm");
                    map.put(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), entry.getKey());
                }
                i3++;
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.analytics.e$c */
    public static class c extends b<c> {
        public c() {
            m5988a("&t", "screenview");
        }
    }
}
