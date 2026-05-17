package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1221aj;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.vm */
/* JADX INFO: loaded from: classes.dex */
public final class C1992vm {

    /* JADX INFO: renamed from: a */
    private static boolean f11793a = false;

    /* JADX INFO: renamed from: b */
    private String f11794b;

    /* JADX INFO: renamed from: c */
    private final boolean f11795c;

    /* JADX INFO: renamed from: d */
    private boolean f11796d;

    /* JADX INFO: renamed from: e */
    private boolean f11797e;

    /* JADX INFO: renamed from: f */
    private String f11798f;

    public C1992vm(String str) {
        this(str, false);
    }

    private C1992vm(String str, boolean z) {
        C1221aj.m7068a(str, (Object) "The log tag cannot be null or empty.");
        this.f11794b = str;
        this.f11795c = str.length() <= 23;
        this.f11796d = false;
        this.f11797e = false;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m12442a() {
        return this.f11796d || (this.f11795c && Log.isLoggable(this.f11794b, 3));
    }

    /* JADX INFO: renamed from: e */
    private String m12443e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.f11798f)) {
            return str;
        }
        String strValueOf = String.valueOf(this.f11798f);
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: a */
    public final void m12444a(String str) {
        this.f11798f = TextUtils.isEmpty(str) ? null : String.format("[%s] ", str);
    }

    /* JADX INFO: renamed from: a */
    public final void m12445a(String str, Object... objArr) {
        if (m12442a()) {
            Log.d(this.f11794b, m12443e(str, objArr));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12446a(Throwable th, String str, Object... objArr) {
        if (m12442a()) {
            Log.d(this.f11794b, m12443e(str, objArr), th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12447b(String str, Object... objArr) {
        Log.i(this.f11794b, m12443e(str, objArr));
    }

    /* JADX INFO: renamed from: b */
    public final void m12448b(Throwable th, String str, Object... objArr) {
        Log.e(this.f11794b, m12443e(str, objArr), th);
    }

    /* JADX INFO: renamed from: c */
    public final void m12449c(String str, Object... objArr) {
        Log.w(this.f11794b, m12443e(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public final void m12450d(String str, Object... objArr) {
        Log.e(this.f11794b, m12443e(str, objArr));
    }
}
