package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.vb */
/* JADX INFO: loaded from: classes.dex */
public final class C1981vb {

    /* JADX INFO: renamed from: a */
    private static final Pattern f11780a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* JADX INFO: renamed from: a */
    public static String m12425a(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-').append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-').append(variant);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m12426a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m12427a(T t, T t2) {
        return (t == null && t2 == null) || !(t == null || t2 == null || !t.equals(t2));
    }

    /* JADX INFO: renamed from: b */
    public static String m12428b(String str) {
        String strValueOf = String.valueOf("urn:x-cast:");
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: c */
    public static String m12429c(String str) {
        if (f11780a.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-')) || cCharAt == '.' || cCharAt == ':') {
                sb.append(cCharAt);
            } else {
                sb.append(String.format("%%%04x", Integer.valueOf(cCharAt & 65535)));
            }
        }
        return sb.toString();
    }
}
