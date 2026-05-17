package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.z */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C2087z extends AbstractC2011we {
    public static final Parcelable.Creator<C2087z> CREATOR = new C1354aa();

    /* JADX INFO: renamed from: A */
    public final C1515dv f12589A;

    /* JADX INFO: renamed from: B */
    public final List<String> f12590B;

    /* JADX INFO: renamed from: C */
    public final List<String> f12591C;

    /* JADX INFO: renamed from: D */
    public final boolean f12592D;

    /* JADX INFO: renamed from: E */
    public final C1355ab f12593E;

    /* JADX INFO: renamed from: F */
    public final boolean f12594F;

    /* JADX INFO: renamed from: G */
    public String f12595G;

    /* JADX INFO: renamed from: H */
    public final List<String> f12596H;

    /* JADX INFO: renamed from: I */
    public final boolean f12597I;

    /* JADX INFO: renamed from: J */
    public final String f12598J;

    /* JADX INFO: renamed from: K */
    public final C1524ed f12599K;

    /* JADX INFO: renamed from: L */
    public final String f12600L;

    /* JADX INFO: renamed from: M */
    public final boolean f12601M;

    /* JADX INFO: renamed from: N */
    public final boolean f12602N;

    /* JADX INFO: renamed from: O */
    public final boolean f12603O;

    /* JADX INFO: renamed from: P */
    public final int f12604P;

    /* JADX INFO: renamed from: Q */
    private C1979v f12605Q;

    /* JADX INFO: renamed from: R */
    private int f12606R;

    /* JADX INFO: renamed from: S */
    private C1372am f12607S;

    /* JADX INFO: renamed from: T */
    private Bundle f12608T;

    /* JADX INFO: renamed from: a */
    public final String f12609a;

    /* JADX INFO: renamed from: b */
    public String f12610b;

    /* JADX INFO: renamed from: c */
    public final List<String> f12611c;

    /* JADX INFO: renamed from: d */
    public final int f12612d;

    /* JADX INFO: renamed from: e */
    public final List<String> f12613e;

    /* JADX INFO: renamed from: f */
    public final long f12614f;

    /* JADX INFO: renamed from: g */
    public final boolean f12615g;

    /* JADX INFO: renamed from: h */
    public final long f12616h;

    /* JADX INFO: renamed from: i */
    public final List<String> f12617i;

    /* JADX INFO: renamed from: j */
    public final long f12618j;

    /* JADX INFO: renamed from: k */
    public final int f12619k;

    /* JADX INFO: renamed from: l */
    public final String f12620l;

    /* JADX INFO: renamed from: m */
    public final long f12621m;

    /* JADX INFO: renamed from: n */
    public final String f12622n;

    /* JADX INFO: renamed from: o */
    public final boolean f12623o;

    /* JADX INFO: renamed from: p */
    public final String f12624p;

    /* JADX INFO: renamed from: q */
    public final String f12625q;

    /* JADX INFO: renamed from: r */
    public final boolean f12626r;

    /* JADX INFO: renamed from: s */
    public final boolean f12627s;

    /* JADX INFO: renamed from: t */
    public final boolean f12628t;

    /* JADX INFO: renamed from: u */
    public final boolean f12629u;

    /* JADX INFO: renamed from: v */
    public final boolean f12630v;

    /* JADX INFO: renamed from: w */
    public String f12631w;

    /* JADX INFO: renamed from: x */
    public final String f12632x;

    /* JADX INFO: renamed from: y */
    public final boolean f12633y;

    /* JADX INFO: renamed from: z */
    public final boolean f12634z;

    public C2087z(int i) {
        this(19, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    public C2087z(int i, long j) {
        this(19, null, null, null, i, null, -1L, false, -1L, null, j, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    C2087z(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C1372am c1372am, String str7, String str8, boolean z8, boolean z9, C1515dv c1515dv, List<String> list4, List<String> list5, boolean z10, C1355ab c1355ab, boolean z11, String str9, List<String> list6, boolean z12, String str10, C1524ed c1524ed, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4) {
        C1423ba c1423ba;
        this.f12606R = i;
        this.f12609a = str;
        this.f12610b = str2;
        this.f12611c = list != null ? Collections.unmodifiableList(list) : null;
        this.f12612d = i2;
        this.f12613e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f12614f = j;
        this.f12615g = z;
        this.f12616h = j2;
        this.f12617i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f12618j = j3;
        this.f12619k = i3;
        this.f12620l = str3;
        this.f12621m = j4;
        this.f12622n = str4;
        this.f12623o = z2;
        this.f12624p = str5;
        this.f12625q = str6;
        this.f12626r = z3;
        this.f12627s = z4;
        this.f12628t = z5;
        this.f12629u = z6;
        this.f12601M = z13;
        this.f12630v = z7;
        this.f12607S = c1372am;
        this.f12631w = str7;
        this.f12632x = str8;
        if (this.f12610b == null && this.f12607S != null && (c1423ba = (C1423ba) this.f12607S.m8089a(C1423ba.CREATOR)) != null && !TextUtils.isEmpty(c1423ba.f7644a)) {
            this.f12610b = c1423ba.f7644a;
        }
        this.f12633y = z8;
        this.f12634z = z9;
        this.f12589A = c1515dv;
        this.f12590B = list4;
        this.f12591C = list5;
        this.f12592D = z10;
        this.f12593E = c1355ab;
        this.f12594F = z11;
        this.f12595G = str9;
        this.f12596H = list6;
        this.f12597I = z12;
        this.f12598J = str10;
        this.f12599K = c1524ed;
        this.f12600L = str11;
        this.f12602N = z14;
        this.f12608T = bundle;
        this.f12603O = z15;
        this.f12604P = i4;
    }

    public C2087z(C1979v c1979v, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, C1515dv c1515dv, List<String> list4, List<String> list5, boolean z9, C1355ab c1355ab, boolean z10, String str7, List<String> list6, boolean z11, String str8, C1524ed c1524ed, String str9, boolean z12, boolean z13, boolean z14, int i2) {
        this(19, str, str2, list, -2, list2, j, z, -1L, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, c1515dv, list4, list5, z9, c1355ab, z10, str7, list6, z11, str8, c1524ed, str9, z12, z13, null, z14, i2);
        this.f12605Q = c1979v;
    }

    public C2087z(C1979v c1979v, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, C1515dv c1515dv, List<String> list4, List<String> list5, boolean z10, C1355ab c1355ab, boolean z11, String str8, List<String> list6, boolean z12, String str9, C1524ed c1524ed, String str10, boolean z13, boolean z14, boolean z15, int i2) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, c1515dv, list4, list5, z10, c1355ab, z11, str8, list6, z12, str9, c1524ed, str10, z13, z14, null, z15, 0);
        this.f12605Q = c1979v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f12605Q != null && this.f12605Q.f11749a >= 9 && !TextUtils.isEmpty(this.f12610b)) {
            this.f12607S = new C1372am(new C1423ba(this.f12610b));
            this.f12610b = null;
        }
        int iM12512a = C2014wh.m12512a(parcel);
        C2014wh.m12516a(parcel, 1, this.f12606R);
        C2014wh.m12524a(parcel, 2, this.f12609a, false);
        C2014wh.m12524a(parcel, 3, this.f12610b, false);
        C2014wh.m12535b(parcel, 4, this.f12611c, false);
        C2014wh.m12516a(parcel, 5, this.f12612d);
        C2014wh.m12535b(parcel, 6, this.f12613e, false);
        C2014wh.m12517a(parcel, 7, this.f12614f);
        C2014wh.m12526a(parcel, 8, this.f12615g);
        C2014wh.m12517a(parcel, 9, this.f12616h);
        C2014wh.m12535b(parcel, 10, this.f12617i, false);
        C2014wh.m12517a(parcel, 11, this.f12618j);
        C2014wh.m12516a(parcel, 12, this.f12619k);
        C2014wh.m12524a(parcel, 13, this.f12620l, false);
        C2014wh.m12517a(parcel, 14, this.f12621m);
        C2014wh.m12524a(parcel, 15, this.f12622n, false);
        C2014wh.m12526a(parcel, 18, this.f12623o);
        C2014wh.m12524a(parcel, 19, this.f12624p, false);
        C2014wh.m12524a(parcel, 21, this.f12625q, false);
        C2014wh.m12526a(parcel, 22, this.f12626r);
        C2014wh.m12526a(parcel, 23, this.f12627s);
        C2014wh.m12526a(parcel, 24, this.f12628t);
        C2014wh.m12526a(parcel, 25, this.f12629u);
        C2014wh.m12526a(parcel, 26, this.f12630v);
        C2014wh.m12520a(parcel, 28, (Parcelable) this.f12607S, i, false);
        C2014wh.m12524a(parcel, 29, this.f12631w, false);
        C2014wh.m12524a(parcel, 30, this.f12632x, false);
        C2014wh.m12526a(parcel, 31, this.f12633y);
        C2014wh.m12526a(parcel, 32, this.f12634z);
        C2014wh.m12520a(parcel, 33, (Parcelable) this.f12589A, i, false);
        C2014wh.m12535b(parcel, 34, this.f12590B, false);
        C2014wh.m12535b(parcel, 35, this.f12591C, false);
        C2014wh.m12526a(parcel, 36, this.f12592D);
        C2014wh.m12520a(parcel, 37, (Parcelable) this.f12593E, i, false);
        C2014wh.m12526a(parcel, 38, this.f12594F);
        C2014wh.m12524a(parcel, 39, this.f12595G, false);
        C2014wh.m12535b(parcel, 40, this.f12596H, false);
        C2014wh.m12526a(parcel, 42, this.f12597I);
        C2014wh.m12524a(parcel, 43, this.f12598J, false);
        C2014wh.m12520a(parcel, 44, (Parcelable) this.f12599K, i, false);
        C2014wh.m12524a(parcel, 45, this.f12600L, false);
        C2014wh.m12526a(parcel, 46, this.f12601M);
        C2014wh.m12526a(parcel, 47, this.f12602N);
        C2014wh.m12518a(parcel, 48, this.f12608T, false);
        C2014wh.m12526a(parcel, 49, this.f12603O);
        C2014wh.m12516a(parcel, 50, this.f12604P);
        C2014wh.m12513a(parcel, iM12512a);
    }
}
