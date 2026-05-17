package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.p015f.C0198a;
import android.support.v4.p019j.C0233d;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.C0254y;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: android.support.design.widget.i */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0069i extends C0076p<View> {

    /* JADX INFO: renamed from: a */
    final Rect f432a;

    /* JADX INFO: renamed from: b */
    final Rect f433b;

    /* JADX INFO: renamed from: c */
    private int f434c;

    /* JADX INFO: renamed from: d */
    private int f435d;

    public AbstractC0069i() {
        this.f432a = new Rect();
        this.f433b = new Rect();
        this.f434c = 0;
    }

    public AbstractC0069i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f432a = new Rect();
        this.f433b = new Rect();
        this.f434c = 0;
    }

    /* JADX INFO: renamed from: c */
    private static int m514c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    float mo273a(View view) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: a */
    final int m515a() {
        return this.f434c;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractC0045a
    /* JADX INFO: renamed from: a */
    public boolean mo258a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewMo278b;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewMo278b = mo278b(coordinatorLayout.m354c(view))) == null) {
            return false;
        }
        if (C0246q.m1770p(viewMo278b) && !C0246q.m1770p(view)) {
            C0246q.m1754b(view, true);
            if (C0246q.m1770p(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m341a(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo277b(viewMo278b) + (size - viewMo278b.getMeasuredHeight()), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* JADX INFO: renamed from: b */
    int mo277b(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: b */
    abstract View mo278b(List<View> list);

    /* JADX INFO: renamed from: b */
    public final void m516b(int i) {
        this.f435d = i;
    }

    @Override // android.support.design.widget.C0076p
    /* JADX INFO: renamed from: b */
    protected void mo517b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewMo278b = mo278b(coordinatorLayout.m354c(view));
        if (viewMo278b == null) {
            super.mo517b(coordinatorLayout, view, i);
            this.f434c = 0;
            return;
        }
        CoordinatorLayout.C0048d c0048d = (CoordinatorLayout.C0048d) view.getLayoutParams();
        Rect rect = this.f432a;
        rect.set(coordinatorLayout.getPaddingLeft() + c0048d.leftMargin, viewMo278b.getBottom() + c0048d.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0048d.rightMargin, ((coordinatorLayout.getHeight() + viewMo278b.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0048d.bottomMargin);
        C0254y lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && C0246q.m1770p(coordinatorLayout) && !C0246q.m1770p(view)) {
            rect.left += lastWindowInsets.m1868a();
            rect.right -= lastWindowInsets.m1871c();
        }
        Rect rect2 = this.f433b;
        C0233d.m1693a(m514c(c0048d.f279c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iM518c = m518c(viewMo278b);
        view.layout(rect2.left, rect2.top - iM518c, rect2.right, rect2.bottom - iM518c);
        this.f434c = rect2.top - viewMo278b.getBottom();
    }

    /* JADX INFO: renamed from: c */
    final int m518c(View view) {
        if (this.f435d == 0) {
            return 0;
        }
        return C0198a.m1464a((int) (mo273a(view) * this.f435d), 0, this.f435d);
    }

    /* JADX INFO: renamed from: d */
    public final int m519d() {
        return this.f435d;
    }
}
