package com.google.android.gms.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.no */
/* JADX INFO: loaded from: classes.dex */
public final class C1778no {
    /* JADX INFO: renamed from: a */
    private static long m11900a(String str) {
        try {
            return m11904a().parse(str).getTime();
        } catch (ParseException e) {
            C1498de.m11169a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2048xo m11901a(cch cchVar) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = cchVar.f9802c;
        long j3 = 0;
        long j4 = 0;
        String str = map.get("Date");
        long jM11900a = str != null ? m11900a(str) : 0L;
        String str2 = map.get("Cache-Control");
        if (str2 != null) {
            String[] strArrSplit = str2.split(",");
            z = false;
            long j5 = 0;
            long j6 = 0;
            for (String str3 : strArrSplit) {
                String strTrim = str3.trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j6 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception e) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    try {
                        j5 = Long.parseLong(strTrim.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
            }
            j3 = j6;
            j4 = j5;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        String str4 = map.get("Expires");
        long jM11900a2 = str4 != null ? m11900a(str4) : 0L;
        String str5 = map.get("Last-Modified");
        long jM11900a3 = str5 != null ? m11900a(str5) : 0L;
        String str6 = map.get("ETag");
        if (z2) {
            j2 = jCurrentTimeMillis + (1000 * j3);
            j = z ? j2 : (1000 * j4) + j2;
        } else if (jM11900a <= 0 || jM11900a2 < jM11900a) {
            j = 0;
            j2 = 0;
        } else {
            j = (jM11900a2 - jM11900a) + jCurrentTimeMillis;
            j2 = j;
        }
        C2048xo c2048xo = new C2048xo();
        c2048xo.f12305a = cchVar.f9801b;
        c2048xo.f12306b = str6;
        c2048xo.f12310f = j2;
        c2048xo.f12309e = j;
        c2048xo.f12307c = jM11900a;
        c2048xo.f12308d = jM11900a3;
        c2048xo.f12311g = map;
        c2048xo.f12312h = cchVar.f9803d;
        return c2048xo;
    }

    /* JADX INFO: renamed from: a */
    static String m11902a(long j) {
        return m11904a().format(new Date(j));
    }

    /* JADX INFO: renamed from: a */
    public static String m11903a(Map<String, String> map) {
        String str = map.get("Content-Type");
        if (str != null) {
            String[] strArrSplit = str.split(";");
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return "ISO-8859-1";
    }

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat m11904a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: a */
    static Map<String, String> m11905a(List<byl> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (byl bylVar : list) {
            treeMap.put(bylVar.m10418a(), bylVar.m10419b());
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: b */
    static List<byl> m11906b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new byl(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
