package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.internal.C1221aj;
import com.google.android.gms.common.util.InterfaceC1300d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.analytics.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0900o {

    /* JADX INFO: renamed from: a */
    private final C0902q f4953a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1300d f4954b;

    /* JADX INFO: renamed from: c */
    private boolean f4955c;

    /* JADX INFO: renamed from: d */
    private long f4956d;

    /* JADX INFO: renamed from: e */
    private long f4957e;

    /* JADX INFO: renamed from: f */
    private long f4958f;

    /* JADX INFO: renamed from: g */
    private long f4959g;

    /* JADX INFO: renamed from: h */
    private long f4960h;

    /* JADX INFO: renamed from: i */
    private boolean f4961i;

    /* JADX INFO: renamed from: j */
    private final Map<Class<? extends AbstractC0901p>, AbstractC0901p> f4962j;

    /* JADX INFO: renamed from: k */
    private final List<InterfaceC0906u> f4963k;

    private C0900o(C0900o c0900o) {
        this.f4953a = c0900o.f4953a;
        this.f4954b = c0900o.f4954b;
        this.f4956d = c0900o.f4956d;
        this.f4957e = c0900o.f4957e;
        this.f4958f = c0900o.f4958f;
        this.f4959g = c0900o.f4959g;
        this.f4960h = c0900o.f4960h;
        this.f4963k = new ArrayList(c0900o.f4963k);
        this.f4962j = new HashMap(c0900o.f4962j.size());
        for (Map.Entry<Class<? extends AbstractC0901p>, AbstractC0901p> entry : c0900o.f4962j.entrySet()) {
            AbstractC0901p abstractC0901pM6050c = m6050c(entry.getKey());
            entry.getValue().mo6068a(abstractC0901pM6050c);
            this.f4962j.put(entry.getKey(), abstractC0901pM6050c);
        }
    }

    C0900o(C0902q c0902q, InterfaceC1300d interfaceC1300d) {
        C1221aj.m7065a(c0902q);
        C1221aj.m7065a(interfaceC1300d);
        this.f4953a = c0902q;
        this.f4954b = interfaceC1300d;
        this.f4959g = 1800000L;
        this.f4960h = 3024000000L;
        this.f4962j = new HashMap();
        this.f4963k = new ArrayList();
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    private static <T extends AbstractC0901p> T m6050c(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            }
            if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            if (Build.VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            }
            throw new IllegalArgumentException("Linkage exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0900o m6051a() {
        return new C0900o(this);
    }

    /* JADX INFO: renamed from: a */
    public final <T extends AbstractC0901p> T m6052a(Class<T> cls) {
        return (T) this.f4962j.get(cls);
    }

    /* JADX INFO: renamed from: a */
    public final void m6053a(long j) {
        this.f4957e = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m6054a(AbstractC0901p abstractC0901p) {
        C1221aj.m7065a(abstractC0901p);
        Class<?> cls = abstractC0901p.getClass();
        if (cls.getSuperclass() != AbstractC0901p.class) {
            throw new IllegalArgumentException();
        }
        abstractC0901p.mo6068a(m6055b(cls));
    }

    /* JADX INFO: renamed from: b */
    public final <T extends AbstractC0901p> T m6055b(Class<T> cls) {
        T t = (T) this.f4962j.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) m6050c(cls);
        this.f4962j.put((Class<? extends AbstractC0901p>) cls, t2);
        return t2;
    }

    /* JADX INFO: renamed from: b */
    public final Collection<AbstractC0901p> m6056b() {
        return this.f4962j.values();
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC0906u> m6057c() {
        return this.f4963k;
    }

    /* JADX INFO: renamed from: d */
    public final long m6058d() {
        return this.f4956d;
    }

    /* JADX INFO: renamed from: e */
    public final void m6059e() {
        this.f4953a.m6070i().m6079a(this);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6060f() {
        return this.f4955c;
    }

    /* JADX INFO: renamed from: g */
    final void m6061g() {
        this.f4958f = this.f4954b.mo7253b();
        if (this.f4957e != 0) {
            this.f4956d = this.f4957e;
        } else {
            this.f4956d = this.f4954b.mo7252a();
        }
        this.f4955c = true;
    }

    /* JADX INFO: renamed from: h */
    final C0902q m6062h() {
        return this.f4953a;
    }

    /* JADX INFO: renamed from: i */
    final boolean m6063i() {
        return this.f4961i;
    }

    /* JADX INFO: renamed from: j */
    final void m6064j() {
        this.f4961i = true;
    }
}
