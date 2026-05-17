package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0710au;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class cib {
    /* JADX INFO: renamed from: a */
    private static String m10918a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m10919a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m10920a(Context context, String str, C1541eu c1541eu, String str2, boolean z, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str3 = z ? "1" : "0";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strM10918a = m10918a(m10918a(m10918a(m10918a(m10918a(m10918a(m10918a(it.next(), "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", c1541eu.f10550q.f10041h), "@gw_sdkver@", str), "@gw_sessid@", bxm.m10406c()), "@gw_seqnum@", c1541eu.f10542i), "@gw_adnetstatus@", c1541eu.f10552s);
            if (c1541eu.f10547n != null) {
                strM10918a = m10918a(m10918a(strM10918a, "@gw_adnetid@", c1541eu.f10547n.f10016b), "@gw_allocid@", c1541eu.f10547n.f10018d);
            }
            String strM11251a = C1535eo.m11251a(strM10918a, context);
            C0710au.m5569e();
            C1596gv.m11411b(context, str, strM11251a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10921a(Context context, String str, List<String> list, String str2, C1515dv c1515dv) {
        if (list == null || list.isEmpty()) {
            return;
        }
        long jMo7252a = C0710au.m5575k().mo7252a();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strM10918a = m10918a(m10918a(it.next(), "@gw_rwd_userid@", str2), "@gw_tmstmp@", Long.toString(jMo7252a));
            if (c1515dv != null) {
                strM10918a = m10918a(m10918a(strM10918a, "@gw_rwd_itm@", c1515dv.f10475a), "@gw_rwd_amt@", Integer.toString(c1515dv.f10476b));
            }
            C0710au.m5569e();
            C1596gv.m11411b(context, str, strM10918a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10922a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(strArrSplit[0]);
            iArr[1] = Integer.parseInt(strArrSplit[1]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
