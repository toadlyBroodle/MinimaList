package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.C1310n;

/* JADX INFO: renamed from: com.google.android.gms.internal.xe */
/* JADX INFO: loaded from: classes.dex */
public final class C2038xe {

    /* JADX INFO: renamed from: a */
    private static Context f12288a;

    /* JADX INFO: renamed from: b */
    private static Boolean f12289b;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m12553a(Context context) {
        boolean zBooleanValue;
        Context applicationContext = context.getApplicationContext();
        if (f12288a == null || f12289b == null || f12288a != applicationContext) {
            f12289b = null;
            if (C1310n.m7286i()) {
                f12289b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12289b = true;
                } catch (ClassNotFoundException e) {
                    f12289b = false;
                }
            }
            f12288a = applicationContext;
            zBooleanValue = f12289b.booleanValue();
        } else {
            zBooleanValue = f12289b.booleanValue();
        }
        return zBooleanValue;
    }
}
