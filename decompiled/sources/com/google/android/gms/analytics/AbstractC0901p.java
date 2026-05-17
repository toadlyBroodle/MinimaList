package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC0901p;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.analytics.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0901p<T extends AbstractC0901p> {
    /* JADX INFO: renamed from: a */
    public static String m6065a(Object obj) {
        return m6066a(obj, 0);
    }

    /* JADX INFO: renamed from: a */
    private static String m6066a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0 ? "" : obj.toString();
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d ? "" : obj.toString();
        }
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
        }
        if (obj instanceof List) {
            StringBuffer stringBuffer = new StringBuffer();
            if (i > 0) {
                stringBuffer.append("[");
            }
            int length = stringBuffer.length();
            for (Object obj2 : (List) obj) {
                if (stringBuffer.length() > length) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(m6066a(obj2, i + 1));
            }
            if (i > 0) {
                stringBuffer.append("]");
            }
            return stringBuffer.toString();
        }
        if (!(obj instanceof Map)) {
            return obj.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        int length2 = 0;
        boolean z = false;
        for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
            String strM6066a = m6066a(entry.getValue(), i + 1);
            if (!TextUtils.isEmpty(strM6066a)) {
                if (i > 0 && !z) {
                    stringBuffer2.append("{");
                    z = true;
                    length2 = stringBuffer2.length();
                }
                if (stringBuffer2.length() > length2) {
                    stringBuffer2.append(", ");
                }
                stringBuffer2.append((String) entry.getKey());
                stringBuffer2.append('=');
                stringBuffer2.append(strM6066a);
            }
        }
        if (z) {
            stringBuffer2.append("}");
        }
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m6067a(Map map) {
        return m6066a(map, 1);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6068a(T t);
}
