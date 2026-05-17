package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.C2064yd;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1344f extends C1339a<Long> {
    /* JADX INFO: renamed from: a */
    public static Long m7348a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) C2064yd.m12596a(new CallableC1345g(sharedPreferences, str, l));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return l;
        }
    }
}
