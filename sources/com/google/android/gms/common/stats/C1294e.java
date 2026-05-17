package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C1305i;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.stats.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1294e {

    /* JADX INFO: renamed from: b */
    private static Boolean f6024b;

    /* JADX INFO: renamed from: a */
    private static C1294e f6023a = new C1294e();

    /* JADX INFO: renamed from: c */
    private static boolean f6025c = false;

    /* JADX INFO: renamed from: a */
    public static C1294e m7244a() {
        return f6023a;
    }

    /* JADX INFO: renamed from: a */
    public static void m7245a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        m7246a(context, str, 8, str2, str3, str4, i2, list, 0L);
    }

    /* JADX INFO: renamed from: a */
    public static void m7246a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        List<String> list2;
        if (f6024b == null) {
            f6024b = false;
        }
        if (f6024b.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                Log.e("WakeLockTracker", strValueOf.length() != 0 ? "missing wakeLock key. ".concat(strValueOf) : new String("missing wakeLock key. "));
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i) {
                if (list == null || list.size() != 1) {
                    list2 = list;
                } else {
                    if ("com.google.android.gms".equals(list.get(0))) {
                        list = null;
                    }
                    list2 = list;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int iM7268a = C1305i.m7268a(context);
                String packageName = context.getPackageName();
                if ("com.google.android.gms".equals(packageName)) {
                    packageName = null;
                }
                try {
                    context.startService(new Intent().setComponent(C1291b.f6014a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(jCurrentTimeMillis, i, str2, i2, list2, str, jElapsedRealtime, iM7268a, str3, packageName, C1305i.m7269b(context), j, str4)));
                } catch (Exception e) {
                    Log.wtf("WakeLockTracker", e);
                }
            }
        }
    }
}
