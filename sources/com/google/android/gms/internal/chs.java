package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class chs {

    /* JADX INFO: renamed from: a */
    public final String f10015a;

    /* JADX INFO: renamed from: b */
    public final String f10016b;

    /* JADX INFO: renamed from: c */
    public final List<String> f10017c;

    /* JADX INFO: renamed from: d */
    public final String f10018d;

    /* JADX INFO: renamed from: e */
    public final String f10019e;

    /* JADX INFO: renamed from: f */
    public final List<String> f10020f;

    /* JADX INFO: renamed from: g */
    public final List<String> f10021g;

    /* JADX INFO: renamed from: h */
    public final List<String> f10022h;

    /* JADX INFO: renamed from: i */
    public final List<String> f10023i;

    /* JADX INFO: renamed from: j */
    public final String f10024j;

    /* JADX INFO: renamed from: k */
    public final List<String> f10025k;

    /* JADX INFO: renamed from: l */
    public final List<String> f10026l;

    /* JADX INFO: renamed from: m */
    public final String f10027m;

    /* JADX INFO: renamed from: n */
    public final String f10028n;

    /* JADX INFO: renamed from: o */
    public final String f10029o;

    /* JADX INFO: renamed from: p */
    public final List<String> f10030p;

    /* JADX INFO: renamed from: q */
    public final String f10031q;

    /* JADX INFO: renamed from: r */
    public final long f10032r;

    /* JADX INFO: renamed from: s */
    private String f10033s;

    public chs(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, String str5, String str6, List<String> list5, List<String> list6, String str7, String str8, String str9, List<String> list7, String str10, List<String> list8, String str11, long j) {
        this.f10015a = str;
        this.f10016b = null;
        this.f10017c = list;
        this.f10018d = null;
        this.f10019e = null;
        this.f10020f = list2;
        this.f10021g = list3;
        this.f10022h = list4;
        this.f10024j = str5;
        this.f10025k = list5;
        this.f10026l = list6;
        this.f10027m = null;
        this.f10028n = null;
        this.f10029o = null;
        this.f10030p = null;
        this.f10031q = null;
        this.f10023i = list8;
        this.f10033s = null;
        this.f10032r = -1L;
    }

    public chs(JSONObject jSONObject) throws JSONException {
        List<String> listM10919a;
        this.f10016b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f10017c = Collections.unmodifiableList(arrayList);
        this.f10018d = jSONObject.optString("allocation_id", null);
        C0710au.m5586v();
        this.f10020f = cib.m10919a(jSONObject, "clickurl");
        C0710au.m5586v();
        this.f10021g = cib.m10919a(jSONObject, "imp_urls");
        C0710au.m5586v();
        this.f10023i = cib.m10919a(jSONObject, "fill_urls");
        C0710au.m5586v();
        this.f10025k = cib.m10919a(jSONObject, "video_start_urls");
        C0710au.m5586v();
        this.f10026l = cib.m10919a(jSONObject, "video_complete_urls");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            C0710au.m5586v();
            listM10919a = cib.m10919a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listM10919a = null;
        }
        this.f10022h = listM10919a;
        this.f10015a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f10024j = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f10019e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.f10027m = jSONObject.optString("html_template", null);
        this.f10028n = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.f10029o = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        C0710au.m5586v();
        this.f10030p = cib.m10919a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f10031q = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.f10033s = jSONObject.optString("response_type", null);
        this.f10032r = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10865a() {
        return "banner".equalsIgnoreCase(this.f10033s);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10866b() {
        return "native".equalsIgnoreCase(this.f10033s);
    }
}
