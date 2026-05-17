package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
public final class aac extends acd {

    /* JADX INFO: renamed from: a */
    private final String f6103a;

    /* JADX INFO: renamed from: b */
    private final char f6104b;

    /* JADX INFO: renamed from: c */
    private final long f6105c;

    /* JADX INFO: renamed from: d */
    private final aae f6106d;

    /* JADX INFO: renamed from: e */
    private final aae f6107e;

    /* JADX INFO: renamed from: f */
    private final aae f6108f;

    /* JADX INFO: renamed from: g */
    private final aae f6109g;

    /* JADX INFO: renamed from: h */
    private final aae f6110h;

    /* JADX INFO: renamed from: i */
    private final aae f6111i;

    /* JADX INFO: renamed from: j */
    private final aae f6112j;

    /* JADX INFO: renamed from: k */
    private final aae f6113k;

    /* JADX INFO: renamed from: l */
    private final aae f6114l;

    aac(abd abdVar) {
        super(abdVar);
        this.f6103a = C2106zs.f12711c.m12779b();
        this.f6105c = 11910L;
        if (mo7395v().m12687w()) {
            this.f6104b = 'C';
        } else {
            this.f6104b = 'c';
        }
        this.f6106d = new aae(this, 6, false, false);
        this.f6107e = new aae(this, 6, true, false);
        this.f6108f = new aae(this, 6, false, true);
        this.f6109g = new aae(this, 5, false, false);
        this.f6110h = new aae(this, 5, true, false);
        this.f6111i = new aae(this, 5, false, true);
        this.f6112j = new aae(this, 4, false, false);
        this.f6113k = new aae(this, 3, false, false);
        this.f6114l = new aae(this, 2, false, false);
    }

    /* JADX INFO: renamed from: a */
    protected static Object m7397a(String str) {
        if (str == null) {
            return null;
        }
        return new aaf(str);
    }

    /* JADX INFO: renamed from: a */
    private static String m7398a(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        Object objValueOf = obj instanceof Integer ? Long.valueOf(((Integer) obj).intValue()) : obj;
        if (objValueOf instanceof Long) {
            if (z && Math.abs(((Long) objValueOf).longValue()) >= 100) {
                String str = String.valueOf(objValueOf).charAt(0) == '-' ? "-" : "";
                String strValueOf = String.valueOf(Math.abs(((Long) objValueOf).longValue()));
                return new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, strValueOf.length() - 1))).append("...").append(str).append(Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d)).toString();
            }
            return String.valueOf(objValueOf);
        }
        if (objValueOf instanceof Boolean) {
            return String.valueOf(objValueOf);
        }
        if (!(objValueOf instanceof Throwable)) {
            return objValueOf instanceof aaf ? ((aaf) objValueOf).f6121a : z ? "-" : String.valueOf(objValueOf);
        }
        Throwable th = (Throwable) objValueOf;
        StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strM7400b = m7400b(AppMeasurement.class.getCanonicalName());
        String strM7400b2 = m7400b(abd.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                String strM7400b3 = m7400b(className);
                if (strM7400b3.equals(strM7400b) || strM7400b3.equals(strM7400b2)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m7399a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String strM7398a = m7398a(z, obj);
        String strM7398a2 = m7398a(z, obj2);
        String strM7398a3 = m7398a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(strM7398a)) {
            sb.append(str2);
            sb.append(strM7398a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strM7398a2)) {
            sb.append(str2);
            sb.append(strM7398a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strM7398a3)) {
            sb.append(str2);
            sb.append(strM7398a3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m7400b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    /* JADX INFO: renamed from: A */
    public final aae m7401A() {
        return this.f6109g;
    }

    /* JADX INFO: renamed from: B */
    public final aae m7402B() {
        return this.f6111i;
    }

    /* JADX INFO: renamed from: C */
    public final aae m7403C() {
        return this.f6112j;
    }

    /* JADX INFO: renamed from: D */
    public final aae m7404D() {
        return this.f6113k;
    }

    /* JADX INFO: renamed from: E */
    public final aae m7405E() {
        return this.f6114l;
    }

    /* JADX INFO: renamed from: F */
    public final String m7406F() {
        Pair<String, Long> pairM7446a = mo7394u().f6141b.m7446a();
        if (pairM7446a == null || pairM7446a == aan.f6140a) {
            return null;
        }
        String strValueOf = String.valueOf(pairM7446a.second);
        String str = (String) pairM7446a.first;
        return new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length()).append(strValueOf).append(":").append(str).toString();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7372a() {
        super.mo7372a();
    }

    /* JADX INFO: renamed from: a */
    protected final void m7407a(int i, String str) {
        Log.println(i, this.f6103a, str);
    }

    /* JADX INFO: renamed from: a */
    protected final void m7408a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m7409a(i)) {
            m7407a(i, m7399a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        C1221aj.m7065a(str);
        aay aayVarM7545k = this.f6329p.m7545k();
        if (aayVarM7545k == null) {
            m7407a(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!aayVarM7545k.m7583P()) {
            m7407a(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        int i2 = i < 0 ? 0 : i;
        if (i2 >= 9) {
            i2 = 8;
        }
        char cCharAt = "01VDIWEA?".charAt(i2);
        char c = this.f6104b;
        long j = this.f6105c;
        String strM7399a = m7399a(true, str, obj, obj2, obj3);
        String string = new StringBuilder(String.valueOf("2").length() + 23 + String.valueOf(strM7399a).length()).append("2").append(cCharAt).append(c).append(j).append(":").append(strM7399a).toString();
        if (string.length() > 1024) {
            string = str.substring(0, 1024);
        }
        aayVarM7545k.m7479a(new aad(this, string));
    }

    /* JADX INFO: renamed from: a */
    protected final boolean m7409a(int i) {
        return Log.isLoggable(this.f6103a, i);
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7374b() {
        super.mo7374b();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7376c() {
        super.mo7376c();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C2079ys mo7377d() {
        return super.mo7377d();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ C2086yz mo7378e() {
        return super.mo7378e();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ acf mo7379f() {
        return super.mo7379f();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C2111zx mo7380g() {
        return super.mo7380g();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C2097zj mo7381h() {
        return super.mo7381h();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ acz mo7382i() {
        return super.mo7382i();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ acv mo7383j() {
        return super.mo7383j();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC1300d mo7384k() {
        return super.mo7384k();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Context mo7385l() {
        return super.mo7385l();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ C2112zy mo7386m() {
        return super.mo7386m();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C2091zd mo7387n() {
        return super.mo7387n();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ aaa mo7388o() {
        return super.mo7388o();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ aek mo7389p() {
        return super.mo7389p();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ aax mo7390q() {
        return super.mo7390q();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ adz mo7391r() {
        return super.mo7391r();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ aay mo7392s() {
        return super.mo7392s();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ aac mo7393t() {
        return super.mo7393t();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ aan mo7394u() {
        return super.mo7394u();
    }

    @Override // com.google.android.gms.internal.acc
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ C2090zc mo7395v() {
        return super.mo7395v();
    }

    @Override // com.google.android.gms.internal.acd
    /* JADX INFO: renamed from: w */
    protected final boolean mo7396w() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final aae m7410y() {
        return this.f6106d;
    }

    /* JADX INFO: renamed from: z */
    public final aae m7411z() {
        return this.f6107e;
    }
}
