package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.vw */
/* JADX INFO: loaded from: classes.dex */
public class C2002vw<T> {

    /* JADX INFO: renamed from: a */
    private static final Object f11836a = new Object();

    /* JADX INFO: renamed from: b */
    private static InterfaceC2010wd f11837b = null;

    /* JADX INFO: renamed from: c */
    private static int f11838c = 0;

    /* JADX INFO: renamed from: d */
    private static String f11839d = "com.google.android.providers.gsf.permission.READ_GSERVICES";

    /* JADX INFO: renamed from: e */
    private String f11840e;

    /* JADX INFO: renamed from: f */
    private T f11841f;

    /* JADX INFO: renamed from: g */
    private T f11842g = null;

    protected C2002vw(String str, T t) {
        this.f11840e = str;
        this.f11841f = t;
    }

    /* JADX INFO: renamed from: a */
    public static C2002vw<Float> m12480a(String str, Float f) {
        return new C2008wb(str, f);
    }

    /* JADX INFO: renamed from: a */
    public static C2002vw<Integer> m12481a(String str, Integer num) {
        return new C2007wa(str, num);
    }

    /* JADX INFO: renamed from: a */
    public static C2002vw<Long> m12482a(String str, Long l) {
        return new C2005vz(str, l);
    }

    /* JADX INFO: renamed from: a */
    public static C2002vw<String> m12483a(String str, String str2) {
        return new C2009wc(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static C2002vw<Boolean> m12484a(String str, boolean z) {
        return new C2003vx(str, Boolean.valueOf(z));
    }
}
