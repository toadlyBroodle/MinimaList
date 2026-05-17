package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.v */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1979v extends AbstractC2011we {
    public static final Parcelable.Creator<C1979v> CREATOR = new C2033x();

    /* JADX INFO: renamed from: A */
    public final long f11723A;

    /* JADX INFO: renamed from: B */
    public final String f11724B;

    /* JADX INFO: renamed from: C */
    public final float f11725C;

    /* JADX INFO: renamed from: D */
    public final int f11726D;

    /* JADX INFO: renamed from: E */
    public final int f11727E;

    /* JADX INFO: renamed from: F */
    public final boolean f11728F;

    /* JADX INFO: renamed from: G */
    public final boolean f11729G;

    /* JADX INFO: renamed from: H */
    public final String f11730H;

    /* JADX INFO: renamed from: I */
    public final boolean f11731I;

    /* JADX INFO: renamed from: J */
    public final String f11732J;

    /* JADX INFO: renamed from: K */
    public final boolean f11733K;

    /* JADX INFO: renamed from: L */
    public final int f11734L;

    /* JADX INFO: renamed from: M */
    public final Bundle f11735M;

    /* JADX INFO: renamed from: N */
    public final String f11736N;

    /* JADX INFO: renamed from: O */
    public final bzd f11737O;

    /* JADX INFO: renamed from: P */
    public final boolean f11738P;

    /* JADX INFO: renamed from: Q */
    public final Bundle f11739Q;

    /* JADX INFO: renamed from: R */
    public final String f11740R;

    /* JADX INFO: renamed from: S */
    public final String f11741S;

    /* JADX INFO: renamed from: T */
    public final String f11742T;

    /* JADX INFO: renamed from: U */
    public final boolean f11743U;

    /* JADX INFO: renamed from: V */
    public final List<Integer> f11744V;

    /* JADX INFO: renamed from: W */
    public final String f11745W;

    /* JADX INFO: renamed from: X */
    public final List<String> f11746X;

    /* JADX INFO: renamed from: Y */
    public final int f11747Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f11748Z;

    /* JADX INFO: renamed from: a */
    public final int f11749a;

    /* JADX INFO: renamed from: aa */
    public final boolean f11750aa;

    /* JADX INFO: renamed from: ab */
    public final boolean f11751ab;

    /* JADX INFO: renamed from: b */
    public final Bundle f11752b;

    /* JADX INFO: renamed from: c */
    public final bwx f11753c;

    /* JADX INFO: renamed from: d */
    public final bxb f11754d;

    /* JADX INFO: renamed from: e */
    public final String f11755e;

    /* JADX INFO: renamed from: f */
    public final ApplicationInfo f11756f;

    /* JADX INFO: renamed from: g */
    public final PackageInfo f11757g;

    /* JADX INFO: renamed from: h */
    public final String f11758h;

    /* JADX INFO: renamed from: i */
    public final String f11759i;

    /* JADX INFO: renamed from: j */
    public final String f11760j;

    /* JADX INFO: renamed from: k */
    public final C1670jo f11761k;

    /* JADX INFO: renamed from: l */
    public final Bundle f11762l;

    /* JADX INFO: renamed from: m */
    public final int f11763m;

    /* JADX INFO: renamed from: n */
    public final List<String> f11764n;

    /* JADX INFO: renamed from: o */
    public final Bundle f11765o;

    /* JADX INFO: renamed from: p */
    public final boolean f11766p;

    /* JADX INFO: renamed from: q */
    public final int f11767q;

    /* JADX INFO: renamed from: r */
    public final int f11768r;

    /* JADX INFO: renamed from: s */
    public final float f11769s;

    /* JADX INFO: renamed from: t */
    public final String f11770t;

    /* JADX INFO: renamed from: u */
    public final long f11771u;

    /* JADX INFO: renamed from: v */
    public final String f11772v;

    /* JADX INFO: renamed from: w */
    public final List<String> f11773w;

    /* JADX INFO: renamed from: x */
    public final String f11774x;

    /* JADX INFO: renamed from: y */
    public final ccm f11775y;

    /* JADX INFO: renamed from: z */
    public final List<String> f11776z;

    C1979v(int i, Bundle bundle, bwx bwxVar, bxb bxbVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, C1670jo c1670jo, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, ccm ccmVar, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, bzd bzdVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10) {
        this.f11749a = i;
        this.f11752b = bundle;
        this.f11753c = bwxVar;
        this.f11754d = bxbVar;
        this.f11755e = str;
        this.f11756f = applicationInfo;
        this.f11757g = packageInfo;
        this.f11758h = str2;
        this.f11759i = str3;
        this.f11760j = str4;
        this.f11761k = c1670jo;
        this.f11762l = bundle2;
        this.f11763m = i2;
        this.f11764n = list;
        this.f11776z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f11765o = bundle3;
        this.f11766p = z;
        this.f11767q = i3;
        this.f11768r = i4;
        this.f11769s = f;
        this.f11770t = str5;
        this.f11771u = j;
        this.f11772v = str6;
        this.f11773w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f11774x = str7;
        this.f11775y = ccmVar;
        this.f11723A = j2;
        this.f11724B = str8;
        this.f11725C = f2;
        this.f11731I = z2;
        this.f11726D = i5;
        this.f11727E = i6;
        this.f11728F = z3;
        this.f11729G = z4;
        this.f11730H = str9;
        this.f11732J = str10;
        this.f11733K = z5;
        this.f11734L = i7;
        this.f11735M = bundle4;
        this.f11736N = str11;
        this.f11737O = bzdVar;
        this.f11738P = z6;
        this.f11739Q = bundle5;
        this.f11740R = str12;
        this.f11741S = str13;
        this.f11742T = str14;
        this.f11743U = z7;
        this.f11744V = list4;
        this.f11745W = str15;
        this.f11746X = list5;
        this.f11747Y = i8;
        this.f11748Z = z8;
        this.f11750aa = z9;
        this.f11751ab = z10;
    }

    private C1979v(Bundle bundle, bwx bwxVar, bxb bxbVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, C1670jo c1670jo, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, ccm ccmVar, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, bzd bzdVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10) {
        this(24, bundle, bwxVar, bxbVar, str, applicationInfo, packageInfo, str2, str3, str4, c1670jo, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, ccmVar, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, bzdVar, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10);
    }

    public C1979v(C2006w c2006w, long j, String str, String str2, String str3) {
        this(c2006w.f11870a, c2006w.f11871b, c2006w.f11872c, c2006w.f11873d, c2006w.f11874e, c2006w.f11875f, (String) C1678jw.m11623a(c2006w.f11863Q, ""), c2006w.f11876g, c2006w.f11877h, c2006w.f11879j, c2006w.f11878i, c2006w.f11880k, c2006w.f11881l, c2006w.f11882m, c2006w.f11884o, c2006w.f11885p, c2006w.f11886q, c2006w.f11887r, c2006w.f11888s, c2006w.f11889t, c2006w.f11890u, c2006w.f11891v, c2006w.f11892w, c2006w.f11893x, c2006w.f11894y, j, c2006w.f11895z, c2006w.f11847A, c2006w.f11848B, c2006w.f11849C, c2006w.f11850D, c2006w.f11851E, c2006w.f11852F, (String) C1678jw.m11624a(c2006w.f11853G, "", 1L, TimeUnit.SECONDS), c2006w.f11854H, c2006w.f11855I, c2006w.f11856J, c2006w.f11857K, c2006w.f11858L, c2006w.f11859M, c2006w.f11860N, c2006w.f11861O, str, str2, str3, c2006w.f11862P, c2006w.f11864R, c2006w.f11865S, c2006w.f11883n, c2006w.f11866T, c2006w.f11867U, c2006w.f11868V, c2006w.f11869W);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f11749a);
        C2014wh.m12518a(parcel, 2, this.f11752b, false);
        C2014wh.m12520a(parcel, 3, (Parcelable) this.f11753c, i, false);
        C2014wh.m12520a(parcel, 4, (Parcelable) this.f11754d, i, false);
        C2014wh.m12524a(parcel, 5, this.f11755e, false);
        C2014wh.m12520a(parcel, 6, (Parcelable) this.f11756f, i, false);
        C2014wh.m12520a(parcel, 7, (Parcelable) this.f11757g, i, false);
        C2014wh.m12524a(parcel, 8, this.f11758h, false);
        C2014wh.m12524a(parcel, 9, this.f11759i, false);
        C2014wh.m12524a(parcel, 10, this.f11760j, false);
        C2014wh.m12520a(parcel, 11, (Parcelable) this.f11761k, i, false);
        C2014wh.m12518a(parcel, 12, this.f11762l, false);
        C2014wh.m12516a(parcel, 13, this.f11763m);
        C2014wh.m12535b(parcel, 14, this.f11764n, false);
        C2014wh.m12518a(parcel, 15, this.f11765o, false);
        C2014wh.m12526a(parcel, 16, this.f11766p);
        C2014wh.m12516a(parcel, 18, this.f11767q);
        C2014wh.m12516a(parcel, 19, this.f11768r);
        C2014wh.m12515a(parcel, 20, this.f11769s);
        C2014wh.m12524a(parcel, 21, this.f11770t, false);
        C2014wh.m12517a(parcel, 25, this.f11771u);
        C2014wh.m12524a(parcel, 26, this.f11772v, false);
        C2014wh.m12535b(parcel, 27, this.f11773w, false);
        C2014wh.m12524a(parcel, 28, this.f11774x, false);
        C2014wh.m12520a(parcel, 29, (Parcelable) this.f11775y, i, false);
        C2014wh.m12535b(parcel, 30, this.f11776z, false);
        C2014wh.m12517a(parcel, 31, this.f11723A);
        C2014wh.m12524a(parcel, 33, this.f11724B, false);
        C2014wh.m12515a(parcel, 34, this.f11725C);
        C2014wh.m12516a(parcel, 35, this.f11726D);
        C2014wh.m12516a(parcel, 36, this.f11727E);
        C2014wh.m12526a(parcel, 37, this.f11728F);
        C2014wh.m12526a(parcel, 38, this.f11729G);
        C2014wh.m12524a(parcel, 39, this.f11730H, false);
        C2014wh.m12526a(parcel, 40, this.f11731I);
        C2014wh.m12524a(parcel, 41, this.f11732J, false);
        C2014wh.m12526a(parcel, 42, this.f11733K);
        C2014wh.m12516a(parcel, 43, this.f11734L);
        C2014wh.m12518a(parcel, 44, this.f11735M, false);
        C2014wh.m12524a(parcel, 45, this.f11736N, false);
        C2014wh.m12520a(parcel, 46, (Parcelable) this.f11737O, i, false);
        C2014wh.m12526a(parcel, 47, this.f11738P);
        C2014wh.m12518a(parcel, 48, this.f11739Q, false);
        C2014wh.m12524a(parcel, 49, this.f11740R, false);
        C2014wh.m12524a(parcel, 50, this.f11741S, false);
        C2014wh.m12524a(parcel, 51, this.f11742T, false);
        C2014wh.m12526a(parcel, 52, this.f11743U);
        C2014wh.m12525a(parcel, 53, this.f11744V, false);
        C2014wh.m12524a(parcel, 54, this.f11745W, false);
        C2014wh.m12535b(parcel, 55, this.f11746X, false);
        C2014wh.m12516a(parcel, 56, this.f11747Y);
        C2014wh.m12526a(parcel, 57, this.f11748Z);
        C2014wh.m12526a(parcel, 58, this.f11750aa);
        C2014wh.m12526a(parcel, 59, this.f11751ab);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
