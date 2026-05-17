package com.google.android.gms.common.util;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.common.util.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1310n {
    /* JADX INFO: renamed from: a */
    public static boolean m7278a() {
        return Build.VERSION.SDK_INT >= 15;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7279b() {
        return Build.VERSION.SDK_INT >= 16;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7280c() {
        return Build.VERSION.SDK_INT >= 17;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7281d() {
        return Build.VERSION.SDK_INT >= 18;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m7282e() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7283f() {
        return Build.VERSION.SDK_INT >= 20;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7284g() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7285h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7286i() {
        return Build.VERSION.SDK_INT >= 26 || "O".equals(Build.VERSION.CODENAME) || Build.VERSION.CODENAME.startsWith("OMR") || Build.VERSION.CODENAME.startsWith("ODR");
    }
}
