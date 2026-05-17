package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class ajo {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ajo$a */
    static class C1369a {

        /* JADX INFO: renamed from: a */
        private static volatile ExecutorService f6945a = null;

        private C1369a() {
        }

        /* JADX INFO: renamed from: a */
        public static ExecutorService m8057a(Context context) {
            if (f6945a == null) {
                synchronized (C1369a.class) {
                    if (f6945a == null) {
                        f6945a = new ahb(context, 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ajp());
                    }
                }
            }
            return f6945a;
        }
    }
}
