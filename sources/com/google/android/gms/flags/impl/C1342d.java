package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.C2064yd;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1342d extends C1339a<Integer> {
    /* JADX INFO: renamed from: a */
    public static Integer m7347a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) C2064yd.m12596a(new CallableC1343e(sharedPreferences, str, num));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
