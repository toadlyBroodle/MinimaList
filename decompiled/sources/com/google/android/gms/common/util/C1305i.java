package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.common.util.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1305i {

    /* JADX INFO: renamed from: b */
    private static long f6039b;

    /* JADX INFO: renamed from: a */
    private static IntentFilter f6038a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* JADX INFO: renamed from: c */
    private static float f6040c = Float.NaN;

    @TargetApi(20)
    /* JADX INFO: renamed from: a */
    public static int m7268a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, f6038a);
        boolean z = ((intentRegisterReceiver == null ? 0 : intentRegisterReceiver.getIntExtra("plugged", 0)) & 7) != 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return ((C1310n.m7283f() ? powerManager.isInteractive() : powerManager.isScreenOn() ? 1 : 0) << 1) | (z ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized float m7269b(Context context) {
        float f;
        if (SystemClock.elapsedRealtime() - f6039b >= 60000 || Float.isNaN(f6040c)) {
            if (context.getApplicationContext().registerReceiver(null, f6038a) != null) {
                f6040c = r0.getIntExtra("level", -1) / r0.getIntExtra("scale", -1);
            }
            f6039b = SystemClock.elapsedRealtime();
            f = f6040c;
        } else {
            f = f6040c;
        }
        return f;
    }
}
