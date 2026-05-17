package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.rs */
/* JADX INFO: loaded from: classes.dex */
public final class C1890rs {

    /* JADX INFO: renamed from: a */
    static Object f11485a = new Object();

    /* JADX INFO: renamed from: b */
    static agf f11486b;

    /* JADX INFO: renamed from: c */
    private static Boolean f11487c;

    /* JADX INFO: renamed from: a */
    public static void m12269a(Context context, Intent intent) {
        C1882rk c1882rkM12060e = C1834pq.m12054a(context).m12060e();
        if (intent == null) {
            c1882rkM12060e.m12033e("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c1882rkM12060e.m12020a("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zM12273a = C1891rt.m12273a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (f11485a) {
                context.startService(intent2);
                if (zM12273a) {
                    try {
                        if (f11486b == null) {
                            agf agfVar = new agf(context, 1, "Analytics WakeLock");
                            f11486b = agfVar;
                            agfVar.m7839a(false);
                        }
                        f11486b.m7838a(1000L);
                    } catch (SecurityException e) {
                        c1882rkM12060e.m12033e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12270a(Context context) {
        C1221aj.m7065a(context);
        if (f11487c != null) {
            return f11487c.booleanValue();
        }
        boolean zM12292a = C1897rz.m12292a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f11487c = Boolean.valueOf(zM12292a);
        return zM12292a;
    }
}
