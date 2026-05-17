package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.yw */
/* JADX INFO: loaded from: classes.dex */
final class C2083yw {

    /* JADX INFO: renamed from: A */
    private long f12547A;

    /* JADX INFO: renamed from: a */
    private final abd f12548a;

    /* JADX INFO: renamed from: b */
    private final String f12549b;

    /* JADX INFO: renamed from: c */
    private String f12550c;

    /* JADX INFO: renamed from: d */
    private String f12551d;

    /* JADX INFO: renamed from: e */
    private String f12552e;

    /* JADX INFO: renamed from: f */
    private String f12553f;

    /* JADX INFO: renamed from: g */
    private long f12554g;

    /* JADX INFO: renamed from: h */
    private long f12555h;

    /* JADX INFO: renamed from: i */
    private long f12556i;

    /* JADX INFO: renamed from: j */
    private String f12557j;

    /* JADX INFO: renamed from: k */
    private long f12558k;

    /* JADX INFO: renamed from: l */
    private String f12559l;

    /* JADX INFO: renamed from: m */
    private long f12560m;

    /* JADX INFO: renamed from: n */
    private long f12561n;

    /* JADX INFO: renamed from: o */
    private boolean f12562o;

    /* JADX INFO: renamed from: p */
    private long f12563p;

    /* JADX INFO: renamed from: q */
    private boolean f12564q;

    /* JADX INFO: renamed from: r */
    private long f12565r;

    /* JADX INFO: renamed from: s */
    private long f12566s;

    /* JADX INFO: renamed from: t */
    private long f12567t;

    /* JADX INFO: renamed from: u */
    private long f12568u;

    /* JADX INFO: renamed from: v */
    private long f12569v;

    /* JADX INFO: renamed from: w */
    private long f12570w;

    /* JADX INFO: renamed from: x */
    private String f12571x;

    /* JADX INFO: renamed from: y */
    private boolean f12572y;

    /* JADX INFO: renamed from: z */
    private long f12573z;

    C2083yw(abd abdVar, String str) {
        C1221aj.m7065a(abdVar);
        C1221aj.m7067a(str);
        this.f12548a = abdVar;
        this.f12549b = str;
        this.f12548a.m7542h().mo7376c();
    }

    /* JADX INFO: renamed from: A */
    public final long m12617A() {
        this.f12548a.m7542h().mo7376c();
        return this.f12563p;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12618B() {
        this.f12548a.m7542h().mo7376c();
        return this.f12564q;
    }

    /* JADX INFO: renamed from: a */
    public final void m12619a() {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m12620a(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12555h != j) | this.f12572y;
        this.f12555h = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m12621a(String str) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (!aek.m7725a(this.f12550c, str)) | this.f12572y;
        this.f12550c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m12622a(boolean z) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12562o != z) | this.f12572y;
        this.f12562o = z;
    }

    /* JADX INFO: renamed from: b */
    public final String m12623b() {
        this.f12548a.m7542h().mo7376c();
        return this.f12549b;
    }

    /* JADX INFO: renamed from: b */
    public final void m12624b(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12556i != j) | this.f12572y;
        this.f12556i = j;
    }

    /* JADX INFO: renamed from: b */
    public final void m12625b(String str) {
        this.f12548a.m7542h().mo7376c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f12572y = (!aek.m7725a(this.f12551d, str)) | this.f12572y;
        this.f12551d = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m12626b(boolean z) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = this.f12564q != z;
        this.f12564q = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m12627c() {
        this.f12548a.m7542h().mo7376c();
        return this.f12550c;
    }

    /* JADX INFO: renamed from: c */
    public final void m12628c(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12558k != j) | this.f12572y;
        this.f12558k = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m12629c(String str) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (!aek.m7725a(this.f12552e, str)) | this.f12572y;
        this.f12552e = str;
    }

    /* JADX INFO: renamed from: d */
    public final String m12630d() {
        this.f12548a.m7542h().mo7376c();
        return this.f12551d;
    }

    /* JADX INFO: renamed from: d */
    public final void m12631d(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12560m != j) | this.f12572y;
        this.f12560m = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m12632d(String str) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (!aek.m7725a(this.f12553f, str)) | this.f12572y;
        this.f12553f = str;
    }

    /* JADX INFO: renamed from: e */
    public final String m12633e() {
        this.f12548a.m7542h().mo7376c();
        return this.f12552e;
    }

    /* JADX INFO: renamed from: e */
    public final void m12634e(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12561n != j) | this.f12572y;
        this.f12561n = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m12635e(String str) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (!aek.m7725a(this.f12557j, str)) | this.f12572y;
        this.f12557j = str;
    }

    /* JADX INFO: renamed from: f */
    public final String m12636f() {
        this.f12548a.m7542h().mo7376c();
        return this.f12553f;
    }

    /* JADX INFO: renamed from: f */
    public final void m12637f(long j) {
        C1221aj.m7074b(j >= 0);
        this.f12548a.m7542h().mo7376c();
        this.f12572y |= this.f12554g != j;
        this.f12554g = j;
    }

    /* JADX INFO: renamed from: f */
    public final void m12638f(String str) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (!aek.m7725a(this.f12559l, str)) | this.f12572y;
        this.f12559l = str;
    }

    /* JADX INFO: renamed from: g */
    public final long m12639g() {
        this.f12548a.m7542h().mo7376c();
        return this.f12555h;
    }

    /* JADX INFO: renamed from: g */
    public final void m12640g(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12573z != j) | this.f12572y;
        this.f12573z = j;
    }

    /* JADX INFO: renamed from: g */
    public final void m12641g(String str) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (!aek.m7725a(this.f12571x, str)) | this.f12572y;
        this.f12571x = str;
    }

    /* JADX INFO: renamed from: h */
    public final long m12642h() {
        this.f12548a.m7542h().mo7376c();
        return this.f12556i;
    }

    /* JADX INFO: renamed from: h */
    public final void m12643h(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12547A != j) | this.f12572y;
        this.f12547A = j;
    }

    /* JADX INFO: renamed from: i */
    public final String m12644i() {
        this.f12548a.m7542h().mo7376c();
        return this.f12557j;
    }

    /* JADX INFO: renamed from: i */
    public final void m12645i(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12565r != j) | this.f12572y;
        this.f12565r = j;
    }

    /* JADX INFO: renamed from: j */
    public final long m12646j() {
        this.f12548a.m7542h().mo7376c();
        return this.f12558k;
    }

    /* JADX INFO: renamed from: j */
    public final void m12647j(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12566s != j) | this.f12572y;
        this.f12566s = j;
    }

    /* JADX INFO: renamed from: k */
    public final String m12648k() {
        this.f12548a.m7542h().mo7376c();
        return this.f12559l;
    }

    /* JADX INFO: renamed from: k */
    public final void m12649k(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12567t != j) | this.f12572y;
        this.f12567t = j;
    }

    /* JADX INFO: renamed from: l */
    public final long m12650l() {
        this.f12548a.m7542h().mo7376c();
        return this.f12560m;
    }

    /* JADX INFO: renamed from: l */
    public final void m12651l(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12568u != j) | this.f12572y;
        this.f12568u = j;
    }

    /* JADX INFO: renamed from: m */
    public final long m12652m() {
        this.f12548a.m7542h().mo7376c();
        return this.f12561n;
    }

    /* JADX INFO: renamed from: m */
    public final void m12653m(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12570w != j) | this.f12572y;
        this.f12570w = j;
    }

    /* JADX INFO: renamed from: n */
    public final void m12654n(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12569v != j) | this.f12572y;
        this.f12569v = j;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12655n() {
        this.f12548a.m7542h().mo7376c();
        return this.f12562o;
    }

    /* JADX INFO: renamed from: o */
    public final long m12656o() {
        this.f12548a.m7542h().mo7376c();
        return this.f12554g;
    }

    /* JADX INFO: renamed from: o */
    public final void m12657o(long j) {
        this.f12548a.m7542h().mo7376c();
        this.f12572y = (this.f12563p != j) | this.f12572y;
        this.f12563p = j;
    }

    /* JADX INFO: renamed from: p */
    public final long m12658p() {
        this.f12548a.m7542h().mo7376c();
        return this.f12573z;
    }

    /* JADX INFO: renamed from: q */
    public final long m12659q() {
        this.f12548a.m7542h().mo7376c();
        return this.f12547A;
    }

    /* JADX INFO: renamed from: r */
    public final void m12660r() {
        this.f12548a.m7542h().mo7376c();
        long j = this.f12554g + 1;
        if (j > 2147483647L) {
            this.f12548a.m7540f().m7401A().m7413a("Bundle index overflow. appId", aac.m7397a(this.f12549b));
            j = 0;
        }
        this.f12572y = true;
        this.f12554g = j;
    }

    /* JADX INFO: renamed from: s */
    public final long m12661s() {
        this.f12548a.m7542h().mo7376c();
        return this.f12565r;
    }

    /* JADX INFO: renamed from: t */
    public final long m12662t() {
        this.f12548a.m7542h().mo7376c();
        return this.f12566s;
    }

    /* JADX INFO: renamed from: u */
    public final long m12663u() {
        this.f12548a.m7542h().mo7376c();
        return this.f12567t;
    }

    /* JADX INFO: renamed from: v */
    public final long m12664v() {
        this.f12548a.m7542h().mo7376c();
        return this.f12568u;
    }

    /* JADX INFO: renamed from: w */
    public final long m12665w() {
        this.f12548a.m7542h().mo7376c();
        return this.f12570w;
    }

    /* JADX INFO: renamed from: x */
    public final long m12666x() {
        this.f12548a.m7542h().mo7376c();
        return this.f12569v;
    }

    /* JADX INFO: renamed from: y */
    public final String m12667y() {
        this.f12548a.m7542h().mo7376c();
        return this.f12571x;
    }

    /* JADX INFO: renamed from: z */
    public final String m12668z() {
        this.f12548a.m7542h().mo7376c();
        String str = this.f12571x;
        m12641g((String) null);
        return str;
    }
}
