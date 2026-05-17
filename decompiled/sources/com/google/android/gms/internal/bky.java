package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
final class bky {

    /* JADX INFO: renamed from: d */
    private int f8351d;

    /* JADX INFO: renamed from: h */
    private final bla f8355h;

    /* JADX INFO: renamed from: a */
    private StringBuilder f8348a = null;

    /* JADX INFO: renamed from: b */
    private Stack<bkp> f8349b = new Stack<>();

    /* JADX INFO: renamed from: c */
    private int f8350c = -1;

    /* JADX INFO: renamed from: e */
    private boolean f8352e = true;

    /* JADX INFO: renamed from: f */
    private final List<bfa> f8353f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List<String> f8354g = new ArrayList();

    public bky(bla blaVar) {
        this.f8355h = blaVar;
    }

    /* JADX INFO: renamed from: a */
    private final bfa m9582a(int i) {
        bkp[] bkpVarArr = new bkp[i];
        for (int i2 = 0; i2 < i; i2++) {
            bkpVarArr[i2] = this.f8349b.get(i2);
        }
        return new bfa(bkpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9583a(bkp bkpVar) {
        m9592d();
        if (this.f8352e) {
            this.f8348a.append(",");
        }
        m9588a(this.f8348a, bkpVar);
        this.f8348a.append(":(");
        if (this.f8351d == this.f8349b.size()) {
            this.f8349b.add(bkpVar);
        } else {
            this.f8349b.set(this.f8351d, bkpVar);
        }
        this.f8351d++;
        this.f8352e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m9587a(blh<?> blhVar) {
        m9592d();
        this.f8350c = this.f8351d;
        this.f8348a.append(blhVar.mo9546a(blp.V2));
        this.f8352e = true;
        if (this.f8355h.mo9599a(this)) {
            m9596g();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m9588a(StringBuilder sb, bkp bkpVar) {
        sb.append(bne.m9699c(bkpVar.m9554d()));
    }

    /* JADX INFO: renamed from: c */
    private final boolean m9591c() {
        return this.f8348a != null;
    }

    /* JADX INFO: renamed from: d */
    private final void m9592d() {
        if (m9591c()) {
            return;
        }
        this.f8348a = new StringBuilder();
        this.f8348a.append("(");
        Iterator<bkp> it = m9582a(this.f8351d).iterator();
        while (it.hasNext()) {
            m9588a(this.f8348a, it.next());
            this.f8348a.append(":(");
        }
        this.f8352e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m9594e() {
        this.f8351d--;
        if (m9591c()) {
            this.f8348a.append(")");
        }
        this.f8352e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m9595f() {
        bne.m9697a(this.f8351d == 0, "Can't finish hashing in the middle processing a child");
        if (m9591c()) {
            m9596g();
        }
        this.f8354g.add("");
    }

    /* JADX INFO: renamed from: g */
    private final void m9596g() {
        bne.m9697a(m9591c(), "Can't end range without starting a range!");
        for (int i = 0; i < this.f8351d; i++) {
            this.f8348a.append(")");
        }
        this.f8348a.append(")");
        bfa bfaVarM9582a = m9582a(this.f8350c);
        this.f8354g.add(bne.m9698b(this.f8348a.toString()));
        this.f8353f.add(bfaVarM9582a);
        this.f8348a = null;
    }

    /* JADX INFO: renamed from: a */
    public final int m9597a() {
        return this.f8348a.length();
    }

    /* JADX INFO: renamed from: b */
    public final bfa m9598b() {
        return m9582a(this.f8351d);
    }
}
