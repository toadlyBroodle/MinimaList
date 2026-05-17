package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0889d;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.AbstractC1832po;
import com.google.android.gms.internal.C1834pq;
import com.google.android.gms.internal.C1880ri;
import com.google.android.gms.internal.C1896ry;
import com.google.android.gms.internal.C1897rz;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: com.google.android.gms.analytics.h */
/* JADX INFO: loaded from: classes.dex */
public class C0893h extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private boolean f4931a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f4932b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f4933c;

    /* JADX INFO: renamed from: d */
    private final C1880ri f4934d;

    /* JADX INFO: renamed from: e */
    private final a f4935e;

    /* JADX INFO: renamed from: f */
    private C0888c f4936f;

    /* JADX INFO: renamed from: g */
    private C1896ry f4937g;

    /* JADX INFO: renamed from: com.google.android.gms.analytics.h$a */
    class a extends AbstractC1832po implements C0889d.a {

        /* JADX INFO: renamed from: a */
        private boolean f4938a;

        /* JADX INFO: renamed from: b */
        private int f4939b;

        /* JADX INFO: renamed from: c */
        private long f4940c;

        /* JADX INFO: renamed from: d */
        private boolean f4941d;

        /* JADX INFO: renamed from: e */
        private long f4942e;

        protected a(C1834pq c1834pq) {
            super(c1834pq);
            this.f4940c = -1L;
        }

        /* JADX INFO: renamed from: c */
        private final void m6021c() {
            if (this.f4940c >= 0 || this.f4938a) {
                m12042n().m5971a(C0893h.this.f4935e);
            } else {
                m12042n().m5975b(C0893h.this.f4935e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC1832po
        /* JADX INFO: renamed from: a */
        protected final void mo6013a() {
        }

        @Override // com.google.android.gms.analytics.C0889d.a
        /* JADX INFO: renamed from: a */
        public final void mo5980a(Activity activity) {
            String canonicalName;
            String stringExtra;
            if (this.f4939b == 0) {
                if (m12037i().mo7253b() >= this.f4942e + Math.max(1000L, this.f4940c)) {
                    this.f4941d = true;
                }
            }
            this.f4939b++;
            if (this.f4938a) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    C0893h.this.m6014a(intent.getData());
                }
                HashMap map = new HashMap();
                map.put("&t", "screenview");
                C0893h c0893h = C0893h.this;
                if (C0893h.this.f4937g != null) {
                    C1896ry c1896ry = C0893h.this.f4937g;
                    String canonicalName2 = activity.getClass().getCanonicalName();
                    canonicalName = c1896ry.f11499a.get(canonicalName2);
                    if (canonicalName == null) {
                        canonicalName = canonicalName2;
                    }
                } else {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                c0893h.m6016a("&cd", canonicalName);
                if (TextUtils.isEmpty((CharSequence) map.get("&dr"))) {
                    C1221aj.m7065a(activity);
                    Intent intent2 = activity.getIntent();
                    if (intent2 == null) {
                        stringExtra = null;
                    } else {
                        stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (TextUtils.isEmpty(stringExtra)) {
                            stringExtra = null;
                        }
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        map.put("&dr", stringExtra);
                    }
                }
                C0893h.this.m6017a((Map<String, String>) map);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m6022a(boolean z) {
            this.f4938a = z;
            m6021c();
        }

        @Override // com.google.android.gms.analytics.C0889d.a
        /* JADX INFO: renamed from: b */
        public final void mo5981b(Activity activity) {
            this.f4939b--;
            this.f4939b = Math.max(0, this.f4939b);
            if (this.f4939b == 0) {
                this.f4942e = m12037i().mo7253b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final synchronized boolean m6023b() {
            boolean z;
            z = this.f4941d;
            this.f4941d = false;
            return z;
        }
    }

    C0893h(C1834pq c1834pq, String str, C1880ri c1880ri) {
        super(c1834pq);
        this.f4932b = new HashMap();
        this.f4933c = new HashMap();
        if (str != null) {
            this.f4932b.put("&tid", str);
        }
        this.f4932b.put("useSecure", "1");
        this.f4932b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f4934d = new C1880ri("tracking", m12037i());
        this.f4935e = new a(c1834pq);
    }

    /* JADX INFO: renamed from: a */
    private static String m6000a(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (key.startsWith("&") && key.length() >= 2) {
            return entry.getKey().substring(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static void m6001a(Map<String, String> map, Map<String, String> map2) {
        C1221aj.m7065a(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strM6000a = m6000a(entry);
            if (strM6000a != null) {
                map2.put(strM6000a, entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m6003b(Map<String, String> map, Map<String, String> map2) {
        C1221aj.m7065a(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strM6000a = m6000a(entry);
            if (strM6000a != null && !map2.containsKey(strM6000a)) {
                map2.put(strM6000a, entry.getValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        this.f4935e.m12053z();
        String strM12298c = m12045q().m12298c();
        if (strM12298c != null) {
            m6016a("&an", strM12298c);
        }
        String strM12297b = m12045q().m12297b();
        if (strM12297b != null) {
            m6016a("&av", strM12297b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6014a(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String strValueOf = String.valueOf(queryParameter);
        Uri uri2 = Uri.parse(strValueOf.length() != 0 ? "http://hostname/?".concat(strValueOf) : new String("http://hostname/?"));
        String queryParameter2 = uri2.getQueryParameter("utm_id");
        if (queryParameter2 != null) {
            this.f4933c.put("&ci", queryParameter2);
        }
        String queryParameter3 = uri2.getQueryParameter("anid");
        if (queryParameter3 != null) {
            this.f4933c.put("&anid", queryParameter3);
        }
        String queryParameter4 = uri2.getQueryParameter("utm_campaign");
        if (queryParameter4 != null) {
            this.f4933c.put("&cn", queryParameter4);
        }
        String queryParameter5 = uri2.getQueryParameter("utm_content");
        if (queryParameter5 != null) {
            this.f4933c.put("&cc", queryParameter5);
        }
        String queryParameter6 = uri2.getQueryParameter("utm_medium");
        if (queryParameter6 != null) {
            this.f4933c.put("&cm", queryParameter6);
        }
        String queryParameter7 = uri2.getQueryParameter("utm_source");
        if (queryParameter7 != null) {
            this.f4933c.put("&cs", queryParameter7);
        }
        String queryParameter8 = uri2.getQueryParameter("utm_term");
        if (queryParameter8 != null) {
            this.f4933c.put("&ck", queryParameter8);
        }
        String queryParameter9 = uri2.getQueryParameter("dclid");
        if (queryParameter9 != null) {
            this.f4933c.put("&dclid", queryParameter9);
        }
        String queryParameter10 = uri2.getQueryParameter("gclid");
        if (queryParameter10 != null) {
            this.f4933c.put("&gclid", queryParameter10);
        }
        String queryParameter11 = uri2.getQueryParameter("aclid");
        if (queryParameter11 != null) {
            this.f4933c.put("&aclid", queryParameter11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6015a(String str) {
        m6016a("&cd", str);
    }

    /* JADX INFO: renamed from: a */
    public void m6016a(String str, String str2) {
        C1221aj.m7066a(str, (Object) "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4932b.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m6017a(Map<String, String> map) {
        long jMo7252a = m12037i().mo7252a();
        if (m12042n().m5978e()) {
            m12027c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean zM5977d = m12042n().m5977d();
        HashMap map2 = new HashMap();
        m6001a(this.f4932b, map2);
        m6001a(map, map2);
        boolean zM12293a = C1897rz.m12293a(this.f4932b.get("useSecure"), true);
        m6003b(this.f4933c, map2);
        this.f4933c.clear();
        String str = map2.get("t");
        if (TextUtils.isEmpty(str)) {
            m12039k().m12229a(map2, "Missing hit type parameter");
            return;
        }
        String str2 = map2.get("tid");
        if (TextUtils.isEmpty(str2)) {
            m12039k().m12229a(map2, "Missing tracking id parameter");
            return;
        }
        boolean z = this.f4931a;
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int i = Integer.parseInt(this.f4932b.get("&a")) + 1;
                if (i >= Integer.MAX_VALUE) {
                    i = 1;
                }
                this.f4932b.put("&a", Integer.toString(i));
            }
        }
        m12041m().m6080a(new RunnableC0907v(this, map2, z, str, jMo7252a, zM5977d, zM12293a, str2));
    }

    /* JADX INFO: renamed from: a */
    public void m6018a(boolean z) {
        synchronized (this) {
            if ((this.f4936f != null) == z) {
                return;
            }
            if (z) {
                this.f4936f = new C0888c(this, Thread.getDefaultUncaughtExceptionHandler(), m12038j());
                Thread.setDefaultUncaughtExceptionHandler(this.f4936f);
                m12023b("Uncaught exceptions will be reported to Google Analytics");
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this.f4936f.m5963a());
                m12023b("Uncaught exceptions will not be reported to Google Analytics");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6019b(boolean z) {
        this.f4935e.m6022a(z);
    }

    /* JADX INFO: renamed from: c */
    public void m6020c(boolean z) {
        this.f4931a = z;
    }
}
