package com.google.android.gms.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.jm */
/* JADX INFO: loaded from: classes.dex */
@cnb
public class C1668jm {
    /* JADX INFO: renamed from: a */
    public static void m11608a(String str, Throwable th) {
        if (m11609a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11609a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    /* JADX INFO: renamed from: b */
    public static void m11610b(String str) {
        if (m11609a(3)) {
            Log.d("Ads", str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11611b(String str, Throwable th) {
        if (m11609a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11612c(String str) {
        if (m11609a(6)) {
            Log.e("Ads", str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11613c(String str, Throwable th) {
        if (m11609a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m11614d(String str) {
        if (m11609a(4)) {
            Log.i("Ads", str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11615e(String str) {
        if (m11609a(5)) {
            Log.w("Ads", str);
        }
    }
}
