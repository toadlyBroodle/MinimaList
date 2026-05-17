package com.google.android.gms.internal;

import com.google.firebase.database.C2227c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bhk {

    /* JADX INFO: renamed from: a */
    private final List<String> f8164a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private int f8165b;

    private bhk(bfa bfaVar) {
        this.f8165b = 0;
        Iterator<bkp> it = bfaVar.iterator();
        while (it.hasNext()) {
            this.f8164a.add(it.next().m9554d());
        }
        this.f8165b = Math.max(1, this.f8164a.size());
        for (int i = 0; i < this.f8164a.size(); i++) {
            this.f8165b = m9314a((CharSequence) this.f8164a.get(i)) + this.f8165b;
        }
        m9320b();
    }

    /* JADX INFO: renamed from: a */
    private static int m9314a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt <= 127) {
                i2++;
            } else if (cCharAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private final String m9315a() {
        String strRemove = this.f8164a.remove(this.f8164a.size() - 1);
        this.f8165b -= m9314a((CharSequence) strRemove);
        if (this.f8164a.size() > 0) {
            this.f8165b--;
        }
        return strRemove;
    }

    /* JADX INFO: renamed from: a */
    private static String m9316a(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return sb.toString();
            }
            if (i2 > 0) {
                sb.append(str);
            }
            sb.append(list.get(i2));
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9317a(bfa bfaVar, Object obj) {
        new bhk(bfaVar).m9318a(obj);
    }

    /* JADX INFO: renamed from: a */
    private final void m9318a(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    m9319a(str);
                    m9318a(map.get(str));
                    m9315a();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                m9319a(Integer.toString(i));
                m9318a(list.get(i));
                m9315a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m9319a(String str) {
        if (this.f8164a.size() > 0) {
            this.f8165b++;
        }
        this.f8164a.add(str);
        this.f8165b += m9314a((CharSequence) str);
        m9320b();
    }

    /* JADX INFO: renamed from: b */
    private final void m9320b() {
        String string;
        if (this.f8165b > 768) {
            throw new C2227c(new StringBuilder(String.valueOf("Data has a key path longer than 768 bytes (").length() + 13).append("Data has a key path longer than 768 bytes (").append(this.f8165b).append(").").toString());
        }
        if (this.f8164a.size() > 32) {
            String strValueOf = String.valueOf("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            if (this.f8164a.size() == 0) {
                string = "";
            } else {
                String strM9316a = m9316a("/", this.f8164a);
                string = new StringBuilder(String.valueOf(strM9316a).length() + 10).append("in path '").append(strM9316a).append("'").toString();
            }
            String strValueOf2 = String.valueOf(string);
            throw new C2227c(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
    }
}
