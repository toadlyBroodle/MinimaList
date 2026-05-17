package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.internal.C1266m;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.wz */
/* JADX INFO: loaded from: classes.dex */
public final class C2032wz {

    /* JADX INFO: renamed from: a */
    private final String f12020a;

    /* JADX INFO: renamed from: b */
    private final String f12021b;

    /* JADX INFO: renamed from: c */
    private final C1266m f12022c;

    /* JADX INFO: renamed from: d */
    private final int f12023d;

    private C2032wz(String str, String str2) {
        this.f12021b = str2;
        this.f12020a = str;
        this.f12022c = new C1266m(str);
        this.f12023d = m12543a();
    }

    public C2032wz(String str, String... strArr) {
        this(str, m12544a(strArr));
    }

    /* JADX INFO: renamed from: a */
    private final int m12543a() {
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f12020a, i)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static String m12544a(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (String str : strArr) {
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str);
        }
        sb.append(']').append(' ');
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private final boolean m12545a(int i) {
        return this.f12023d <= i;
    }

    /* JADX INFO: renamed from: e */
    private final String m12546e(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f12021b.concat(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m12547a(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f12020a, m12546e(str, objArr), th);
    }

    /* JADX INFO: renamed from: a */
    public final void m12548a(String str, Object... objArr) {
        if (m12545a(2)) {
            Log.v(this.f12020a, m12546e(str, objArr));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12549a(Throwable th) {
        Log.wtf(this.f12020a, th);
    }

    /* JADX INFO: renamed from: b */
    public final void m12550b(String str, Object... objArr) {
        if (m12545a(3)) {
            Log.d(this.f12020a, m12546e(str, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12551c(String str, Object... objArr) {
        Log.i(this.f12020a, m12546e(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public final void m12552d(String str, Object... objArr) {
        Log.w(this.f12020a, m12546e(str, objArr));
    }
}
