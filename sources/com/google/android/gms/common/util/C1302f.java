package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.common.util.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1302f {

    /* JADX INFO: renamed from: a */
    private static final String[] f6029a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* JADX INFO: renamed from: b */
    private static DropBoxManager f6030b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f6031c = false;

    /* JADX INFO: renamed from: d */
    private static int f6032d = -1;

    /* JADX INFO: renamed from: e */
    private static int f6033e = 0;

    /* JADX INFO: renamed from: a */
    public static boolean m7261a(Context context, Throwable th) {
        return m7262a(context, th, 536870912);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7262a(Context context, Throwable th, int i) {
        try {
            C1221aj.m7065a(context);
            C1221aj.m7065a(th);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
        return false;
    }
}
