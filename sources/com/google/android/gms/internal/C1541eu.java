package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.eu */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1541eu {

    /* JADX INFO: renamed from: A */
    public final String f10521A;

    /* JADX INFO: renamed from: B */
    public final ccb f10522B;

    /* JADX INFO: renamed from: C */
    public boolean f10523C;

    /* JADX INFO: renamed from: D */
    public boolean f10524D;

    /* JADX INFO: renamed from: E */
    public boolean f10525E;

    /* JADX INFO: renamed from: F */
    public boolean f10526F;

    /* JADX INFO: renamed from: G */
    public final List<String> f10527G;

    /* JADX INFO: renamed from: H */
    public final bwf f10528H;

    /* JADX INFO: renamed from: I */
    public final boolean f10529I;

    /* JADX INFO: renamed from: J */
    public final boolean f10530J;

    /* JADX INFO: renamed from: K */
    private C1355ab f10531K;

    /* JADX INFO: renamed from: L */
    private long f10532L;

    /* JADX INFO: renamed from: M */
    private long f10533M;

    /* JADX INFO: renamed from: a */
    public final bwx f10534a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1758mv f10535b;

    /* JADX INFO: renamed from: c */
    public final List<String> f10536c;

    /* JADX INFO: renamed from: d */
    public final int f10537d;

    /* JADX INFO: renamed from: e */
    public final List<String> f10538e;

    /* JADX INFO: renamed from: f */
    public final List<String> f10539f;

    /* JADX INFO: renamed from: g */
    public final int f10540g;

    /* JADX INFO: renamed from: h */
    public final long f10541h;

    /* JADX INFO: renamed from: i */
    public final String f10542i;

    /* JADX INFO: renamed from: j */
    public final JSONObject f10543j;

    /* JADX INFO: renamed from: k */
    public final boolean f10544k;

    /* JADX INFO: renamed from: l */
    public boolean f10545l;

    /* JADX INFO: renamed from: m */
    public final boolean f10546m;

    /* JADX INFO: renamed from: n */
    public final chs f10547n;

    /* JADX INFO: renamed from: o */
    public final cim f10548o;

    /* JADX INFO: renamed from: p */
    public final String f10549p;

    /* JADX INFO: renamed from: q */
    public final cht f10550q;

    /* JADX INFO: renamed from: r */
    public final chv f10551r;

    /* JADX INFO: renamed from: s */
    public final String f10552s;

    /* JADX INFO: renamed from: t */
    public final bxb f10553t;

    /* JADX INFO: renamed from: u */
    public final C1515dv f10554u;

    /* JADX INFO: renamed from: v */
    public final List<String> f10555v;

    /* JADX INFO: renamed from: w */
    public final List<String> f10556w;

    /* JADX INFO: renamed from: x */
    public final long f10557x;

    /* JADX INFO: renamed from: y */
    public final long f10558y;

    /* JADX INFO: renamed from: z */
    public final String f10559z;

    public C1541eu(bwx bwxVar, InterfaceC1758mv interfaceC1758mv, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, chs chsVar, cim cimVar, String str2, cht chtVar, chv chvVar, long j2, bxb bxbVar, long j3, long j4, long j5, String str3, JSONObject jSONObject, ccb ccbVar, C1515dv c1515dv, List<String> list4, List<String> list5, boolean z2, C1355ab c1355ab, String str4, List<String> list6, String str5, bwf bwfVar, boolean z3, boolean z4) {
        this.f10523C = false;
        this.f10524D = false;
        this.f10525E = false;
        this.f10526F = false;
        this.f10534a = bwxVar;
        this.f10535b = interfaceC1758mv;
        this.f10536c = m11255a(list);
        this.f10537d = i;
        this.f10538e = m11255a(list2);
        this.f10539f = m11255a(list3);
        this.f10540g = i2;
        this.f10541h = j;
        this.f10542i = str;
        this.f10546m = z;
        this.f10547n = chsVar;
        this.f10548o = cimVar;
        this.f10549p = str2;
        this.f10550q = chtVar;
        this.f10551r = chvVar;
        this.f10532L = j2;
        this.f10553t = bxbVar;
        this.f10533M = j3;
        this.f10557x = j4;
        this.f10558y = j5;
        this.f10559z = str3;
        this.f10543j = jSONObject;
        this.f10522B = ccbVar;
        this.f10554u = c1515dv;
        this.f10555v = m11255a(list4);
        this.f10556w = m11255a(list5);
        this.f10544k = z2;
        this.f10531K = c1355ab;
        this.f10552s = str4;
        this.f10527G = m11255a(list6);
        this.f10521A = str5;
        this.f10528H = bwfVar;
        this.f10529I = z3;
        this.f10530J = z4;
    }

    public C1541eu(C1542ev c1542ev, InterfaceC1758mv interfaceC1758mv, chs chsVar, cim cimVar, String str, chv chvVar, ccb ccbVar, String str2) {
        this(c1542ev.f10560a.f11753c, null, c1542ev.f10561b.f12611c, c1542ev.f10564e, c1542ev.f10561b.f12613e, c1542ev.f10561b.f12617i, c1542ev.f10561b.f12619k, c1542ev.f10561b.f12618j, c1542ev.f10560a.f11759i, c1542ev.f10561b.f12615g, null, null, null, c1542ev.f10562c, null, c1542ev.f10561b.f12616h, c1542ev.f10563d, c1542ev.f10561b.f12614f, c1542ev.f10565f, c1542ev.f10566g, c1542ev.f10561b.f12622n, c1542ev.f10567h, null, c1542ev.f10561b.f12589A, c1542ev.f10561b.f12590B, c1542ev.f10561b.f12590B, c1542ev.f10561b.f12592D, c1542ev.f10561b.f12593E, null, c1542ev.f10561b.f12596H, c1542ev.f10561b.f12600L, c1542ev.f10568i, c1542ev.f10561b.f12603O, c1542ev.f10569j);
    }

    /* JADX INFO: renamed from: a */
    private static <T> List<T> m11255a(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11256a() {
        if (this.f10535b == null || this.f10535b.mo11833w() == null) {
            return false;
        }
        return this.f10535b.mo11833w().m11864b();
    }
}
