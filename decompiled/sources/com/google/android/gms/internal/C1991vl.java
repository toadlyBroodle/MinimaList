package com.google.android.gms.internal;

import com.google.android.gms.common.api.C1074a;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: com.google.android.gms.internal.vl */
/* JADX INFO: loaded from: classes.dex */
public final class C1991vl {

    /* JADX INFO: renamed from: a */
    public static final C1074a.g<C1973uu> f11786a = new C1074a.g<>();

    /* JADX INFO: renamed from: b */
    public static final C1074a.g<Object> f11787b = new C1074a.g<>();

    /* JADX INFO: renamed from: c */
    public static final C1074a.g<Object> f11788c = new C1074a.g<>();

    /* JADX INFO: renamed from: d */
    private static C1074a.g<Object> f11789d = new C1074a.g<>();

    /* JADX INFO: renamed from: e */
    private static C1074a.g<Object> f11790e = new C1074a.g<>();

    /* JADX INFO: renamed from: f */
    private static Charset f11791f;

    /* JADX INFO: renamed from: g */
    private static String f11792g;

    static {
        Charset charsetForName = null;
        try {
            charsetForName = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException e) {
        } catch (UnsupportedCharsetException e2) {
        }
        f11791f = charsetForName;
        f11792g = C1981vb.m12428b("com.google.cast.multizone");
    }
}
