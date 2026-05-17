package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1074a;
import com.google.android.gms.common.api.C1074a.a;
import com.google.android.gms.common.api.internal.AbstractC1137by;
import com.google.android.gms.common.api.internal.AbstractC1155cp;
import com.google.android.gms.common.api.internal.BinderC1129bq;
import com.google.android.gms.common.api.internal.C1098am;
import com.google.android.gms.common.api.internal.C1100ao;
import com.google.android.gms.common.api.internal.C1108aw;
import com.google.android.gms.common.api.internal.C1149cj;
import com.google.android.gms.common.api.internal.C1150ck;
import com.google.android.gms.common.api.internal.InterfaceC1133bu;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.internal.C1249bk;
import com.google.android.gms.p051b.AbstractC0964e;
import com.google.android.gms.p051b.C0965f;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.common.api.e */
/* JADX INFO: loaded from: classes.dex */
public class C1078e<O extends C1074a.a> {

    /* JADX INFO: renamed from: a */
    protected final C1098am f5469a;

    /* JADX INFO: renamed from: b */
    private final Context f5470b;

    /* JADX INFO: renamed from: c */
    private final C1074a<O> f5471c;

    /* JADX INFO: renamed from: d */
    private final O f5472d;

    /* JADX INFO: renamed from: e */
    private final C1150ck<O> f5473e;

    /* JADX INFO: renamed from: f */
    private final Looper f5474f;

    /* JADX INFO: renamed from: g */
    private final int f5475g;

    /* JADX INFO: renamed from: h */
    private final AbstractC1079f f5476h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1133bu f5477i;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final a f5478a = new C1199q().m7028a();

        /* JADX INFO: renamed from: b */
        public final InterfaceC1133bu f5479b;

        /* JADX INFO: renamed from: c */
        public final Looper f5480c;

        private a(InterfaceC1133bu interfaceC1133bu, Account account, Looper looper) {
            this.f5479b = interfaceC1133bu;
            this.f5480c = looper;
        }
    }

    protected C1078e(Context context, C1074a<O> c1074a, Looper looper) {
        C1221aj.m7066a(context, "Null context is not permitted.");
        C1221aj.m7066a(c1074a, "Api must not be null.");
        C1221aj.m7066a(looper, "Looper must not be null.");
        this.f5470b = context.getApplicationContext();
        this.f5471c = c1074a;
        this.f5472d = null;
        this.f5474f = looper;
        this.f5473e = C1150ck.m6927a(c1074a);
        this.f5476h = new C1108aw(this);
        this.f5469a = C1098am.m6782a(this.f5470b);
        this.f5475g = this.f5469a.m6806c();
        this.f5477i = new C1149cj();
    }

    public C1078e(Context context, C1074a<O> c1074a, O o, a aVar) {
        C1221aj.m7066a(context, "Null context is not permitted.");
        C1221aj.m7066a(c1074a, "Api must not be null.");
        C1221aj.m7066a(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f5470b = context.getApplicationContext();
        this.f5471c = c1074a;
        this.f5472d = o;
        this.f5474f = aVar.f5480c;
        this.f5473e = C1150ck.m6928a(this.f5471c, this.f5472d);
        this.f5476h = new C1108aw(this);
        this.f5469a = C1098am.m6782a(this.f5470b);
        this.f5475g = this.f5469a.m6806c();
        this.f5477i = aVar.f5479b;
        this.f5469a.m6799a((C1078e<?>) this);
    }

    @Deprecated
    public C1078e(Context context, C1074a<O> c1074a, O o, InterfaceC1133bu interfaceC1133bu) {
        this(context, c1074a, o, new C1199q().m7029a(interfaceC1133bu).m7028a());
    }

    /* JADX INFO: renamed from: a */
    private final <TResult, A extends C1074a.c> AbstractC0964e<TResult> m6650a(int i, AbstractC1137by<A, TResult> abstractC1137by) {
        C0965f<TResult> c0965f = new C0965f<>();
        this.f5469a.m6800a(this, i, abstractC1137by, c0965f, this.f5477i);
        return c0965f.m6217a();
    }

    /* JADX INFO: renamed from: a */
    private final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T m6651a(int i, T t) {
        t.m6712f();
        this.f5469a.m6801a(this, i, t);
        return t;
    }

    /* JADX INFO: renamed from: f */
    private final C1249bk m6652f() {
        GoogleSignInAccount googleSignInAccountM6634a;
        GoogleSignInAccount googleSignInAccountM6634a2;
        return new C1249bk().m7159a((!(this.f5472d instanceof C1074a.a.b) || (googleSignInAccountM6634a2 = ((C1074a.a.b) this.f5472d).m6634a()) == null) ? this.f5472d instanceof C1074a.a.InterfaceC2332a ? ((C1074a.a.InterfaceC2332a) this.f5472d).m6633a() : null : googleSignInAccountM6634a2.m6118d()).m7161a((!(this.f5472d instanceof C1074a.a.b) || (googleSignInAccountM6634a = ((C1074a.a.b) this.f5472d).m6634a()) == null) ? Collections.emptySet() : googleSignInAccountM6634a.m6125k());
    }

    /* JADX INFO: renamed from: a */
    public final <TResult, A extends C1074a.c> AbstractC0964e<TResult> m6653a(AbstractC1137by<A, TResult> abstractC1137by) {
        return m6650a(0, abstractC1137by);
    }

    /* JADX INFO: renamed from: a */
    public C1074a.f mo6654a(Looper looper, C1100ao<O> c1100ao) {
        return this.f5471c.m6630b().mo6098a(this.f5470b, looper, m6652f().m7160a(this.f5470b.getPackageName()).m7162b(this.f5470b.getClass().getName()).m7158a(), this.f5472d, c1100ao, c1100ao);
    }

    /* JADX INFO: renamed from: a */
    public final C1074a<O> m6655a() {
        return this.f5471c;
    }

    /* JADX INFO: renamed from: a */
    public BinderC1129bq mo6656a(Context context, Handler handler) {
        return new BinderC1129bq(context, handler, m6652f().m7158a());
    }

    /* JADX INFO: renamed from: a */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T m6657a(T t) {
        return (T) m6651a(0, t);
    }

    /* JADX INFO: renamed from: b */
    public final <TResult, A extends C1074a.c> AbstractC0964e<TResult> m6658b(AbstractC1137by<A, TResult> abstractC1137by) {
        return m6650a(1, abstractC1137by);
    }

    /* JADX INFO: renamed from: b */
    public final C1150ck<O> m6659b() {
        return this.f5473e;
    }

    /* JADX INFO: renamed from: b */
    public final <A extends C1074a.c, T extends AbstractC1155cp<? extends InterfaceC1193k, A>> T m6660b(T t) {
        return (T) m6651a(1, t);
    }

    /* JADX INFO: renamed from: c */
    public final int m6661c() {
        return this.f5475g;
    }

    /* JADX INFO: renamed from: d */
    public final Looper m6662d() {
        return this.f5474f;
    }

    /* JADX INFO: renamed from: e */
    public final Context m6663e() {
        return this.f5470b;
    }
}
