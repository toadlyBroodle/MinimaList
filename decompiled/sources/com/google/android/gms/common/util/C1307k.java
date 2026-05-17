package com.google.android.gms.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.common.util.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1307k {

    /* JADX INFO: renamed from: a */
    private static final Pattern f6041a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* JADX INFO: renamed from: b */
    private static final Pattern f6042b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* JADX INFO: renamed from: c */
    private static final Pattern f6043c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* JADX INFO: renamed from: a */
    private static String m7271a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m7272a(URI uri, String str) {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return mapEmptyMap;
        }
        HashMap map = new HashMap();
        Scanner scanner = new Scanner(rawQuery);
        scanner.useDelimiter("&");
        while (scanner.hasNext()) {
            String[] strArrSplit = scanner.next().split("=");
            if (strArrSplit.length == 0 || strArrSplit.length > 2) {
                throw new IllegalArgumentException("bad parameter");
            }
            String strM7271a = m7271a(strArrSplit[0], str);
            String strM7271a2 = null;
            if (strArrSplit.length == 2) {
                strM7271a2 = m7271a(strArrSplit[1], str);
            }
            map.put(strM7271a, strM7271a2);
        }
        return map;
    }
}
