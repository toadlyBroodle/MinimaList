package com.google.android.gms.internal;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
final class ahc {
    /* JADX INFO: renamed from: a */
    public static int m7910a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            String strValueOf = String.valueOf(Build.VERSION.SDK);
            ahs.m7942a(strValueOf.length() != 0 ? "Invalid version number: ".concat(strValueOf) : new String("Invalid version number: "));
            return 0;
        }
    }
}
