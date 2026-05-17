package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0405h;
import android.support.v7.view.menu.C0407j;
import android.support.v7.view.menu.InterfaceC0412o;
import android.support.v7.view.menu.InterfaceC0413p;
import android.support.v7.widget.C0477ao;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C0477ao implements C0405h.b, InterfaceC0413p {

    /* JADX INFO: renamed from: a */
    C0405h.a f2682a;

    /* JADX INFO: renamed from: b */
    InterfaceC0430e f2683b;

    /* JADX INFO: renamed from: c */
    private C0405h f2684c;

    /* JADX INFO: renamed from: d */
    private Context f2685d;

    /* JADX INFO: renamed from: e */
    private int f2686e;

    /* JADX INFO: renamed from: f */
    private boolean f2687f;

    /* JADX INFO: renamed from: g */
    private C0508d f2688g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0412o.a f2689h;

    /* JADX INFO: renamed from: i */
    private boolean f2690i;

    /* JADX INFO: renamed from: j */
    private int f2691j;

    /* JADX INFO: renamed from: k */
    private int f2692k;

    /* JADX INFO: renamed from: l */
    private int f2693l;

    /* JADX INFO: renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface InterfaceC0426a {
        /* JADX INFO: renamed from: c */
        boolean mo3166c();

        /* JADX INFO: renamed from: d */
        boolean mo3167d();
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActionMenuView$b */
    private static class C0427b implements InterfaceC0412o.a {
        C0427b() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public void mo2706a(C0405h c0405h, boolean z) {
        }

        @Override // android.support.v7.view.menu.InterfaceC0412o.a
        /* JADX INFO: renamed from: a */
        public boolean mo2707a(C0405h c0405h) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0428c extends C0477ao.a {

        /* JADX INFO: renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f2694a;

        /* JADX INFO: renamed from: b */
        @ViewDebug.ExportedProperty
        public int f2695b;

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public int f2696c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f2697d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f2698e;

        /* JADX INFO: renamed from: f */
        boolean f2699f;

        public C0428c(int i, int i2) {
            super(i, i2);
            this.f2694a = false;
        }

        public C0428c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0428c(C0428c c0428c) {
            super(c0428c);
            this.f2694a = c0428c.f2694a;
        }

        public C0428c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C0429d implements C0405h.a {
        C0429d() {
        }

        @Override // android.support.v7.view.menu.C0405h.a
        /* JADX INFO: renamed from: a */
        public void mo424a(C0405h c0405h) {
            if (ActionMenuView.this.f2682a != null) {
                ActionMenuView.this.f2682a.mo424a(c0405h);
            }
        }

        @Override // android.support.v7.view.menu.C0405h.a
        /* JADX INFO: renamed from: a */
        public boolean mo425a(C0405h c0405h, MenuItem menuItem) {
            return ActionMenuView.this.f2683b != null && ActionMenuView.this.f2683b.mo3395a(menuItem);
        }
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface InterfaceC0430e {
        /* JADX INFO: renamed from: a */
        boolean mo3395a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2692k = (int) (56.0f * f);
        this.f2693l = (int) (f * 4.0f);
        this.f2685d = context;
        this.f2686e = 0;
    }

    /* JADX INFO: renamed from: a */
    static int m3377a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        C0428c c0428c = (C0428c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m3165a();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && i5 < 2) {
                i5 = 2;
            }
        }
        if (!c0428c.f2694a && z2) {
            z = true;
        }
        c0428c.f2697d = z;
        c0428c.f2695b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0304 A[PHI: r7
      0x0304: PHI (r7v9 float) = (r7v8 float), (r7v17 float), (r7v17 float) binds: [B:72:0x0189, B:79:0x01b2, B:81:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3378c(int i, int i2) {
        long j;
        boolean z;
        float f;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = i11 / this.f2692k;
        int i13 = i11 % this.f2692k;
        if (i12 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i14 = this.f2692k + (i13 / i12);
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z3 = false;
        long j3 = 0;
        int childCount = getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                i7 = i18;
                j2 = j3;
                i9 = i15;
                i10 = i12;
                i8 = i16;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i20 = i18 + 1;
                if (z4) {
                    childAt.setPadding(this.f2693l, 0, this.f2693l, 0);
                }
                C0428c c0428c = (C0428c) childAt.getLayoutParams();
                c0428c.f2699f = false;
                c0428c.f2696c = 0;
                c0428c.f2695b = 0;
                c0428c.f2697d = false;
                c0428c.leftMargin = 0;
                c0428c.rightMargin = 0;
                c0428c.f2698e = z4 && ((ActionMenuItemView) childAt).m3165a();
                int iM3377a = m3377a(childAt, i14, c0428c.f2694a ? 1 : i12, childMeasureSpec, paddingTop);
                int iMax = Math.max(i16, iM3377a);
                int i21 = c0428c.f2697d ? i17 + 1 : i17;
                boolean z5 = c0428c.f2694a ? true : z3;
                int i22 = i12 - iM3377a;
                int iMax2 = Math.max(i15, childAt.getMeasuredHeight());
                if (iM3377a == 1) {
                    long j4 = ((long) (1 << i19)) | j3;
                    i9 = iMax2;
                    i10 = i22;
                    i17 = i21;
                    z3 = z5;
                    j2 = j4;
                    i8 = iMax;
                    i7 = i20;
                } else {
                    i7 = i20;
                    i8 = iMax;
                    long j5 = j3;
                    i9 = iMax2;
                    i10 = i22;
                    z3 = z5;
                    i17 = i21;
                    j2 = j5;
                }
            }
            i19++;
            i16 = i8;
            i15 = i9;
            i12 = i10;
            j3 = j2;
            i18 = i7;
        }
        boolean z6 = z3 && i18 == 2;
        boolean z7 = false;
        long j6 = j3;
        int i23 = i12;
        while (i17 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j7 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount) {
                C0428c c0428c2 = (C0428c) getChildAt(i26).getLayoutParams();
                if (!c0428c2.f2697d) {
                    i5 = i25;
                    i6 = i24;
                } else if (c0428c2.f2695b < i24) {
                    i6 = c0428c2.f2695b;
                    j7 = 1 << i26;
                    i5 = 1;
                } else if (c0428c2.f2695b == i24) {
                    j7 |= (long) (1 << i26);
                    i5 = i25 + 1;
                    i6 = i24;
                } else {
                    i5 = i25;
                    i6 = i24;
                }
                i26++;
                i24 = i6;
                i25 = i5;
            }
            long j8 = j6 | j7;
            if (i25 > i23) {
                j = j8;
                break;
            }
            int i27 = i24 + 1;
            int i28 = 0;
            int i29 = i23;
            long j9 = j8;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                C0428c c0428c3 = (C0428c) childAt2.getLayoutParams();
                if ((((long) (1 << i28)) & j7) != 0) {
                    if (z6 && c0428c3.f2698e && i29 == 1) {
                        childAt2.setPadding(this.f2693l + i14, 0, this.f2693l, 0);
                    }
                    c0428c3.f2695b++;
                    c0428c3.f2699f = true;
                    i4 = i29 - 1;
                } else if (c0428c3.f2695b == i27) {
                    j9 |= (long) (1 << i28);
                    i4 = i29;
                } else {
                    i4 = i29;
                }
                i28++;
                i29 = i4;
            }
            j6 = j9;
            z7 = true;
            i23 = i29;
        }
        j = j6;
        boolean z8 = !z3 && i18 == 1;
        if (i23 <= 0 || j == 0 || (i23 >= i18 - 1 && !z8 && i16 <= 1)) {
            z = z7;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z8) {
                f = fBitCount;
                int i30 = f <= 0.0f ? (int) ((i23 * i14) / f) : 0;
                i3 = 0;
                z = z7;
                while (i3 < childCount) {
                    if ((((long) (1 << i3)) & j) == 0) {
                        z2 = z;
                    } else {
                        View childAt3 = getChildAt(i3);
                        C0428c c0428c4 = (C0428c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0428c4.f2696c = i30;
                            c0428c4.f2699f = true;
                            if (i3 == 0 && !c0428c4.f2698e) {
                                c0428c4.leftMargin = (-i30) / 2;
                            }
                            z2 = true;
                        } else if (c0428c4.f2694a) {
                            c0428c4.f2696c = i30;
                            c0428c4.f2699f = true;
                            c0428c4.rightMargin = (-i30) / 2;
                            z2 = true;
                        } else {
                            if (i3 != 0) {
                                c0428c4.leftMargin = i30 / 2;
                            }
                            if (i3 != childCount - 1) {
                                c0428c4.rightMargin = i30 / 2;
                            }
                            z2 = z;
                        }
                    }
                    i3++;
                    z = z2;
                }
            } else {
                if ((1 & j) != 0 && !((C0428c) getChildAt(0).getLayoutParams()).f2698e) {
                    fBitCount -= 0.5f;
                }
                if ((((long) (1 << (childCount - 1))) & j) != 0 && !((C0428c) getChildAt(childCount - 1).getLayoutParams()).f2698e) {
                    f = fBitCount - 0.5f;
                }
                if (f <= 0.0f) {
                }
                i3 = 0;
                z = z7;
                while (i3 < childCount) {
                }
            }
        }
        if (z) {
            int i31 = 0;
            while (true) {
                int i32 = i31;
                if (i32 >= childCount) {
                    break;
                }
                View childAt4 = getChildAt(i32);
                C0428c c0428c5 = (C0428c) childAt4.getLayoutParams();
                if (c0428c5.f2699f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(c0428c5.f2696c + (c0428c5.f2695b * i14), 1073741824), childMeasureSpec);
                }
                i31 = i32 + 1;
            }
        }
        if (mode == 1073741824) {
            i15 = size2;
        }
        setMeasuredDimension(i11, i15);
    }

    @Override // android.support.v7.widget.C0477ao, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0428c generateLayoutParams(AttributeSet attributeSet) {
        return new C0428c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.C0477ao, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0428c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0428c c0428c = layoutParams instanceof C0428c ? new C0428c((C0428c) layoutParams) : new C0428c(layoutParams);
        if (c0428c.f3134h > 0) {
            return c0428c;
        }
        c0428c.f3134h = 16;
        return c0428c;
    }

    @Override // android.support.v7.view.menu.InterfaceC0413p
    /* JADX INFO: renamed from: a */
    public void mo158a(C0405h c0405h) {
        this.f2684c = c0405h;
    }

    /* JADX INFO: renamed from: a */
    public void m3381a(InterfaceC0412o.a aVar, C0405h.a aVar2) {
        this.f2689h = aVar;
        this.f2682a = aVar2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3382a() {
        return this.f2687f;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m3383a(int i) {
        boolean zMo3167d = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0426a)) {
            zMo3167d = false | ((InterfaceC0426a) childAt).mo3167d();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0426a)) ? zMo3167d : ((InterfaceC0426a) childAt2).mo3166c() | zMo3167d;
    }

    @Override // android.support.v7.view.menu.C0405h.b
    /* JADX INFO: renamed from: a */
    public boolean mo3171a(C0407j c0407j) {
        return this.f2684c.m3256a(c0407j, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.C0477ao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0428c generateDefaultLayoutParams() {
        C0428c c0428c = new C0428c(-2, -2);
        c0428c.f3134h = 16;
        return c0428c;
    }

    /* JADX INFO: renamed from: c */
    public C0428c m3387c() {
        C0428c c0428cGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c0428cGenerateDefaultLayoutParams.f2694a = true;
        return c0428cGenerateDefaultLayoutParams;
    }

    @Override // android.support.v7.widget.C0477ao, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0428c);
    }

    /* JADX INFO: renamed from: d */
    public C0405h m3388d() {
        return this.f2684c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3389e() {
        return this.f2688g != null && this.f2688g.m4597f();
    }

    /* JADX INFO: renamed from: f */
    public boolean m3390f() {
        return this.f2688g != null && this.f2688g.m4598g();
    }

    /* JADX INFO: renamed from: g */
    public boolean m3391g() {
        return this.f2688g != null && this.f2688g.m4601j();
    }

    public Menu getMenu() {
        if (this.f2684c == null) {
            Context context = getContext();
            this.f2684c = new C0405h(context);
            this.f2684c.mo3249a(new C0429d());
            this.f2688g = new C0508d(context);
            this.f2688g.m4594c(true);
            this.f2688g.mo172a(this.f2689h != null ? this.f2689h : new C0427b());
            this.f2684c.m3252a(this.f2688g, this.f2685d);
            this.f2688g.m4593a(this);
        }
        return this.f2684c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2688g.m4596e();
    }

    public int getPopupTheme() {
        return this.f2686e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m3392h() {
        return this.f2688g != null && this.f2688g.m4602k();
    }

    /* JADX INFO: renamed from: i */
    public void m3393i() {
        if (this.f2688g != null) {
            this.f2688g.m4599h();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2688g != null) {
            this.f2688g.mo174a(false);
            if (this.f2688g.m4601j()) {
                this.f2688g.m4598g();
                this.f2688g.m4597f();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3393i();
    }

    @Override // android.support.v7.widget.C0477ao, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int width;
        int paddingLeft;
        if (!this.f2690i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = 0;
        int i12 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z3 = false;
        boolean zM4582a = C0506bq.m4582a(this);
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                z2 = z3;
                i8 = i12;
                i7 = paddingRight;
                i9 = i11;
            } else {
                C0428c c0428c = (C0428c) childAt.getLayoutParams();
                if (c0428c.f2694a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m3383a(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM4582a) {
                        paddingLeft = c0428c.leftMargin + getPaddingLeft();
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - c0428c.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i14 = i10 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i14, width, measuredHeight + i14);
                    i7 = paddingRight - measuredWidth;
                    z2 = true;
                    i8 = i12;
                    i9 = i11;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + c0428c.leftMargin + c0428c.rightMargin;
                    int i15 = i11 + measuredWidth2;
                    int i16 = paddingRight - measuredWidth2;
                    if (m3383a(i13)) {
                        i15 += dividerWidth;
                    }
                    boolean z4 = z3;
                    i7 = i16;
                    i8 = i12 + 1;
                    i9 = i15;
                    z2 = z4;
                }
            }
            i13++;
            i11 = i9;
            paddingRight = i7;
            i12 = i8;
            z3 = z2;
        }
        if (childCount == 1 && !z3) {
            View childAt2 = getChildAt(0);
            int measuredWidth3 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = ((i3 - i) / 2) - (measuredWidth3 / 2);
            int i18 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth3 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i12 - (z3 ? 0 : 1);
        int iMax = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (zM4582a) {
            int width2 = getWidth() - getPaddingRight();
            int i20 = 0;
            while (i20 < childCount) {
                View childAt3 = getChildAt(i20);
                C0428c c0428c2 = (C0428c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    i6 = width2;
                } else if (c0428c2.f2694a) {
                    i6 = width2;
                } else {
                    int i21 = width2 - c0428c2.rightMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth4, i22, i21, measuredHeight3 + i22);
                    i6 = i21 - ((c0428c2.leftMargin + measuredWidth4) + iMax);
                }
                i20++;
                width2 = i6;
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt4 = getChildAt(i23);
            C0428c c0428c3 = (C0428c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() == 8) {
                i5 = paddingLeft2;
            } else if (c0428c3.f2694a) {
                i5 = paddingLeft2;
            } else {
                int i24 = paddingLeft2 + c0428c3.leftMargin;
                int measuredWidth5 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth5, measuredHeight4 + i25);
                i5 = c0428c3.rightMargin + measuredWidth5 + iMax + i24;
            }
            i23++;
            paddingLeft2 = i5;
        }
    }

    @Override // android.support.v7.widget.C0477ao, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z = this.f2690i;
        this.f2690i = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f2690i) {
            this.f2691j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f2690i && this.f2684c != null && size != this.f2691j) {
            this.f2691j = size;
            this.f2684c.mo208a(true);
        }
        int childCount = getChildCount();
        if (this.f2690i && childCount > 0) {
            m3378c(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0428c c0428c = (C0428c) getChildAt(i3).getLayoutParams();
            c0428c.rightMargin = 0;
            c0428c.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2688g.m4595d(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0430e interfaceC0430e) {
        this.f2683b = interfaceC0430e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2688g.m4592a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f2687f = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2686e != i) {
            this.f2686e = i;
            if (i == 0) {
                this.f2685d = getContext();
            } else {
                this.f2685d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0508d c0508d) {
        this.f2688g = c0508d;
        this.f2688g.m4593a(this);
    }
}
