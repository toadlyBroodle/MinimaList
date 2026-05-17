package android.support.v4.p019j;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: android.support.v4.j.q */
/* JADX INFO: loaded from: classes.dex */
public class C0246q {

    /* JADX INFO: renamed from: a */
    static final j f1347a;

    /* JADX INFO: renamed from: android.support.v4.j.q$a */
    static class a extends j {
        a() {
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public boolean mo1781a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$b */
    static class b extends a {
        b() {
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1782a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1783a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1784a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1785a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1786a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: b */
        public boolean mo1787b(View view) {
            return view.hasTransientState();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: c */
        public void mo1788c(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: d */
        public int mo1789d(View view) {
            return view.getImportantForAccessibility();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: e */
        public ViewParent mo1790e(View view) {
            return view.getParentForAccessibility();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: f */
        public int mo1791f(View view) {
            return view.getMinimumWidth();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: g */
        public int mo1792g(View view) {
            return view.getMinimumHeight();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: h */
        public void mo1793h(View view) {
            view.requestFitSystemWindows();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: i */
        public boolean mo1794i(View view) {
            return view.getFitsSystemWindows();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: j */
        public boolean mo1795j(View view) {
            return view.hasOverlappingRendering();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$c */
    static class c extends b {
        c() {
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1796a(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: k */
        public int mo1797k(View view) {
            return view.getLayoutDirection();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: l */
        public int mo1798l(View view) {
            return view.getPaddingStart();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: m */
        public int mo1799m(View view) {
            return view.getPaddingEnd();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: n */
        public int mo1800n(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: o */
        public boolean mo1801o(View view) {
            return view.isPaddingRelative();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: p */
        public Display mo1802p(View view) {
            return view.getDisplay();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$d */
    static class d extends c {
        d() {
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1803a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: q */
        public Rect mo1804q(View view) {
            return view.getClipBounds();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$e */
    static class e extends d {
        e() {
        }

        @Override // android.support.v4.p019j.C0246q.b, android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1782a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: r */
        public boolean mo1805r(View view) {
            return view.isLaidOut();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: s */
        public boolean mo1806s(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$f */
    static class f extends e {

        /* JADX INFO: renamed from: d */
        private static ThreadLocal<Rect> f1348d;

        f() {
        }

        /* JADX INFO: renamed from: b */
        private static Rect m1807b() {
            if (f1348d == null) {
                f1348d = new ThreadLocal<>();
            }
            Rect rect = f1348d.get();
            if (rect == null) {
                rect = new Rect();
                f1348d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: A */
        public float mo1808A(View view) {
            return view.getZ();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public C0254y mo1809a(View view, C0254y c0254y) {
            WindowInsets windowInsets = (WindowInsets) C0254y.m1867a(c0254y);
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (windowInsetsOnApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(windowInsetsOnApplyWindowInsets);
            }
            return C0254y.m1866a(windowInsets);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1810a(View view, float f) {
            view.setElevation(f);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1811a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1812a(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1813a(View view, final InterfaceC0244o interfaceC0244o) {
            if (interfaceC0244o == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: android.support.v4.j.q.f.1
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        return (WindowInsets) C0254y.m1867a(interfaceC0244o.mo213a(view2, C0254y.m1866a(windowInsets)));
                    }
                });
            }
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1814a(View view, String str) {
            view.setTransitionName(str);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: b */
        public C0254y mo1815b(View view, C0254y c0254y) {
            WindowInsets windowInsets = (WindowInsets) C0254y.m1867a(c0254y);
            WindowInsets windowInsetsDispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            if (windowInsetsDispatchApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(windowInsetsDispatchApplyWindowInsets);
            }
            return C0254y.m1866a(windowInsets);
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: b */
        public void mo1816b(View view, int i) {
            boolean z;
            Rect rectM1807b = m1807b();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                rectM1807b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !rectM1807b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo1816b(view, i);
            if (z && rectM1807b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(rectM1807b);
            }
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: c */
        public void mo1817c(View view, int i) {
            boolean z;
            Rect rectM1807b = m1807b();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                rectM1807b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !rectM1807b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo1817c(view, i);
            if (z && rectM1807b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(rectM1807b);
            }
        }

        @Override // android.support.v4.p019j.C0246q.b, android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: h */
        public void mo1793h(View view) {
            view.requestApplyInsets();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: t */
        public String mo1818t(View view) {
            return view.getTransitionName();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: u */
        public float mo1819u(View view) {
            return view.getElevation();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: v */
        public float mo1820v(View view) {
            return view.getTranslationZ();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: w */
        public boolean mo1821w(View view) {
            return view.isNestedScrollingEnabled();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: x */
        public void mo1822x(View view) {
            view.stopNestedScroll();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: y */
        public ColorStateList mo1823y(View view) {
            return view.getBackgroundTintList();
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: z */
        public PorterDuff.Mode mo1824z(View view) {
            return view.getBackgroundTintMode();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$g */
    static class g extends f {
        g() {
        }

        @Override // android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: a */
        public void mo1825a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        @Override // android.support.v4.p019j.C0246q.f, android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: b */
        public void mo1816b(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        @Override // android.support.v4.p019j.C0246q.f, android.support.v4.p019j.C0246q.j
        /* JADX INFO: renamed from: c */
        public void mo1817c(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$h */
    static class h extends g {
        h() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$i */
    static class i extends h {
        i() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.j.q$j */
    static class j {

        /* JADX INFO: renamed from: b */
        static Field f1351b;

        /* JADX INFO: renamed from: c */
        static boolean f1352c = false;

        /* JADX INFO: renamed from: d */
        private static Field f1353d;

        /* JADX INFO: renamed from: e */
        private static boolean f1354e;

        /* JADX INFO: renamed from: f */
        private static Field f1355f;

        /* JADX INFO: renamed from: g */
        private static boolean f1356g;

        /* JADX INFO: renamed from: h */
        private static WeakHashMap<View, String> f1357h;

        /* JADX INFO: renamed from: a */
        WeakHashMap<View, C0250u> f1358a = null;

        j() {
        }

        /* JADX INFO: renamed from: D */
        private static void m1826D(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        /* JADX INFO: renamed from: A */
        public float mo1808A(View view) {
            return mo1820v(view) + mo1819u(view);
        }

        /* JADX INFO: renamed from: B */
        public boolean m1827B(View view) {
            if (f1352c) {
                return false;
            }
            if (f1351b == null) {
                try {
                    f1351b = View.class.getDeclaredField("mAccessibilityDelegate");
                    f1351b.setAccessible(true);
                } catch (Throwable th) {
                    f1352c = true;
                    return false;
                }
            }
            try {
                return f1351b.get(view) != null;
            } catch (Throwable th2) {
                f1352c = true;
                return false;
            }
        }

        /* JADX INFO: renamed from: C */
        public C0250u m1828C(View view) {
            if (this.f1358a == null) {
                this.f1358a = new WeakHashMap<>();
            }
            C0250u c0250u = this.f1358a.get(view);
            if (c0250u != null) {
                return c0250u;
            }
            C0250u c0250u2 = new C0250u(view);
            this.f1358a.put(view, c0250u2);
            return c0250u2;
        }

        /* JADX INFO: renamed from: a */
        long m1829a() {
            return ValueAnimator.getFrameDelay();
        }

        /* JADX INFO: renamed from: a */
        public C0254y mo1809a(View view, C0254y c0254y) {
            return c0254y;
        }

        /* JADX INFO: renamed from: a */
        public void mo1810a(View view, float f) {
        }

        /* JADX INFO: renamed from: a */
        public void mo1782a(View view, int i) {
        }

        /* JADX INFO: renamed from: a */
        public void mo1825a(View view, int i, int i2) {
        }

        /* JADX INFO: renamed from: a */
        public void mo1796a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public void mo1811a(View view, ColorStateList colorStateList) {
            if (view instanceof InterfaceC0245p) {
                ((InterfaceC0245p) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public void mo1812a(View view, PorterDuff.Mode mode) {
            if (view instanceof InterfaceC0245p) {
                ((InterfaceC0245p) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo1803a(View view, Rect rect) {
        }

        /* JADX INFO: renamed from: a */
        public void mo1783a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* JADX INFO: renamed from: a */
        public void m1830a(View view, C0227b c0227b) {
            view.setAccessibilityDelegate(c0227b == null ? null : c0227b.m1669a());
        }

        /* JADX INFO: renamed from: a */
        public void mo1813a(View view, InterfaceC0244o interfaceC0244o) {
        }

        /* JADX INFO: renamed from: a */
        public void mo1784a(View view, Runnable runnable) {
            view.postDelayed(runnable, m1829a());
        }

        /* JADX INFO: renamed from: a */
        public void mo1785a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, m1829a() + j);
        }

        /* JADX INFO: renamed from: a */
        public void mo1814a(View view, String str) {
            if (f1357h == null) {
                f1357h = new WeakHashMap<>();
            }
            f1357h.put(view, str);
        }

        /* JADX INFO: renamed from: a */
        public void mo1786a(View view, boolean z) {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo1781a(View view) {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public C0254y mo1815b(View view, C0254y c0254y) {
            return c0254y;
        }

        /* JADX INFO: renamed from: b */
        public void mo1816b(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                m1826D(view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    m1826D((View) parent);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean mo1787b(View view) {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public void mo1788c(View view) {
            view.postInvalidate();
        }

        /* JADX INFO: renamed from: c */
        public void mo1817c(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                m1826D(view);
                Object parent = view.getParent();
                if (parent instanceof View) {
                    m1826D((View) parent);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public int mo1789d(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public ViewParent mo1790e(View view) {
            return view.getParent();
        }

        /* JADX INFO: renamed from: f */
        public int mo1791f(View view) {
            if (!f1354e) {
                try {
                    f1353d = View.class.getDeclaredField("mMinWidth");
                    f1353d.setAccessible(true);
                } catch (NoSuchFieldException e) {
                }
                f1354e = true;
            }
            if (f1353d != null) {
                try {
                    return ((Integer) f1353d.get(view)).intValue();
                } catch (Exception e2) {
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: g */
        public int mo1792g(View view) {
            if (!f1356g) {
                try {
                    f1355f = View.class.getDeclaredField("mMinHeight");
                    f1355f.setAccessible(true);
                } catch (NoSuchFieldException e) {
                }
                f1356g = true;
            }
            if (f1355f != null) {
                try {
                    return ((Integer) f1355f.get(view)).intValue();
                } catch (Exception e2) {
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: h */
        public void mo1793h(View view) {
        }

        /* JADX INFO: renamed from: i */
        public boolean mo1794i(View view) {
            return false;
        }

        /* JADX INFO: renamed from: j */
        public boolean mo1795j(View view) {
            return true;
        }

        /* JADX INFO: renamed from: k */
        public int mo1797k(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: l */
        public int mo1798l(View view) {
            return view.getPaddingLeft();
        }

        /* JADX INFO: renamed from: m */
        public int mo1799m(View view) {
            return view.getPaddingRight();
        }

        /* JADX INFO: renamed from: n */
        public int mo1800n(View view) {
            return 0;
        }

        /* JADX INFO: renamed from: o */
        public boolean mo1801o(View view) {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public Display mo1802p(View view) {
            if (mo1806s(view)) {
                return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            }
            return null;
        }

        /* JADX INFO: renamed from: q */
        public Rect mo1804q(View view) {
            return null;
        }

        /* JADX INFO: renamed from: r */
        public boolean mo1805r(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        /* JADX INFO: renamed from: s */
        public boolean mo1806s(View view) {
            return view.getWindowToken() != null;
        }

        /* JADX INFO: renamed from: t */
        public String mo1818t(View view) {
            if (f1357h == null) {
                return null;
            }
            return f1357h.get(view);
        }

        /* JADX INFO: renamed from: u */
        public float mo1819u(View view) {
            return 0.0f;
        }

        /* JADX INFO: renamed from: v */
        public float mo1820v(View view) {
            return 0.0f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: w */
        public boolean mo1821w(View view) {
            if (view instanceof InterfaceC0238i) {
                return ((InterfaceC0238i) view).isNestedScrollingEnabled();
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: x */
        public void mo1822x(View view) {
            if (view instanceof InterfaceC0238i) {
                ((InterfaceC0238i) view).stopNestedScroll();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: y */
        public ColorStateList mo1823y(View view) {
            if (view instanceof InterfaceC0245p) {
                return ((InterfaceC0245p) view).getSupportBackgroundTintList();
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: z */
        public PorterDuff.Mode mo1824z(View view) {
            if (view instanceof InterfaceC0245p) {
                return ((InterfaceC0245p) view).getSupportBackgroundTintMode();
            }
            return null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f1347a = new i();
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            f1347a = new h();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            f1347a = new g();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            f1347a = new f();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            f1347a = new e();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            f1347a = new d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            f1347a = new c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            f1347a = new b();
        } else if (Build.VERSION.SDK_INT >= 15) {
            f1347a = new a();
        } else {
            f1347a = new j();
        }
    }

    /* JADX INFO: renamed from: A */
    public static boolean m1734A(View view) {
        return f1347a.mo1781a(view);
    }

    /* JADX INFO: renamed from: B */
    public static Display m1735B(View view) {
        return f1347a.mo1802p(view);
    }

    /* JADX INFO: renamed from: a */
    public static C0254y m1736a(View view, C0254y c0254y) {
        return f1347a.mo1809a(view, c0254y);
    }

    /* JADX INFO: renamed from: a */
    public static void m1737a(View view, float f2) {
        f1347a.mo1810a(view, f2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1738a(View view, int i2) {
        f1347a.mo1782a(view, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1739a(View view, int i2, int i3) {
        f1347a.mo1825a(view, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public static void m1740a(View view, int i2, int i3, int i4, int i5) {
        f1347a.mo1796a(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: a */
    public static void m1741a(View view, ColorStateList colorStateList) {
        f1347a.mo1811a(view, colorStateList);
    }

    /* JADX INFO: renamed from: a */
    public static void m1742a(View view, PorterDuff.Mode mode) {
        f1347a.mo1812a(view, mode);
    }

    /* JADX INFO: renamed from: a */
    public static void m1743a(View view, Rect rect) {
        f1347a.mo1803a(view, rect);
    }

    /* JADX INFO: renamed from: a */
    public static void m1744a(View view, Drawable drawable) {
        f1347a.mo1783a(view, drawable);
    }

    /* JADX INFO: renamed from: a */
    public static void m1745a(View view, C0227b c0227b) {
        f1347a.m1830a(view, c0227b);
    }

    /* JADX INFO: renamed from: a */
    public static void m1746a(View view, InterfaceC0244o interfaceC0244o) {
        f1347a.mo1813a(view, interfaceC0244o);
    }

    /* JADX INFO: renamed from: a */
    public static void m1747a(View view, Runnable runnable) {
        f1347a.mo1784a(view, runnable);
    }

    /* JADX INFO: renamed from: a */
    public static void m1748a(View view, Runnable runnable, long j2) {
        f1347a.mo1785a(view, runnable, j2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1749a(View view, String str) {
        f1347a.mo1814a(view, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m1750a(View view, boolean z) {
        f1347a.mo1786a(view, z);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1751a(View view) {
        return f1347a.m1827B(view);
    }

    /* JADX INFO: renamed from: b */
    public static C0254y m1752b(View view, C0254y c0254y) {
        return f1347a.mo1815b(view, c0254y);
    }

    /* JADX INFO: renamed from: b */
    public static void m1753b(View view, int i2) {
        f1347a.mo1817c(view, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m1754b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1755b(View view) {
        return f1347a.mo1787b(view);
    }

    /* JADX INFO: renamed from: c */
    public static void m1756c(View view) {
        f1347a.mo1788c(view);
    }

    /* JADX INFO: renamed from: c */
    public static void m1757c(View view, int i2) {
        f1347a.mo1816b(view, i2);
    }

    /* JADX INFO: renamed from: d */
    public static int m1758d(View view) {
        return f1347a.mo1789d(view);
    }

    /* JADX INFO: renamed from: e */
    public static int m1759e(View view) {
        return f1347a.mo1797k(view);
    }

    /* JADX INFO: renamed from: f */
    public static ViewParent m1760f(View view) {
        return f1347a.mo1790e(view);
    }

    /* JADX INFO: renamed from: g */
    public static int m1761g(View view) {
        return f1347a.mo1798l(view);
    }

    /* JADX INFO: renamed from: h */
    public static int m1762h(View view) {
        return f1347a.mo1799m(view);
    }

    /* JADX INFO: renamed from: i */
    public static int m1763i(View view) {
        return f1347a.mo1791f(view);
    }

    /* JADX INFO: renamed from: j */
    public static int m1764j(View view) {
        return f1347a.mo1792g(view);
    }

    /* JADX INFO: renamed from: k */
    public static C0250u m1765k(View view) {
        return f1347a.m1828C(view);
    }

    /* JADX INFO: renamed from: l */
    public static float m1766l(View view) {
        return f1347a.mo1819u(view);
    }

    /* JADX INFO: renamed from: m */
    public static String m1767m(View view) {
        return f1347a.mo1818t(view);
    }

    /* JADX INFO: renamed from: n */
    public static int m1768n(View view) {
        return f1347a.mo1800n(view);
    }

    /* JADX INFO: renamed from: o */
    public static void m1769o(View view) {
        f1347a.mo1793h(view);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1770p(View view) {
        return f1347a.mo1794i(view);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1771q(View view) {
        return f1347a.mo1795j(view);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1772r(View view) {
        return f1347a.mo1801o(view);
    }

    /* JADX INFO: renamed from: s */
    public static ColorStateList m1773s(View view) {
        return f1347a.mo1823y(view);
    }

    /* JADX INFO: renamed from: t */
    public static PorterDuff.Mode m1774t(View view) {
        return f1347a.mo1824z(view);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m1775u(View view) {
        return f1347a.mo1821w(view);
    }

    /* JADX INFO: renamed from: v */
    public static void m1776v(View view) {
        f1347a.mo1822x(view);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m1777w(View view) {
        return f1347a.mo1805r(view);
    }

    /* JADX INFO: renamed from: x */
    public static float m1778x(View view) {
        return f1347a.mo1808A(view);
    }

    /* JADX INFO: renamed from: y */
    public static Rect m1779y(View view) {
        return f1347a.mo1804q(view);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m1780z(View view) {
        return f1347a.mo1806s(view);
    }
}
