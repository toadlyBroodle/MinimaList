package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.p052a.C1072a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.vu */
/* JADX INFO: loaded from: classes.dex */
public final class C2000vu {

    /* JADX INFO: renamed from: a */
    private static final C1992vm f11830a = new C1992vm("MetadataUtils");

    /* JADX INFO: renamed from: b */
    private static final String[] f11831b = {"Z", "+hh", "+hhmm", "+hh:mm"};

    /* JADX INFO: renamed from: c */
    private static final String f11832c;

    static {
        String strValueOf = String.valueOf("yyyyMMdd'T'HHmmss");
        String strValueOf2 = String.valueOf(f11831b[0]);
        f11832c = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: a */
    public static Calendar m12475a(String str) {
        if (TextUtils.isEmpty(str)) {
            f11830a.m12445a("Input string is empty or null", new Object[0]);
            return null;
        }
        String strM12478b = m12478b(str);
        if (TextUtils.isEmpty(strM12478b)) {
            f11830a.m12445a("Invalid date format", new Object[0]);
            return null;
        }
        String strM12479c = m12479c(str);
        String str2 = "yyyyMMdd";
        if (!TextUtils.isEmpty(strM12479c)) {
            String strValueOf = String.valueOf(strM12478b);
            strM12478b = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strM12479c).length()).append(strValueOf).append("T").append(strM12479c).toString();
            str2 = strM12479c.length() == 6 ? "yyyyMMdd'T'HHmmss" : f11832c;
        }
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(strM12478b));
            return gregorianCalendar;
        } catch (ParseException e) {
            f11830a.m12445a("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12476a(List<C1072a> list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new C1072a(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException e) {
                }
            }
        } catch (JSONException e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12477a(JSONObject jSONObject, List<C1072a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C1072a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m6620d());
        }
        try {
            jSONObject.put("images", jSONArray);
        } catch (JSONException e) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m12478b(String str) {
        if (TextUtils.isEmpty(str)) {
            f11830a.m12445a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e) {
            f11830a.m12447b("Error extracting the date: %s", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m12479c(String str) {
        if (TextUtils.isEmpty(str)) {
            f11830a.m12445a("string is empty or null", new Object[0]);
            return null;
        }
        int iIndexOf = str.indexOf(84);
        int i = iIndexOf + 1;
        if (iIndexOf != 8) {
            f11830a.m12445a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String strSubstring = str.substring(i);
            if (strSubstring.length() == 6) {
                return strSubstring;
            }
            switch (strSubstring.charAt(6)) {
                case '+':
                case '-':
                    int length = strSubstring.length();
                    if (length == f11831b[1].length() + 6 || length == f11831b[2].length() + 6 || length == f11831b[3].length() + 6) {
                    }
                    break;
                case 'Z':
                    if (strSubstring.length() == f11831b[0].length() + 6) {
                        String strValueOf = String.valueOf(strSubstring.substring(0, strSubstring.length() - 1));
                        String strValueOf2 = String.valueOf("+0000");
                        if (strValueOf2.length() == 0) {
                        }
                    }
                    break;
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            f11830a.m12445a("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }
}
