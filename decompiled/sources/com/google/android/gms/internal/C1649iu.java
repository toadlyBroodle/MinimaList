package com.google.android.gms.internal;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.iu */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1649iu {
    /* JADX INFO: renamed from: a */
    public static <T> T m11543a(Context context, Callable<T> callable) {
        T tCall;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                tCall = callable.call();
            } catch (Throwable th) {
                C1668jm.m11611b("Unexpected exception.", th);
                cmv.m11140a(context).mo11143a(th, "StrictModeUtil.runWithLaxStrictMode");
                StrictMode.setThreadPolicy(threadPolicy);
                tCall = null;
            }
            return tCall;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m11544b(Context context, Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
