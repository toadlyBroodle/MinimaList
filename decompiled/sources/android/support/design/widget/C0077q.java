package android.support.design.widget;

import android.support.v4.p019j.C0246q;
import android.view.View;

/* JADX INFO: renamed from: android.support.design.widget.q */
/* JADX INFO: loaded from: classes.dex */
class C0077q {

    /* JADX INFO: renamed from: a */
    private final View f475a;

    /* JADX INFO: renamed from: b */
    private int f476b;

    /* JADX INFO: renamed from: c */
    private int f477c;

    /* JADX INFO: renamed from: d */
    private int f478d;

    /* JADX INFO: renamed from: e */
    private int f479e;

    public C0077q(View view) {
        this.f475a = view;
    }

    /* JADX INFO: renamed from: c */
    private void m556c() {
        C0246q.m1753b(this.f475a, this.f478d - (this.f475a.getTop() - this.f476b));
        C0246q.m1757c(this.f475a, this.f479e - (this.f475a.getLeft() - this.f477c));
    }

    /* JADX INFO: renamed from: a */
    public void m557a() {
        this.f476b = this.f475a.getTop();
        this.f477c = this.f475a.getLeft();
        m556c();
    }

    /* JADX INFO: renamed from: a */
    public boolean m558a(int i) {
        if (this.f478d == i) {
            return false;
        }
        this.f478d = i;
        m556c();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int m559b() {
        return this.f478d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m560b(int i) {
        if (this.f479e == i) {
            return false;
        }
        this.f479e = i;
        m556c();
        return true;
    }
}
