package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C0889d;
import com.google.android.gms.analytics.C0903r;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;

/* JADX INFO: renamed from: com.google.android.gms.internal.pm */
/* JADX INFO: loaded from: classes.dex */
public class C1830pm {

    /* JADX INFO: renamed from: a */
    private final C1834pq f11300a;

    protected C1830pm(C1834pq c1834pq) {
        C1221aj.m7065a(c1834pq);
        this.f11300a = c1834pq;
    }

    /* JADX INFO: renamed from: a */
    private static String m12016a(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    /* JADX INFO: renamed from: a */
    private final void m12017a(int i, String str, Object obj, Object obj2, Object obj3) {
        C1882rk c1882rkM12061f = this.f11300a != null ? this.f11300a.m12061f() : null;
        if (c1882rkM12061f == null) {
            String strM12204a = C1872ra.f11418b.m12204a();
            if (Log.isLoggable(strM12204a, i)) {
                Log.println(i, strM12204a, m12018c(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String strM12204a2 = C1872ra.f11418b.m12204a();
        if (Log.isLoggable(strM12204a2, i)) {
            Log.println(i, strM12204a2, C1882rk.m12018c(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            c1882rkM12061f.m12227a(i, str, obj, obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: c */
    protected static String m12018c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String strM12016a = m12016a(obj);
        String strM12016a2 = m12016a(obj2);
        String strM12016a3 = m12016a(obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(strM12016a)) {
            sb.append(str2);
            sb.append(strM12016a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strM12016a2)) {
            sb.append(str2);
            sb.append(strM12016a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strM12016a3)) {
            sb.append(str2);
            sb.append(strM12016a3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m12019w() {
        return Log.isLoggable(C1872ra.f11418b.m12204a(), 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m12020a(String str, Object obj) {
        m12017a(2, str, obj, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12021a(String str, Object obj, Object obj2) {
        m12017a(2, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12022a(String str, Object obj, Object obj2, Object obj3) {
        m12017a(3, str, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: b */
    public final void m12023b(String str) {
        m12017a(2, str, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m12024b(String str, Object obj) {
        m12017a(3, str, obj, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m12025b(String str, Object obj, Object obj2) {
        m12017a(3, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m12026b(String str, Object obj, Object obj2, Object obj3) {
        m12017a(5, str, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: c */
    public final void m12027c(String str) {
        m12017a(3, str, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m12028c(String str, Object obj) {
        m12017a(4, str, obj, null, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m12029c(String str, Object obj, Object obj2) {
        m12017a(5, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m12030d(String str) {
        m12017a(4, str, null, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m12031d(String str, Object obj) {
        m12017a(5, str, obj, null, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m12032d(String str, Object obj, Object obj2) {
        m12017a(6, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m12033e(String str) {
        m12017a(5, str, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m12034e(String str, Object obj) {
        m12017a(6, str, obj, null, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m12035f(String str) {
        m12017a(6, str, null, null, null);
    }

    /* JADX INFO: renamed from: h */
    public final C1834pq m12036h() {
        return this.f11300a;
    }

    /* JADX INFO: renamed from: i */
    protected final InterfaceC1300d m12037i() {
        return this.f11300a.m12058c();
    }

    /* JADX INFO: renamed from: j */
    protected final Context m12038j() {
        return this.f11300a.m12056a();
    }

    /* JADX INFO: renamed from: k */
    protected final C1882rk m12039k() {
        return this.f11300a.m12060e();
    }

    /* JADX INFO: renamed from: l */
    protected final C1863qs m12040l() {
        return this.f11300a.m12059d();
    }

    /* JADX INFO: renamed from: m */
    protected final C0903r m12041m() {
        return this.f11300a.m12062g();
    }

    /* JADX INFO: renamed from: n */
    public final C0889d m12042n() {
        return this.f11300a.m12065j();
    }

    /* JADX INFO: renamed from: o */
    protected final C1823pf m12043o() {
        return this.f11300a.m12063h();
    }

    /* JADX INFO: renamed from: p */
    protected final C1868qx m12044p() {
        return this.f11300a.m12064i();
    }

    /* JADX INFO: renamed from: q */
    protected final C1899sa m12045q() {
        return this.f11300a.m12066k();
    }

    /* JADX INFO: renamed from: r */
    protected final C1886ro m12046r() {
        return this.f11300a.m12067l();
    }

    /* JADX INFO: renamed from: s */
    protected final C1853qi m12047s() {
        return this.f11300a.m12070o();
    }

    /* JADX INFO: renamed from: t */
    protected final C1822pe m12048t() {
        return this.f11300a.m12069n();
    }

    /* JADX INFO: renamed from: u */
    protected final C1846qb m12049u() {
        return this.f11300a.m12071p();
    }

    /* JADX INFO: renamed from: v */
    protected final C1867qw m12050v() {
        return this.f11300a.m12072q();
    }
}
