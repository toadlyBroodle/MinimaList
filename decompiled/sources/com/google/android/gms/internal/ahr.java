package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ahr {

    /* JADX INFO: renamed from: a */
    private static String f6789a;

    /* JADX INFO: renamed from: b */
    private static Map<String, String> f6790b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m7939a(Context context, String str) {
        if (f6789a == null) {
            synchronized (ahr.class) {
                if (f6789a == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        f6789a = sharedPreferences.getString("referrer", "");
                    } else {
                        f6789a = "";
                    }
                }
            }
        }
        return m7940a(f6789a, str);
    }

    /* JADX INFO: renamed from: a */
    public static String m7940a(String str, String str2) {
        if (str2 != null) {
            String strValueOf = String.valueOf(str);
            return Uri.parse(strValueOf.length() != 0 ? "http://hostname/?".concat(strValueOf) : new String("http://hostname/?")).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }
}
