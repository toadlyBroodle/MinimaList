package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.analytics.InterfaceC0891f;

/* JADX INFO: renamed from: com.google.android.gms.internal.rj */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1881rj {

    /* JADX INFO: renamed from: a */
    private static volatile InterfaceC0891f f11466a = new C1864qt();

    /* JADX INFO: renamed from: a */
    public static void m12220a(InterfaceC0891f interfaceC0891f) {
        f11466a = interfaceC0891f;
    }

    /* JADX INFO: renamed from: a */
    public static void m12221a(String str) {
        C1882rk c1882rkM12226b = C1882rk.m12226b();
        if (c1882rkM12226b != null) {
            c1882rkM12226b.m12023b(str);
        } else if (m12223a(0)) {
            Log.v(C1872ra.f11418b.m12204a(), str);
        }
        InterfaceC0891f interfaceC0891f = f11466a;
        if (interfaceC0891f != null) {
            interfaceC0891f.mo5992a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12222a(String str, Object obj) {
        String string;
        C1882rk c1882rkM12226b = C1882rk.m12226b();
        if (c1882rkM12226b != null) {
            c1882rkM12226b.m12034e(str, obj);
        } else if (m12223a(3)) {
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                string = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strValueOf).length()).append(str).append(":").append(strValueOf).toString();
            } else {
                string = str;
            }
            Log.e(C1872ra.f11418b.m12204a(), string);
        }
        InterfaceC0891f interfaceC0891f = f11466a;
        if (interfaceC0891f != null) {
            interfaceC0891f.mo5994c(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12223a(int i) {
        return f11466a != null && f11466a.mo5991a() <= i;
    }

    /* JADX INFO: renamed from: b */
    public static void m12224b(String str) {
        C1882rk c1882rkM12226b = C1882rk.m12226b();
        if (c1882rkM12226b != null) {
            c1882rkM12226b.m12033e(str);
        } else if (m12223a(2)) {
            Log.w(C1872ra.f11418b.m12204a(), str);
        }
        InterfaceC0891f interfaceC0891f = f11466a;
        if (interfaceC0891f != null) {
            interfaceC0891f.mo5993b(str);
        }
    }
}
