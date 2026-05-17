package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.C1498de;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class cej<T> implements Comparable<cej<T>> {

    /* JADX INFO: renamed from: a */
    private final C1498de.a f9875a;

    /* JADX INFO: renamed from: b */
    private final int f9876b;

    /* JADX INFO: renamed from: c */
    private final String f9877c;

    /* JADX INFO: renamed from: d */
    private final int f9878d;

    /* JADX INFO: renamed from: e */
    private final ckd f9879e;

    /* JADX INFO: renamed from: f */
    private Integer f9880f;

    /* JADX INFO: renamed from: g */
    private cil f9881g;

    /* JADX INFO: renamed from: h */
    private boolean f9882h;

    /* JADX INFO: renamed from: i */
    private boolean f9883i;

    /* JADX INFO: renamed from: j */
    private boolean f9884j;

    /* JADX INFO: renamed from: k */
    private boolean f9885k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1422b f9886l;

    /* JADX INFO: renamed from: m */
    private C2048xo f9887m;

    /* JADX INFO: renamed from: n */
    private cgj f9888n;

    /* JADX INFO: renamed from: o */
    private final Object f9889o;

    public cej(int i, String str, ckd ckdVar) {
        Uri uri;
        String host;
        this.f9875a = C1498de.a.f10440a ? new C1498de.a() : null;
        this.f9882h = true;
        this.f9883i = false;
        this.f9884j = false;
        this.f9885k = false;
        this.f9887m = null;
        this.f9889o = new Object();
        this.f9876b = i;
        this.f9877c = str;
        this.f9879e = ckdVar;
        this.f9886l = new bul();
        this.f9878d = (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) ? 0 : host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final cej<?> m10755a(int i) {
        this.f9880f = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final cej<?> m10756a(cil cilVar) {
        this.f9881g = cilVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final cej<?> m10757a(C2048xo c2048xo) {
        this.f9887m = c2048xo;
        return this;
    }

    /* JADX INFO: renamed from: a */
    protected abstract cjk<T> mo10758a(cch cchVar);

    /* JADX INFO: renamed from: a */
    public final void m10759a(C1471ce c1471ce) {
        if (this.f9879e != null) {
            this.f9879e.mo11057a(c1471ce);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10760a(cgj cgjVar) {
        synchronized (this.f9889o) {
            this.f9888n = cgjVar;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m10761a(cjk<?> cjkVar) {
        synchronized (this.f9889o) {
            if (this.f9888n != null) {
                this.f9888n.mo9745a(this, cjkVar);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo10762a(T t);

    /* JADX INFO: renamed from: a */
    public byte[] mo10763a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> mo10764b() {
        return Collections.emptyMap();
    }

    /* JADX INFO: renamed from: b */
    public final void m10765b(String str) {
        if (C1498de.a.f10440a) {
            this.f9875a.m11174a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m10766c() {
        return this.f9876b;
    }

    /* JADX INFO: renamed from: c */
    final void m10767c(String str) {
        if (this.f9881g != null) {
            this.f9881g.m10940b(this);
        }
        if (C1498de.a.f10440a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new cfi(this, str, id));
            } else {
                this.f9875a.m11174a(str, id);
                this.f9875a.m11173a(toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        cej cejVar = (cej) obj;
        chk chkVar = chk.NORMAL;
        chk chkVar2 = chk.NORMAL;
        return chkVar == chkVar2 ? this.f9880f.intValue() - cejVar.f9880f.intValue() : chkVar2.ordinal() - chkVar.ordinal();
    }

    /* JADX INFO: renamed from: d */
    public final int m10768d() {
        return this.f9878d;
    }

    /* JADX INFO: renamed from: e */
    public final String m10769e() {
        return this.f9877c;
    }

    /* JADX INFO: renamed from: f */
    public final C2048xo m10770f() {
        return this.f9887m;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10771g() {
        return this.f9882h;
    }

    /* JADX INFO: renamed from: h */
    public final int m10772h() {
        return this.f9886l.mo8752a();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC1422b m10773i() {
        return this.f9886l;
    }

    /* JADX INFO: renamed from: j */
    public final void m10774j() {
        this.f9884j = true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10775k() {
        return this.f9884j;
    }

    /* JADX INFO: renamed from: l */
    final void m10776l() {
        synchronized (this.f9889o) {
            if (this.f9888n != null) {
                this.f9888n.mo9744a(this);
            }
        }
    }

    public String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f9878d));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        String str = this.f9877c;
        String strValueOf2 = String.valueOf(chk.NORMAL);
        String strValueOf3 = String.valueOf(this.f9880f);
        return new StringBuilder(String.valueOf("[ ] ").length() + 3 + String.valueOf(str).length() + String.valueOf(strConcat).length() + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length()).append("[ ] ").append(str).append(" ").append(strConcat).append(" ").append(strValueOf2).append(" ").append(strValueOf3).toString();
    }
}
