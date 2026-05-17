package com.google.android.gms.cast;

import com.google.android.gms.internal.C1981vb;
import java.util.Collection;

/* JADX INFO: renamed from: com.google.android.gms.cast.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0992f {
    /* JADX INFO: renamed from: a */
    public static String m6328a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return m6329a("com.google.android.gms.cast.CATEGORY_CAST", str, null, false);
    }

    /* JADX INFO: renamed from: a */
    private static String m6329a(String str, String str2, Collection<String> collection, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                String strValueOf = String.valueOf(str2);
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid application ID: ".concat(strValueOf) : new String("Invalid application ID: "));
            }
            sb.append("/").append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str2 == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z2 = true;
            for (String str3 : collection) {
                C1981vb.m12426a(str3);
                if (z2) {
                    z2 = false;
                } else {
                    sb.append(",");
                }
                sb.append(C1981vb.m12429c(str3));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m6330a(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection == null) {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
        return m6329a("com.google.android.gms.cast.CATEGORY_CAST", str, collection, false);
    }
}
