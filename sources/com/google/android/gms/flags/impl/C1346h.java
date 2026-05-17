package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.C2064yd;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1346h extends C1339a<String> {
    /* JADX INFO: renamed from: a */
    public static String m7349a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) C2064yd.m12596a(new CallableC1347i(sharedPreferences, str, str2));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
