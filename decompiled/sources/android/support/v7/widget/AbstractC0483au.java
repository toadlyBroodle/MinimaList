package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v7.widget.C0484av;
import android.view.View;

/* JADX INFO: renamed from: android.support.v7.widget.au */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483au {

    /* JADX INFO: renamed from: a */
    protected final C0484av.h f3195a;

    /* JADX INFO: renamed from: b */
    final Rect f3196b;

    /* JADX INFO: renamed from: c */
    private int f3197c;

    private AbstractC0483au(C0484av.h hVar) {
        this.f3197c = Integer.MIN_VALUE;
        this.f3196b = new Rect();
        this.f3195a = hVar;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0483au m3998a(C0484av.h hVar) {
        return new AbstractC0483au(hVar) { // from class: android.support.v7.widget.au.1
            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: a */
            public int mo4001a(View view) {
                return this.f3195a.m4270h(view) - ((C0484av.i) view.getLayoutParams()).leftMargin;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: a */
            public void mo4003a(int i) {
                this.f3195a.mo3636i(i);
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: b */
            public int mo4005b(View view) {
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                return iVar.rightMargin + this.f3195a.m4273j(view);
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: c */
            public int mo4006c() {
                return this.f3195a.m4291z();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: c */
            public int mo4007c(View view) {
                this.f3195a.m4228a(view, true, this.f3196b);
                return this.f3196b.right;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: d */
            public int mo4008d() {
                return this.f3195a.m4289x() - this.f3195a.m4205B();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: d */
            public int mo4009d(View view) {
                this.f3195a.m4228a(view, true, this.f3196b);
                return this.f3196b.left;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: e */
            public int mo4010e() {
                return this.f3195a.m4289x();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: e */
            public int mo4011e(View view) {
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                return iVar.rightMargin + this.f3195a.m4264f(view) + iVar.leftMargin;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: f */
            public int mo4012f() {
                return (this.f3195a.m4289x() - this.f3195a.m4291z()) - this.f3195a.m4205B();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: f */
            public int mo4013f(View view) {
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                return iVar.bottomMargin + this.f3195a.m4268g(view) + iVar.topMargin;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: g */
            public int mo4014g() {
                return this.f3195a.m4205B();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: h */
            public int mo4015h() {
                return this.f3195a.m4287v();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: i */
            public int mo4016i() {
                return this.f3195a.m4288w();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0483au m3999a(C0484av.h hVar, int i) {
        switch (i) {
            case 0:
                return m3998a(hVar);
            case 1:
                return m4000b(hVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0483au m4000b(C0484av.h hVar) {
        return new AbstractC0483au(hVar) { // from class: android.support.v7.widget.au.2
            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: a */
            public int mo4001a(View view) {
                return this.f3195a.m4272i(view) - ((C0484av.i) view.getLayoutParams()).topMargin;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: a */
            public void mo4003a(int i) {
                this.f3195a.mo3639j(i);
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: b */
            public int mo4005b(View view) {
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                return iVar.bottomMargin + this.f3195a.m4274k(view);
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: c */
            public int mo4006c() {
                return this.f3195a.m4204A();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: c */
            public int mo4007c(View view) {
                this.f3195a.m4228a(view, true, this.f3196b);
                return this.f3196b.bottom;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: d */
            public int mo4008d() {
                return this.f3195a.m4290y() - this.f3195a.m4206C();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: d */
            public int mo4009d(View view) {
                this.f3195a.m4228a(view, true, this.f3196b);
                return this.f3196b.top;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: e */
            public int mo4010e() {
                return this.f3195a.m4290y();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: e */
            public int mo4011e(View view) {
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                return iVar.bottomMargin + this.f3195a.m4268g(view) + iVar.topMargin;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: f */
            public int mo4012f() {
                return (this.f3195a.m4290y() - this.f3195a.m4204A()) - this.f3195a.m4206C();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: f */
            public int mo4013f(View view) {
                C0484av.i iVar = (C0484av.i) view.getLayoutParams();
                return iVar.rightMargin + this.f3195a.m4264f(view) + iVar.leftMargin;
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: g */
            public int mo4014g() {
                return this.f3195a.m4206C();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: h */
            public int mo4015h() {
                return this.f3195a.m4288w();
            }

            @Override // android.support.v7.widget.AbstractC0483au
            /* JADX INFO: renamed from: i */
            public int mo4016i() {
                return this.f3195a.m4287v();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo4001a(View view);

    /* JADX INFO: renamed from: a */
    public void m4002a() {
        this.f3197c = mo4012f();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4003a(int i);

    /* JADX INFO: renamed from: b */
    public int m4004b() {
        if (Integer.MIN_VALUE == this.f3197c) {
            return 0;
        }
        return mo4012f() - this.f3197c;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo4005b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo4006c();

    /* JADX INFO: renamed from: c */
    public abstract int mo4007c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo4008d();

    /* JADX INFO: renamed from: d */
    public abstract int mo4009d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo4010e();

    /* JADX INFO: renamed from: e */
    public abstract int mo4011e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo4012f();

    /* JADX INFO: renamed from: f */
    public abstract int mo4013f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo4014g();

    /* JADX INFO: renamed from: h */
    public abstract int mo4015h();

    /* JADX INFO: renamed from: i */
    public abstract int mo4016i();
}
