package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.C2040xg;

/* JADX INFO: renamed from: com.google.android.gms.common.util.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1299c {
    /* JADX INFO: renamed from: a */
    public static boolean m7251a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (C2040xg.m12562a(context).m12556a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
