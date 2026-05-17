package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.C2064yd;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1340b extends C1339a<Boolean> {
    /* JADX INFO: renamed from: a */
    public static Boolean m7346a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) C2064yd.m12596a(new CallableC1341c(sharedPreferences, str, bool));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
