package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1302f;

/* JADX INFO: loaded from: classes.dex */
final class agw {
    /* JADX INFO: renamed from: a */
    public static void m7886a(String str, Context context) {
        ahs.m7942a(str);
        if (C1302f.m7261a(context, new RuntimeException(str))) {
            ahs.m7947d("Crash reported successfully.");
        } else {
            ahs.m7947d("Failed to report crash");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7887a(String str, Throwable th, Context context) {
        ahs.m7943a(str, th);
        if (C1302f.m7261a(context, th)) {
            ahs.m7947d("Crash reported successfully.");
        } else {
            ahs.m7947d("Failed to report crash");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7888b(String str, Context context) {
        ahs.m7944b(str);
        if (C1302f.m7261a(context, new RuntimeException(str))) {
            ahs.m7947d("Crash reported successfully.");
        } else {
            ahs.m7947d("Failed to report crash");
        }
    }
}
