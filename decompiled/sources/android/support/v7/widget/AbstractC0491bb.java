package android.support.v7.widget;

import android.support.v7.widget.C0484av;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.bb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491bb extends C0484av.e {

    /* JADX INFO: renamed from: h */
    boolean f3432h = true;

    /* JADX INFO: renamed from: a */
    public final void m4464a(C0484av.w wVar, boolean z) {
        m4467d(wVar, z);
        m4177f(wVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3852a(C0484av.w wVar);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3853a(C0484av.w wVar, int i, int i2, int i3, int i4);

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: a */
    public boolean mo4171a(C0484av.w wVar, C0484av.e.c cVar, C0484av.e.c cVar2) {
        int i = cVar.f3292a;
        int i2 = cVar.f3293b;
        View view = wVar.f3381a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3292a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3293b;
        if (wVar.m4435q() || (i == left && i2 == top)) {
            return mo3852a(wVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3853a(wVar, i, i2, left, top);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3854a(C0484av.w wVar, C0484av.w wVar2, int i, int i2, int i3, int i4);

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: a */
    public boolean mo4172a(C0484av.w wVar, C0484av.w wVar2, C0484av.e.c cVar, C0484av.e.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3292a;
        int i4 = cVar.f3293b;
        if (wVar2.m4421c()) {
            i = cVar.f3292a;
            i2 = cVar.f3293b;
        } else {
            i = cVar2.f3292a;
            i2 = cVar2.f3293b;
        }
        return mo3854a(wVar, wVar2, i3, i4, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m4465b(C0484av.w wVar, boolean z) {
        m4466c(wVar, z);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3858b(C0484av.w wVar);

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: b */
    public boolean mo4173b(C0484av.w wVar, C0484av.e.c cVar, C0484av.e.c cVar2) {
        return (cVar == null || (cVar.f3292a == cVar2.f3292a && cVar.f3293b == cVar2.f3293b)) ? mo3858b(wVar) : mo3853a(wVar, cVar.f3292a, cVar.f3293b, cVar2.f3292a, cVar2.f3293b);
    }

    /* JADX INFO: renamed from: c */
    public void m4466c(C0484av.w wVar, boolean z) {
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: c */
    public boolean mo4174c(C0484av.w wVar, C0484av.e.c cVar, C0484av.e.c cVar2) {
        if (cVar.f3292a != cVar2.f3292a || cVar.f3293b != cVar2.f3293b) {
            return mo3853a(wVar, cVar.f3292a, cVar.f3293b, cVar2.f3292a, cVar2.f3293b);
        }
        m4469j(wVar);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m4467d(C0484av.w wVar, boolean z) {
    }

    @Override // android.support.v7.widget.C0484av.e
    /* JADX INFO: renamed from: h */
    public boolean mo4181h(C0484av.w wVar) {
        return !this.f3432h || wVar.m4432n();
    }

    /* JADX INFO: renamed from: i */
    public final void m4468i(C0484av.w wVar) {
        m4475p(wVar);
        m4177f(wVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m4469j(C0484av.w wVar) {
        m4479t(wVar);
        m4177f(wVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m4470k(C0484av.w wVar) {
        m4477r(wVar);
        m4177f(wVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m4471l(C0484av.w wVar) {
        m4474o(wVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m4472m(C0484av.w wVar) {
        m4478s(wVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m4473n(C0484av.w wVar) {
        m4476q(wVar);
    }

    /* JADX INFO: renamed from: o */
    public void m4474o(C0484av.w wVar) {
    }

    /* JADX INFO: renamed from: p */
    public void m4475p(C0484av.w wVar) {
    }

    /* JADX INFO: renamed from: q */
    public void m4476q(C0484av.w wVar) {
    }

    /* JADX INFO: renamed from: r */
    public void m4477r(C0484av.w wVar) {
    }

    /* JADX INFO: renamed from: s */
    public void m4478s(C0484av.w wVar) {
    }

    /* JADX INFO: renamed from: t */
    public void m4479t(C0484av.w wVar) {
    }
}
