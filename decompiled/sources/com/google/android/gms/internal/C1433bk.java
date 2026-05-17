package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.bk */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1433bk {

    /* JADX INFO: renamed from: a */
    private static final SimpleDateFormat f8303a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARN: Removed duplicated region for block: B:72:0x0288 A[PHI: r18
      0x0288: PHI (r18v3 int) = (r18v2 int), (r18v5 int) binds: [B:50:0x012a, B:55:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2087z m9511a(Context context, C1979v c1979v, String str) {
        String str2;
        long j;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("ad_base_url", null);
            String strOptString2 = jSONObject.optString("ad_url", null);
            String strOptString3 = jSONObject.optString("ad_size", null);
            String strOptString4 = jSONObject.optString("ad_slot_size", strOptString3);
            boolean z = (c1979v == null || c1979v.f11763m == 0) ? false : true;
            String strOptString5 = jSONObject.optString("ad_json", null);
            if (strOptString5 == null) {
                strOptString5 = jSONObject.optString("ad_html", null);
            }
            if (strOptString5 == null) {
                strOptString5 = jSONObject.optString("body", null);
            }
            if (strOptString5 == null && jSONObject.has("ads")) {
                strOptString5 = jSONObject.toString();
            }
            long j2 = -1;
            String strOptString6 = jSONObject.optString("debug_dialog", null);
            String strOptString7 = jSONObject.optString("debug_signals", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1L;
            String strOptString8 = jSONObject.optString("orientation", null);
            int iMo11459a = -1;
            if ("portrait".equals(strOptString8)) {
                iMo11459a = C0710au.m5571g().mo11472b();
            } else if ("landscape".equals(strOptString8)) {
                iMo11459a = C0710au.m5571g().mo11459a();
            }
            C2087z c2087zM9145a = null;
            if (!TextUtils.isEmpty(strOptString5) || TextUtils.isEmpty(strOptString2)) {
                str2 = strOptString5;
            } else {
                c2087zM9145a = BinderC1428bf.m9145a(c1979v, context, c1979v.f11761k.f10855a, strOptString2, null, null, null, null);
                strOptString = c2087zM9145a.f12609a;
                str2 = c2087zM9145a.f12610b;
                j2 = c2087zM9145a.f12621m;
            }
            if (str2 == null) {
                return new C2087z(0);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("click_urls");
            List<String> listM9513a = c2087zM9145a == null ? null : c2087zM9145a.f12611c;
            if (jSONArrayOptJSONArray != null) {
                listM9513a = m9513a(jSONArrayOptJSONArray, listM9513a);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("impression_urls");
            List<String> listM9513a2 = c2087zM9145a == null ? null : c2087zM9145a.f12613e;
            if (jSONArrayOptJSONArray2 != null) {
                listM9513a2 = m9513a(jSONArrayOptJSONArray2, listM9513a2);
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            List<String> listM9513a3 = c2087zM9145a == null ? null : c2087zM9145a.f12617i;
            if (jSONArrayOptJSONArray3 != null) {
                listM9513a3 = m9513a(jSONArrayOptJSONArray3, listM9513a3);
            }
            if (c2087zM9145a == null) {
                j = j3;
            } else {
                if (c2087zM9145a.f12619k != -1) {
                    iMo11459a = c2087zM9145a.f12619k;
                }
                if (c2087zM9145a.f12614f > 0) {
                    j = c2087zM9145a.f12614f;
                }
            }
            String strOptString9 = jSONObject.optString("active_view");
            boolean zOptBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            String strOptString10 = zOptBoolean ? jSONObject.optString("ad_passback_url", null) : null;
            boolean zOptBoolean2 = jSONObject.optBoolean("mediation", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("custom_render_allowed", false);
            boolean zOptBoolean4 = jSONObject.optBoolean("content_url_opted_out", true);
            boolean zOptBoolean5 = jSONObject.optBoolean("content_vertical_opted_out", true);
            boolean zOptBoolean6 = jSONObject.optBoolean("prefetch", false);
            long jOptLong = jSONObject.optLong("refresh_interval_milliseconds", -1L);
            return new C2087z(c1979v, strOptString, str2, listM9513a, listM9513a2, j, zOptBoolean2, jSONObject.optLong("mediation_config_cache_time_milliseconds", -1L), listM9513a3, jOptLong, iMo11459a, strOptString3, j2, strOptString6, zOptBoolean, strOptString10, strOptString9, zOptBoolean3, z, c1979v.f11766p, zOptBoolean4, zOptBoolean6, jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), C1515dv.m11203a(jSONObject.optJSONArray("rewards")), m9513a(jSONObject.optJSONArray("video_start_urls"), (List<String>) null), m9513a(jSONObject.optJSONArray("video_complete_urls"), (List<String>) null), jSONObject.optBoolean("use_displayed_impression", false), C1355ab.m7483a(jSONObject.optJSONObject("auto_protection_configuration")), c1979v.f11729G, jSONObject.optString("set_cookie", ""), m9513a(jSONObject.optJSONArray("remote_ping_urls"), (List<String>) null), jSONObject.optBoolean("render_in_browser", c1979v.f11733K), strOptString4, C1524ed.m11218a(jSONObject.optJSONObject("safe_browsing")), strOptString7, zOptBoolean5, c1979v.f11743U, jSONObject.optBoolean("custom_close_blocked"), 0);
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e.getMessage());
            C1560fm.m11615e(strValueOf.length() != 0 ? "Could not parse the inline ad response: ".concat(strValueOf) : new String("Could not parse the inline ad response: "));
            return new C2087z(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private static Integer m9512a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m9513a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    private static JSONArray m9514a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m9515a(Context context, C1425bc c1425bc) {
        String str;
        C1979v c1979v = c1425bc.f7769i;
        Location location = c1425bc.f7764d;
        C1456bs c1456bs = c1425bc.f7770j;
        Bundle bundle = c1425bc.f7761a;
        JSONObject jSONObject = c1425bc.f7771k;
        try {
            HashMap map = new HashMap();
            map.put("extra_caps", bxm.m10409f().m10546a(can.f9487bG));
            if (c1425bc.f7763c.size() > 0) {
                map.put("eid", TextUtils.join(",", c1425bc.f7763c));
            }
            if (c1979v.f11752b != null) {
                map.put("ad_pos", c1979v.f11752b);
            }
            bwx bwxVar = c1979v.f11753c;
            String strM11338a = C1555fh.m11338a();
            if (strM11338a != null) {
                map.put("abf", strM11338a);
            }
            if (bwxVar.f9208b != -1) {
                map.put("cust_age", f8303a.format(new Date(bwxVar.f9208b)));
            }
            if (bwxVar.f9209c != null) {
                map.put("extras", bwxVar.f9209c);
            }
            if (bwxVar.f9210d != -1) {
                map.put("cust_gender", Integer.valueOf(bwxVar.f9210d));
            }
            if (bwxVar.f9211e != null) {
                map.put("kw", bwxVar.f9211e);
            }
            if (bwxVar.f9213g != -1) {
                map.put("tag_for_child_directed_treatment", Integer.valueOf(bwxVar.f9213g));
            }
            if (bwxVar.f9212f) {
                if (((Boolean) bxm.m10409f().m10546a(can.f9548cO)).booleanValue()) {
                    map.put("test_request", true);
                } else {
                    map.put("adtest", "on");
                }
            }
            if (bwxVar.f9207a >= 2) {
                if (bwxVar.f9214h) {
                    map.put("d_imp_hdr", 1);
                }
                if (!TextUtils.isEmpty(bwxVar.f9215i)) {
                    map.put("ppid", bwxVar.f9215i);
                }
            }
            if (bwxVar.f9207a >= 3 && bwxVar.f9218l != null) {
                map.put("url", bwxVar.f9218l);
            }
            if (bwxVar.f9207a >= 5) {
                if (bwxVar.f9220n != null) {
                    map.put("custom_targeting", bwxVar.f9220n);
                }
                if (bwxVar.f9221o != null) {
                    map.put("category_exclusions", bwxVar.f9221o);
                }
                if (bwxVar.f9222p != null) {
                    map.put("request_agent", bwxVar.f9222p);
                }
            }
            if (bwxVar.f9207a >= 6 && bwxVar.f9223q != null) {
                map.put("request_pkg", bwxVar.f9223q);
            }
            if (bwxVar.f9207a >= 7) {
                map.put("is_designed_for_families", Boolean.valueOf(bwxVar.f9224r));
            }
            if (c1979v.f11754d.f9253g != null) {
                boolean z = false;
                boolean z2 = false;
                for (bxb bxbVar : c1979v.f11754d.f9253g) {
                    if (!bxbVar.f9255i && !z2) {
                        map.put("format", bxbVar.f9247a);
                        z2 = true;
                    }
                    if (bxbVar.f9255i && !z) {
                        map.put("fluid", "height");
                        z = true;
                    }
                    if (z2 && z) {
                        break;
                    }
                }
            } else {
                map.put("format", c1979v.f11754d.f9247a);
                if (c1979v.f11754d.f9255i) {
                    map.put("fluid", "height");
                }
            }
            if (c1979v.f11754d.f9251e == -1) {
                map.put("smart_w", "full");
            }
            if (c1979v.f11754d.f9248b == -2) {
                map.put("smart_h", "auto");
            }
            if (c1979v.f11754d.f9253g != null) {
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                for (bxb bxbVar2 : c1979v.f11754d.f9253g) {
                    if (bxbVar2.f9255i) {
                        z3 = true;
                    } else {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        sb.append(bxbVar2.f9251e == -1 ? (int) (bxbVar2.f9252f / c1456bs.f8802s) : bxbVar2.f9251e);
                        sb.append("x");
                        sb.append(bxbVar2.f9248b == -2 ? (int) (bxbVar2.f9249c / c1456bs.f8802s) : bxbVar2.f9248b);
                    }
                }
                if (z3) {
                    if (sb.length() != 0) {
                        sb.insert(0, "|");
                    }
                    sb.insert(0, "320x50");
                }
                map.put("sz", sb);
            }
            if (c1979v.f11763m != 0) {
                map.put("native_version", Integer.valueOf(c1979v.f11763m));
                map.put("native_templates", c1979v.f11764n);
                ccm ccmVar = c1979v.f11775y;
                if (ccmVar != null) {
                    switch (ccmVar.f9816c) {
                        case 0:
                            str = "any";
                            break;
                        case 1:
                            str = "portrait";
                            break;
                        case 2:
                            str = "landscape";
                            break;
                        default:
                            str = "not_set";
                            break;
                    }
                } else {
                    str = "any";
                }
                map.put("native_image_orientation", str);
                if (!c1979v.f11776z.isEmpty()) {
                    map.put("native_custom_templates", c1979v.f11776z);
                }
                if (c1979v.f11749a >= 24) {
                    map.put("max_num_ads", Integer.valueOf(c1979v.f11747Y));
                }
                if (!TextUtils.isEmpty(c1979v.f11745W)) {
                    try {
                        map.put("native_advanced_settings", new JSONArray(c1979v.f11745W));
                    } catch (JSONException e) {
                        C1560fm.m11613c("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (c1979v.f11744V != null && c1979v.f11744V.size() > 0) {
                for (Integer num : c1979v.f11744V) {
                    if (num.intValue() == 2) {
                        map.put("iba", true);
                    } else if (num.intValue() == 1) {
                        map.put("ina", true);
                    }
                }
            }
            if (c1979v.f11754d.f9256j) {
                map.put("ene", true);
            }
            if (c1979v.f11737O != null) {
                map.put("is_icon_ad", true);
                map.put("icon_ad_expansion_behavior", Integer.valueOf(c1979v.f11737O.f9307a));
            }
            map.put("slotname", c1979v.f11755e);
            map.put("pn", c1979v.f11756f.packageName);
            if (c1979v.f11757g != null) {
                map.put("vc", Integer.valueOf(c1979v.f11757g.versionCode));
            }
            map.put("ms", c1425bc.f7767g);
            map.put("seq_num", c1979v.f11759i);
            map.put("session_id", c1979v.f11760j);
            map.put("js", c1979v.f11761k.f10855a);
            C1469cc c1469cc = c1425bc.f7765e;
            Bundle bundle2 = c1979v.f11735M;
            Bundle bundle3 = c1425bc.f7762b;
            map.put("am", Integer.valueOf(c1456bs.f8784a));
            map.put("cog", m9512a(c1456bs.f8785b));
            map.put("coh", m9512a(c1456bs.f8786c));
            if (!TextUtils.isEmpty(c1456bs.f8787d)) {
                map.put("carrier", c1456bs.f8787d);
            }
            map.put("gl", c1456bs.f8788e);
            if (c1456bs.f8789f) {
                map.put("simulator", 1);
            }
            if (c1456bs.f8790g) {
                map.put("is_sidewinder", 1);
            }
            map.put("ma", m9512a(c1456bs.f8791h));
            map.put("sp", m9512a(c1456bs.f8792i));
            map.put("hl", c1456bs.f8793j);
            if (!TextUtils.isEmpty(c1456bs.f8794k)) {
                map.put("mv", c1456bs.f8794k);
            }
            map.put("muv", Integer.valueOf(c1456bs.f8796m));
            if (c1456bs.f8797n != -2) {
                map.put("cnt", Integer.valueOf(c1456bs.f8797n));
            }
            map.put("gnt", Integer.valueOf(c1456bs.f8798o));
            map.put("pt", Integer.valueOf(c1456bs.f8799p));
            map.put("rm", Integer.valueOf(c1456bs.f8800q));
            map.put("riv", Integer.valueOf(c1456bs.f8801r));
            Bundle bundle4 = new Bundle();
            bundle4.putString("build_build", c1456bs.f8809z);
            bundle4.putString("build_device", c1456bs.f8782A);
            Bundle bundle5 = new Bundle();
            bundle5.putBoolean("is_charging", c1456bs.f8806w);
            bundle5.putDouble("battery_level", c1456bs.f8805v);
            bundle4.putBundle("battery", bundle5);
            Bundle bundle6 = new Bundle();
            bundle6.putInt("active_network_state", c1456bs.f8808y);
            bundle6.putBoolean("active_network_metered", c1456bs.f8807x);
            if (c1469cc != null) {
                Bundle bundle7 = new Bundle();
                bundle7.putInt("predicted_latency_micros", c1469cc.f9779a);
                bundle7.putLong("predicted_down_throughput_bps", c1469cc.f9780b);
                bundle7.putLong("predicted_up_throughput_bps", c1469cc.f9781c);
                bundle6.putBundle("predictions", bundle7);
            }
            bundle4.putBundle("network", bundle6);
            Bundle bundle8 = new Bundle();
            bundle8.putBoolean("is_browser_custom_tabs_capable", c1456bs.f8783B);
            bundle4.putBundle("browser", bundle8);
            if (bundle2 != null) {
                Bundle bundle9 = new Bundle();
                bundle9.putString("runtime_free", Long.toString(bundle2.getLong("runtime_free_memory", -1L)));
                bundle9.putString("runtime_max", Long.toString(bundle2.getLong("runtime_max_memory", -1L)));
                bundle9.putString("runtime_total", Long.toString(bundle2.getLong("runtime_total_memory", -1L)));
                bundle9.putString("web_view_count", Integer.toString(bundle2.getInt("web_view_count", 0)));
                Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle2.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle9.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle9.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle9.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle9.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle9.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle9.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle9.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle9.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle9.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle4.putBundle("android_mem_info", bundle9);
            }
            Bundle bundle10 = new Bundle();
            bundle10.putBundle("parental_controls", bundle3);
            if (!TextUtils.isEmpty(c1456bs.f8795l)) {
                bundle10.putString("package_version", c1456bs.f8795l);
            }
            bundle4.putBundle("play_store", bundle10);
            map.put("device", bundle4);
            Bundle bundle11 = new Bundle();
            bundle11.putString("doritos", c1425bc.f7766f);
            if (((Boolean) bxm.m10409f().m10546a(can.f9477ax)).booleanValue()) {
                String strM5408a = null;
                boolean zM5409b = false;
                if (c1425bc.f7768h != null) {
                    strM5408a = c1425bc.f7768h.m5408a();
                    zM5409b = c1425bc.f7768h.m5409b();
                }
                if (TextUtils.isEmpty(strM5408a)) {
                    bxm.m10404a();
                    bundle11.putString("pdid", C1657jb.m11572b(context));
                    bundle11.putString("pdidtype", "ssaid");
                } else {
                    bundle11.putString("rdid", strM5408a);
                    bundle11.putBoolean("is_lat", zM5409b);
                    bundle11.putString("idtype", "adid");
                }
            }
            map.put("pii", bundle11);
            map.put("platform", Build.MANUFACTURER);
            map.put("submodel", Build.MODEL);
            if (location != null) {
                m9517a((HashMap<String, Object>) map, location);
            } else if (c1979v.f11753c.f9207a >= 2 && c1979v.f11753c.f9217k != null) {
                m9517a((HashMap<String, Object>) map, c1979v.f11753c.f9217k);
            }
            if (c1979v.f11749a >= 2) {
                map.put("quality_signals", c1979v.f11762l);
            }
            if (c1979v.f11749a >= 4 && c1979v.f11766p) {
                map.put("forceHttps", Boolean.valueOf(c1979v.f11766p));
            }
            if (bundle != null) {
                map.put("content_info", bundle);
            }
            if (c1979v.f11749a >= 5) {
                map.put("u_sd", Float.valueOf(c1979v.f11769s));
                map.put("sh", Integer.valueOf(c1979v.f11768r));
                map.put("sw", Integer.valueOf(c1979v.f11767q));
            } else {
                map.put("u_sd", Float.valueOf(c1456bs.f8802s));
                map.put("sh", Integer.valueOf(c1456bs.f8804u));
                map.put("sw", Integer.valueOf(c1456bs.f8803t));
            }
            if (c1979v.f11749a >= 6) {
                if (!TextUtils.isEmpty(c1979v.f11770t)) {
                    try {
                        map.put("view_hierarchy", new JSONObject(c1979v.f11770t));
                    } catch (JSONException e2) {
                        C1560fm.m11613c("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                map.put("correlation_id", Long.valueOf(c1979v.f11771u));
            }
            if (c1979v.f11749a >= 7) {
                map.put("request_id", c1979v.f11772v);
            }
            if (c1979v.f11749a >= 12 && !TextUtils.isEmpty(c1979v.f11724B)) {
                map.put("anchor", c1979v.f11724B);
            }
            if (c1979v.f11749a >= 13) {
                map.put("android_app_volume", Float.valueOf(c1979v.f11725C));
            }
            if (c1979v.f11749a >= 18) {
                map.put("android_app_muted", Boolean.valueOf(c1979v.f11731I));
            }
            if (c1979v.f11749a >= 14 && c1979v.f11726D > 0) {
                map.put("target_api", Integer.valueOf(c1979v.f11726D));
            }
            if (c1979v.f11749a >= 15) {
                map.put("scroll_index", Integer.valueOf(c1979v.f11727E == -1 ? -1 : c1979v.f11727E));
            }
            if (c1979v.f11749a >= 16) {
                map.put("_activity_context", Boolean.valueOf(c1979v.f11728F));
            }
            if (c1979v.f11749a >= 18) {
                if (!TextUtils.isEmpty(c1979v.f11732J)) {
                    try {
                        map.put("app_settings", new JSONObject(c1979v.f11732J));
                    } catch (JSONException e3) {
                        C1560fm.m11613c("Problem creating json from app settings", e3);
                    }
                }
                map.put("render_in_browser", Boolean.valueOf(c1979v.f11733K));
            }
            if (c1979v.f11749a >= 18) {
                map.put("android_num_video_cache_tasks", Integer.valueOf(c1979v.f11734L));
            }
            C1670jo c1670jo = c1979v.f11761k;
            boolean z4 = c1979v.f11748Z;
            boolean z5 = c1425bc.f7772l;
            boolean z6 = c1979v.f11751ab;
            Bundle bundle12 = new Bundle();
            Bundle bundle13 = new Bundle();
            bundle13.putString("cl", "179146524");
            bundle13.putString("rapid_rc", "dev");
            bundle13.putString("rapid_rollup", "HEAD");
            bundle12.putBundle("build_meta", bundle13);
            bundle12.putString("mf", Boolean.toString(((Boolean) bxm.m10409f().m10546a(can.f9489bI)).booleanValue()));
            bundle12.putBoolean("instant_app", z4);
            bundle12.putBoolean("lite", c1670jo.f10859e);
            bundle12.putBoolean("local_service", z5);
            bundle12.putBoolean("is_privileged_process", z6);
            map.put("sdk_env", bundle12);
            map.put("cache_state", jSONObject);
            if (c1979v.f11749a >= 19) {
                map.put("gct", c1979v.f11736N);
            }
            if (c1979v.f11749a >= 21 && c1979v.f11738P) {
                map.put("de", "1");
            }
            if (((Boolean) bxm.m10409f().m10546a(can.f9433aF)).booleanValue()) {
                String str2 = c1979v.f11754d.f9247a;
                boolean z7 = str2.equals("interstitial_mb") || str2.equals("reward_mb");
                Bundle bundle14 = c1979v.f11739Q;
                boolean z8 = bundle14 != null;
                if (z7 && z8) {
                    Bundle bundle15 = new Bundle();
                    bundle15.putBundle("interstitial_pool", bundle14);
                    map.put("counters", bundle15);
                }
            }
            if (c1979v.f11740R != null) {
                map.put("gmp_app_id", c1979v.f11740R);
            }
            if (c1979v.f11741S == null) {
                map.put("fbs_aiid", "");
            } else if ("TIME_OUT".equals(c1979v.f11741S)) {
                map.put("sai_timeout", bxm.m10409f().m10546a(can.f9469ap));
            } else {
                map.put("fbs_aiid", c1979v.f11741S);
            }
            if (c1979v.f11742T != null) {
                map.put("fbs_aeid", c1979v.f11742T);
            }
            if (c1979v.f11749a >= 24) {
                map.put("disable_ml", Boolean.valueOf(c1979v.f11750aa));
            }
            String str3 = (String) bxm.m10409f().m10546a(can.f9401A);
            if (str3 != null && !str3.isEmpty()) {
                if (Build.VERSION.SDK_INT >= ((Integer) bxm.m10409f().m10546a(can.f9402B)).intValue()) {
                    HashMap map2 = new HashMap();
                    String[] strArrSplit = str3.split(",");
                    for (String str4 : strArrSplit) {
                        map2.put(str4, C1654iz.m11551a(str4));
                    }
                    map.put("video_decoders", map2);
                }
            }
            if (C1560fm.m11609a(2)) {
                String strValueOf = String.valueOf(C0710au.m5569e().m11442a(map).toString(2));
                C1560fm.m11343a(strValueOf.length() != 0 ? "Ad Request JSON: ".concat(strValueOf) : new String("Ad Request JSON: "));
            }
            return C0710au.m5569e().m11442a(map);
        } catch (JSONException e4) {
            String strValueOf2 = String.valueOf(e4.getMessage());
            C1560fm.m11615e(strValueOf2.length() != 0 ? "Problem serializing ad request to JSON: ".concat(strValueOf2) : new String("Problem serializing ad request to JSON: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m9516a(C2087z c2087z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (c2087z.f12609a != null) {
            jSONObject.put("ad_base_url", c2087z.f12609a);
        }
        if (c2087z.f12620l != null) {
            jSONObject.put("ad_size", c2087z.f12620l);
        }
        jSONObject.put("native", c2087z.f12627s);
        if (c2087z.f12627s) {
            jSONObject.put("ad_json", c2087z.f12610b);
        } else {
            jSONObject.put("ad_html", c2087z.f12610b);
        }
        if (c2087z.f12622n != null) {
            jSONObject.put("debug_dialog", c2087z.f12622n);
        }
        if (c2087z.f12600L != null) {
            jSONObject.put("debug_signals", c2087z.f12600L);
        }
        if (c2087z.f12614f != -1) {
            jSONObject.put("interstitial_timeout", c2087z.f12614f / 1000.0d);
        }
        if (c2087z.f12619k == C0710au.m5571g().mo11472b()) {
            jSONObject.put("orientation", "portrait");
        } else if (c2087z.f12619k == C0710au.m5571g().mo11459a()) {
            jSONObject.put("orientation", "landscape");
        }
        if (c2087z.f12611c != null) {
            jSONObject.put("click_urls", m9514a(c2087z.f12611c));
        }
        if (c2087z.f12613e != null) {
            jSONObject.put("impression_urls", m9514a(c2087z.f12613e));
        }
        if (c2087z.f12617i != null) {
            jSONObject.put("manual_impression_urls", m9514a(c2087z.f12617i));
        }
        if (c2087z.f12625q != null) {
            jSONObject.put("active_view", c2087z.f12625q);
        }
        jSONObject.put("ad_is_javascript", c2087z.f12623o);
        if (c2087z.f12624p != null) {
            jSONObject.put("ad_passback_url", c2087z.f12624p);
        }
        jSONObject.put("mediation", c2087z.f12615g);
        jSONObject.put("custom_render_allowed", c2087z.f12626r);
        jSONObject.put("content_url_opted_out", c2087z.f12629u);
        jSONObject.put("content_vertical_opted_out", c2087z.f12601M);
        jSONObject.put("prefetch", c2087z.f12630v);
        if (c2087z.f12618j != -1) {
            jSONObject.put("refresh_interval_milliseconds", c2087z.f12618j);
        }
        if (c2087z.f12616h != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", c2087z.f12616h);
        }
        if (!TextUtils.isEmpty(c2087z.f12632x)) {
            jSONObject.put("gws_query_id", c2087z.f12632x);
        }
        jSONObject.put("fluid", c2087z.f12633y ? "height" : "");
        jSONObject.put("native_express", c2087z.f12634z);
        if (c2087z.f12590B != null) {
            jSONObject.put("video_start_urls", m9514a(c2087z.f12590B));
        }
        if (c2087z.f12591C != null) {
            jSONObject.put("video_complete_urls", m9514a(c2087z.f12591C));
        }
        if (c2087z.f12589A != null) {
            C1515dv c1515dv = c2087z.f12589A;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", c1515dv.f10475a);
            jSONObject2.put("rb_amount", c1515dv.f10476b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", c2087z.f12592D);
        jSONObject.put("auto_protection_configuration", c2087z.f12593E);
        jSONObject.put("render_in_browser", c2087z.f12597I);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static void m9517a(HashMap<String, Object> map, Location location) {
        HashMap map2 = new HashMap();
        Float fValueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long lValueOf = Long.valueOf(location.getTime() * 1000);
        Long lValueOf2 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long lValueOf3 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        map2.put("radius", fValueOf);
        map2.put("lat", lValueOf2);
        map2.put("long", lValueOf3);
        map2.put("time", lValueOf);
        map.put("uule", map2);
    }
}
