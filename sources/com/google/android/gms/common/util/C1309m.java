package com.google.android.gms.common.util;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.common.util.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1309m {

    /* JADX INFO: renamed from: a */
    private static final Pattern f6044a = Pattern.compile("\\\\.");

    /* JADX INFO: renamed from: b */
    private static final Pattern f6045b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* JADX INFO: renamed from: a */
    public static boolean m7277a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    if (!m7277a(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException e) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!m7277a(jSONArray.get(i), jSONArray2.get(i))) {
                    return false;
                }
            } catch (JSONException e2) {
                return false;
            }
        }
        return true;
    }
}
