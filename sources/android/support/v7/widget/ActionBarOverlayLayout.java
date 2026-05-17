package android.support.v7.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0025a;
import android.support.v4.p019j.C0243n;
import android.support.v4.p019j.C0246q;
import android.support.v4.p019j.InterfaceC0241l;
import android.support.v7.p022a.C0333a;
import android.support.v7.view.menu.InterfaceC0412o;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0241l, InterfaceC0467ae {

    /* JADX INFO: renamed from: e */
    static final int[] f2650e = {C0333a.a.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A */
    private final Runnable f2651A;

    /* JADX INFO: renamed from: B */
    private final Runnable f2652B;

    /* JADX INFO: renamed from: C */
    private final C0243n f2653C;

    /* JADX INFO: renamed from: a */
    ActionBarContainer f2654a;

    /* JADX INFO: renamed from: b */
    boolean f2655b;

    /* JADX INFO: renamed from: c */
    ViewPropertyAnimator f2656c;

    /* JADX INFO: renamed from: d */
    final AnimatorListenerAdapter f2657d;

    /* JADX INFO: renamed from: f */
    private int f2658f;

    /* JADX INFO: renamed from: g */
    private int f2659g;

    /* JADX INFO: renamed from: h */
    private ContentFrameLayout f2660h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0468af f2661i;

    /* JADX INFO: renamed from: j */
    private Drawable f2662j;

    /* JADX INFO: renamed from: k */
    private boolean f2663k;

    /* JADX INFO: renamed from: l */
    private boolean f2664l;

    /* JADX INFO: renamed from: m */
    private boolean f2665m;

    /* JADX INFO: renamed from: n */
    private boolean f2666n;

    /* JADX INFO: renamed from: o */
    private int f2667o;

    /* JADX INFO: renamed from: p */
    private int f2668p;

    /* JADX INFO: renamed from: q */
    private final Rect f2669q;

    /* JADX INFO: renamed from: r */
    private final Rect f2670r;

    /* JADX INFO: renamed from: s */
    private final Rect f2671s;

    /* JADX INFO: renamed from: t */
    private final Rect f2672t;

    /* JADX INFO: renamed from: u */
    private final Rect f2673u;

    /* JADX INFO: renamed from: v */
    private final Rect f2674v;

    /* JADX INFO: renamed from: w */
    private final Rect f2675w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0424a f2676x;

    /* JADX INFO: renamed from: y */
    private final int f2677y;

    /* JADX INFO: renamed from: z */
    private OverScroller f2678z;

    /* JADX INFO: renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface InterfaceC0424a {
        /* JADX INFO: renamed from: b */
        void mo2755b(int i);

        /* JADX INFO: renamed from: g */
        void mo2757g(boolean z);

        /* JADX INFO: renamed from: j */
        void mo2762j();

        /* JADX INFO: renamed from: k */
        void mo2764k();

        /* JADX INFO: renamed from: l */
        void mo2765l();

        /* JADX INFO: renamed from: m */
        void mo2766m();
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C0425b extends ViewGroup.MarginLayoutParams {
        public C0425b(int i, int i2) {
            super(i, i2);
        }

        public C0425b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0425b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2659g = 0;
        this.f2669q = new Rect();
        this.f2670r = new Rect();
        this.f2671s = new Rect();
        this.f2672t = new Rect();
        this.f2673u = new Rect();
        this.f2674v = new Rect();
        this.f2675w = new Rect();
        this.f2677y = 600;
        this.f2657d = new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f2656c = null;
                ActionBarOverlayLayout.this.f2655b = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f2656c = null;
                ActionBarOverlayLayout.this.f2655b = false;
            }
        };
        this.f2651A = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.m3369d();
                ActionBarOverlayLayout.this.f2656c = ActionBarOverlayLayout.this.f2654a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2657d);
            }
        };
        this.f2652B = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.m3369d();
                ActionBarOverlayLayout.this.f2656c = ActionBarOverlayLayout.this.f2654a.animate().translationY(-ActionBarOverlayLayout.this.f2654a.getHeight()).setListener(ActionBarOverlayLayout.this.f2657d);
            }
        };
        m3356a(context);
        this.f2653C = new C0243n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private InterfaceC0468af m3355a(View view) {
        if (view instanceof InterfaceC0468af) {
            return (InterfaceC0468af) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: a */
    private void m3356a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2650e);
        this.f2658f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2662j = typedArrayObtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2662j == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2663k = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2678z = new OverScroller(context);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3357a(float f, float f2) {
        this.f2678z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2678z.getFinalY() > this.f2654a.getHeight();
    }

    /* JADX INFO: renamed from: a */
    private boolean m3358a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C0425b c0425b = (C0425b) view.getLayoutParams();
        if (z && c0425b.leftMargin != rect.left) {
            c0425b.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && c0425b.topMargin != rect.top) {
            c0425b.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && c0425b.rightMargin != rect.right) {
            c0425b.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || c0425b.bottomMargin == rect.bottom) {
            return z5;
        }
        c0425b.bottomMargin = rect.bottom;
        return true;
    }

    /* JADX INFO: renamed from: l */
    private void m3359l() {
        m3369d();
        postDelayed(this.f2651A, 600L);
    }

    /* JADX INFO: renamed from: m */
    private void m3360m() {
        m3369d();
        postDelayed(this.f2652B, 600L);
    }

    /* JADX INFO: renamed from: n */
    private void m3361n() {
        m3369d();
        this.f2651A.run();
    }

    /* JADX INFO: renamed from: o */
    private void m3362o() {
        m3369d();
        this.f2652B.run();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0425b generateLayoutParams(AttributeSet attributeSet) {
        return new C0425b(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: a */
    public void mo3364a(int i) {
        m3368c();
        switch (i) {
            case 2:
                this.f2661i.mo3832f();
                break;
            case 5:
                this.f2661i.mo3833g();
                break;
            case C0025a.j.AppCompatTheme_windowActionBar /* 109 */:
                setOverlayMode(true);
                break;
        }
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: a */
    public void mo3365a(Menu menu, InterfaceC0412o.a aVar) {
        m3368c();
        this.f2661i.mo3818a(menu, aVar);
    }

    /* JADX INFO: renamed from: a */
    public boolean m3366a() {
        return this.f2664l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0425b generateDefaultLayoutParams() {
        return new C0425b(-1, -1);
    }

    /* JADX INFO: renamed from: c */
    void m3368c() {
        if (this.f2660h == null) {
            this.f2660h = (ContentFrameLayout) findViewById(C0333a.f.action_bar_activity_content);
            this.f2654a = (ActionBarContainer) findViewById(C0333a.f.action_bar_container);
            this.f2661i = m3355a(findViewById(C0333a.f.action_bar));
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0425b;
    }

    /* JADX INFO: renamed from: d */
    void m3369d() {
        removeCallbacks(this.f2651A);
        removeCallbacks(this.f2652B);
        if (this.f2656c != null) {
            this.f2656c.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2662j == null || this.f2663k) {
            return;
        }
        int bottom = this.f2654a.getVisibility() == 0 ? (int) (this.f2654a.getBottom() + this.f2654a.getTranslationY() + 0.5f) : 0;
        this.f2662j.setBounds(0, bottom, getWidth(), this.f2662j.getIntrinsicHeight() + bottom);
        this.f2662j.draw(canvas);
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: e */
    public boolean mo3370e() {
        m3368c();
        return this.f2661i.mo3834h();
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: f */
    public boolean mo3371f() {
        m3368c();
        return this.f2661i.mo3835i();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m3368c();
        if ((C0246q.m1768n(this) & 256) != 0) {
        }
        boolean zM3358a = m3358a(this.f2654a, rect, true, true, false, true);
        this.f2672t.set(rect);
        C0506bq.m4581a(this, this.f2672t, this.f2669q);
        if (!this.f2673u.equals(this.f2672t)) {
            this.f2673u.set(this.f2672t);
            zM3358a = true;
        }
        if (!this.f2670r.equals(this.f2669q)) {
            this.f2670r.set(this.f2669q);
            zM3358a = true;
        }
        if (zM3358a) {
            requestLayout();
        }
        return true;
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: g */
    public boolean mo3372g() {
        m3368c();
        return this.f2661i.mo3836j();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0425b(layoutParams);
    }

    public int getActionBarHideOffset() {
        if (this.f2654a != null) {
            return -((int) this.f2654a.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2653C.m1729a();
    }

    public CharSequence getTitle() {
        m3368c();
        return this.f2661i.mo3830e();
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: h */
    public boolean mo3373h() {
        m3368c();
        return this.f2661i.mo3837k();
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: i */
    public boolean mo3374i() {
        m3368c();
        return this.f2661i.mo3838l();
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: j */
    public void mo3375j() {
        m3368c();
        this.f2661i.mo3839m();
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    /* JADX INFO: renamed from: k */
    public void mo3376k() {
        m3368c();
        this.f2661i.mo3840n();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3356a(getContext());
        C0246q.m1769o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3369d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0425b c0425b = (C0425b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = c0425b.leftMargin + paddingLeft;
                int i7 = c0425b.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m3368c();
        measureChildWithMargins(this.f2654a, i, 0, i2, 0);
        C0425b c0425b = (C0425b) this.f2654a.getLayoutParams();
        int iMax = Math.max(0, this.f2654a.getMeasuredWidth() + c0425b.leftMargin + c0425b.rightMargin);
        int iMax2 = Math.max(0, c0425b.bottomMargin + this.f2654a.getMeasuredHeight() + c0425b.topMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2654a.getMeasuredState());
        boolean z = (C0246q.m1768n(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f2658f;
            if (this.f2665m && this.f2654a.getTabContainer() != null) {
                measuredHeight += this.f2658f;
            }
        } else {
            measuredHeight = this.f2654a.getVisibility() != 8 ? this.f2654a.getMeasuredHeight() : 0;
        }
        this.f2671s.set(this.f2669q);
        this.f2674v.set(this.f2672t);
        if (this.f2664l || z) {
            Rect rect = this.f2674v;
            rect.top = measuredHeight + rect.top;
            this.f2674v.bottom += 0;
        } else {
            Rect rect2 = this.f2671s;
            rect2.top = measuredHeight + rect2.top;
            this.f2671s.bottom += 0;
        }
        m3358a(this.f2660h, this.f2671s, true, true, true, true);
        if (!this.f2675w.equals(this.f2674v)) {
            this.f2675w.set(this.f2674v);
            this.f2660h.m3417a(this.f2674v);
        }
        measureChildWithMargins(this.f2660h, i, 0, i2, 0);
        C0425b c0425b2 = (C0425b) this.f2660h.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2660h.getMeasuredWidth() + c0425b2.leftMargin + c0425b2.rightMargin);
        int iMax4 = Math.max(iMax2, c0425b2.bottomMargin + this.f2660h.getMeasuredHeight() + c0425b2.topMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2660h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2666n || !z) {
            return false;
        }
        if (m3357a(f, f2)) {
            m3362o();
        } else {
            m3361n();
        }
        this.f2655b = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2667o += i2;
        setActionBarHideOffset(this.f2667o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2653C.m1732a(view, view2, i);
        this.f2667o = getActionBarHideOffset();
        m3369d();
        if (this.f2676x != null) {
            this.f2676x.mo2765l();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2654a.getVisibility() != 0) {
            return false;
        }
        return this.f2666n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.p019j.InterfaceC0241l
    public void onStopNestedScroll(View view) {
        if (this.f2666n && !this.f2655b) {
            if (this.f2667o <= this.f2654a.getHeight()) {
                m3359l();
            } else {
                m3360m();
            }
        }
        if (this.f2676x != null) {
            this.f2676x.mo2766m();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m3368c();
        int i2 = this.f2668p ^ i;
        this.f2668p = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        if (this.f2676x != null) {
            this.f2676x.mo2757g(z2 ? false : true);
            if (z || !z2) {
                this.f2676x.mo2762j();
            } else {
                this.f2676x.mo2764k();
            }
        }
        if ((i2 & 256) == 0 || this.f2676x == null) {
            return;
        }
        C0246q.m1769o(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2659g = i;
        if (this.f2676x != null) {
            this.f2676x.mo2755b(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m3369d();
        this.f2654a.setTranslationY(-Math.max(0, Math.min(i, this.f2654a.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0424a interfaceC0424a) {
        this.f2676x = interfaceC0424a;
        if (getWindowToken() != null) {
            this.f2676x.mo2755b(this.f2659g);
            if (this.f2668p != 0) {
                onWindowSystemUiVisibilityChanged(this.f2668p);
                C0246q.m1769o(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2665m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2666n) {
            this.f2666n = z;
            if (z) {
                return;
            }
            m3369d();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m3368c();
        this.f2661i.mo3814a(i);
    }

    public void setIcon(Drawable drawable) {
        m3368c();
        this.f2661i.mo3815a(drawable);
    }

    public void setLogo(int i) {
        m3368c();
        this.f2661i.mo3823b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2664l = z;
        this.f2663k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    public void setWindowCallback(Window.Callback callback) {
        m3368c();
        this.f2661i.mo3819a(callback);
    }

    @Override // android.support.v7.widget.InterfaceC0467ae
    public void setWindowTitle(CharSequence charSequence) {
        m3368c();
        this.f2661i.mo3820a(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
