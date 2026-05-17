package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C1320x;
import com.google.android.gms.internal.C2040xg;

/* JADX INFO: renamed from: com.google.android.gms.common.util.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1316t {
    /* JADX INFO: renamed from: a */
    public static boolean m7293a(Context context, int i) {
        if (!m7294a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1320x.m7319a(context).m7324a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public static boolean m7294a(Context context, int i, String str) {
        return C2040xg.m12562a(context).m12558a(i, str);
    }
}
