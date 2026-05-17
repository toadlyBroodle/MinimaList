package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class bms {
    /* JADX INFO: renamed from: a */
    public static String m9675a(Object obj) throws IOException {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e) {
                throw new IOException("Could not serialize number", e);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            m9678a(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e2) {
            throw new IOException("Failed to serialize JSON", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m9676a(String str) throws IOException {
        try {
            return m9677a(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, Object> m9677a(JSONObject jSONObject) {
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, m9679b(jSONObject.get(next)));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m9678a(Object obj, JSONStringer jSONStringer) throws JSONException {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                m9678a(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            m9678a(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    /* JADX INFO: renamed from: b */
    private static Object m9679b(Object obj) {
        if (obj instanceof JSONObject) {
            return m9677a((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m9679b(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static Object m9680b(String str) throws IOException {
        try {
            return m9679b(new JSONTokener(str).nextValue());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
