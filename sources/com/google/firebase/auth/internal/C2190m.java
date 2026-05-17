package com.google.firebase.auth.internal;

import android.support.v4.p018i.C0207a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.aym;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.m */
/* JADX INFO: loaded from: classes.dex */
final class C2190m {
    /* JADX INFO: renamed from: a */
    private static List<Object> m12884a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jSONArray.length()) {
                return arrayList;
            }
            Object objM12886a = jSONArray.get(i2);
            if (objM12886a instanceof JSONArray) {
                objM12886a = m12884a((JSONArray) objM12886a);
            } else if (objM12886a instanceof JSONObject) {
                objM12886a = m12886a((JSONObject) objM12886a);
            }
            arrayList.add(objM12886a);
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m12885a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m12886a(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("RawUserInfoParser", "Failed to parse JSONObject into Map.");
            throw new aym(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, Object> m12886a(JSONObject jSONObject) throws JSONException {
        C0207a c0207a = new C0207a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objM12886a = jSONObject.get(next);
            if (objM12886a instanceof JSONArray) {
                objM12886a = m12884a((JSONArray) objM12886a);
            } else if (objM12886a instanceof JSONObject) {
                objM12886a = m12886a((JSONObject) objM12886a);
            }
            c0207a.put(next, objM12886a);
        }
        return c0207a;
    }
}
