package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajw {

    /* JADX INFO: renamed from: a */
    private static final Map<String, ajx> f6957a;

    static {
        HashMap map = new HashMap();
        map.put(EnumC2025ws.CONTAINS.toString(), new ajx("contains"));
        map.put(EnumC2025ws.ENDS_WITH.toString(), new ajx("endsWith"));
        map.put(EnumC2025ws.EQUALS.toString(), new ajx("equals"));
        map.put(EnumC2025ws.GREATER_EQUALS.toString(), new ajx("greaterEquals"));
        map.put(EnumC2025ws.GREATER_THAN.toString(), new ajx("greaterThan"));
        map.put(EnumC2025ws.LESS_EQUALS.toString(), new ajx("lessEquals"));
        map.put(EnumC2025ws.LESS_THAN.toString(), new ajx("lessThan"));
        map.put(EnumC2025ws.REGEX.toString(), new ajx("regex", new String[]{EnumC2034xa.ARG0.toString(), EnumC2034xa.ARG1.toString(), EnumC2034xa.IGNORE_CASE.toString()}));
        map.put(EnumC2025ws.STARTS_WITH.toString(), new ajx("startsWith"));
        f6957a = map;
    }

    /* JADX INFO: renamed from: a */
    public static ars m8067a(String str, Map<String, arh<?>> map, aii aiiVar) {
        if (!f6957a.containsKey(str)) {
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 47).append("Fail to convert ").append(str).append(" to the internal representation").toString());
        }
        ajx ajxVar = f6957a.get(str);
        List<arh<?>> listM8070a = m8070a(ajxVar.m8072b(), map);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new art("gtmUtils"));
        ars arsVar = new ars("15", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arsVar);
        arrayList2.add(new art("mobile"));
        ars arsVar2 = new ars("17", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(arsVar2);
        arrayList3.add(new art(ajxVar.m8071a()));
        arrayList3.add(new aro(listM8070a));
        return new ars("2", arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static String m8068a(EnumC2025ws enumC2025ws) {
        return m8069a(enumC2025ws.toString());
    }

    /* JADX INFO: renamed from: a */
    public static String m8069a(String str) {
        if (f6957a.containsKey(str)) {
            return f6957a.get(str).m8071a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static List<arh<?>> m8070a(String[] strArr, Map<String, arh<?>> map) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            if (map.containsKey(strArr[i2])) {
                arrayList.add(map.get(strArr[i2]));
            } else {
                arrayList.add(arn.f7154e);
            }
            i = i2 + 1;
        }
    }
}
