package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ey */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1545ey {

    /* JADX INFO: renamed from: a */
    private final long f10584a;

    /* JADX INFO: renamed from: e */
    private String f10588e;

    /* JADX INFO: renamed from: f */
    private String f10589f;

    /* JADX INFO: renamed from: b */
    private final List<String> f10585b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final List<String> f10586c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final Map<String, cht> f10587d = new HashMap();

    /* JADX INFO: renamed from: g */
    private boolean f10590g = false;

    public C1545ey(String str, long j) {
        this.f10589f = str;
        this.f10584a = j;
        m11270a(str);
    }

    /* JADX INFO: renamed from: a */
    private final void m11270a(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("status", -1) != 1) {
                this.f10590g = false;
                C1560fm.m11615e("App settings could not be fetched successfully.");
                return;
            }
            this.f10590g = true;
            this.f10588e = jSONObject.optString("app_id");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f10586c.add(strOptString2);
                        } else if ("rewarded".equalsIgnoreCase(strOptString) && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f10587d.put(strOptString2, new cht(jSONObjectOptJSONObject));
                        }
                    }
                }
            }
            m11271a(jSONObject);
        } catch (JSONException e) {
            C1560fm.m11613c("Exception occurred while processing app setting json", e);
            C0710au.m5573i().m11292a(e, "AppSettings.parseAppSettingsJson");
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m11271a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.f10585b.add(jSONArrayOptJSONArray.optString(i));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m11272a() {
        return this.f10584a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11273b() {
        return this.f10590g;
    }

    /* JADX INFO: renamed from: c */
    public final String m11274c() {
        return this.f10589f;
    }

    /* JADX INFO: renamed from: d */
    public final String m11275d() {
        return this.f10588e;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, cht> m11276e() {
        return this.f10587d;
    }
}
