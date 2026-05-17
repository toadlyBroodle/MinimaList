package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.p019j.C0246q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private TypedValue f2728a;

    /* JADX INFO: renamed from: b */
    private TypedValue f2729b;

    /* JADX INFO: renamed from: c */
    private TypedValue f2730c;

    /* JADX INFO: renamed from: d */
    private TypedValue f2731d;

    /* JADX INFO: renamed from: e */
    private TypedValue f2732e;

    /* JADX INFO: renamed from: f */
    private TypedValue f2733f;

    /* JADX INFO: renamed from: g */
    private final Rect f2734g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0433a f2735h;

    /* JADX INFO: renamed from: android.support.v7.widget.ContentFrameLayout$a */
    public interface InterfaceC0433a {
        /* JADX INFO: renamed from: a */
        void mo2704a();

        /* JADX INFO: renamed from: b */
        void mo2705b();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2734g = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public void m3416a(int i, int i2, int i3, int i4) {
        this.f2734g.set(i, i2, i3, i4);
        if (C0246q.m1777w(this)) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3417a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2732e == null) {
            this.f2732e = new TypedValue();
        }
        return this.f2732e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2733f == null) {
            this.f2733f = new TypedValue();
        }
        return this.f2733f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2730c == null) {
            this.f2730c = new TypedValue();
        }
        return this.f2730c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2731d == null) {
            this.f2731d = new TypedValue();
        }
        return this.f2731d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2728a == null) {
            this.f2728a = new TypedValue();
        }
        return this.f2728a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2729b == null) {
            this.f2729b = new TypedValue();
        }
        return this.f2729b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2735h != null) {
            this.f2735h.mo2704a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2735h != null) {
            this.f2735h.mo2705b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        boolean z;
        int iMakeMeasureSpec;
        boolean z2 = false;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f2731d : this.f2730c;
            if (typedValue != null && typedValue.type != 0) {
                int dimension = typedValue.type == 5 ? (int) typedValue.getDimension(displayMetrics) : typedValue.type == 6 ? (int) typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels) : 0;
                if (dimension > 0) {
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f2734g.left + this.f2734g.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f2732e : this.f2733f;
            if (typedValue2 != null && typedValue2.type != 0) {
                int dimension2 = typedValue2.type == 5 ? (int) typedValue2.getDimension(displayMetrics) : typedValue2.type == 6 ? (int) typedValue2.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels) : 0;
                if (dimension2 > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(dimension2 - (this.f2734g.top + this.f2734g.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = iMakeMeasureSpec2;
        } else {
            TypedValue typedValue3 = z3 ? this.f2729b : this.f2728a;
            if (typedValue3 != null && typedValue3.type != 0) {
                int dimension3 = typedValue3.type == 5 ? (int) typedValue3.getDimension(displayMetrics) : typedValue3.type == 6 ? (int) typedValue3.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels) : 0;
                if (dimension3 > 0) {
                    dimension3 -= this.f2734g.left + this.f2734g.right;
                }
                if (measuredWidth < dimension3) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimension3, 1073741824);
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(InterfaceC0433a interfaceC0433a) {
        this.f2735h = interfaceC0433a;
    }
}
