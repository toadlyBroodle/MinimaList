package com.google.android.gms.internal;

import com.google.firebase.database.C2227c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class bng {

    /* JADX INFO: renamed from: a */
    private static final Pattern f8467a = Pattern.compile("[\\[\\]\\.#$]");

    /* JADX INFO: renamed from: b */
    private static final Pattern f8468b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    /* JADX INFO: renamed from: a */
    public static void m9702a(bfa bfaVar) {
        bkp bkpVarM9158d = bfaVar.m9158d();
        if (bkpVarM9158d == null || !bkpVarM9158d.m9554d().startsWith(".")) {
            return;
        }
        String strValueOf = String.valueOf(bfaVar.toString());
        throw new C2227c(strValueOf.length() != 0 ? "Invalid write location: ".concat(strValueOf) : new String("Invalid write location: "));
    }

    /* JADX INFO: renamed from: a */
    public static void m9703a(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(".sv")) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!(str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || f8468b.matcher(str).find())))) {
                    throw new C2227c(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
                }
                m9703a(entry.getValue());
            }
            return;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m9703a(it.next());
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                throw new C2227c("Invalid value: Value cannot be NaN, Inf or -Inf.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9704a(String str) {
        if (!(!f8467a.matcher(str).find())) {
            throw new C2227c(new StringBuilder(String.valueOf(str).length() + 101).append("Invalid Firebase Database path: ").append(str).append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'").toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9705b(String str) {
        if (str.startsWith(".info")) {
            m9704a(str.substring(5));
        } else if (str.startsWith("/.info")) {
            m9704a(str.substring(6));
        } else {
            m9704a(str);
        }
    }
}
