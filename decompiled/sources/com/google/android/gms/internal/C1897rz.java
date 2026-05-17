package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1307k;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.rz */
/* JADX INFO: loaded from: classes.dex */
public final class C1897rz {

    /* JADX INFO: renamed from: a */
    private static final char[] f11500a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static double m12282a(String str, double d) {
        if (str == null) {
            return 100.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 100.0d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m12283a(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1809os m12284a(C1882rk c1882rk, String str) {
        C1221aj.m7065a(c1882rk);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String strValueOf = String.valueOf(str);
            Map<String, String> mapM7272a = C1307k.m7272a(new URI(strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?")), "UTF-8");
            C1809os c1809os = new C1809os();
            c1809os.m11951e(mapM7272a.get("utm_content"));
            c1809os.m11947c(mapM7272a.get("utm_medium"));
            c1809os.m11943a(mapM7272a.get("utm_campaign"));
            c1809os.m11945b(mapM7272a.get("utm_source"));
            c1809os.m11949d(mapM7272a.get("utm_term"));
            c1809os.m11953f(mapM7272a.get("utm_id"));
            c1809os.m11955g(mapM7272a.get("anid"));
            c1809os.m11957h(mapM7272a.get("gclid"));
            c1809os.m11959i(mapM7272a.get("dclid"));
            c1809os.m11961j(mapM7272a.get("aclid"));
            return c1809os;
        } catch (URISyntaxException e) {
            c1882rk.m12031d("No valid campaign data found", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12285a(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-").append(locale.getCountry().toLowerCase());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m12286a(boolean z) {
        return z ? "1" : "0";
    }

    /* JADX INFO: renamed from: a */
    public static void m12287a(Map<String, String> map, String str, String str2) {
        if (str2 == null || map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m12288a(Map<String, String> map, String str, Map<String, String> map2) {
        m12287a(map, str, map2.get(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m12289a(Map<String, String> map, String str, boolean z) {
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, z ? "1" : "0");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12290a(double d, String str) {
        int i;
        if (d <= 0.0d || d >= 100.0d) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            i = 1;
        } else {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                i = ((i << 6) & 268435455) + cCharAt + (cCharAt << 14);
                int i2 = 266338304 & i;
                if (i2 != 0) {
                    i ^= i2 >> 21;
                }
            }
        }
        return ((double) (i % 10000)) >= 100.0d * d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12291a(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 4);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12292a(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 2);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (z) {
                    if (receiverInfo.exported) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12293a(String str, boolean z) {
        if (str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1")) {
            return true;
        }
        return (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("0")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static MessageDigest m12294b(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return null;
            }
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException e) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12295b(Map<String, String> map, String str, String str2) {
        if (str2 == null || !TextUtils.isEmpty(map.get(str))) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12296c(String str) {
        return TextUtils.isEmpty(str) || !str.startsWith("http:");
    }
}
