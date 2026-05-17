package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.bp */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1449bp {

    /* JADX INFO: renamed from: A */
    private C1355ab f8585A;

    /* JADX INFO: renamed from: C */
    private String f8587C;

    /* JADX INFO: renamed from: D */
    private List<String> f8588D;

    /* JADX INFO: renamed from: E */
    private boolean f8589E;

    /* JADX INFO: renamed from: F */
    private String f8590F;

    /* JADX INFO: renamed from: G */
    private C1524ed f8591G;

    /* JADX INFO: renamed from: H */
    private boolean f8592H;

    /* JADX INFO: renamed from: I */
    private boolean f8593I;

    /* JADX INFO: renamed from: J */
    private final C1979v f8594J;

    /* JADX INFO: renamed from: a */
    private String f8595a;

    /* JADX INFO: renamed from: b */
    private String f8596b;

    /* JADX INFO: renamed from: c */
    private String f8597c;

    /* JADX INFO: renamed from: d */
    private List<String> f8598d;

    /* JADX INFO: renamed from: e */
    private String f8599e;

    /* JADX INFO: renamed from: f */
    private String f8600f;

    /* JADX INFO: renamed from: g */
    private String f8601g;

    /* JADX INFO: renamed from: h */
    private List<String> f8602h;

    /* JADX INFO: renamed from: l */
    private List<String> f8606l;

    /* JADX INFO: renamed from: w */
    private C1515dv f8617w;

    /* JADX INFO: renamed from: x */
    private List<String> f8618x;

    /* JADX INFO: renamed from: y */
    private List<String> f8619y;

    /* JADX INFO: renamed from: i */
    private long f8603i = -1;

    /* JADX INFO: renamed from: j */
    private boolean f8604j = false;

    /* JADX INFO: renamed from: k */
    private final long f8605k = -1;

    /* JADX INFO: renamed from: m */
    private long f8607m = -1;

    /* JADX INFO: renamed from: n */
    private int f8608n = -1;

    /* JADX INFO: renamed from: o */
    private boolean f8609o = false;

    /* JADX INFO: renamed from: p */
    private boolean f8610p = false;

    /* JADX INFO: renamed from: q */
    private boolean f8611q = false;

    /* JADX INFO: renamed from: r */
    private boolean f8612r = true;

    /* JADX INFO: renamed from: s */
    private boolean f8613s = true;

    /* JADX INFO: renamed from: t */
    private String f8614t = "";

    /* JADX INFO: renamed from: u */
    private boolean f8615u = false;

    /* JADX INFO: renamed from: v */
    private boolean f8616v = false;

    /* JADX INFO: renamed from: z */
    private boolean f8620z = false;

    /* JADX INFO: renamed from: B */
    private boolean f8586B = false;

    public C1449bp(C1979v c1979v, String str) {
        this.f8596b = str;
        this.f8594J = c1979v;
    }

    /* JADX INFO: renamed from: a */
    private static String m9922a(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: b */
    private static long m9923b(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                C1560fm.m11615e(new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: c */
    private static List<String> m9924c(Map<String, List<String>> map, String str) {
        String str2;
        List<String> list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    /* JADX INFO: renamed from: d */
    private static boolean m9925d(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf(list.get(0)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final C2087z m9926a(long j, boolean z) {
        return new C2087z(this.f8594J, this.f8596b, this.f8597c, this.f8598d, this.f8602h, this.f8603i, this.f8604j, -1L, this.f8606l, this.f8607m, this.f8608n, this.f8595a, j, this.f8600f, this.f8601g, this.f8609o, this.f8610p, this.f8611q, this.f8612r, false, this.f8614t, this.f8615u, this.f8616v, this.f8617w, this.f8618x, this.f8619y, this.f8620z, this.f8585A, this.f8586B, this.f8587C, this.f8588D, this.f8589E, this.f8590F, this.f8591G, this.f8599e, this.f8613s, this.f8592H, this.f8593I, z ? 2 : 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m9927a(String str, Map<String, List<String>> map, String str2) {
        this.f8597c = str2;
        m9928a(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m9928a(Map<String, List<String>> map) {
        this.f8595a = m9922a(map, "X-Afma-Ad-Size");
        this.f8590F = m9922a(map, "X-Afma-Ad-Slot-Size");
        List<String> listM9924c = m9924c(map, "X-Afma-Click-Tracking-Urls");
        if (listM9924c != null) {
            this.f8598d = listM9924c;
        }
        this.f8599e = m9922a(map, "X-Afma-Debug-Signals");
        List<String> list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f8600f = list.get(0);
        }
        List<String> listM9924c2 = m9924c(map, "X-Afma-Tracking-Urls");
        if (listM9924c2 != null) {
            this.f8602h = listM9924c2;
        }
        long jM9923b = m9923b(map, "X-Afma-Interstitial-Timeout");
        if (jM9923b != -1) {
            this.f8603i = jM9923b;
        }
        this.f8604j |= m9925d(map, "X-Afma-Mediation");
        List<String> listM9924c3 = m9924c(map, "X-Afma-Manual-Tracking-Urls");
        if (listM9924c3 != null) {
            this.f8606l = listM9924c3;
        }
        long jM9923b2 = m9923b(map, "X-Afma-Refresh-Rate");
        if (jM9923b2 != -1) {
            this.f8607m = jM9923b2;
        }
        List<String> list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f8608n = C0710au.m5571g().mo11472b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f8608n = C0710au.m5571g().mo11459a();
            }
        }
        this.f8601g = m9922a(map, "X-Afma-ActiveView");
        List<String> list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f8611q = Boolean.valueOf(list3.get(0)).booleanValue();
        }
        this.f8609o |= m9925d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f8610p = "native".equals(m9922a(map, "X-Afma-Ad-Format"));
        List<String> list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f8612r = Boolean.valueOf(list4.get(0)).booleanValue();
        }
        List<String> list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f8613s = Boolean.valueOf(list5.get(0)).booleanValue();
        }
        List<String> list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f8614t = list6.get(0);
        }
        String strM9922a = m9922a(map, "X-Afma-Fluid");
        if (strM9922a != null && strM9922a.equals("height")) {
            this.f8615u = true;
        }
        this.f8616v = "native_express".equals(m9922a(map, "X-Afma-Ad-Format"));
        this.f8617w = C1515dv.m11202a(m9922a(map, "X-Afma-Rewards"));
        if (this.f8618x == null) {
            this.f8618x = m9924c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f8619y == null) {
            this.f8619y = m9924c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f8620z |= m9925d(map, "X-Afma-Use-Displayed-Impression");
        this.f8586B |= m9925d(map, "X-Afma-Auto-Collect-Location");
        this.f8587C = m9922a(map, "Set-Cookie");
        String strM9922a2 = m9922a(map, "X-Afma-Auto-Protection-Configuration");
        if (strM9922a2 == null || TextUtils.isEmpty(strM9922a2)) {
            Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            builderBuildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f8600f)) {
                builderBuildUpon.appendQueryParameter("debugDialog", this.f8600f);
            }
            boolean zBooleanValue = ((Boolean) bxm.m10409f().m10546a(can.f9639e)).booleanValue();
            String string = builderBuildUpon.toString();
            this.f8585A = new C1355ab(zBooleanValue, Arrays.asList(new StringBuilder(String.valueOf(string).length() + 18 + String.valueOf("navigationURL").length()).append(string).append("&").append("navigationURL").append("={NAVIGATION_URL}").toString()));
        } else {
            try {
                this.f8585A = C1355ab.m7483a(new JSONObject(strM9922a2));
            } catch (JSONException e) {
                C1560fm.m11613c("Error parsing configuration JSON", e);
                this.f8585A = new C1355ab();
            }
        }
        List<String> listM9924c4 = m9924c(map, "X-Afma-Remote-Ping-Urls");
        if (listM9924c4 != null) {
            this.f8588D = listM9924c4;
        }
        String strM9922a3 = m9922a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(strM9922a3)) {
            try {
                this.f8591G = C1524ed.m11218a(new JSONObject(strM9922a3));
            } catch (JSONException e2) {
                C1560fm.m11613c("Error parsing safe browsing header", e2);
            }
        }
        this.f8589E |= m9925d(map, "X-Afma-Render-In-Browser");
        String strM9922a4 = m9922a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(strM9922a4)) {
            try {
                this.f8592H = new JSONObject(strM9922a4).getBoolean("never_pool");
            } catch (JSONException e3) {
                C1560fm.m11613c("Error parsing interstitial pool header", e3);
            }
        }
        this.f8593I = m9925d(map, "X-Afma-Custom-Close-Blocked");
    }
}
