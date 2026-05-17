package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class apr {
    /* JADX INFO: renamed from: a */
    public static ajy m8114a(Object obj) throws JSONException {
        JSONArray jSONArray;
        String string;
        JSONArray jSONArray2;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            string = jSONObject.getString("name");
            jSONArray2 = jSONObject.getJSONArray("params");
            jSONArray = jSONObject.getJSONArray("instructions");
        } else {
            if (!(obj instanceof JSONArray)) {
                throw new IllegalArgumentException("invalid JSON in runtime section");
            }
            JSONArray jSONArray3 = (JSONArray) obj;
            C1221aj.m7074b(jSONArray3.length() >= 3);
            String string2 = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            JSONArray jSONArray5 = new JSONArray();
            for (int i = 1; i < jSONArray4.length(); i++) {
                C1221aj.m7074b(jSONArray4.get(i) instanceof String);
                jSONArray5.put(jSONArray4.get(i));
            }
            JSONArray jSONArray6 = new JSONArray();
            for (int i2 = 3; i2 < jSONArray3.length(); i2++) {
                jSONArray6.put(jSONArray3.get(i2));
            }
            jSONArray = jSONArray6;
            string = string2;
            jSONArray2 = jSONArray5;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            arrayList.add(jSONArray2.getString(i3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONArray jSONArray7 = jSONArray.getJSONArray(i4);
            if (jSONArray7.length() != 0) {
                arrayList2.add(m8122b(jSONArray7));
            }
        }
        return new ajy(null, string, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: a */
    static aqs m8115a(String str) throws JSONException, apq {
        Object obj = new JSONObject(str).get("resource");
        if (!(obj instanceof JSONObject)) {
            throw new apq("Resource map not found");
        }
        JSONObject jSONObject = (JSONObject) obj;
        aqt aqtVar = new aqt();
        aqtVar.m8171a(jSONObject.optString("version"));
        List<String> listM8119a = m8119a(jSONObject.getJSONArray("macros"));
        List<aqu> listM8120a = m8120a(jSONObject.getJSONArray("tags"), listM8119a);
        List<aqu> listM8120a2 = m8120a(jSONObject.getJSONArray("predicates"), listM8119a);
        Iterator<aqu> it = m8120a(jSONObject.getJSONArray("macros"), listM8119a).iterator();
        while (it.hasNext()) {
            aqtVar.m8169a(it.next());
        }
        JSONArray jSONArray = jSONObject.getJSONArray("rules");
        for (int i = 0; i < jSONArray.length(); i++) {
            aqtVar.m8170a(m8117a(jSONArray.getJSONArray(i), listM8120a, listM8120a2));
        }
        return aqtVar.m8168a();
    }

    /* JADX INFO: renamed from: a */
    private static aqu m8116a(JSONObject jSONObject, List<String> list) {
        aqw aqwVar = new aqw();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            are areVarM8201a = m8118a(jSONObject.get(next), list).m8201a();
            if ("push_after_evaluate".equals(next)) {
                aqwVar.m8174a(areVarM8201a);
            } else {
                aqwVar.m8175a(next, areVarM8201a);
            }
        }
        return aqwVar.m8173a();
    }

    /* JADX INFO: renamed from: a */
    private static aqy m8117a(JSONArray jSONArray, List<aqu> list, List<aqu> list2) throws JSONException, apq {
        ara araVar = new ara();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            if (jSONArray2.getString(0).equals("if")) {
                for (int i2 = 1; i2 < jSONArray2.length(); i2++) {
                    araVar.m8190a(list2.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                for (int i3 = 1; i3 < jSONArray2.length(); i3++) {
                    araVar.m8191b(list2.get(jSONArray2.getInt(i3)));
                }
            } else if (jSONArray2.getString(0).equals("add")) {
                for (int i4 = 1; i4 < jSONArray2.length(); i4++) {
                    araVar.m8192c(list.get(jSONArray2.getInt(i4)));
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                for (int i5 = 1; i5 < jSONArray2.length(); i5++) {
                    araVar.m8193d(list.get(jSONArray2.getInt(i5)));
                }
            } else {
                String strValueOf = String.valueOf(jSONArray2.getString(0));
                m8123c(strValueOf.length() != 0 ? "Unknown Rule property: ".concat(strValueOf) : new String("Unknown Rule property: "));
            }
        }
        return araVar.m8189a();
    }

    /* JADX INFO: renamed from: a */
    private static arg m8118a(Object obj, List<String> list) throws JSONException, apq {
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof Boolean) {
                return new arg(8, obj);
            }
            if (obj instanceof Integer) {
                return new arg(6, obj);
            }
            if (obj instanceof String) {
                return new arg(1, obj);
            }
            String strValueOf = String.valueOf(obj);
            m8123c(new StringBuilder(String.valueOf(strValueOf).length() + 20).append("Invalid value type: ").append(strValueOf).toString());
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        String string = jSONArray.getString(0);
        if (string.equals("escape")) {
            arg argVarM8118a = m8118a(jSONArray.get(1), list);
            for (int i = 2; i < jSONArray.length(); i++) {
                argVarM8118a.m8202a(jSONArray.getInt(i));
            }
            return argVarM8118a;
        }
        if (string.equals("list")) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                arrayList.add(m8118a(jSONArray.get(i2), list).m8201a());
            }
            arg argVar = new arg(2, arrayList);
            argVar.m8203a(true);
            return argVar;
        }
        if (string.equals("map")) {
            HashMap map = new HashMap();
            for (int i3 = 1; i3 < jSONArray.length(); i3 += 2) {
                map.put(m8118a(jSONArray.get(i3), list).m8201a(), m8118a(jSONArray.get(i3 + 1), list).m8201a());
            }
            arg argVar2 = new arg(3, map);
            argVar2.m8203a(true);
            return argVar2;
        }
        if (string.equals("macro")) {
            arg argVar3 = new arg(4, list.get(jSONArray.getInt(1)));
            argVar3.m8203a(true);
            return argVar3;
        }
        if (!string.equals("template")) {
            String strValueOf2 = String.valueOf(obj);
            m8123c(new StringBuilder(String.valueOf(strValueOf2).length() + 20).append("Invalid value type: ").append(strValueOf2).toString());
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 1; i4 < jSONArray.length(); i4++) {
            arrayList2.add(m8118a(jSONArray.get(i4), list).m8201a());
        }
        arg argVar4 = new arg(7, arrayList2);
        argVar4.m8203a(true);
        return argVar4;
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m8119a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i).getString("instance_name"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static List<aqu> m8120a(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m8116a(jSONArray.getJSONObject(i), list));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    static arb m8121b(String str) throws JSONException, apq {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("runtime");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ard ardVar = new ard();
        Object obj = jSONObject.get("resource");
        if (!(obj instanceof JSONObject)) {
            throw new apq("Resource map not found");
        }
        ardVar.m8197a(((JSONObject) obj).optString("version"));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jSONArrayOptJSONArray.length()) {
                return ardVar.m8195a();
            }
            Object obj2 = jSONArrayOptJSONArray.get(i2);
            if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                ardVar.m8196a(m8114a(obj2));
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static ars m8122b(JSONArray jSONArray) throws JSONException {
        C1221aj.m7074b(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(m8122b(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(arn.f7153d);
            } else {
                arrayList.add(arv.m8227a(obj));
            }
        }
        return new ars(string, arrayList);
    }

    /* JADX INFO: renamed from: c */
    private static void m8123c(String str) throws apq {
        ahs.m7942a(str);
        throw new apq(str);
    }
}
