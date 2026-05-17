package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.C0883a;
import com.google.android.gms.analytics.C0894i;
import com.google.android.gms.analytics.C0900o;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.qc */
/* JADX INFO: loaded from: classes.dex */
final class C1847qc extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private boolean f11350a;

    /* JADX INFO: renamed from: b */
    private final C1843pz f11351b;

    /* JADX INFO: renamed from: c */
    private final C1884rm f11352c;

    /* JADX INFO: renamed from: d */
    private final C1883rl f11353d;

    /* JADX INFO: renamed from: e */
    private final C1838pu f11354e;

    /* JADX INFO: renamed from: f */
    private long f11355f;

    /* JADX INFO: renamed from: g */
    private final AbstractC1865qu f11356g;

    /* JADX INFO: renamed from: h */
    private final AbstractC1865qu f11357h;

    /* JADX INFO: renamed from: i */
    private final C1895rx f11358i;

    /* JADX INFO: renamed from: j */
    private long f11359j;

    /* JADX INFO: renamed from: k */
    private boolean f11360k;

    protected C1847qc(C1834pq c1834pq, C1836ps c1836ps) {
        super(c1834pq);
        C1221aj.m7065a(c1836ps);
        this.f11355f = Long.MIN_VALUE;
        this.f11353d = new C1883rl(c1834pq);
        this.f11351b = new C1843pz(c1834pq);
        this.f11352c = new C1884rm(c1834pq);
        this.f11354e = new C1838pu(c1834pq);
        this.f11358i = new C1895rx(m12037i());
        this.f11356g = new C1848qd(this, c1834pq);
        this.f11357h = new C1849qe(this, c1834pq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m12123A() {
        m12139a((InterfaceC1869qy) new C1851qg(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m12124B() {
        try {
            this.f11351b.m12117f();
            m12147g();
        } catch (SQLiteException e) {
            m12031d("Failed to delete stale hits", e);
        }
        this.f11357h.m12185a(86400000L);
    }

    /* JADX INFO: renamed from: C */
    private final void m12125C() {
        if (this.f11360k || !C1863qs.m12170b() || this.f11354e.m12091b()) {
            return;
        }
        if (this.f11358i.m12280a(C1872ra.f11402C.m12204a().longValue())) {
            this.f11358i.m12279a();
            m12023b("Connecting to service");
            if (this.f11354e.m12092c()) {
                m12023b("Connected to service");
                this.f11358i.m12281b();
                m12145e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        m12023b("Store is empty, nothing to dispatch");
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r12.f11351b.m12114c();
        r12.f11351b.m12115d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        m12034e("Failed to commit local dispatch transaction", r0);
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        if (r12.f11354e.m12091b() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        m12023b("Service connected, sending hits to the service");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
    
        if (r8.isEmpty() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        r0 = r8.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        if (r12.f11354e.m12090a(r0) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        r4 = java.lang.Math.max(r4, r0.m12212c());
        r8.remove(r0);
        m12024b("Hit sent do device AnalyticsService for delivery", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        r12.f11351b.m12112b(r0.m12212c());
        r3.add(java.lang.Long.valueOf(r0.m12212c()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        m12034e("Failed to remove hit that was send for delivery", r0);
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r12.f11351b.m12114c();
        r12.f11351b.m12115d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        m12034e("Failed to commit local dispatch transaction", r0);
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        if (r12.f11352c.m12249b() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
    
        r8 = r12.f11352c.m12248a(r8);
        r9 = r8.iterator();
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r9.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        r4 = java.lang.Math.max(r4, r9.next().longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0171, code lost:
    
        r12.f11351b.m12110a(r8);
        r3.addAll(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0179, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
    
        if (r3.isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0180, code lost:
    
        r12.f11351b.m12114c();
        r12.f11351b.m12115d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        m12034e("Failed to commit local dispatch transaction", r0);
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0197, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
    
        m12034e("Failed to remove successfully uploaded hits", r0);
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a0, code lost:
    
        r12.f11351b.m12114c();
        r12.f11351b.m12115d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ad, code lost:
    
        m12034e("Failed to commit local dispatch transaction", r0);
        m12129G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b7, code lost:
    
        r12.f11351b.m12114c();
        r12.f11351b.m12115d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c5, code lost:
    
        m12034e("Failed to commit local dispatch transaction", r0);
        m12129G();
     */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m12126D() {
        long j;
        C0903r.m6076d();
        m12052y();
        m12023b("Dispatching a batch of local hits");
        boolean z = !this.f11354e.m12091b();
        boolean z2 = this.f11352c.m12249b() ? false : true;
        if (z && z2) {
            m12023b("No network or service available. Will retry later");
        } else {
            long jMax = Math.max(C1863qs.m12174f(), C1863qs.m12175g());
            ArrayList arrayList = new ArrayList();
            long jMax2 = 0;
            loop0: while (true) {
                try {
                    this.f11351b.m12111b();
                    arrayList.clear();
                    try {
                        List<C1877rf> listM12108a = this.f11351b.m12108a(jMax);
                        if (!listM12108a.isEmpty()) {
                            m12020a("Hits loaded from store. count", Integer.valueOf(listM12108a.size()));
                            Iterator<C1877rf> it = listM12108a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (it.next().m12212c() == jMax2) {
                                    m12032d("Database contains successfully uploaded hit", Long.valueOf(jMax2), Integer.valueOf(listM12108a.size()));
                                    m12129G();
                                    try {
                                        this.f11351b.m12114c();
                                        this.f11351b.m12115d();
                                        break loop0;
                                    } catch (SQLiteException e) {
                                        m12034e("Failed to commit local dispatch transaction", e);
                                        m12129G();
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                        jMax2 = j;
                    } catch (SQLiteException e2) {
                        m12031d("Failed to read hits from persisted store", e2);
                        m12129G();
                        try {
                            this.f11351b.m12114c();
                            this.f11351b.m12115d();
                        } catch (SQLiteException e3) {
                            m12034e("Failed to commit local dispatch transaction", e3);
                            m12129G();
                        }
                    }
                } catch (Throwable th) {
                    try {
                        this.f11351b.m12114c();
                        this.f11351b.m12115d();
                        throw th;
                    } catch (SQLiteException e4) {
                        m12034e("Failed to commit local dispatch transaction", e4);
                        m12129G();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    private final long m12127E() {
        C0903r.m6076d();
        m12052y();
        try {
            return this.f11351b.m12118g();
        } catch (SQLiteException e) {
            m12034e("Failed to get min/max hit times from local store", e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m12128F() {
        C1868qx c1868qxM12044p = m12044p();
        if (c1868qxM12044p.m12194b() && !c1868qxM12044p.m12195c()) {
            long jM12127E = m12127E();
            if (jM12127E == 0 || Math.abs(m12037i().mo7252a() - jM12127E) > C1872ra.f11424h.m12204a().longValue()) {
                return;
            }
            m12020a("Dispatch alarm scheduled (ms)", Long.valueOf(C1863qs.m12173e()));
            c1868qxM12044p.m12196d();
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m12129G() {
        if (this.f11356g.m12188c()) {
            m12023b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f11356g.m12189d();
        C1868qx c1868qxM12044p = m12044p();
        if (c1868qxM12044p.m12195c()) {
            c1868qxM12044p.m12197e();
        }
    }

    /* JADX INFO: renamed from: H */
    private final long m12130H() {
        if (this.f11355f != Long.MIN_VALUE) {
            return this.f11355f;
        }
        long jLongValue = C1872ra.f11421e.m12204a().longValue();
        C1899sa c1899saM12045q = m12045q();
        c1899saM12045q.m12052y();
        if (!c1899saM12045q.f11502a) {
            return jLongValue;
        }
        C1899sa c1899saM12045q2 = m12045q();
        c1899saM12045q2.m12052y();
        return ((long) c1899saM12045q2.f11503b) * 1000;
    }

    /* JADX INFO: renamed from: I */
    private final void m12131I() {
        m12052y();
        C0903r.m6076d();
        this.f11360k = true;
        this.f11354e.m12093d();
        m12147g();
    }

    /* JADX INFO: renamed from: a */
    private final void m12132a(C1837pt c1837pt, C1809os c1809os) {
        C1221aj.m7065a(c1837pt);
        C1221aj.m7065a(c1809os);
        C0894i c0894i = new C0894i(m12036h());
        c0894i.m6025b(c1837pt.m12078c());
        c0894i.m6026b(c1837pt.m12079d());
        C0900o c0900oMo6028h = c0894i.mo6028h();
        C1818pa c1818pa = (C1818pa) c0900oMo6028h.m6055b(C1818pa.class);
        c1818pa.m11980a("data");
        c1818pa.m11984b(true);
        c0900oMo6028h.m6054a(c1809os);
        C1812ov c1812ov = (C1812ov) c0900oMo6028h.m6055b(C1812ov.class);
        C1808or c1808or = (C1808or) c0900oMo6028h.m6055b(C1808or.class);
        for (Map.Entry<String, String> entry : c1837pt.m12081f().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                c1808or.m11935a(value);
            } else if ("av".equals(key)) {
                c1808or.m11937b(value);
            } else if ("aid".equals(key)) {
                c1808or.m11939c(value);
            } else if ("aiid".equals(key)) {
                c1808or.m11941d(value);
            } else if ("uid".equals(key)) {
                c1818pa.m11986c(value);
            } else {
                c1812ov.m11965a(key, value);
            }
        }
        m12025b("Sending installation campaign to", c1837pt.m12078c(), c1809os);
        c0900oMo6028h.m6053a(m12046r().m12255b());
        c0900oMo6028h.m6059e();
    }

    /* JADX INFO: renamed from: g */
    private final boolean m12135g(String str) {
        return C2040xg.m12562a(m12038j()).m12554a(str) == 0;
    }

    /* JADX INFO: renamed from: a */
    public final long m12136a(C1837pt c1837pt, boolean z) {
        C1221aj.m7065a(c1837pt);
        m12052y();
        C0903r.m6076d();
        try {
            try {
                this.f11351b.m12111b();
                C1843pz c1843pz = this.f11351b;
                long jM12075a = c1837pt.m12075a();
                String strM12077b = c1837pt.m12077b();
                C1221aj.m7067a(strM12077b);
                c1843pz.m12052y();
                C0903r.m6076d();
                int iDelete = c1843pz.m12106A().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(jM12075a), strM12077b});
                if (iDelete > 0) {
                    c1843pz.m12020a("Deleted property records", Integer.valueOf(iDelete));
                }
                long jM12107a = this.f11351b.m12107a(c1837pt.m12075a(), c1837pt.m12077b(), c1837pt.m12078c());
                c1837pt.m12076a(1 + jM12107a);
                C1843pz c1843pz2 = this.f11351b;
                C1221aj.m7065a(c1837pt);
                c1843pz2.m12052y();
                C0903r.m6076d();
                SQLiteDatabase sQLiteDatabaseM12106A = c1843pz2.m12106A();
                Map<String, String> mapM12081f = c1837pt.m12081f();
                C1221aj.m7065a(mapM12081f);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : mapM12081f.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                String str = encodedQuery == null ? "" : encodedQuery;
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", Long.valueOf(c1837pt.m12075a()));
                contentValues.put("cid", c1837pt.m12077b());
                contentValues.put("tid", c1837pt.m12078c());
                contentValues.put("adid", Integer.valueOf(c1837pt.m12079d() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(c1837pt.m12080e()));
                contentValues.put("params", str);
                try {
                    if (sQLiteDatabaseM12106A.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        c1843pz2.m12035f("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e) {
                    c1843pz2.m12034e("Error storing a property", e);
                }
                this.f11351b.m12114c();
                return jM12107a;
            } finally {
                try {
                    this.f11351b.m12115d();
                } catch (SQLiteException e2) {
                    m12034e("Failed to end transaction", e2);
                }
            }
        } catch (SQLiteException e3) {
            m12034e("Failed to update Analytics property", e3);
            try {
                this.f11351b.m12115d();
            } catch (SQLiteException e4) {
                m12034e("Failed to end transaction", e4);
            }
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        this.f11351b.m12053z();
        this.f11352c.m12053z();
        this.f11354e.m12053z();
    }

    /* JADX INFO: renamed from: a */
    public final void m12137a(long j) {
        C0903r.m6076d();
        m12052y();
        if (j < 0) {
            j = 0;
        }
        this.f11355f = j;
        m12147g();
    }

    /* JADX INFO: renamed from: a */
    protected final void m12138a(C1837pt c1837pt) {
        C0903r.m6076d();
        m12024b("Sending first hit to property", c1837pt.m12078c());
        if (m12046r().m12256c().m12280a(C1863qs.m12179l())) {
            return;
        }
        String strM12259f = m12046r().m12259f();
        if (TextUtils.isEmpty(strM12259f)) {
            return;
        }
        C1809os c1809osM12284a = C1897rz.m12284a(m12039k(), strM12259f);
        m12024b("Found relevant installation campaign", c1809osM12284a);
        m12132a(c1837pt, c1809osM12284a);
    }

    /* JADX INFO: renamed from: a */
    public final void m12139a(InterfaceC1869qy interfaceC1869qy) {
        long j = this.f11359j;
        C0903r.m6076d();
        m12052y();
        long jM12257d = m12046r().m12257d();
        m12024b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jM12257d != 0 ? Math.abs(m12037i().mo7252a() - jM12257d) : -1L));
        m12125C();
        try {
            m12126D();
            m12046r().m12258e();
            m12147g();
            if (interfaceC1869qy != null) {
                interfaceC1869qy.mo12148a(null);
            }
            if (this.f11359j != j) {
                this.f11353d.m12234c();
            }
        } catch (Throwable th) {
            m12034e("Local dispatch failed", th);
            m12046r().m12258e();
            m12147g();
            if (interfaceC1869qy != null) {
                interfaceC1869qy.mo12148a(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12140a(C1877rf c1877rf) throws Throwable {
        Pair<String, Long> pairM12267a;
        C1221aj.m7065a(c1877rf);
        C0903r.m6076d();
        m12052y();
        if (this.f11360k) {
            m12027c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            m12020a("Delivering hit", c1877rf);
        }
        if (TextUtils.isEmpty(c1877rf.m12217h()) && (pairM12267a = m12046r().m12260g().m12267a()) != null) {
            Long l = (Long) pairM12267a.second;
            String str = (String) pairM12267a.first;
            String strValueOf = String.valueOf(l);
            String string = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length()).append(strValueOf).append(":").append(str).toString();
            HashMap map = new HashMap(c1877rf.m12211b());
            map.put("_m", string);
            c1877rf = new C1877rf(this, map, c1877rf.m12213d(), c1877rf.m12215f(), c1877rf.m12212c(), c1877rf.m12210a(), c1877rf.m12214e());
        }
        m12125C();
        if (this.f11354e.m12090a(c1877rf)) {
            m12027c("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f11351b.m12109a(c1877rf);
            m12147g();
        } catch (SQLiteException e) {
            m12034e("Delivery failed to save hit to a database", e);
            m12039k().m12228a(c1877rf, "deliver: failed to insert hit to database");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12141a(String str) {
        C1221aj.m7067a(str);
        C0903r.m6076d();
        C1809os c1809osM12284a = C1897rz.m12284a(m12039k(), str);
        if (c1809osM12284a == null) {
            m12031d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String strM12259f = m12046r().m12259f();
        if (str.equals(strM12259f)) {
            m12033e("Ignoring duplicate install campaign");
            return;
        }
        if (!TextUtils.isEmpty(strM12259f)) {
            m12032d("Ignoring multiple install campaigns. original, new", strM12259f, str);
            return;
        }
        m12046r().m12254a(str);
        if (m12046r().m12256c().m12280a(C1863qs.m12179l())) {
            m12031d("Campaign received too late, ignoring", c1809osM12284a);
            return;
        }
        m12024b("Received installation campaign", c1809osM12284a);
        Iterator<C1837pt> it = this.f11351b.m12113c(0L).iterator();
        while (it.hasNext()) {
            m12132a(it.next(), c1809osM12284a);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m12142b() {
        m12052y();
        C1221aj.m7071a(!this.f11350a, "Analytics backend already started");
        this.f11350a = true;
        m12041m().m6080a(new RunnableC1850qf(this));
    }

    /* JADX INFO: renamed from: c */
    protected final void m12143c() {
        m12052y();
        C0903r.m6076d();
        Context contextM12056a = m12036h().m12056a();
        if (!C1890rs.m12270a(contextM12056a)) {
            m12033e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C1891rt.m12273a(contextM12056a)) {
            m12035f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C0883a.m5930a(contextM12056a)) {
            m12033e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        m12046r().m12255b();
        if (!m12135g("android.permission.ACCESS_NETWORK_STATE")) {
            m12035f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m12131I();
        }
        if (!m12135g("android.permission.INTERNET")) {
            m12035f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m12131I();
        }
        if (C1891rt.m12273a(m12038j())) {
            m12023b("AnalyticsService registered in the app manifest and enabled");
        } else {
            m12033e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f11360k && !this.f11351b.m12116e()) {
            m12125C();
        }
        m12147g();
    }

    /* JADX INFO: renamed from: d */
    final void m12144d() {
        C0903r.m6076d();
        this.f11359j = m12037i().mo7252a();
    }

    /* JADX INFO: renamed from: e */
    protected final void m12145e() {
        C0903r.m6076d();
        C0903r.m6076d();
        m12052y();
        if (!C1863qs.m12170b()) {
            m12033e("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.f11354e.m12091b()) {
            m12023b("Service not connected");
            return;
        }
        if (this.f11351b.m12116e()) {
            return;
        }
        m12023b("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                List<C1877rf> listM12108a = this.f11351b.m12108a(C1863qs.m12174f());
                if (listM12108a.isEmpty()) {
                    m12147g();
                    return;
                }
                while (!listM12108a.isEmpty()) {
                    C1877rf c1877rf = listM12108a.get(0);
                    if (!this.f11354e.m12090a(c1877rf)) {
                        m12147g();
                        return;
                    }
                    listM12108a.remove(c1877rf);
                    try {
                        this.f11351b.m12112b(c1877rf.m12212c());
                    } catch (SQLiteException e) {
                        m12034e("Failed to remove hit that was send for delivery", e);
                        m12129G();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                m12034e("Failed to read hits from store", e2);
                m12129G();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12146f() {
        C0903r.m6076d();
        m12052y();
        m12027c("Sync dispatching local hits");
        long j = this.f11359j;
        m12125C();
        try {
            m12126D();
            m12046r().m12258e();
            m12147g();
            if (this.f11359j != j) {
                this.f11353d.m12234c();
            }
        } catch (Throwable th) {
            m12034e("Sync local dispatch failed", th);
            m12147g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12147g() {
        boolean zM12235d;
        long jMin;
        C0903r.m6076d();
        m12052y();
        if (!(!this.f11360k && m12130H() > 0)) {
            this.f11353d.m12233b();
            m12129G();
            return;
        }
        if (this.f11351b.m12116e()) {
            this.f11353d.m12233b();
            m12129G();
            return;
        }
        if (C1872ra.f11442z.m12204a().booleanValue()) {
            zM12235d = true;
        } else {
            this.f11353d.m12232a();
            zM12235d = this.f11353d.m12235d();
        }
        if (!zM12235d) {
            m12129G();
            m12128F();
            return;
        }
        m12128F();
        long jM12130H = m12130H();
        long jM12257d = m12046r().m12257d();
        if (jM12257d != 0) {
            jMin = jM12130H - Math.abs(m12037i().mo7252a() - jM12257d);
            if (jMin <= 0) {
                jMin = Math.min(C1863qs.m12172d(), jM12130H);
            }
        } else {
            jMin = Math.min(C1863qs.m12172d(), jM12130H);
        }
        m12020a("Dispatch scheduled (ms)", Long.valueOf(jMin));
        if (this.f11356g.m12188c()) {
            this.f11356g.m12187b(Math.max(1L, jMin + this.f11356g.m12186b()));
        } else {
            this.f11356g.m12185a(jMin);
        }
    }
}
