package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.C2064yd;

/* JADX INFO: renamed from: com.google.android.gms.flags.impl.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1348j {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f6096a = null;

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m7350a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f6096a == null) {
                f6096a = (SharedPreferences) C2064yd.m12596a(new CallableC1349k(context));
            }
            sharedPreferences = f6096a;
        }
        return sharedPreferences;
    }
}
