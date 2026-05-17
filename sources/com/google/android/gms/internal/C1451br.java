package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.br */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1451br {

    /* JADX INFO: renamed from: a */
    private final List<String> f8680a;

    /* JADX INFO: renamed from: b */
    private final String f8681b;

    /* JADX INFO: renamed from: c */
    private final String f8682c;

    /* JADX INFO: renamed from: d */
    private final String f8683d;

    /* JADX INFO: renamed from: e */
    private final boolean f8684e;

    /* JADX INFO: renamed from: f */
    private final String f8685f;

    /* JADX INFO: renamed from: g */
    private final String f8686g;

    /* JADX INFO: renamed from: h */
    private String f8687h;

    /* JADX INFO: renamed from: i */
    private final int f8688i;

    /* JADX INFO: renamed from: j */
    private final boolean f8689j;

    /* JADX INFO: renamed from: k */
    private final JSONObject f8690k;

    public C1451br(int i, Map<String, String> map) {
        this.f8687h = map.get("url");
        this.f8681b = map.get("base_uri");
        this.f8682c = map.get("post_parameters");
        this.f8684e = m10006b(map.get("drt_include"));
        this.f8685f = map.get("request_id");
        this.f8683d = map.get("type");
        this.f8680a = m10007c(map.get("errors"));
        this.f8688i = i;
        this.f8686g = map.get("fetched_ad");
        this.f8689j = m10006b(map.get("render_test_ad_label"));
        this.f8690k = new JSONObject();
    }

    public C1451br(JSONObject jSONObject) {
        this.f8687h = jSONObject.optString("url");
        this.f8681b = jSONObject.optString("base_uri");
        this.f8682c = jSONObject.optString("post_parameters");
        this.f8684e = m10006b(jSONObject.optString("drt_include"));
        this.f8685f = jSONObject.optString("request_id");
        this.f8683d = jSONObject.optString("type");
        this.f8680a = m10007c(jSONObject.optString("errors"));
        this.f8688i = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f8686g = jSONObject.optString("fetched_ad");
        this.f8689j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f8690k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m10006b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* JADX INFO: renamed from: c */
    private static List<String> m10007c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    /* JADX INFO: renamed from: a */
    public final int m10008a() {
        return this.f8688i;
    }

    /* JADX INFO: renamed from: a */
    public final void m10009a(String str) {
        this.f8687h = str;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m10010b() {
        return this.f8680a;
    }

    /* JADX INFO: renamed from: c */
    public final String m10011c() {
        return this.f8681b;
    }

    /* JADX INFO: renamed from: d */
    public final String m10012d() {
        return this.f8682c;
    }

    /* JADX INFO: renamed from: e */
    public final String m10013e() {
        return this.f8687h;
    }

    /* JADX INFO: renamed from: f */
    public final String m10014f() {
        return this.f8683d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10015g() {
        return this.f8684e;
    }

    /* JADX INFO: renamed from: h */
    public final String m10016h() {
        return this.f8685f;
    }

    /* JADX INFO: renamed from: i */
    public final String m10017i() {
        return this.f8686g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10018j() {
        return this.f8689j;
    }
}
