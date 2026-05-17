package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.C1312p;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.qs */
/* JADX INFO: loaded from: classes.dex */
public final class C1863qs {

    /* JADX INFO: renamed from: a */
    private final C1834pq f11385a;

    /* JADX INFO: renamed from: b */
    private volatile Boolean f11386b;

    /* JADX INFO: renamed from: c */
    private String f11387c;

    /* JADX INFO: renamed from: d */
    private Set<Integer> f11388d;

    protected C1863qs(C1834pq c1834pq) {
        C1221aj.m7065a(c1834pq);
        this.f11385a = c1834pq;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12170b() {
        return C1872ra.f11417a.m12204a().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static int m12171c() {
        return C1872ra.f11434r.m12204a().intValue();
    }

    /* JADX INFO: renamed from: d */
    public static long m12172d() {
        return C1872ra.f11422f.m12204a().longValue();
    }

    /* JADX INFO: renamed from: e */
    public static long m12173e() {
        return C1872ra.f11423g.m12204a().longValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m12174f() {
        return C1872ra.f11425i.m12204a().intValue();
    }

    /* JADX INFO: renamed from: g */
    public static int m12175g() {
        return C1872ra.f11426j.m12204a().intValue();
    }

    /* JADX INFO: renamed from: h */
    public static String m12176h() {
        return C1872ra.f11428l.m12204a();
    }

    /* JADX INFO: renamed from: i */
    public static String m12177i() {
        return C1872ra.f11427k.m12204a();
    }

    /* JADX INFO: renamed from: j */
    public static String m12178j() {
        return C1872ra.f11429m.m12204a();
    }

    /* JADX INFO: renamed from: l */
    public static long m12179l() {
        return C1872ra.f11441y.m12204a().longValue();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12180a() {
        if (this.f11386b == null) {
            synchronized (this) {
                if (this.f11386b == null) {
                    ApplicationInfo applicationInfo = this.f11385a.m12056a().getApplicationInfo();
                    String strM7287a = C1312p.m7287a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f11386b = Boolean.valueOf(str != null && str.equals(strM7287a));
                    }
                    if ((this.f11386b == null || !this.f11386b.booleanValue()) && "com.google.android.gms.analytics".equals(strM7287a)) {
                        this.f11386b = Boolean.TRUE;
                    }
                    if (this.f11386b == null) {
                        this.f11386b = Boolean.TRUE;
                        this.f11385a.m12060e().m12035f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f11386b.booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final Set<Integer> m12181k() {
        String strM12204a = C1872ra.f11437u.m12204a();
        if (this.f11388d == null || this.f11387c == null || !this.f11387c.equals(strM12204a)) {
            String[] strArrSplit = TextUtils.split(strM12204a, ",");
            HashSet hashSet = new HashSet();
            for (String str : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                } catch (NumberFormatException e) {
                }
            }
            this.f11387c = strM12204a;
            this.f11388d = hashSet;
        }
        return this.f11388d;
    }
}
