package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cht {

    /* JADX INFO: renamed from: a */
    public final List<chs> f10034a;

    /* JADX INFO: renamed from: b */
    public final long f10035b;

    /* JADX INFO: renamed from: c */
    public final List<String> f10036c;

    /* JADX INFO: renamed from: d */
    public final List<String> f10037d;

    /* JADX INFO: renamed from: e */
    public final List<String> f10038e;

    /* JADX INFO: renamed from: f */
    public final List<String> f10039f;

    /* JADX INFO: renamed from: g */
    public final boolean f10040g;

    /* JADX INFO: renamed from: h */
    public final String f10041h;

    /* JADX INFO: renamed from: i */
    public final long f10042i;

    /* JADX INFO: renamed from: j */
    public final String f10043j;

    /* JADX INFO: renamed from: k */
    public final int f10044k;

    /* JADX INFO: renamed from: l */
    public final int f10045l;

    /* JADX INFO: renamed from: m */
    public final long f10046m;

    /* JADX INFO: renamed from: n */
    public final boolean f10047n;

    /* JADX INFO: renamed from: o */
    public final boolean f10048o;

    /* JADX INFO: renamed from: p */
    public final boolean f10049p;

    /* JADX INFO: renamed from: q */
    public int f10050q;

    /* JADX INFO: renamed from: r */
    public int f10051r;

    /* JADX INFO: renamed from: s */
    public boolean f10052s;

    public cht(String str) {
        this(new JSONObject(str));
    }

    public cht(List<chs> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f10034a = list;
        this.f10035b = j;
        this.f10036c = list2;
        this.f10037d = list3;
        this.f10038e = list4;
        this.f10039f = list5;
        this.f10040g = z;
        this.f10041h = str;
        this.f10042i = -1L;
        this.f10050q = 0;
        this.f10051r = 1;
        this.f10043j = null;
        this.f10044k = 0;
        this.f10045l = -1;
        this.f10046m = -1L;
        this.f10047n = false;
        this.f10048o = false;
        this.f10049p = false;
        this.f10052s = false;
    }

    public cht(JSONObject jSONObject) throws JSONException {
        if (C1560fm.m11609a(2)) {
            String strValueOf = String.valueOf(jSONObject.toString(2));
            C1560fm.m11343a(strValueOf.length() != 0 ? "Mediation Response JSON: ".concat(strValueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            chs chsVar = new chs(jSONArray.getJSONObject(i2));
            if (chsVar.m10865a()) {
                this.f10052s = true;
            }
            arrayList.add(chsVar);
            if (i < 0 && m10867a(chsVar)) {
                i = i2;
            }
        }
        this.f10050q = i;
        this.f10051r = jSONArray.length();
        this.f10034a = Collections.unmodifiableList(arrayList);
        this.f10041h = jSONObject.optString("qdata");
        this.f10045l = jSONObject.optInt("fs_model_type", -1);
        this.f10046m = jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.f10035b = -1L;
            this.f10036c = null;
            this.f10037d = null;
            this.f10038e = null;
            this.f10039f = null;
            this.f10042i = -1L;
            this.f10043j = null;
            this.f10044k = 0;
            this.f10047n = false;
            this.f10040g = false;
            this.f10048o = false;
            this.f10049p = false;
            return;
        }
        this.f10035b = jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        C0710au.m5586v();
        this.f10036c = cib.m10919a(jSONObjectOptJSONObject, "click_urls");
        C0710au.m5586v();
        this.f10037d = cib.m10919a(jSONObjectOptJSONObject, "imp_urls");
        C0710au.m5586v();
        this.f10038e = cib.m10919a(jSONObjectOptJSONObject, "nofill_urls");
        C0710au.m5586v();
        this.f10039f = cib.m10919a(jSONObjectOptJSONObject, "remote_ping_urls");
        this.f10040g = jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        long jOptLong = jSONObjectOptJSONObject.optLong("refresh", -1L);
        this.f10042i = jOptLong > 0 ? jOptLong * 1000 : -1L;
        C1515dv c1515dvM11203a = C1515dv.m11203a(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (c1515dvM11203a == null) {
            this.f10043j = null;
            this.f10044k = 0;
        } else {
            this.f10043j = c1515dvM11203a.f10475a;
            this.f10044k = c1515dvM11203a.f10476b;
        }
        this.f10047n = jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        this.f10048o = jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        this.f10049p = jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m10867a(chs chsVar) {
        Iterator<String> it = chsVar.f10017c.iterator();
        while (it.hasNext()) {
            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
