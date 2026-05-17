package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.C0710au;
import com.google.android.gms.ads.internal.p048js.InterfaceC0783a;
import com.google.android.gms.internal.C1560fm;
import com.google.android.gms.internal.C1596gv;
import com.google.android.gms.internal.C1646ir;
import com.google.android.gms.internal.C1745mi;
import com.google.android.gms.internal.C1746mj;
import com.google.android.gms.internal.InterfaceC1739mc;
import com.google.android.gms.internal.InterfaceC1758mv;
import com.google.android.gms.internal.InterfaceC1785nv;
import com.google.android.gms.internal.InterfaceC1802ol;
import com.google.android.gms.internal.InterfaceC1803om;
import com.google.android.gms.internal.InterfaceC1804on;
import com.google.android.gms.internal.afk;
import com.google.android.gms.internal.afl;
import com.google.android.gms.internal.bxm;
import com.google.android.gms.internal.can;
import com.google.android.gms.internal.cnb;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.gmsg.k */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C0764k {

    /* JADX INFO: renamed from: s */
    private static InterfaceC0748aa<Object> f4658s = new C0770q();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4640a = C0765l.f4659a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4641b = C0766m.f4660a;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4642c = C0767n.f4661a;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4643d = new C0772s();

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4644e = new C0773t();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4645f = C0768o.f4662a;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0748aa<Object> f4646g = new C0774u();

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4647h = new C0775v();

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4648i = C0769p.f4663a;

    /* JADX INFO: renamed from: j */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4649j = new C0776w();

    /* JADX INFO: renamed from: k */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4650k = new C0777x();

    /* JADX INFO: renamed from: l */
    public static final InterfaceC0748aa<InterfaceC1739mc> f4651l = new C1745mi();

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0748aa<InterfaceC1739mc> f4652m = new C1746mj();

    /* JADX INFO: renamed from: n */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4653n = new C0763j();

    /* JADX INFO: renamed from: o */
    public static final C0758e f4654o = new C0758e();

    /* JADX INFO: renamed from: p */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4655p = new C0778y();

    /* JADX INFO: renamed from: q */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4656q = new C0779z();

    /* JADX INFO: renamed from: r */
    public static final InterfaceC0748aa<InterfaceC1758mv> f4657r = new C0771r();

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m5692a(InterfaceC0783a interfaceC0783a, Map map) {
        Uri uriM7809a;
        String str = (String) map.get("u");
        if (str == null) {
            C1560fm.m11615e("URL missing from click GMSG.");
            return;
        }
        Uri uriM11374a = Uri.parse(str);
        try {
            afk afkVarMo11835y = ((InterfaceC1802ol) interfaceC0783a).mo11835y();
            if (afkVarMo11835y == null || !afkVarMo11835y.m7812a(uriM11374a)) {
                uriM7809a = uriM11374a;
            } else {
                Context context = ((InterfaceC1785nv) interfaceC0783a).getContext();
                Object obj = (InterfaceC1804on) interfaceC0783a;
                if (obj == null) {
                    throw null;
                }
                uriM7809a = afkVarMo11835y.m7809a(uriM11374a, context, (View) obj, ((InterfaceC1785nv) interfaceC0783a).mo11755d());
            }
            uriM11374a = uriM7809a;
        } catch (afl e) {
            String strValueOf = String.valueOf(str);
            C1560fm.m11615e(strValueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf) : new String("Unable to append parameter to URL: "));
        }
        if ((((Boolean) bxm.m10409f().m10546a(can.f9466am)).booleanValue() && C0710au.m5590z().m11236a(((InterfaceC1785nv) interfaceC0783a).getContext())) && TextUtils.isEmpty(uriM11374a.getQueryParameter("fbs_aeid"))) {
            String strM11249i = C0710au.m5590z().m11249i(((InterfaceC1785nv) interfaceC0783a).getContext());
            C0710au.m5569e();
            uriM11374a = C1596gv.m11374a(uriM11374a.toString(), "fbs_aeid", strM11249i);
            C0710au.m5590z().m11241d(((InterfaceC1785nv) interfaceC0783a).getContext(), strM11249i);
        }
        new C1646ir(((InterfaceC1785nv) interfaceC0783a).getContext(), ((InterfaceC1803om) interfaceC0783a).mo11760k().f10855a, uriM11374a.toString()).m11341h();
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m5693a(InterfaceC1785nv interfaceC1785nv, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C1560fm.m11615e("URL missing from httpTrack GMSG.");
        } else {
            new C1646ir(interfaceC1785nv.getContext(), ((InterfaceC1803om) interfaceC1785nv).mo11760k().f10855a, str).m11341h();
        }
    }

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ void m5694a(InterfaceC1802ol interfaceC1802ol, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            afk afkVarMo11835y = interfaceC1802ol.mo11835y();
            if (afkVarMo11835y != null) {
                afkVarMo11835y.m7810a().mo5659a(i, i2, i3);
            }
        } catch (NumberFormatException e) {
            C1560fm.m11615e("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final /* synthetic */ void m5695b(InterfaceC1785nv interfaceC1785nv, Map map) {
        Intent intent;
        PackageManager packageManager = interfaceC1785nv.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        if (TextUtils.isEmpty(strOptString7)) {
                            intent = null;
                            if (intent == null) {
                            }
                            jSONObject.put(strOptString, packageManager.resolveActivity(intent, 65536) == null);
                        } else {
                            try {
                                intent = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                String strValueOf = String.valueOf(strOptString7);
                                C1560fm.m11611b(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e);
                                intent = null;
                            }
                            if (intent == null) {
                                intent = new Intent();
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    intent.setData(Uri.parse(strOptString2));
                                }
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    intent.setAction(strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    intent.setType(strOptString4);
                                }
                                if (!TextUtils.isEmpty(strOptString5)) {
                                    intent.setPackage(strOptString5);
                                }
                                if (!TextUtils.isEmpty(strOptString6)) {
                                    String[] strArrSplit = strOptString6.split("/", 2);
                                    if (strArrSplit.length == 2) {
                                        intent.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                    }
                                }
                            }
                            try {
                                jSONObject.put(strOptString, packageManager.resolveActivity(intent, 65536) == null);
                            } catch (JSONException e2) {
                                C1560fm.m11611b("Error constructing openable urls response.", e2);
                            }
                        }
                    } catch (JSONException e3) {
                        C1560fm.m11611b("Error parsing the intent data.", e3);
                    }
                }
                ((InterfaceC0783a) interfaceC1785nv).mo5713a("openableIntents", jSONObject);
            } catch (JSONException e4) {
                ((InterfaceC0783a) interfaceC1785nv).mo5713a("openableIntents", new JSONObject());
            }
        } catch (JSONException e5) {
            ((InterfaceC0783a) interfaceC1785nv).mo5713a("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: renamed from: c */
    static final /* synthetic */ void m5696c(InterfaceC1785nv interfaceC1785nv, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C1560fm.m11615e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = interfaceC1785nv.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            map2.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null));
        }
        ((InterfaceC0783a) interfaceC1785nv).mo5712a("openableURLs", map2);
    }
}
