package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.common.stats.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1292c {
    /* JADX INFO: renamed from: a */
    public static String m7243a(PowerManager.WakeLock wakeLock, String str) {
        String strValueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }
}
