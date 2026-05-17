package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bda {
    /* JADX INFO: renamed from: a */
    public static Long m8949a(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m8950a(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m8951a(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!strArrSplit[i].isEmpty()) {
                arrayList.add(strArrSplit[i]);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m8952a(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        String strValueOf = String.valueOf(String.format(str, objArr));
        throw new AssertionError(strValueOf.length() != 0 ? "hardAssert failed: ".concat(strValueOf) : new String("hardAssert failed: "));
    }
}
