package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
public final class aql {

    /* JADX INFO: renamed from: a */
    private String f7084a = "https://www.google-analytics.com";

    /* JADX INFO: renamed from: a */
    private static String m8159a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            String strValueOf = String.valueOf(str);
            ahs.m7942a(strValueOf.length() != 0 ? "Cannot encode the string: ".concat(strValueOf) : new String("Cannot encode the string: "));
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8160a(app appVar) {
        String string;
        String str = this.f7084a;
        if (appVar.m8111e()) {
            string = appVar.m8112f();
        } else if (appVar == null) {
            string = "";
        } else {
            String strTrim = !appVar.m8113g().trim().equals("") ? appVar.m8113g().trim() : "-1";
            StringBuilder sb = new StringBuilder();
            if (appVar.m8109c() != null) {
                sb.append(appVar.m8109c());
            } else {
                sb.append("id");
            }
            sb.append("=").append(m8159a(appVar.m8107a())).append("&pv=").append(m8159a(strTrim)).append("&rv=5.0");
            if (appVar.m8111e()) {
                sb.append("&gtm_debug=x");
            }
            string = sb.toString();
        }
        return new StringBuilder(String.valueOf(str).length() + String.valueOf("/gtm/android?").length() + String.valueOf(string).length()).append(str).append("/gtm/android?").append(string).toString();
    }
}
