package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: android.support.design.widget.p */
/* JADX INFO: loaded from: classes.dex */
class C0076p<V extends View> extends CoordinatorLayout.AbstractC0045a<V> {

    /* JADX INFO: renamed from: a */
    private C0077q f472a;

    /* JADX INFO: renamed from: b */
    private int f473b;

    /* JADX INFO: renamed from: c */
    private int f474c;

    public C0076p() {
        this.f473b = 0;
        this.f474c = 0;
    }

    public C0076p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f473b = 0;
        this.f474c = 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo252a(int i) {
        if (this.f472a != null) {
            return this.f472a.m558a(i);
        }
        this.f473b = i;
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo257a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo517b(coordinatorLayout, v, i);
        if (this.f472a == null) {
            this.f472a = new C0077q(v);
        }
        this.f472a.m557a();
        if (this.f473b != 0) {
            this.f472a.m558a(this.f473b);
            this.f473b = 0;
        }
        if (this.f474c == 0) {
            return true;
        }
        this.f472a.m560b(this.f474c);
        this.f474c = 0;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public int mo260b() {
        if (this.f472a != null) {
            return this.f472a.m559b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    protected void mo517b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m340a(v, i);
    }
}
