package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C1315s;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C1221aj {
    /* JADX INFO: renamed from: a */
    public static <T> T m7065a(T t) {
        if (t == null) {
            throw new NullPointerException("null reference");
        }
        return t;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m7066a(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException(String.valueOf(obj));
        }
        return t;
    }

    /* JADX INFO: renamed from: a */
    public static String m7067a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static String m7068a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static void m7069a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7070a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7071a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7072a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7073b(String str) {
        if (!C1315s.m7292a()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7074b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7075b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7076b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7077c(String str) {
        if (C1315s.m7292a()) {
            throw new IllegalStateException(str);
        }
    }
}
