package com.google.android.gms.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.fm */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1560fm extends C1668jm {
    /* JADX INFO: renamed from: a */
    public static void m11343a(String str) {
        if (m11344a()) {
            Log.v("Ads", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11344a() {
        if (m11609a(2)) {
            if (((Boolean) bxm.m10409f().m10546a(can.f9451aX)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
