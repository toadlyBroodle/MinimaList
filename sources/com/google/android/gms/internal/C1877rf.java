package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.rf */
/* JADX INFO: loaded from: classes.dex */
public final class C1877rf {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f11452a;

    /* JADX INFO: renamed from: b */
    private final List<C1856ql> f11453b;

    /* JADX INFO: renamed from: c */
    private final long f11454c;

    /* JADX INFO: renamed from: d */
    private final long f11455d;

    /* JADX INFO: renamed from: e */
    private final int f11456e;

    /* JADX INFO: renamed from: f */
    private final boolean f11457f;

    /* JADX INFO: renamed from: g */
    private final String f11458g;

    public C1877rf(C1830pm c1830pm, Map<String, String> map, long j, boolean z) {
        this(c1830pm, map, j, z, 0L, 0, null);
    }

    public C1877rf(C1830pm c1830pm, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(c1830pm, map, j, z, j2, i, null);
    }

    public C1877rf(C1830pm c1830pm, Map<String, String> map, long j, boolean z, long j2, int i, List<C1856ql> list) {
        String strM12205a;
        String strM12205a2;
        C1221aj.m7065a(c1830pm);
        C1221aj.m7065a(map);
        this.f11455d = j;
        this.f11457f = z;
        this.f11454c = j2;
        this.f11456e = i;
        this.f11453b = list != null ? list : Collections.emptyList();
        this.f11458g = m12207a(list);
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (m12208a(entry.getKey()) && (strM12205a2 = m12205a(c1830pm, entry.getKey())) != null) {
                map2.put(strM12205a2, m12209b(c1830pm, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!m12208a(entry2.getKey()) && (strM12205a = m12205a(c1830pm, entry2.getKey())) != null) {
                map2.put(strM12205a, m12209b(c1830pm, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.f11458g)) {
            C1897rz.m12287a(map2, "_v", this.f11458g);
            if (this.f11458g.equals("ma4.0.0") || this.f11458g.equals("ma4.0.1")) {
                map2.remove("adid");
            }
        }
        this.f11452a = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    private static String m12205a(C1830pm c1830pm, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith("&")) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            string = string.substring(0, 256);
            c1830pm.m12029c("Hit param name is too long and will be trimmed", Integer.valueOf(length), string);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    private final String m12206a(String str, String str2) {
        C1221aj.m7067a(str);
        C1221aj.m7075b(!str.startsWith("&"), "Short param name required");
        String str3 = this.f11452a.get(str);
        return str3 != null ? str3 : str2;
    }

    /* JADX INFO: renamed from: a */
    private static String m12207a(List<C1856ql> list) {
        String strM12158b;
        if (list != null) {
            for (C1856ql c1856ql : list) {
                if ("appendVersion".equals(c1856ql.m12157a())) {
                    strM12158b = c1856ql.m12158b();
                    break;
                }
            }
            strM12158b = null;
        } else {
            strM12158b = null;
        }
        if (TextUtils.isEmpty(strM12158b)) {
            return null;
        }
        return strM12158b;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12208a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* JADX INFO: renamed from: b */
    private static String m12209b(C1830pm c1830pm, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, 8192);
        c1830pm.m12029c("Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: a */
    public final int m12210a() {
        return this.f11456e;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m12211b() {
        return this.f11452a;
    }

    /* JADX INFO: renamed from: c */
    public final long m12212c() {
        return this.f11454c;
    }

    /* JADX INFO: renamed from: d */
    public final long m12213d() {
        return this.f11455d;
    }

    /* JADX INFO: renamed from: e */
    public final List<C1856ql> m12214e() {
        return this.f11453b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12215f() {
        return this.f11457f;
    }

    /* JADX INFO: renamed from: g */
    public final long m12216g() {
        return C1897rz.m12283a(m12206a("_s", "0"));
    }

    /* JADX INFO: renamed from: h */
    public final String m12217h() {
        return m12206a("_m", "");
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=").append(this.f11455d);
        if (this.f11454c != 0) {
            stringBuffer.append(", dbId=").append(this.f11454c);
        }
        if (this.f11456e != 0) {
            stringBuffer.append(", appUID=").append(this.f11456e);
        }
        ArrayList arrayList = new ArrayList(this.f11452a.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(this.f11452a.get(str));
        }
        return stringBuffer.toString();
    }
}
