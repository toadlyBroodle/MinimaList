package com.google.android.gms.internal;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.qz */
/* JADX INFO: loaded from: classes.dex */
public final class C1870qz {
    /* JADX INFO: renamed from: a */
    public static int m12198a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            C1881rj.m12222a("Invalid version number", Build.VERSION.SDK);
            return 0;
        }
    }
}
