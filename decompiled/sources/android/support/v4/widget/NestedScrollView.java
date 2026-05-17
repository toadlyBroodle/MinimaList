package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p019j.C0227b;
import android.support.v4.p019j.C0240k;
import android.support.v4.p019j.C0243n;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.InterfaceC0239j;
import android.support.v4.p019j.InterfaceC0241l;
import android.support.v4.p019j.p020a.C0224b;
import android.support.v4.p019j.p020a.C0226d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0239j, InterfaceC0241l {

    /* JADX INFO: renamed from: w */
    private static final C0314a f1600w = new C0314a();

    /* JADX INFO: renamed from: x */
    private static final int[] f1601x = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    private float f1602A;

    /* JADX INFO: renamed from: B */
    private InterfaceC0315b f1603B;

    /* JADX INFO: renamed from: a */
    private long f1604a;

    /* JADX INFO: renamed from: b */
    private final Rect f1605b;

    /* JADX INFO: renamed from: c */
    private OverScroller f1606c;

    /* JADX INFO: renamed from: d */
    private EdgeEffect f1607d;

    /* JADX INFO: renamed from: e */
    private EdgeEffect f1608e;

    /* JADX INFO: renamed from: f */
    private int f1609f;

    /* JADX INFO: renamed from: g */
    private boolean f1610g;

    /* JADX INFO: renamed from: h */
    private boolean f1611h;

    /* JADX INFO: renamed from: i */
    private View f1612i;

    /* JADX INFO: renamed from: j */
    private boolean f1613j;

    /* JADX INFO: renamed from: k */
    private VelocityTracker f1614k;

    /* JADX INFO: renamed from: l */
    private boolean f1615l;

    /* JADX INFO: renamed from: m */
    private boolean f1616m;

    /* JADX INFO: renamed from: n */
    private int f1617n;

    /* JADX INFO: renamed from: o */
    private int f1618o;

    /* JADX INFO: renamed from: p */
    private int f1619p;

    /* JADX INFO: renamed from: q */
    private int f1620q;

    /* JADX INFO: renamed from: r */
    private final int[] f1621r;

    /* JADX INFO: renamed from: s */
    private final int[] f1622s;

    /* JADX INFO: renamed from: t */
    private int f1623t;

    /* JADX INFO: renamed from: u */
    private int f1624u;

    /* JADX INFO: renamed from: v */
    private C0316c f1625v;

    /* JADX INFO: renamed from: y */
    private final C0243n f1626y;

    /* JADX INFO: renamed from: z */
    private final C0240k f1627z;

    /* JADX INFO: renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0314a extends C0227b {
        C0314a() {
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public void mo157a(View view, C0224b c0224b) {
            int scrollRange;
            super.mo157a(view, c0224b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0224b.m1625b((CharSequence) ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0224b.m1648k(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0224b.m1615a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0224b.m1615a(4096);
            }
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public void mo311a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo311a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0226d.m1666a(accessibilityEvent, nestedScrollView.getScrollX());
            C0226d.m1667b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // android.support.v4.p019j.C0227b
        /* JADX INFO: renamed from: a */
        public boolean mo1671a(View view, int i, Bundle bundle) {
            if (super.mo1671a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            switch (i) {
                case 4096:
                    int iMin = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.getScrollRange());
                    if (iMin == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2328c(0, iMin);
                    return true;
                case 8192:
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m2328c(0, iMax);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface InterfaceC0315b {
        /* JADX INFO: renamed from: a */
        void mo2333a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: android.support.v4.widget.NestedScrollView$c */
    static class C0316c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0316c> CREATOR = new Parcelable.Creator<C0316c>() { // from class: android.support.v4.widget.NestedScrollView.c.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0316c createFromParcel(Parcel parcel) {
                return new C0316c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0316c[] newArray(int i) {
                return new C0316c[i];
            }
        };

        /* JADX INFO: renamed from: a */
        public int f1628a;

        C0316c(Parcel parcel) {
            super(parcel);
            this.f1628a = parcel.readInt();
        }

        C0316c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1628a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1628a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1605b = new Rect();
        this.f1610g = true;
        this.f1611h = false;
        this.f1612i = null;
        this.f1613j = false;
        this.f1616m = true;
        this.f1620q = -1;
        this.f1621r = new int[2];
        this.f1622s = new int[2];
        m2301a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1601x, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1626y = new C0243n(this);
        this.f1627z = new C0240k(this);
        setNestedScrollingEnabled(true);
        C0246q.m1745a(this, f1600w);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View m2300a(boolean z, int i, int i2) {
        boolean z2;
        View view;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z3 = false;
        int size = focusables.size();
        int i3 = 0;
        while (i3 < size) {
            View view3 = (View) focusables.get(i3);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i >= bottom || top >= i2) {
                z2 = z3;
                view = view2;
            } else {
                boolean z4 = i < top && bottom < i2;
                if (view2 == null) {
                    boolean z5 = z4;
                    view = view3;
                    z2 = z5;
                } else {
                    boolean z6 = (z && top < view2.getTop()) || (!z && bottom > view2.getBottom());
                    if (z3) {
                        if (z4 && z6) {
                            view = view3;
                            z2 = z3;
                        }
                    } else if (z4) {
                        view = view3;
                        z2 = true;
                    } else if (z6) {
                        view = view3;
                        z2 = z3;
                    }
                }
            }
            i3++;
            view2 = view;
            z3 = z2;
        }
        return view2;
    }

    /* JADX INFO: renamed from: a */
    private void m2301a() {
        this.f1606c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1617n = viewConfiguration.getScaledTouchSlop();
        this.f1618o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1619p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: a */
    private void m2302a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1620q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1609f = (int) motionEvent.getY(i);
            this.f1620q = motionEvent.getPointerId(i);
            if (this.f1614k != null) {
                this.f1614k.clear();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2303a(int i, int i2, int i3) {
        boolean z = false;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        boolean z2 = i == 33;
        View viewM2300a = m2300a(z2, i2, i3);
        if (viewM2300a == null) {
            viewM2300a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2317g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (viewM2300a != findFocus()) {
            viewM2300a.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2304a(Rect rect, boolean z) {
        int iM2319a = m2319a(rect);
        boolean z2 = iM2319a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM2319a);
            } else {
                m2326b(0, iM2319a);
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2305a(View view) {
        return !m2306a(view, 0, getHeight());
    }

    /* JADX INFO: renamed from: a */
    private boolean m2306a(View view, int i, int i2) {
        view.getDrawingRect(this.f1605b);
        offsetDescendantRectToMyCoords(view, this.f1605b);
        return this.f1605b.bottom + i >= getScrollY() && this.f1605b.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2307a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m2307a((View) parent, view2);
    }

    /* JADX INFO: renamed from: b */
    private static int m2308b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX INFO: renamed from: b */
    private void m2309b(View view) {
        view.getDrawingRect(this.f1605b);
        offsetDescendantRectToMyCoords(view, this.f1605b);
        int iM2319a = m2319a(this.f1605b);
        if (iM2319a != 0) {
            scrollBy(0, iM2319a);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m2310b() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m2311c() {
        if (this.f1614k == null) {
            this.f1614k = VelocityTracker.obtain();
        } else {
            this.f1614k.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2312d() {
        if (this.f1614k == null) {
            this.f1614k = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m2313d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* JADX INFO: renamed from: e */
    private void m2314e() {
        if (this.f1614k != null) {
            this.f1614k.recycle();
            this.f1614k = null;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m2315f() {
        this.f1613j = false;
        m2314e();
        m2320a(0);
        if (this.f1607d != null) {
            this.f1607d.onRelease();
            this.f1608e.onRelease();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2316g() {
        if (getOverScrollMode() == 2) {
            this.f1607d = null;
            this.f1608e = null;
        } else if (this.f1607d == null) {
            Context context = getContext();
            this.f1607d = new EdgeEffect(context);
            this.f1608e = new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2317g(int i) {
        if (i != 0) {
            if (this.f1616m) {
                m2326b(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1602A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1602A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1602A;
    }

    /* JADX INFO: renamed from: h */
    private void m2318h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        if (dispatchNestedPreFling(0.0f, i)) {
            return;
        }
        dispatchNestedFling(0.0f, i, z);
        m2332f(i);
    }

    /* JADX INFO: renamed from: a */
    protected int m2319a(Rect rect) {
        int iMax;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            iMax = Math.min(rect.height() > height ? (rect.top - scrollY) + 0 : (rect.bottom - i) + 0, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            iMax = 0;
        } else {
            iMax = Math.max(rect.height() > height ? 0 - (i - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    public void m2320a(int i) {
        this.f1627z.m1728c(i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2321a(int i, int i2) {
        return this.f1627z.m1720a(i, i2);
    }

    /* JADX INFO: renamed from: a */
    boolean m2322a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        if (!z6) {
            i7 = 0;
        }
        int i10 = i4 + i2;
        if (!z7) {
            i8 = 0;
        }
        int i11 = -i7;
        int i12 = i7 + i5;
        int i13 = -i8;
        int i14 = i8 + i6;
        if (i9 > i12) {
            z2 = true;
        } else if (i9 < i11) {
            z2 = true;
            i12 = i11;
        } else {
            z2 = false;
            i12 = i9;
        }
        if (i10 > i14) {
            z3 = true;
        } else if (i10 < i13) {
            z3 = true;
            i14 = i13;
        } else {
            z3 = false;
            i14 = i10;
        }
        if (z3 && !m2327b(1)) {
            this.f1606c.springBack(i12, i14, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i12, i14, z2, z3);
        return z2 || z3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2323a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1627z.m1722a(i, i2, i3, i4, iArr, i5);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2324a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1627z.m1724a(i, i2, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2325a(KeyEvent keyEvent) {
        this.f1605b.setEmpty();
        if (m2310b()) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case 19:
                    return !keyEvent.isAltPressed() ? m2331e(33) : m2330d(33);
                case 20:
                    return !keyEvent.isAltPressed() ? m2331e(130) : m2330d(130);
                case 62:
                    m2329c(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                default:
                    return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m2326b(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1604a > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            this.f1606c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, iMax)) - scrollY);
            C0246q.m1756c(this);
        } else {
            if (!this.f1606c.isFinished()) {
                this.f1606c.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f1604a = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public boolean m2327b(int i) {
        return this.f1627z.m1719a(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m2328c(int i, int i2) {
        m2326b(i - getScrollX(), i2 - getScrollY());
    }

    /* JADX INFO: renamed from: c */
    public boolean m2329c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1605b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f1605b.top + height > childAt.getBottom()) {
                    this.f1605b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f1605b.top = getScrollY() - height;
            if (this.f1605b.top < 0) {
                this.f1605b.top = 0;
            }
        }
        this.f1605b.bottom = this.f1605b.top + height;
        return m2303a(i, this.f1605b.top, this.f1605b.bottom);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.f1606c.computeScrollOffset()) {
            if (m2327b(1)) {
                m2320a(1);
            }
            this.f1624u = 0;
            return;
        }
        this.f1606c.getCurrX();
        int currY = this.f1606c.getCurrY();
        int i = currY - this.f1624u;
        if (m2324a(0, i, this.f1622s, null, 1)) {
            i -= this.f1622s[1];
        }
        if (i != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            m2322a(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!m2323a(0, scrollY2, 0, i - scrollY2, null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    m2316g();
                    if (currY <= 0 && scrollY > 0) {
                        this.f1607d.onAbsorb((int) this.f1606c.getCurrVelocity());
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        this.f1608e.onAbsorb((int) this.f1606c.getCurrVelocity());
                    }
                }
            }
        }
        this.f1624u = currY;
        C0246q.m1756c(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2330d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.f1605b.top = 0;
        this.f1605b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f1605b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            this.f1605b.top = this.f1605b.bottom - height;
        }
        return m2303a(i, this.f1605b.top, this.f1605b.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2325a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1627z.m1718a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1627z.m1717a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1627z.m1723a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1627z.m1721a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1607d != null) {
            int scrollY = getScrollY();
            if (!this.f1607d.isFinished()) {
                int iSave = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), Math.min(0, scrollY));
                this.f1607d.setSize(width, getHeight());
                if (this.f1607d.draw(canvas)) {
                    C0246q.m1756c(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f1608e.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = getHeight();
            canvas.translate((-width2) + getPaddingLeft(), Math.max(getScrollRange(), scrollY) + height);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f1608e.setSize(width2, height);
            if (this.f1608e.draw(canvas)) {
                C0246q.m1756c(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m2331e(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m2306a(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2317g(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f1605b);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f1605b);
            m2317g(m2319a(this.f1605b));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m2305a(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m2332f(int i) {
        if (getChildCount() > 0) {
            m2321a(2, 1);
            this.f1606c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1624u = getScrollY();
            C0246q.m1756c(this);
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * getHeight());
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1626y.m1729a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f1627z.m1725b();
    }

    @Override // android.view.View, android.support.v4.p019j.InterfaceC0238i
    public boolean isNestedScrollingEnabled() {
        return this.f1627z.m1716a();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1611h = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 8:
                if (!this.f1613j) {
                    float axisValue = motionEvent.getAxisValue(9);
                    if (axisValue != 0.0f) {
                        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        int i = scrollY - verticalScrollFactorCompat;
                        if (i < 0) {
                            scrollRange = 0;
                        } else if (i <= scrollRange) {
                            scrollRange = i;
                        }
                        if (scrollRange != scrollY) {
                            super.scrollTo(getScrollX(), scrollRange);
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1613j) {
            return true;
        }
        switch (action & 255) {
            case 0:
                int y = (int) motionEvent.getY();
                if (!m2313d((int) motionEvent.getX(), y)) {
                    this.f1613j = false;
                    m2314e();
                } else {
                    this.f1609f = y;
                    this.f1620q = motionEvent.getPointerId(0);
                    m2311c();
                    this.f1614k.addMovement(motionEvent);
                    this.f1606c.computeScrollOffset();
                    this.f1613j = this.f1606c.isFinished() ? false : true;
                    m2321a(2, 0);
                }
                break;
            case 1:
            case 3:
                this.f1613j = false;
                this.f1620q = -1;
                m2314e();
                if (this.f1606c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0246q.m1756c(this);
                }
                m2320a(0);
                break;
            case 2:
                int i = this.f1620q;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(iFindPointerIndex);
                        if (Math.abs(y2 - this.f1609f) > this.f1617n && (getNestedScrollAxes() & 2) == 0) {
                            this.f1613j = true;
                            this.f1609f = y2;
                            m2312d();
                            this.f1614k.addMovement(motionEvent);
                            this.f1623t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    } else {
                        Log.e("NestedScrollView", "Invalid pointerId=" + i + " in onInterceptTouchEvent");
                    }
                }
                break;
            case 6:
                m2302a(motionEvent);
                break;
        }
        return this.f1613j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1610g = false;
        if (this.f1612i != null && m2307a(this.f1612i, this)) {
            m2309b(this.f1612i);
        }
        this.f1612i = null;
        if (!this.f1611h) {
            if (this.f1625v != null) {
                scrollTo(getScrollX(), this.f1625v.f1628a);
                this.f1625v = null;
            }
            int iMax = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > iMax) {
                scrollTo(getScrollX(), iMax);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1611h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1615l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2318h((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1626y.m1732a(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || m2305a(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0316c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0316c c0316c = (C0316c) parcelable;
        super.onRestoreInstanceState(c0316c.getSuperState());
        this.f1625v = c0316c;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0316c c0316c = new C0316c(super.onSaveInstanceState());
        c0316c.f1628a = getScrollY();
        return c0316c;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f1603B != null) {
            this.f1603B.mo2333a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m2306a(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f1605b);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f1605b);
        m2317g(m2319a(this.f1605b));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onStopNestedScroll(View view) {
        this.f1626y.m1730a(view);
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m2312d();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1623t = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.f1623t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() == 0) {
                    return false;
                }
                boolean z = !this.f1606c.isFinished();
                this.f1613j = z;
                if (z && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.f1606c.isFinished()) {
                    this.f1606c.abortAnimation();
                }
                this.f1609f = (int) motionEvent.getY();
                this.f1620q = motionEvent.getPointerId(0);
                m2321a(2, 0);
                break;
            case 1:
                VelocityTracker velocityTracker = this.f1614k;
                velocityTracker.computeCurrentVelocity(1000, this.f1619p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1620q);
                if (Math.abs(yVelocity) > this.f1618o) {
                    m2318h(-yVelocity);
                } else if (this.f1606c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0246q.m1756c(this);
                }
                this.f1620q = -1;
                m2315f();
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1620q);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.f1609f - y;
                    if (m2324a(0, i, this.f1622s, this.f1621r, 0)) {
                        i -= this.f1622s[1];
                        motionEventObtain.offsetLocation(0.0f, this.f1621r[1]);
                        this.f1623t += this.f1621r[1];
                    }
                    if (!this.f1613j && Math.abs(i) > this.f1617n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1613j = true;
                        i = i > 0 ? i - this.f1617n : i + this.f1617n;
                    }
                    if (this.f1613j) {
                        this.f1609f = y - this.f1621r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m2322a(0, i, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m2327b(0)) {
                            this.f1614k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (m2323a(0, scrollY2, 0, i - scrollY2, this.f1621r, 0)) {
                            this.f1609f -= this.f1621r[1];
                            motionEventObtain.offsetLocation(0.0f, this.f1621r[1]);
                            this.f1623t += this.f1621r[1];
                        } else if (z2) {
                            m2316g();
                            int i2 = scrollY + i;
                            if (i2 < 0) {
                                C0323g.m2450a(this.f1607d, i / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f1608e.isFinished()) {
                                    this.f1608e.onRelease();
                                }
                            } else if (i2 > scrollRange) {
                                C0323g.m2450a(this.f1608e, i / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f1607d.isFinished()) {
                                    this.f1607d.onRelease();
                                }
                            }
                            if (this.f1607d != null && (!this.f1607d.isFinished() || !this.f1608e.isFinished())) {
                                C0246q.m1756c(this);
                            }
                        }
                    }
                } else {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1620q + " in onTouchEvent");
                }
                break;
            case 3:
                if (this.f1613j && getChildCount() > 0 && this.f1606c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0246q.m1756c(this);
                }
                this.f1620q = -1;
                m2315f();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f1609f = (int) motionEvent.getY(actionIndex);
                this.f1620q = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                m2302a(motionEvent);
                this.f1609f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1620q));
                break;
        }
        if (this.f1614k != null) {
            this.f1614k.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1610g) {
            this.f1612i = view2;
        } else {
            m2309b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2304a(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2314e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1610g = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iM2308b = m2308b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iM2308b2 = m2308b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iM2308b == getScrollX() && iM2308b2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM2308b, iM2308b2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1615l) {
            this.f1615l = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1627z.m1715a(z);
    }

    public void setOnScrollChangeListener(InterfaceC0315b interfaceC0315b) {
        this.f1603B = interfaceC0315b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1616m = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f1627z.m1726b(i);
    }

    @Override // android.view.View, android.support.v4.p019j.InterfaceC0238i
    public void stopNestedScroll() {
        this.f1627z.m1727c();
    }
}
