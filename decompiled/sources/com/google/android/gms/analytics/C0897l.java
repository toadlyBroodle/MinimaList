package com.google.android.gms.analytics;

import com.google.android.gms.internal.C1881rj;

/* JADX INFO: renamed from: com.google.android.gms.analytics.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0897l {
    /* JADX INFO: renamed from: a */
    public static String m6038a(int i) {
        return m6039a("cd", i);
    }

    /* JADX INFO: renamed from: a */
    private static String m6039a(String str, int i) {
        if (i > 0) {
            return new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString();
        }
        C1881rj.m12222a("index out of range for prefix", str);
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m6040b(int i) {
        return m6039a("cm", i);
    }

    /* JADX INFO: renamed from: c */
    public static String m6041c(int i) {
        return m6039a("&pr", i);
    }

    /* JADX INFO: renamed from: d */
    public static String m6042d(int i) {
        return m6039a("pr", i);
    }

    /* JADX INFO: renamed from: e */
    public static String m6043e(int i) {
        return m6039a("&promo", i);
    }

    /* JADX INFO: renamed from: f */
    public static String m6044f(int i) {
        return m6039a("promo", i);
    }

    /* JADX INFO: renamed from: g */
    public static String m6045g(int i) {
        return m6039a("pi", i);
    }

    /* JADX INFO: renamed from: h */
    public static String m6046h(int i) {
        return m6039a("&il", i);
    }

    /* JADX INFO: renamed from: i */
    public static String m6047i(int i) {
        return m6039a("il", i);
    }

    /* JADX INFO: renamed from: j */
    public static String m6048j(int i) {
        return m6039a("cd", i);
    }

    /* JADX INFO: renamed from: k */
    public static String m6049k(int i) {
        return m6039a("cm", i);
    }
}
