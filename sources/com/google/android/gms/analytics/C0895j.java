package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.p049a.C0884a;
import com.google.android.gms.analytics.p049a.C0885b;
import com.google.android.gms.analytics.p049a.C0886c;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.internal.C1808or;
import com.google.android.gms.internal.C1809os;
import com.google.android.gms.internal.C1810ot;
import com.google.android.gms.internal.C1811ou;
import com.google.android.gms.internal.C1812ov;
import com.google.android.gms.internal.C1813ow;
import com.google.android.gms.internal.C1814ox;
import com.google.android.gms.internal.C1815oy;
import com.google.android.gms.internal.C1816oz;
import com.google.android.gms.internal.C1818pa;
import com.google.android.gms.internal.C1819pb;
import com.google.android.gms.internal.C1820pc;
import com.google.android.gms.internal.C1821pd;
import com.google.android.gms.internal.C1830pm;
import com.google.android.gms.internal.C1833pp;
import com.google.android.gms.internal.C1834pq;
import com.google.android.gms.internal.C1837pt;
import com.google.android.gms.internal.C1877rf;
import com.google.android.gms.internal.C1897rz;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0895j extends C1830pm implements InterfaceC0906u {

    /* JADX INFO: renamed from: a */
    private static DecimalFormat f4946a;

    /* JADX INFO: renamed from: b */
    private final C1834pq f4947b;

    /* JADX INFO: renamed from: c */
    private final String f4948c;

    /* JADX INFO: renamed from: d */
    private final Uri f4949d;

    public C0895j(C1834pq c1834pq, String str) {
        this(c1834pq, str, true, false);
    }

    private C0895j(C1834pq c1834pq, String str, boolean z, boolean z2) {
        super(c1834pq);
        C1221aj.m7067a(str);
        this.f4947b = c1834pq;
        this.f4948c = str;
        this.f4949d = m6029a(this.f4948c);
    }

    /* JADX INFO: renamed from: a */
    static Uri m6029a(String str) {
        C1221aj.m7067a(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* JADX INFO: renamed from: a */
    private static String m6030a(double d) {
        if (f4946a == null) {
            f4946a = new DecimalFormat("0.######");
        }
        return f4946a.format(d);
    }

    /* JADX INFO: renamed from: a */
    private static void m6031a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, m6030a(d));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m6032a(Map<String, String> map, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        map.put(str, new StringBuilder(23).append(i).append("x").append(i2).toString());
    }

    /* JADX INFO: renamed from: a */
    private static void m6033a(Map<String, String> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m6034a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* JADX INFO: renamed from: b */
    private static Map<String, String> m6035b(C0900o c0900o) {
        String strValueOf;
        HashMap map = new HashMap();
        C1812ov c1812ov = (C1812ov) c0900o.m6052a(C1812ov.class);
        if (c1812ov != null) {
            for (Map.Entry<String, Object> entry : c1812ov.m11964a().entrySet()) {
                Object value = entry.getValue();
                if (value == null) {
                    strValueOf = null;
                } else if (value instanceof String) {
                    strValueOf = (String) value;
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = null;
                    }
                } else if (value instanceof Double) {
                    Double d = (Double) value;
                    strValueOf = d.doubleValue() != 0.0d ? m6030a(d.doubleValue()) : null;
                } else {
                    strValueOf = value instanceof Boolean ? value != Boolean.FALSE ? "1" : null : String.valueOf(value);
                }
                if (strValueOf != null) {
                    map.put(entry.getKey(), strValueOf);
                }
            }
        }
        C1818pa c1818pa = (C1818pa) c0900o.m6052a(C1818pa.class);
        if (c1818pa != null) {
            m6033a(map, "t", c1818pa.m11979a());
            m6033a(map, "cid", c1818pa.m11982b());
            m6033a(map, "uid", c1818pa.m11985c());
            m6033a(map, "sc", c1818pa.m11990f());
            m6031a(map, "sf", c1818pa.m11992h());
            m6034a(map, "ni", c1818pa.m11991g());
            m6033a(map, "adid", c1818pa.m11987d());
            m6034a(map, "ate", c1818pa.m11989e());
        }
        C1819pb c1819pb = (C1819pb) c0900o.m6052a(C1819pb.class);
        if (c1819pb != null) {
            m6033a(map, "cd", c1819pb.m11993a());
            m6031a(map, "a", c1819pb.m11994b());
            m6033a(map, "dr", c1819pb.m11995c());
        }
        C1815oy c1815oy = (C1815oy) c0900o.m6052a(C1815oy.class);
        if (c1815oy != null) {
            m6033a(map, "ec", c1815oy.m11972a());
            m6033a(map, "ea", c1815oy.m11973b());
            m6033a(map, "el", c1815oy.m11974c());
            m6031a(map, "ev", c1815oy.m11975d());
        }
        C1809os c1809os = (C1809os) c0900o.m6052a(C1809os.class);
        if (c1809os != null) {
            m6033a(map, "cn", c1809os.m11942a());
            m6033a(map, "cs", c1809os.m11944b());
            m6033a(map, "cm", c1809os.m11946c());
            m6033a(map, "ck", c1809os.m11948d());
            m6033a(map, "cc", c1809os.m11950e());
            m6033a(map, "ci", c1809os.m11952f());
            m6033a(map, "anid", c1809os.m11954g());
            m6033a(map, "gclid", c1809os.m11956h());
            m6033a(map, "dclid", c1809os.m11958i());
            m6033a(map, "aclid", c1809os.m11960j());
        }
        C1816oz c1816oz = (C1816oz) c0900o.m6052a(C1816oz.class);
        if (c1816oz != null) {
            m6033a(map, "exd", c1816oz.f11254a);
            m6034a(map, "exf", c1816oz.f11255b);
        }
        C1820pc c1820pc = (C1820pc) c0900o.m6052a(C1820pc.class);
        if (c1820pc != null) {
            m6033a(map, "sn", c1820pc.f11274a);
            m6033a(map, "sa", c1820pc.f11275b);
            m6033a(map, "st", c1820pc.f11276c);
        }
        C1821pd c1821pd = (C1821pd) c0900o.m6052a(C1821pd.class);
        if (c1821pd != null) {
            m6033a(map, "utv", c1821pd.f11277a);
            m6031a(map, "utt", c1821pd.f11278b);
            m6033a(map, "utc", c1821pd.f11279c);
            m6033a(map, "utl", c1821pd.f11280d);
        }
        C1810ot c1810ot = (C1810ot) c0900o.m6052a(C1810ot.class);
        if (c1810ot != null) {
            for (Map.Entry<Integer, String> entry2 : c1810ot.m11962a().entrySet()) {
                String strM6038a = C0897l.m6038a(entry2.getKey().intValue());
                if (!TextUtils.isEmpty(strM6038a)) {
                    map.put(strM6038a, entry2.getValue());
                }
            }
        }
        C1811ou c1811ou = (C1811ou) c0900o.m6052a(C1811ou.class);
        if (c1811ou != null) {
            for (Map.Entry<Integer, Double> entry3 : c1811ou.m11963a().entrySet()) {
                String strM6040b = C0897l.m6040b(entry3.getKey().intValue());
                if (!TextUtils.isEmpty(strM6040b)) {
                    map.put(strM6040b, m6030a(entry3.getValue().doubleValue()));
                }
            }
        }
        C1814ox c1814ox = (C1814ox) c0900o.m6052a(C1814ox.class);
        if (c1814ox != null) {
            C0885b c0885bM11968a = c1814ox.m11968a();
            if (c0885bM11968a != null) {
                for (Map.Entry<String, String> entry4 : c0885bM11968a.m5949a().entrySet()) {
                    if (entry4.getKey().startsWith("&")) {
                        map.put(entry4.getKey().substring(1), entry4.getValue());
                    } else {
                        map.put(entry4.getKey(), entry4.getValue());
                    }
                }
            }
            Iterator<C0886c> it = c1814ox.m11971d().iterator();
            int i = 1;
            while (it.hasNext()) {
                map.putAll(it.next().m5961e(C0897l.m6044f(i)));
                i++;
            }
            Iterator<C0884a> it2 = c1814ox.m11969b().iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                map.putAll(it2.next().m5944g(C0897l.m6042d(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry<String, List<C0884a>> entry5 : c1814ox.m11970c().entrySet()) {
                List<C0884a> value2 = entry5.getValue();
                String strM6047i = C0897l.m6047i(i3);
                int i4 = 1;
                for (C0884a c0884a : value2) {
                    String strValueOf2 = String.valueOf(strM6047i);
                    String strValueOf3 = String.valueOf(C0897l.m6045g(i4));
                    map.putAll(c0884a.m5944g(strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2)));
                    i4++;
                }
                if (!TextUtils.isEmpty(entry5.getKey())) {
                    String strValueOf4 = String.valueOf(strM6047i);
                    String strValueOf5 = String.valueOf("nm");
                    map.put(strValueOf5.length() != 0 ? strValueOf4.concat(strValueOf5) : new String(strValueOf4), entry5.getKey());
                }
                i3++;
            }
        }
        C1813ow c1813ow = (C1813ow) c0900o.m6052a(C1813ow.class);
        if (c1813ow != null) {
            m6033a(map, "ul", c1813ow.m11966a());
            m6031a(map, "sd", c1813ow.f11240a);
            m6032a(map, "sr", c1813ow.f11241b, c1813ow.f11242c);
            m6032a(map, "vp", c1813ow.f11243d, c1813ow.f11244e);
        }
        C1808or c1808or = (C1808or) c0900o.m6052a(C1808or.class);
        if (c1808or != null) {
            m6033a(map, "an", c1808or.m11933a());
            m6033a(map, "aid", c1808or.m11938c());
            m6033a(map, "aiid", c1808or.m11940d());
            m6033a(map, "av", c1808or.m11936b());
        }
        return map;
    }

    @Override // com.google.android.gms.analytics.InterfaceC0906u
    /* JADX INFO: renamed from: a */
    public final Uri mo6036a() {
        return this.f4949d;
    }

    @Override // com.google.android.gms.analytics.InterfaceC0906u
    /* JADX INFO: renamed from: a */
    public final void mo6037a(C0900o c0900o) {
        C1221aj.m7065a(c0900o);
        C1221aj.m7075b(c0900o.m6060f(), "Can't deliver not submitted measurement");
        C1221aj.m7077c("deliver should be called on worker thread");
        C0900o c0900oM6051a = c0900o.m6051a();
        C1818pa c1818pa = (C1818pa) c0900oM6051a.m6055b(C1818pa.class);
        if (TextUtils.isEmpty(c1818pa.m11979a())) {
            m12039k().m12229a(m6035b(c0900oM6051a), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(c1818pa.m11982b())) {
            m12039k().m12229a(m6035b(c0900oM6051a), "Ignoring measurement without client id");
            return;
        }
        if (this.f4947b.m12065j().m5978e()) {
            return;
        }
        double dM11992h = c1818pa.m11992h();
        if (C1897rz.m12290a(dM11992h, c1818pa.m11982b())) {
            m12024b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(dM11992h));
            return;
        }
        Map<String, String> mapM6035b = m6035b(c0900oM6051a);
        mapM6035b.put("v", "1");
        mapM6035b.put("_v", C1833pp.f11303b);
        mapM6035b.put("tid", this.f4948c);
        if (this.f4947b.m12065j().m5977d()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : mapM6035b.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            m12028c("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
            return;
        }
        HashMap map = new HashMap();
        C1897rz.m12287a(map, "uid", c1818pa.m11985c());
        C1808or c1808or = (C1808or) c0900o.m6052a(C1808or.class);
        if (c1808or != null) {
            C1897rz.m12287a(map, "an", c1808or.m11933a());
            C1897rz.m12287a(map, "aid", c1808or.m11938c());
            C1897rz.m12287a(map, "av", c1808or.m11936b());
            C1897rz.m12287a(map, "aiid", c1808or.m11940d());
        }
        mapM6035b.put("_s", String.valueOf(m12043o().m12005a(new C1837pt(0L, c1818pa.m11982b(), this.f4948c, !TextUtils.isEmpty(c1818pa.m11987d()), 0L, map))));
        m12043o().m12008a(new C1877rf(m12039k(), mapM6035b, c0900o.m6058d(), true));
    }
}
