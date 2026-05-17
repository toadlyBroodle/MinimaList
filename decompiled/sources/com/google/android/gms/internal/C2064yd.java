package com.google.android.gms.internal;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.yd */
/* JADX INFO: loaded from: classes.dex */
public final class C2064yd {
    /* JADX INFO: renamed from: a */
    public static <T> T m12596a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
