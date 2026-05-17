package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.de */
/* JADX INFO: loaded from: classes.dex */
public class C1498de {

    /* JADX INFO: renamed from: b */
    private static String f10439b = "Volley";

    /* JADX INFO: renamed from: a */
    public static boolean f10438a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: com.google.android.gms.internal.de$a */
    static class a {

        /* JADX INFO: renamed from: a */
        public static final boolean f10440a = C1498de.f10438a;

        /* JADX INFO: renamed from: b */
        private final List<C1526ef> f10441b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private boolean f10442c = false;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m11173a(String str) {
            this.f10442c = true;
            long j = this.f10441b.size() == 0 ? 0L : this.f10441b.get(this.f10441b.size() - 1).f10503c - this.f10441b.get(0).f10503c;
            if (j > 0) {
                long j2 = this.f10441b.get(0).f10503c;
                C1498de.m11170b("(%-4d ms) %s", Long.valueOf(j), str);
                long j3 = j2;
                for (C1526ef c1526ef : this.f10441b) {
                    long j4 = c1526ef.f10503c;
                    C1498de.m11170b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(c1526ef.f10502b), c1526ef.f10501a);
                    j3 = j4;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m11174a(String str, long j) {
            if (this.f10442c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f10441b.add(new C1526ef(str, j, SystemClock.elapsedRealtime()));
        }

        protected final void finalize() {
            if (this.f10442c) {
                return;
            }
            m11173a("Request on the loose");
            C1498de.m11171c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11168a(String str, Object... objArr) {
        if (f10438a) {
            Log.v(f10439b, m11172d(str, objArr));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11169a(Throwable th, String str, Object... objArr) {
        Log.e(f10439b, m11172d(str, objArr), th);
    }

    /* JADX INFO: renamed from: b */
    public static void m11170b(String str, Object... objArr) {
        Log.d(f10439b, m11172d(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m11171c(String str, Object... objArr) {
        Log.e(f10439b, m11172d(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    private static String m11172d(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClass().equals(C1498de.class)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                string = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()).append(strSubstring2).append(".").append(methodName).toString();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }
}
