package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.w */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C2006w {

    /* JADX INFO: renamed from: A */
    public final float f11847A;

    /* JADX INFO: renamed from: B */
    public final boolean f11848B;

    /* JADX INFO: renamed from: C */
    public final int f11849C;

    /* JADX INFO: renamed from: D */
    public final int f11850D;

    /* JADX INFO: renamed from: E */
    public final boolean f11851E;

    /* JADX INFO: renamed from: F */
    public final boolean f11852F;

    /* JADX INFO: renamed from: G */
    public final Future<String> f11853G;

    /* JADX INFO: renamed from: H */
    public final String f11854H;

    /* JADX INFO: renamed from: I */
    public final boolean f11855I;

    /* JADX INFO: renamed from: J */
    public final int f11856J;

    /* JADX INFO: renamed from: K */
    public final Bundle f11857K;

    /* JADX INFO: renamed from: L */
    public final String f11858L;

    /* JADX INFO: renamed from: M */
    public final bzd f11859M;

    /* JADX INFO: renamed from: N */
    public final boolean f11860N;

    /* JADX INFO: renamed from: O */
    public final Bundle f11861O;

    /* JADX INFO: renamed from: P */
    public final boolean f11862P;

    /* JADX INFO: renamed from: Q */
    public final Future<String> f11863Q;

    /* JADX INFO: renamed from: R */
    public final List<Integer> f11864R;

    /* JADX INFO: renamed from: S */
    public final String f11865S;

    /* JADX INFO: renamed from: T */
    public final int f11866T;

    /* JADX INFO: renamed from: U */
    public final boolean f11867U;

    /* JADX INFO: renamed from: V */
    public final boolean f11868V;

    /* JADX INFO: renamed from: W */
    public final boolean f11869W;

    /* JADX INFO: renamed from: a */
    public final Bundle f11870a;

    /* JADX INFO: renamed from: b */
    public final bwx f11871b;

    /* JADX INFO: renamed from: c */
    public final bxb f11872c;

    /* JADX INFO: renamed from: d */
    public final String f11873d;

    /* JADX INFO: renamed from: e */
    public final ApplicationInfo f11874e;

    /* JADX INFO: renamed from: f */
    public final PackageInfo f11875f;

    /* JADX INFO: renamed from: g */
    public final String f11876g;

    /* JADX INFO: renamed from: h */
    public final String f11877h;

    /* JADX INFO: renamed from: i */
    public final Bundle f11878i;

    /* JADX INFO: renamed from: j */
    public final C1670jo f11879j;

    /* JADX INFO: renamed from: k */
    public final int f11880k;

    /* JADX INFO: renamed from: l */
    public final List<String> f11881l;

    /* JADX INFO: renamed from: m */
    public final List<String> f11882m;

    /* JADX INFO: renamed from: n */
    public final List<String> f11883n;

    /* JADX INFO: renamed from: o */
    public final Bundle f11884o;

    /* JADX INFO: renamed from: p */
    public final boolean f11885p;

    /* JADX INFO: renamed from: q */
    public final int f11886q;

    /* JADX INFO: renamed from: r */
    public final int f11887r;

    /* JADX INFO: renamed from: s */
    public final float f11888s;

    /* JADX INFO: renamed from: t */
    public final String f11889t;

    /* JADX INFO: renamed from: u */
    public final long f11890u;

    /* JADX INFO: renamed from: v */
    public final String f11891v;

    /* JADX INFO: renamed from: w */
    public final List<String> f11892w;

    /* JADX INFO: renamed from: x */
    public final String f11893x;

    /* JADX INFO: renamed from: y */
    public final ccm f11894y;

    /* JADX INFO: renamed from: z */
    public final String f11895z;

    public C2006w(Bundle bundle, bwx bwxVar, bxb bxbVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, C1670jo c1670jo, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i, int i2, float f, String str4, long j, String str5, List<String> list3, String str6, ccm ccmVar, String str7, float f2, boolean z2, int i3, int i4, boolean z3, boolean z4, Future<String> future, String str8, boolean z5, int i5, Bundle bundle4, String str9, bzd bzdVar, boolean z6, Bundle bundle5, boolean z7, Future<String> future2, List<Integer> list4, String str10, List<String> list5, int i6, boolean z8, boolean z9, boolean z10) {
        this.f11870a = bundle;
        this.f11871b = bwxVar;
        this.f11872c = bxbVar;
        this.f11873d = str;
        this.f11874e = applicationInfo;
        this.f11875f = packageInfo;
        this.f11876g = str2;
        this.f11877h = str3;
        this.f11879j = c1670jo;
        this.f11878i = bundle2;
        this.f11885p = z;
        this.f11886q = i;
        this.f11887r = i2;
        this.f11888s = f;
        if (list == null || list.size() <= 0) {
            this.f11880k = 0;
            this.f11881l = null;
            this.f11882m = null;
        } else {
            this.f11880k = 3;
            this.f11881l = list;
            this.f11882m = list2;
        }
        this.f11884o = bundle3;
        this.f11889t = str4;
        this.f11890u = j;
        this.f11891v = str5;
        this.f11892w = list3;
        this.f11893x = str6;
        this.f11894y = ccmVar;
        this.f11895z = str7;
        this.f11847A = f2;
        this.f11848B = z2;
        this.f11849C = i3;
        this.f11850D = i4;
        this.f11851E = z3;
        this.f11852F = z4;
        this.f11853G = future;
        this.f11854H = str8;
        this.f11855I = z5;
        this.f11856J = i5;
        this.f11857K = bundle4;
        this.f11858L = str9;
        this.f11859M = bzdVar;
        this.f11860N = z6;
        this.f11861O = bundle5;
        this.f11862P = z7;
        this.f11863Q = future2;
        this.f11864R = list4;
        this.f11865S = str10;
        this.f11883n = list5;
        this.f11866T = i6;
        this.f11867U = z8;
        this.f11868V = z9;
        this.f11869W = z10;
    }
}
