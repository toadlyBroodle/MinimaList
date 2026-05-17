package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.C2040xg;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.af */
/* JADX INFO: loaded from: classes.dex */
public final class C1217af {

    /* JADX INFO: renamed from: a */
    private static Object f5839a = new Object();

    /* JADX INFO: renamed from: b */
    private static boolean f5840b;

    /* JADX INFO: renamed from: c */
    private static String f5841c;

    /* JADX INFO: renamed from: d */
    private static int f5842d;

    /* JADX INFO: renamed from: a */
    public static String m7059a(Context context) {
        m7061c(context);
        return f5841c;
    }

    /* JADX INFO: renamed from: b */
    public static int m7060b(Context context) {
        m7061c(context);
        return f5842d;
    }

    /* JADX INFO: renamed from: c */
    private static void m7061c(Context context) {
        synchronized (f5839a) {
            if (f5840b) {
                return;
            }
            f5840b = true;
            try {
                Bundle bundle = C2040xg.m12562a(context).m12556a(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f5841c = bundle.getString("com.google.app.id");
                f5842d = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
