package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.common.util.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1304h {

    /* JADX INFO: renamed from: a */
    private static Boolean f6035a;

    /* JADX INFO: renamed from: b */
    private static Boolean f6036b;

    /* JADX INFO: renamed from: c */
    private static Boolean f6037c;

    @TargetApi(20)
    /* JADX INFO: renamed from: a */
    public static boolean m7264a(Context context) {
        if (f6035a == null) {
            f6035a = Boolean.valueOf(C1310n.m7283f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f6035a.booleanValue();
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: b */
    public static boolean m7265b(Context context) {
        return (!C1310n.m7285h() || m7266c(context)) && m7264a(context);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: c */
    public static boolean m7266c(Context context) {
        if (f6036b == null) {
            f6036b = Boolean.valueOf(C1310n.m7284g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f6036b.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7267d(Context context) {
        if (f6037c == null) {
            f6037c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f6037c.booleanValue();
    }
}
