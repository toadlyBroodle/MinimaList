package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.firebase.iid.ab */
/* JADX INFO: loaded from: classes.dex */
final class C2289ab {

    /* JADX INFO: renamed from: b */
    private static final long f12987b = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a */
    final String f12988a;

    /* JADX INFO: renamed from: c */
    private String f12989c;

    /* JADX INFO: renamed from: d */
    private long f12990d;

    private C2289ab(String str, String str2, long j) {
        this.f12988a = str;
        this.f12989c = str2;
        this.f12990d = j;
    }

    /* JADX INFO: renamed from: a */
    static C2289ab m13064a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2289ab(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2289ab(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 23).append("Failed to parse token: ").append(strValueOf).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    static String m13065a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(strValueOf).length() + 24).append("Failed to encode token: ").append(strValueOf).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    final boolean m13066b(String str) {
        return System.currentTimeMillis() > this.f12990d + f12987b || !str.equals(this.f12989c);
    }
}
