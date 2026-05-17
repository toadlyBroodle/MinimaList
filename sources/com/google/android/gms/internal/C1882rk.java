package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.rk */
/* JADX INFO: loaded from: classes.dex */
public class C1882rk extends AbstractC1832po {

    /* JADX INFO: renamed from: a */
    private static C1882rk f11467a;

    public C1882rk(C1834pq c1834pq) {
        super(c1834pq);
    }

    /* JADX INFO: renamed from: a */
    private static String m12225a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objValueOf = obj instanceof Integer ? Long.valueOf(((Integer) obj).intValue()) : obj;
        if (!(objValueOf instanceof Long)) {
            return objValueOf instanceof Boolean ? String.valueOf(objValueOf) : objValueOf instanceof Throwable ? objValueOf.getClass().getCanonicalName() : "-";
        }
        if (Math.abs(((Long) objValueOf).longValue()) < 100) {
            return String.valueOf(objValueOf);
        }
        String str = String.valueOf(objValueOf).charAt(0) == '-' ? "-" : "";
        String strValueOf = String.valueOf(Math.abs(((Long) objValueOf).longValue()));
        return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
    }

    /* JADX INFO: renamed from: b */
    public static C1882rk m12226b() {
        return f11467a;
    }

    @Override // com.google.android.gms.internal.AbstractC1832po
    /* JADX INFO: renamed from: a */
    protected final void mo6013a() {
        synchronized (C1882rk.class) {
            f11467a = this;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m12227a(int i, String str, Object obj, Object obj2, Object obj3) {
        synchronized (this) {
            C1221aj.m7065a(str);
            int i2 = i >= 0 ? i : 0;
            int i3 = i2 >= 9 ? 8 : i2;
            char c = m12040l().m12180a() ? 'C' : 'c';
            char cCharAt = "01VDIWEA?".charAt(i3);
            String str2 = C1833pp.f11302a;
            String strC = m12018c(str, m12225a(obj), m12225a(obj2), m12225a(obj3));
            String string = new StringBuilder(String.valueOf("3").length() + 3 + String.valueOf(str2).length() + String.valueOf(strC).length()).append("3").append(cCharAt).append(c).append(str2).append(":").append(strC).toString();
            if (string.length() > 1024) {
                string = string.substring(0, 1024);
            }
            C1886ro c1886roM12068m = m12036h().m12068m();
            if (c1886roM12068m != null) {
                c1886roM12068m.m12260g().m12268a(string);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12228a(C1877rf c1877rf, String str) {
        String string = c1877rf != null ? c1877rf.toString() : "no hit data";
        String strValueOf = String.valueOf(str);
        m12031d(strValueOf.length() != 0 ? "Discarding hit. ".concat(strValueOf) : new String("Discarding hit. "), string);
    }

    /* JADX INFO: renamed from: a */
    public final void m12229a(Map<String, String> map, String str) {
        String string;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            string = sb.toString();
        } else {
            string = "no hit data";
        }
        String strValueOf = String.valueOf(str);
        m12031d(strValueOf.length() != 0 ? "Discarding hit. ".concat(strValueOf) : new String("Discarding hit. "), string);
    }
}
